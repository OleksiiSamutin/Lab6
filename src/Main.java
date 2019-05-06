public class Main {
    public static void main(String[] args) {
        MusicDisc musicDisc = new MusicDisc("Origins","Imagine Dragons");
        musicDisc.add(new Rock(189,"Imagine Dragons","Natural", 100));
        musicDisc.add(new ElectronicMusic(244, "Calvin Garix", "I'm not alone",100));
        musicDisc.add(new Rock(181, "Imagine Dragons", "Machine",100));
        musicDisc.add(new ElectronicMusic(217,"Imagine Dragons", "Cool Out",100));
        musicDisc.add(new Rock(260,"Imagine Dragons", "Bad Liar",100));
        musicDisc.add(new Rock(217,"Imagine Dragons","West Coast",100));
        musicDisc.add(new ClassicMusic(344,"Ludvig Van Beethoven","Moon Sonata",131));
        musicDisc.add(new ClassicMusic(166,"Vivaldi","Presto",136));
        musicDisc.add(new Rock(201,"Imagine Dragons","Digital",100));
        musicDisc.add(new Rock(180,"Imagine Dragons","Only",100));
        musicDisc.add(new Rock(190,"Imagine Dragons","Stuck",100));
        musicDisc.add(new Rock(166,"Imagine Dragons","Love",100));
        System.out.println(musicDisc.getLength());

        MusicComposition[] musicCompositions = new MusicComposition[3];
        musicCompositions[0] = new Rock(166,"Imagine Dragons","Love",100);
        musicCompositions[1] = new Rock(260,"Imagine Dragons", "Bad Liar",100);
        musicCompositions[2] = new Rock(210,"Imagine Dragons","Zero",100);


        FavouriteComposition fav = new FavouriteComposition(200,250);
        for (MusicComposition musicComposition :musicCompositions) {

            if (new LengthCompare().MinLengthCompare(musicComposition,fav)>=0 &&
                    new LengthCompare().MaxLengthCompare(musicComposition,fav)<=0)
            {
                System.out.println(musicComposition);
            }
        }


        System.out.println("hey!");
        System.out.println(musicDisc);
        //Arrays.sort(musicDisc.musicCompositions, Comparator.comparing(MusicComposition::getGenre));
        //System.out.println(musicDisc);
        musicDisc.shuffle();
        System.out.println(musicDisc);
    }
}
