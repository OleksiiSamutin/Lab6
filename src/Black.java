public class Black extends  MetalMusic {
    private String subgenre = "Black";

    public Black(int lengthInSeconds, String genre, String composer, String name, int BPM, String subgenre) {
        super(lengthInSeconds, genre, composer, name, BPM);
        this.subgenre = subgenre;
    }
}
