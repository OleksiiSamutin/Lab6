public class Chillout extends ElectronicMusic {
    private String subgenre = "Chillout";

    public Chillout(int lengthInSeconds, String genre, String composer, String name, int BPM, String subgenre) {
        super(lengthInSeconds, genre, composer, name, BPM);
        this.subgenre = subgenre;
    }
}
