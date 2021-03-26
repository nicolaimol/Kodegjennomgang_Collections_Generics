import java.util.Comparator;

public class BordComparatorBen  implements Comparator<Bord> {

    @Override
    public int compare(Bord o1, Bord o2) {
        return o1.getAntallBen() - o2.getAntallBen();
    }
}
