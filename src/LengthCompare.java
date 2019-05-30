import java.util.Comparator;
public class LengthCompare implements Comparator<MusicComposition> {
    public int MaxLengthCompare(MusicComposition o1, FavouriteComposition o2){
        return Integer.compare(o1.getLengthInSeconds(), o2.getMaxLength());
    }

    public int MinLengthCompare(MusicComposition o1,FavouriteComposition o2){
        return Integer.compare(o1.getLengthInSeconds(),o2.getMinLength());
    }

    @Override
    public int compare(MusicComposition o1, MusicComposition o2) {
        return 0;
    }
}
