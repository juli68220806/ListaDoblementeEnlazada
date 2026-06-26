package org.juli;

public class ListaDoblementeEnlazada {
    private Nodo cabeza;
    private int tamaño;

    public ListaDoblementeEnlazada(){
        cabeza = null;
        tamaño= 0;
    }
    public boolean isEmpty(){
        return tamaño == 0;
    }
    public int size(){
        return tamaño;
    }
    public void insertarInicio(int dato){
        Nodo nuevo = new Nodo (dato);
        if (cabeza == null){
            cabeza = nuevo;
        }else{
            nuevo.setSiguiente(cabeza);
            cabeza.setAnterior(nuevo);
            cabeza = nuevo;
        }
        tamaño ++;
    }
    public void insertarFinal(int dato){
        Nodo nuevo = new Nodo(dato);
        if (cabeza == null){
            cabeza = nuevo;
        }else{
            Nodo temporal = cabeza;
            while (temporal.getSiguiente() != null){
                temporal = temporal.getSiguiente();
            }
            temporal.setSiguiente(nuevo);
            nuevo.setAnterior(temporal);
        }
        tamaño ++;
    }
    public void insertarPorIndice(int dato, int indice){
        if (indice < 0||indice > tamaño){
            System.out.println("indice invalido");
            return;
        }
        if (indice == 0){
            insertarInicio(dato);
            return;
        }
        if (indice == tamaño){
            insertarFinal(dato);
            return;
        }
        Nodo nuevo = new Nodo(dato);
        Nodo auxiliar = cabeza;

        for (int i=0; i< indice - 1; i++){
            auxiliar = auxiliar.getSiguiente();
        }
        nuevo.setSiguiente(auxiliar.getSiguiente());
        nuevo.setAnterior(auxiliar);

        auxiliar.getSiguiente().setAnterior(nuevo);
        auxiliar.setSiguiente(nuevo);
        tamaño++;
    }
    public void eliminarInicio(){
        if (isEmpty()){
            System.out.println("La lista esta vacia");
            return;
        }
        if (cabeza.getSiguiente()== null){
            cabeza= null;
        }else{
            cabeza = cabeza.getSiguiente();
            cabeza.setAnterior(null);
        }
        tamaño--;
    }
    public void eliminarFinal(){
        if (isEmpty()){
            System.out.println("La lista esta vacia");
            return;
        }
        if (cabeza.getSiguiente()== null){
            cabeza= null;
        }else{
            Nodo auxiliar = cabeza;
            while (auxiliar.getSiguiente() !=null){
                auxiliar = auxiliar.getSiguiente();
            }
            auxiliar.getAnterior().setSiguiente(null);
        }
        tamaño--;
    }
    public void eliminarPorIndice(int indice){
        if (isEmpty()){
            System.out.println("La lista esta vacia");
            return;
        }
        if(indice < 0||indice >= tamaño){
            System.out.println("Indice invalido");
            return;
        }
        if (indice==0){
            eliminarInicio();
            return;
        }
        if(indice==tamaño-1){
            eliminarFinal();
            return;
}
Nodo auxiliar = cabeza;
        for (int i=0; i<indice; i++){
auxiliar = auxiliar.getSiguiente();
        }
                auxiliar.getAnterior().setSiguiente(auxiliar.getSiguiente());
        auxiliar.getSiguiente().setAnterior(auxiliar.getAnterior());
tamaño--;
        }
public void clear(){
    cabeza = null;
    tamaño = 0;
    System.out.println("La lista ha sido eliminada");
}
public void print(){
    if (isEmpty()){
        System.out.println("La lista esta vacia");
        return;
    }
    Nodo auxiliar = cabeza;
    while (auxiliar != null){
        System.out.print(auxiliar.getDato()+" ");
        auxiliar = auxiliar.getSiguiente();
    }
    System.out.println();
}
}


