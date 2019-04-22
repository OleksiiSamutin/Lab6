public class MusicAlbum {
    private static int MAX_SONGS_IN_ALBUM = 12;
    private MusicComposition[] musicCompositions = new MusicComposition[MAX_SONGS_IN_ALBUM];
    private int counter;
    private String albumName;
    private String author;

    public MusicAlbum(String albumName, String author) {
        this.albumName = albumName;
        this.author = author;
    }

    public void add(MusicComposition musicComposition){
        musicCompositions[counter++] = musicComposition;
    }
    @Override
    public String toString(){
        String result = "====== Album ======\n";
        for (int i = 0; i < counter; i++){
            result += i + 1 + ". " + musicCompositions[i].toString() + "\n";
        }
        return result + "====================";

    }

    public int getLength() {
        int result = 0;
        for (MusicComposition musicComposition : musicCompositions){
            if (musicComposition != null){
                result += musicComposition.getLengthInSeconds();
            }
        }
        return result;
    }

}
