import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListaLiczb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        int a = 1;

        while (a > 0) {
            System.out.println("Podaj liczbe dodatnią :");
            a = sc.nextInt();
            if (a > 0) {
                lista.add(a);
            } else {
                System.out.println("Podałeś liczbe ujemną program się zakończył");
            }
        }

        List<Integer> shallowCopy = lista.subList(0, lista.size());
        Collections.reverse(shallowCopy);
        System.out.println(shallowCopy.toString());
        Collections.reverse(lista);
        //stackoverflow
        int suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i)+"+");
            suma += lista.get(i);
        }
        System.out.println("="+suma);

        System.out.println("Suma wszystkich podanych liczb: " + suma);
int najwiekszaLiczba = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) > najwiekszaLiczba) {
                najwiekszaLiczba = lista.get(i);

            }
        }
        System.out.println("Najwieksza podana liczba to: " + najwiekszaLiczba);

        int najmniejszaLiczba = najwiekszaLiczba;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) < najmniejszaLiczba) {
                najmniejszaLiczba = lista.get(i);

            }
        }
        System.out.println("Najmniejsza podana liczba to: " + najmniejszaLiczba);
    }

}
