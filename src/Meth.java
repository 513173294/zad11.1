import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Meth {

    public static void wypelnijListe(List list) {
        Scanner scanner = new Scanner(System.in);
        int liczba = 0;

        while (liczba >= 0) {
            System.out.println("podaj liczbe ktora chcesz dodac : ");
            liczba = scanner.nextInt();
            scanner.nextLine();
            if (liczba < 0) {
                System.out.println("podales nie dozwolona wartosc!");
                break;
            }
            list.add(liczba);

        }
    }

    public static void zsumujListe(List<Integer> list) {
        int suma = 0;
        int i = 0;
        while (i < list.size()) {
            suma += list.get(i);
            System.out.print(list.get(i) + " + ");

            if (i == list.size()) {
                System.out.print(list.get(i) + " = " + suma);
            }
            i++;
            System.out.println(suma);
        }

    }

    public static void wyswietListe(List<Integer> list) {
        int sum = 0;
        for (int k = 0; k < list.size(); k++) {
            sum += list.get(k);

            if (k < list.size() - 1)
                System.out.print(list.get(k) + "+");
            else System.out.print(list.get(k));

            if (k == list.size() - 1) {
                System.out.print(" = " + sum);
                break;
            }

        }


    }

    public static void findMin(List<Integer> list) {
        int min = 999999999;
        for (int k = 0; k < list.size(); k++) {
            if (min > list.get(k)) {
                min = list.get(k);
            }

        }
        System.out.println("najmniejsza podana wartosc: " + min);


    }

    public static int findMax(List<Integer> list) {
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }

        }
        System.out.println("najwieksza podana wartosc :" + max);

        return max;
    }

    public static void wyswietlOdTylu(List list) {
        System.out.print("lista od tylu: ");
        for (int j = list.size() - 1; j >= 0; j--) {
            System.out.print(list.get(j) + " ");
        }

    }


}