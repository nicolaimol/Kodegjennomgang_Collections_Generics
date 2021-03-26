public abstract class Mobel implements Comparable<Mobel> {
    private static int lopenummer = 0;

    //  feltene navn, type, vekt, pris og nummer (et løpenummer):
    protected String navn;
    protected double vekt;
    protected double pris;
    protected int nummer;

    public Mobel(String navn, double vekt, double pris) {
        this.navn = navn;
        this.vekt = vekt;
        this.pris = pris;
        this.nummer = lopenummer++;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public double getVekt() {
        return vekt;
    }

    public void setVekt(double vekt) {
        this.vekt = vekt;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public abstract String toString();

    @Override
    public int compareTo(Mobel o) {
        return this.nummer - o.nummer;
    }
}
