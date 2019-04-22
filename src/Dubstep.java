public class Dubstep extends ElectronicMusic {
    private String subgenre = "Dubstep";

    public Dubstep(int lengthInSeconds, String genre, String composer, String name, int BPM) {
        super(lengthInSeconds, genre, composer, name, BPM);
        this.subgenre = subgenre;
    }
}
