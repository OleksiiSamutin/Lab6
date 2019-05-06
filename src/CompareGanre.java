import java.util.Comparator;

public class CompareGanre implements Comparator<MusicComposition> {
    @Override
    public int compare(MusicComposition o1, MusicComposition o2) {
        return o1.getGenre().compareTo(o2.getGenre());
    }
}
