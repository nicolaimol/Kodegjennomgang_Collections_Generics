import java.util.ArrayList;
import java.util.List;

public class MobelRegister {
    List<Mobel> mobelList;
    List<Stol> stolList;
    List<Bord> bordList;

    public MobelRegister() {
        this.mobelList = new ArrayList<>();
        this.stolList = new ArrayList<>();
        this.bordList = new ArrayList<>();
    }

    public Mobel leggTil(String navn, double vekt, double pris) {
        Stol nyttMobel = new Stol(navn, vekt, pris);
        stolList.add(nyttMobel);
        return nyttMobel;
    }

    public Mobel leggTil(String navn, double vekt, double pris, int antallBen) {
        Bord bord = new Bord(navn, vekt, pris, antallBen);
        bordList.add(bord);
        return bord;
    }

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

    public void skrivUtBordEtterBen() {
        bordList.sort(new BordComparatorBen());
        for (Bord bord:bordList) {
            System.out.println(bord);
        }
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
