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
abstract class PizzaBuilder {
    protected Pizza pizza;
 
    public Pizza getPizza() { return pizza; }
 
    public abstract void buildMasa();
    public abstract void buildSalsa();
    public abstract void buildRelleno();
}
