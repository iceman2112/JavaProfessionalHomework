
package Lesson1;

import Lesson1.FruitPack.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Slava
 */
public class Main {

    /** 
     * Меняет элемент i индекс и j индексом массива arr
     * @param <T>
     * @param arr
     * @param i
     * @param j 
     */
    public static <T> void swap(T[] arr, int i, int j) {
        T elem = arr[i];
        arr[i] = arr[j];
        arr[j] = elem;
    }
    
    /** 
     * Преобразует массив в ArrayLIst
     * @param <T>
     * @param arr
     * @return 
     */
    public static <T> ArrayList<T> toArrayList(T[] arr) {
        ArrayList<T> result = new ArrayList<T>();
        for (T elem : arr) 
            result.add(elem);
        return result;
    }
    
    public static void testTasks12() {
        String[] arr = {
            "s1", "s2", "s3"
        };

        swap(arr, 0, 2);

        System.out.println(Arrays.toString(arr));

        ArrayList<String> result = toArrayList(arr);
        System.out.println(result);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Box<Apple> boxApple = new Box<Apple>();
        boxApple.add(new Apple());
        boxApple.add(new Apple());
        boxApple.add(new Apple());
    
        Box<Orange> boxOrange = new Box<Orange>();
        boxOrange.add(new Orange());
        boxOrange.add(new Orange());
    
        System.out.println(boxOrange);
        System.out.println(boxOrange.compare(boxApple));
        
        Box<Apple> boxApple2 = new Box<Apple>();
        boxApple.move(boxApple2);
        System.out.println(boxApple);
        System.out.println(boxApple2);
    }    
}
