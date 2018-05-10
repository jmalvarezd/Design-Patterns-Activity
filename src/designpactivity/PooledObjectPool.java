/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpactivity;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Estudiante
 */
public class PooledObjectPool {
	private static long expTime = 6000;//6 seconds
	public static HashMap<Tienda, Long> available = new HashMap<Tienda, Long>();
	public static HashMap<Tienda, Long> inUse = new HashMap<Tienda, Long>();
	
	
	public synchronized static Tienda getObject() {
		long now = System.currentTimeMillis();
		if (!available.isEmpty()) {
			for (Map.Entry<Tienda, Long> entry : available.entrySet()) {
				if (now - entry.getValue() > expTime) { //object has expired
					popElement(available);
				} else {
					Tienda po = popElement(available, entry.getKey());
					push(inUse, po, now); 
					return po;
				}
			}
		}
		return createTienda(now);
	}	
	
	private synchronized static Tienda createTienda(long now) {
		Tienda po = new Tienda();
		push(inUse, po, now);
		return po;
        }

	private synchronized static void push(HashMap<Tienda, Long> map,
			Tienda po, long now) {
		map.put(po, now);
	}

	public static void releaseObject(Tienda po) {
		cleanUp(po);
		available.put(po, System.currentTimeMillis());
		inUse.remove(po);
	}
	
	private static Tienda popElement(HashMap<Tienda, Long> map) {
		 Map.Entry<Tienda, Long> entry = map.entrySet().iterator().next();
		 Tienda key= entry.getKey();
		 //Long value=entry.getValue();
		 map.remove(entry.getKey());
		 return key;
	}
	
	private static Tienda popElement(HashMap<Tienda, Long> map, Tienda key) {
		map.remove(key);
		return key;
	}
	
	public static void cleanUp(Tienda po) {
		po.setPizzaBuilder(null);
	}
}
