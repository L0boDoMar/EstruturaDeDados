
package pilha;

import java.util.Stack;


public class Pilha {

    
    public static void main(String[] args) {
        
        Stack<String> pilha = new Stack();
        
        pilha.push("1");
        pilha.push("2");
        pilha.push("3");
        
        System.out.print(pilha.pop());
        System.out.print(pilha.pop());
        System.out.print(pilha.pop());
    }
    
}
