import java.util.List;

public class Meth {



    public static void wyswietListe(List list) {
        for (int k = 0; k < list.size(); k++) {
            if (k < list.size() - 1)
                System.out.print(list.get(k) + "+");
            else System.out.print(list.get(k));

            if (k == list.size()) break;
        }


    }


    public static void wyswietlOdTylu(List list) {
        System.out.print("lista od tylu: ");
        for (int j = list.size() - 1; j >= 0; j--) {
            System.out.print(list.get(j) + " ");
        }

    }


}