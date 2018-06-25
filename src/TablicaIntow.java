import java.util.*;

public class TablicaIntow {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> listaIntow = new ArrayList<>();


        int liczba = 0;
        int sum = 0;
        while (liczba >= 0) {
            System.out.println("podaj liczbe ktora chcesz dodac : ");
            liczba = scanner.nextInt();
            scanner.nextLine();
            if (liczba < 0) {
                System.out.println("podales nie dozwolona wartosc!");
                break;
            }
            listaIntow.add(liczba);
            sum = sum + liczba;

        }
        Meth.wyswietlOdTylu(listaIntow);

        int max = 0;
        for (int i = 0; i < listaIntow.size(); i++) {
            if (max < listaIntow.get(i)) {
                max = listaIntow.get(i);
            }
        }
        int min = max;
        for (int k = 0; k < listaIntow.size(); k++) {
            if (min > listaIntow.get(k)) {
                min = listaIntow.get(k);
            }
        }
        System.out.println("\n" + "najwieksza podana wartosc : " + max);
        System.out.println("najmniejsza podana wartosc : " + min);
        System.out.print("suma: ");
        Meth.wyswietListe(listaIntow );
        System.out.print(" = " + sum);

    }
}
