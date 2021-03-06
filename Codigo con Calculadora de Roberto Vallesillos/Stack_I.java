/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* Stack.java
* @author Diego Cordova
* Ultima modificacion: 2021-02-3
*
* Interfaz Calculadora
* Interface de la calculadora
********************************************************/

import java.util.Vector;

public class Stack_I<E> implements stack<E> {

    private Vector<E> stack; // Arraylist used as stack

    /**
    * @author Diego Cordova
    * @return for StackImplementation class object
    */
    public Stack_I (){
        this.stack = new Vector<E>(0, 1);
    }

    /**
    * @author Diego Cordova
    * @return Adds the item to the artibute stack
    * @param item 
    */
    @Override
    public void push(E item) {
        this.stack.add(item);
    }

    /**
    * @author Diego Cordova
    * @return the las item added to the stack atribute 
    */
    @Override
    public E pop() {
        if (empty()){
            return null;
            
        } else {
            return this.stack.remove(this.stack.size() - 1);
        }
    }

    /**
    * @author Diego Cordova
    * @return last item added to the stack 
    */
    @Override
    public E peek() {
        if (empty()){
            return null;
            
        } else {
            return this.stack.get(this.stack.size() - 1);
        }
    }

    /**
    * @author Diego Cordova
    * @return true if stack is empty and false if not 
    */
    @Override
    public boolean empty() {
        return (stack.size() == 0);
    }

    /**
    * @author Diego Cordova
    * @return the number of elements in the stack
    */
    @Override
    public int size() {
        return stack.size();
    }
}