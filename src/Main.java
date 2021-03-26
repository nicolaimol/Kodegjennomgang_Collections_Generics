import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {



        List<Mobel> mobelList = new ArrayList<>();




        /*
        MobelRegister register = new MobelRegister();
        register.leggTil("Spisebord", 30, 2000.0, 4);
        register.leggTil("Stuebord", 20, 80.0, 2);
        register.skrivUtBordEtterBen();
         */

        long tidStart = System.currentTimeMillis();
        MobelRegister<Mobel> mobelRegister = new MobelRegister<>();
        mobelRegister.leggTil(new Stol("Stol", 10, 200));
        mobelRegister.leggTil(new MobelImpl("Dobbelseng", "Seng", 50, 200));
        mobelRegister.leggTil(new Bord("Stuebord", 60, 1000, 4));
        mobelRegister.leggTil(new Bord("Spisebord", 40, 500, 2));
        long tidEnd = System.currentTimeMillis();
        System.out.println("Tid: " + (tidEnd - tidStart));

        mobelRegister.sortere();
        //mobelRegister.sorterBord();
        mobelRegister.skrivUtMobler();



        /*
        System.out.println();

        List<Bord> bordList = new ArrayList<>();
        bordList.add(new Bord("Spisebord", 30, 2000.0, 4));
        bordList.add(new Bord("Stuebord", 20, 80.0, 2));
        skrivUtMobel(bordList);

        System.out.println();

        List<Stol> stolList = new ArrayList<>();
        stolList.add(new Stol("Godstol", 30, 2000));
        stolList.add(new Stol("Kjøkkenstol", 10, 500));
        skrivUtMobel(stolList);
         */

    }


    public static <T> void skrivUtMobel(List<T> list) {
        for (T mobel: list) {
            System.out.println(mobel);
        }
    }
}

