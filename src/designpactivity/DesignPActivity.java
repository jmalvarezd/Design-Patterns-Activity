/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpactivity;

/**
 *
 * @author Estudiante
 */
public class DesignPActivity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Builder:
        System.out.println("Builder:");
        Tienda tienda = new Tienda();
        PizzaBuilder hawaiian = new HawaiiPizzaBuilder();
        PizzaBuilder mexican = new MexicanPizzaBuilder();
        tienda.setPizzaBuilder(hawaiian);
        tienda.construirPizza();
        Pizza pizzaConstruida = tienda.getPizza();
        System.out.println(pizzaConstruida);
        
        
        //Object Pool
        System.out.println("Object Pool");
        Tienda tienda1DePool = PooledObjectPool.getObject();
        
        tienda1DePool.setPizzaBuilder(hawaiian);
        tienda1DePool.construirPizza();
        Pizza pizzaConstruida1 = tienda1DePool.getPizza();
        System.out.println(pizzaConstruida1);
        
        PooledObjectPool.releaseObject(tienda1DePool);
        Tienda tienda2DePool = PooledObjectPool.getObject();
        tienda2DePool.setPizzaBuilder(mexican);
        tienda2DePool.construirPizza();
        Pizza pizzaConstruida2 = tienda2DePool.getPizza();
        System.out.println(pizzaConstruida2);
        
        
        
        
    }
    
}
