package jrubio;

import jrubio.ex1.LinkedList;
import jrubio.ex3.MaxPrefixDC;
import jrubio.ex2.NumberWordsCounter;

public class Main {

    public static void main(String[] args) {
		System.out.println("Exercici 1:");
		System.out.println("");
        exercici1Test();
        System.out.println("");
		System.out.println("");
		
		System.out.println("Exercici 2:");
		System.out.println("");
		exercici2DivideConquer();
		System.out.println("");
		System.out.println("");
		
		System.out.println("Exercici 3:");
		System.out.println("");
        exercici3Cutre();
        //exercici3Bo();
		System.out.println("");
		System.out.println("");
		System.out.println("Gràcies per la vostra atenció!");
    }

    // Consideració: Si els elements de la llista són parells retornarà mig+1
    public static void exercici1Test(){
        LinkedList linkedList = new LinkedList();

        linkedList.insert(5);
        linkedList.insert(4);
        linkedList.insert(3);
        linkedList.insert(2);
        linkedList.insert(1);
        // Cutre
        int indiceElemMedio = linkedList.buscarMedio();
        System.out.println("Posició mig:" + indiceElemMedio);

        System.out.print("Element LinkedList[" + indiceElemMedio + "] = ");
        linkedList.print(indiceElemMedio);

        // Guai
        linkedList.buscarMedioPunteros();
    }

    public static void exercici2DivideConquer(){
        String arrayEntrada[] = {"prova", "proveta",
                "proaso", "primer"};
        int n = arrayEntrada.length;

        String ans = MaxPrefixDC.prefixComu(arrayEntrada, 0, n - 1);
        System.out.println("Sortida: "+ (ans.length() != 0 ? ans : ""));
    }

    private static void exercici3Cutre() {
        System.out.println("Mètode 1: " + NumberWordsCounter.versioFacil());
        System.out.println("Mètode 2: " + NumberWordsCounter.versioMitja());
    }

    private static void exercici3Bo(){

    }
}
