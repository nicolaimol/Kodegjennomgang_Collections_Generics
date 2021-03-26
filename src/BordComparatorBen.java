import java.util.Comparator;

public class BordComparatorBen  implements Comparator<Object> {

    @Override
    public int compare(Object o1, Object o2) {
        Bord bord1 = (Bord) o1;
        Bord bord2 = (Bord) o2;
        return bord1.getAntallBen() - bord2.getAntallBen();
    }
}
