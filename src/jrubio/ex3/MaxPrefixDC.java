package jrubio.ex3;

/*
En aquesta versió ho farem utilitzant "Divide & Conquer".
També es podria fer amb arbres, però crec que seria més complex i no tinc gaire marge de temps.
 */
public class MaxPrefixDC {

    // Funció auxiliar per trobar el prefix comú entre dos strings (comparació lletra a lletra)
    static String prefixComuAux(String str1, String str2) {
        String result = "";
        int n1 = str1.length(), n2 = str2.length();

        for (int i = 0, j = 0; i <= n1 - 1 &&
                j <= n2 - 1; i++, j++) {
            if (str1.charAt(i) != str2.charAt(j)) {
                break;
            }
            result += str1.charAt(i);
        }
        return (result);
    }

    // Funció principal que realitza el "divideix i guanyaràs".
    public static String prefixComu(String arr[], int low, int high) {
        if (low == high) {
            return (arr[low]);
        }
        if (high > low) {
            int mid = low + (high - low) / 2; // El mateix que (low + high)/2, però contemplant overflow.

            String str1 = prefixComu(arr, low, mid);
            String str2 = prefixComu(arr, mid + 1, high);

            return (prefixComuAux(str1, str2));
        }
        return null;
    }
}
