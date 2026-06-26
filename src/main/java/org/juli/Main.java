package org.juli;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
     public static void main(String []args){
     ListaDoblementeEnlazada lista = new ListaDoblementeEnlazada();
     System.out.println(" la lista esta vacia?: "+ lista.isEmpty());

     System.out.println("Insertar al inicio:");
     lista.insertarInicio(20);
     lista.insertarInicio(10);
     lista.print();

     System.out.println("Insertar al final:");
     lista.insertarFinal(30);
     lista.insertarFinal(40);
     lista.print();

     System.out.println("Insertar por indice: ");
     lista.insertarPorIndice(25, 2);
     lista.print();

     System.out.println("Eliminar al inicio; ");
     lista.eliminarInicio();
     lista.print();

     System.out.println("Eliminar al final: ");
     lista.eliminarFinal();
     lista.print();

     System.out.println("Eliminar por indice: ");
     lista.eliminarPorIndice(1);
     lista.print();

     System.out.println(" el tamaño de la lista es:"+ lista.size());
     System.out.println("vaciar la lista: ");
     lista.clear();
     lista.print();

     System.out.println("¿la lista esta vacia?: "+ lista.isEmpty());
     }
}
