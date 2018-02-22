/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson1;

import Lesson1.FruitPack.Fruit;
import java.util.ArrayList;

/**
 * Класс для хранения фрукторв
 * @author Slava
 */
public class Box<T extends Fruit> {
    protected ArrayList<T> container;
    
    public Box() {
        container = new ArrayList<T>();
    }
    
    /**
     * Возращает вес коробки по весу всех фруктов
     * @return 
     */
    public float getWeight() {
        float weight = 0f;
        for (T elem : container) {
            weight += elem.getWeight();
        }
        return weight;
    }
    
    /** 
     * Сравниет вес коробки box с текущей коробкой
     * @param box
     * @return 
     */
    public boolean compare(Box<?> box) {
        return (this.getWeight() == box.getWeight());
    }
    
    /**
     * Перемещает все фрукты из текущей коробки в box 
     * @param box 
     */
    public void move(Box<T> box) {
        for (T elem : container) {
            box.add(elem);
        }
        container.clear();
    }   
    
    /**
     * @param fruit 
     */
    public void add(T fruit) {
        if (fruit == null) return;      
        container.add(fruit);
    }   

    @Override
    public String toString() {
        return container.toString();
    }
}
