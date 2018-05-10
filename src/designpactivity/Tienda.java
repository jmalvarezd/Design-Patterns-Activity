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
class Tienda {
    private PizzaBuilder pizzaBuilder;
 
    public void setPizzaBuilder(PizzaBuilder pb) { pizzaBuilder = pb; }
    public Pizza getPizza() { return pizzaBuilder.getPizza(); }
 
    public void construirPizza() {
       pizzaBuilder.buildMasa();
       pizzaBuilder.buildSalsa();
       pizzaBuilder.buildRelleno();
    }
}
 
