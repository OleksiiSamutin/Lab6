public class Main {
    public static void main(String[] args) {
        MusicAlbum musicAlbum = new MusicAlbum("Origins","Imagine Dragons");
        musicAlbum.add(new Rock(189,"Rock","Imagine Dragons","Natural", 100));
        musicAlbum.add(new Rock(187,"Rock", "Imagine Dragons", "Boomerang",100));
        musicAlbum.add(new Rock(181, "Rock", "Imagine Dragons", "Machine",100));
        musicAlbum.add(new Rock(217,"Rock","Imagine Dragons", "Cool Out",100));
        musicAlbum.add(new Rock(260,"Rock","Imagine Dragons", "Bad Liar",100));
        musicAlbum.add(new Rock(217,"Rock","Imagine Dragons","West Coast",100));
        musicAlbum.add(new Rock(210,"Rock","Imagine Dragons","Zero",100));
        musicAlbum.add(new Rock(204,"Rock","Imagine Dragons","Bullet In A Gun",100));
        musicAlbum.add(new Rock(201,"Rock","Imagine Dragons","Digital",100));
        musicAlbum.add(new Rock(180,"Rock","Imagine Dragons","Only",100));
        musicAlbum.add(new Rock(190,"Rock","Imagine Dragons","Stuck",100));
        musicAlbum.add(new Rock(166,"Rock","Imagine Dragons","Love",100));
        System.out.println(musicAlbum.getLength());

        MusicComposition[] musicCompositions = new MusicComposition[3];
        musicCompositions[0] = new Rock(166,"Rock","Imagine Dragons","Love",100);
        musicCompositions[1] = new Rock(260,"Rock","Imagine Dragons", "Bad Liar",100);
        musicCompositions[2] = new Rock(210,"Rock","Imagine Dragons","Zero",100);


        FavouriteComposition fav = new FavouriteComposition(200,250);
        for (MusicComposition musicComposition :musicCompositions) {
            if (new MinLengthCompare().compare(musicComposition,fav) >=0 &&
                    new MaxLengthCompare().compare(musicComposition, fav) <=0){
                System.out.println(musicComposition);
            }
        }
    }
}
