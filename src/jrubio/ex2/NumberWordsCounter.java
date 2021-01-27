package jrubio.ex2;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Arrays;

/*
 Estimat backtracking
 */
public class NumberWordsCounter {

    private final static int VALIDS[] = {1,2,3,4,5};
    private final static int SUMDIGIT[] = {1,3,4,6,4}; // Mida de "u","dos","tres","quatre","cinc"
    private final static String ALFABET[] = {"u","dos","tres","quatre","cinc"};
    // --------------------------------------
    //             VERSIÓ FÀCIL
    // --------------------------------------

    static boolean digitValid(final int digit){
        boolean result = false;

        for(int i : VALIDS){
            if(i == digit){
                result = true;
                break;
            }
        }

        return result;
    }

    static int valorDigit(int digit){
        return SUMDIGIT[digit-1];
    }

    public static int versioFacil(){
        int aux;
        int suma = 0;
        for(int i = 1; i <= 1000; i++){
            aux = i;
            while (aux > 0) {
                if(digitValid(aux % 10)) suma += valorDigit(aux % 10);
                aux = aux / 10;
            }
        }
        return suma;
    }

    // --------------------------------------
    // VERSIÓ MITJA ESPECIFICADA A L'ENUNCIAT
    // --------------------------------------

    public static String digitToString(int digit){
        return digitValid(digit) ? ALFABET[digit-1] : "";
    }

    public static int versioMitja(){
        int aux;
        int suma = 0;
        for(int i = 1; i <= 1000; i++){
            aux = i;
            while (aux > 0) {
                if(digitValid(aux % 10)) suma += digitToString(aux % 10).length();
                aux = aux / 10;
            }
        }
        return suma;
    }

    // --------------------------------------
    // VERSIÓ DIFICIL
    // Entenc que es fa un backtracking que fa una cerca a un KeyValue<String, int>.
    // Si el valor ja existeix, agafa la suma. Altrament la calcula i afegeix.
    // D'aquesta forma cada cop serà més ràpid calcular-ho.
    // p.e.
    // 834, el tinc? NO --> 34 el tinc? SI --> retornem valor de 34 + valor de 8 (els de 3 xifres no caldria afegir-los)
    // --------------------------------------
    public static int versioBona(){


        return 0;
    }
}
