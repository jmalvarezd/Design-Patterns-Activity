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
class HawaiiPizzaBuilder extends PizzaBuilder {
    public HawaiiPizzaBuilder(){super.pizza = new Pizza();}
    public void buildMasa()   { pizza.setMasa("suave"); }
    public void buildSalsa()   { pizza.setSalsa("dulce"); }
    public void buildRelleno() { pizza.setRelleno("Piña y queso"); }
}