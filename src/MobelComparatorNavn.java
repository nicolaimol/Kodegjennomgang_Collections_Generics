import java.util.Comparator;

public class MobelComparatorNavn implements Comparator<Mobel> {
    @Override
    public int compare(Mobel o1, Mobel o2) {
        return o1.getNavn().compareTo(o2.getNavn());
    }
}
