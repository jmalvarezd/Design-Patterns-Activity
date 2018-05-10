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
class MexicanPizzaBuilder extends PizzaBuilder {
    public MexicanPizzaBuilder(){super.pizza = new Pizza();}
    public void buildMasa()   { pizza.setMasa("cocida"); }
    public void buildSalsa()   { pizza.setSalsa("picante"); }
    public void buildRelleno() { pizza.setRelleno("Salchichón y Tomate"); }
}
