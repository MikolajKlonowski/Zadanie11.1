import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Metody {
    public void creatList(ArrayList lista) {
        int a = 1;
        Scanner sc = new Scanner (System.in);
        while (a > 0) {
            System.out.println ("Podaj liczbe dodatnią :");
            a = sc.nextInt ( );
            if (a > 0) {
                lista.add (a);
            } else {
                System.out.println ("Podałeś liczbe ujemną program się zakończył");
            }
        }
    }
    public void copyAndReversList(ArrayList lista){
        List<Integer> shallowCopy = lista.subList(0, lista.size());
        Collections.reverse(shallowCopy);
        System.out.println(shallowCopy.toString());
        Collections.reverse(lista);
        //stackoverflow
    }
    public int obliczSuma (ArrayList<Integer> lista){
        int suma = 0;
        for (int i = 0; i < lista.size ( ); i++) {
            System.out.print (lista.get (i) + "+");
            int a =  lista.get (i);
            suma =suma + a;
        }
       return  suma;
    }
    public int najwiekszaLiczbaZListy (ArrayList<Integer> lista){
        int najwiekszaLiczba = 0;
        for (int i = 0; i < lista.size ( ); i++) {
            int a = lista.get (i);
            if (a > najwiekszaLiczba) {
                najwiekszaLiczba = a;

            }
        }
        return  najwiekszaLiczba;
    }
    public int najmnijeszaLiczbaZListy (ArrayList<Integer> lista){
        int najmniejszaLiczba = najwiekszaLiczbaZListy (lista);
        for (int i = 0; i < lista.size ( ); i++) {
            if (lista.get (i) < najmniejszaLiczba) {
                najmniejszaLiczba = lista.get (i);

            }
        }
        return najmniejszaLiczba;
    }
}

