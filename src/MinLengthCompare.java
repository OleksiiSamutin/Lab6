import java.util.Comparator;
public class MinLengthCompare implements Comparator<MusicComposition> {
    public int compare(MusicComposition o1,FavouriteComposition o2){

        return Integer.compare(o1.getLengthInSeconds(),o2.getMinLength());
    }

    @Override
    public int compare(MusicComposition o1, MusicComposition o2) {
        return 0;
    }
}
