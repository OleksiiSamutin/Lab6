public class MusicComposition {
    private int lengthInSeconds;
    protected String genre;
    private String composer;
    private String name;
    private int BPM;

    public MusicComposition(int lengthInSeconds, String genre, String composer, String name, int BPM) {
        this.lengthInSeconds = lengthInSeconds;
        this.genre = genre;
        this.composer = composer;
        this.name = name;
        this.BPM = BPM;
    }

    public int getLengthInSeconds() {
        return lengthInSeconds;
    }
    @Override
    public String toString(){
        return composer + "-" + name + " " + lengthInSeconds +" с.";
    }
}
