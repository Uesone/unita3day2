package Esercizio1;

public class Main {
    public static void main(String[] args) {

        String string1 = "ciao";
        String string2 = "hello";

        System.out.println("La stringa \"" + string1 + "\" ha un numero di caratteri pari? " + stringaPariDispari(string1));
        System.out.println("La stringa \"" + string2 + "\" ha un numero di caratteri pari? " + stringaPariDispari(string2));
    }

    public static boolean stringaPariDispari(String s) {

        return s.length() % 2 == 0;
    }
}
