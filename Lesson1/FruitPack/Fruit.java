/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson1.FruitPack;

/**
 *
 * @author Slava
 */
public class Fruit {
    protected float weight;
   
    public Fruit(float weight) {
        this.weight = weight;
    }
    
    public float getWeight() {
        return weight;
    }
    
    public String toString() {
        return getClass().getName() + ": " + weight;
    }
}
