import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListaLiczb {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList<Integer> lista = new ArrayList<> ( );
        Metody m = new Metody ( );
        m.creatList (lista);
        m.copyAndReversList (lista);
        int suma = m.obliczSuma (lista);
        System.out.println ("=" + suma);
        System.out.println ("Suma wszystkich podanych liczb: " + suma);
       int najwieksza = m.najwiekszaLiczbaZListy (lista);
        System.out.println ("Najwieksza liczba to: "+najwieksza );
        int najmnniejsza = m.najmnijeszaLiczbaZListy (lista);
        System.out.println ("Najmnijesza z lity liczba to: "+najmnniejsza );






    }

}
