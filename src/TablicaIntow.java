import java.util.*;

public class TablicaIntow {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> listaIntow = new ArrayList<>();



        Meth.wypelnijListe(listaIntow);
        Meth.wyswietlOdTylu(listaIntow);
        System.out.println();
        System.out.print("suma: ");
        Meth.wyswietListe(listaIntow);
        System.out.println();
        Meth.findMax(listaIntow);
        Meth.findMin(listaIntow);

    }
}
