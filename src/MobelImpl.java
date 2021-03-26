public class MobelImpl extends Mobel {

    private String type;

    public MobelImpl(String navn, String type, double vekt, double pris) {
        super(navn, vekt, pris);
        this.type = type;
    }

    @Override
    public String toString() {
        String ut = nummer + "_" + navn;
        return String.format("%d_%s", nummer, navn);
    }
}
