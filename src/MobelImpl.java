public class MobelImpl extends Mobel {

    public MobelImpl(String navn, double vekt, double pris) {
        super(navn, vekt, pris);
    }

    @Override
    public String toString() {
        String ut = nummer + "_" + navn;
        return String.format("%d_%s", nummer, navn);
    }
}
