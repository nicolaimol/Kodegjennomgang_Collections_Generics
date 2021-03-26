import java.util.ArrayList;
import java.util.List;

public class MobelRegister <T extends Mobel> {
    List<T> mobelList;

    public MobelRegister() {
        this.mobelList = new ArrayList<>();
    }

    public Mobel leggTil(T mobel) {
        mobelList.add(mobel);
        return mobel;
    }

    /*
    public Mobel leggTil(String navn, double vekt, double pris) {
        Mobel nyttMobel = new Stol(navn, vekt, pris);
        mobelList.add((T) nyttMobel);
        return nyttMobel;
    }

    public Mobel leggTil(String navn, double vekt, double pris, int antallBen) {
        Mobel bord = new Bord(navn, vekt, pris, antallBen);
        mobelList.add(bord);
        return bord;
    }
     */


    public Mobel hentMobel(int nummer) {
        for (Mobel mobel:mobelList) {
            if (mobel.getNummer() == nummer) {
                return mobel;
            }
        }
        return null;
    }

    public Mobel slettMobel(int nummer) {
        Mobel mobel = hentMobel(nummer);
        if (mobel != null) {
            mobelList.remove(mobel);
        }
        return mobel;
    }

    public void skrivUtMobler() {
        for (Mobel mobel:mobelList) {
            System.out.println(mobel);
        }
    }

    public void sortere() {
        mobelList.sort(new MobelComparatorNavn());
    }

    public void sorterBord() {
        mobelList.sort(new BordComparatorBen());
    }
}

class Stol extends Mobel {

    public Stol(String navn, double vekt, double pris) {
        super(navn, vekt, pris);
    }

    @Override
    public String toString() {
        return String.format("%d_%s", nummer, navn);
    }
}

class Bord extends Mobel {
    private int antallBen;

    public Bord(String navn, double vekt, double pris, int antallBen) {
        super(navn, vekt, pris);
        this.antallBen = antallBen;
    }

    public int getAntallBen() {
        return antallBen;
    }

    public void setAntallBen(int antallBen) {
        this.antallBen = antallBen;
    }

    @Override
    public String toString() {
        return String.format("%d_%s", nummer, navn);
    }
}
