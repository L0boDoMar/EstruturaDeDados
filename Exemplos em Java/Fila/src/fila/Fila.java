
package fila;

import java.util.LinkedList;
import java.util.Queue;


public class Fila {

    
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        
        fila.add("A");
        fila.add("B");
        fila.add("C");
        
        System.out.print(fila.peek());
        System.out.print(fila.remove());
        System.out.print(fila.remove());
        System.out.print(fila.remove());
    }
    
}
