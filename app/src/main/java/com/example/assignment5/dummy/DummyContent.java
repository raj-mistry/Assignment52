package com.example.assignment5.dummy;

import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    private static ArrayList<String> mNames = new ArrayList<>();
    private static ArrayList<String> mDescription = new ArrayList<>();
    private static ArrayList<String> mDetailedDescription = new ArrayList<>();
    private static ArrayList<String> mImageUrls = new ArrayList<>();



    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 1;


    static {

        mImageUrls.add("https://images-na.ssl-images-amazon.com/images/S/sgp-catalog-images/region_US/toei-TOEI-DBB_S1-Full-Image_GalleryCover-en-US-1479951130744._UY500_UX667_RI_V4de172d91eed11a414543f2eee34b60e_TTW_.jpg");
        mNames.add("Dragonball");
        mDescription.add("One of the greatest anime of all time");
        mDetailedDescription.add("Dragon Ball (Japanese: ドラゴンボール, Hepburn: Doragon Bōru) is a Japanese media franchise created by Akira Toriyama in 1984. The initial manga, written and illustrated by Toriyama, was serialized in Weekly Shōnen Jump from 1984 to 1995, with the 519 individual chapters collected into 42 tankōbon volumes by its publisher Shueisha.");


        // Add some sample items.
        //for (int i = 0; i <= COUNT; i++) {
        //    addItem(createDummyItem(i));
        //}

        addItem(new DummyItem(String.valueOf(0), mNames.get(0), mDescription.get(0), mDescription.get(0)));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), mNames.get(position), mDescription.get(position), mDetailedDescription.get(position));
    }
    /*

    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }
     */

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;
        public final String description;

        public DummyItem(String id, String content, String details, String description) {
            this.id = id;
            this.content = content;
            this.details = details;
            this.description = description;
        }

        @Override
        public String toString() {
            return content;
        }
    }

    public void initImageBitmaps(){

        mImageUrls.add("https://images-na.ssl-images-amazon.com/images/S/sgp-catalog-images/region_US/toei-TOEI-DBB_S1-Full-Image_GalleryCover-en-US-1479951130744._UY500_UX667_RI_V4de172d91eed11a414543f2eee34b60e_TTW_.jpg");
        mNames.add("Dragonball");
        mDescription.add("One of the greatest anime of all time");
        mDetailedDescription.add("Dragon Ball (Japanese: ドラゴンボール, Hepburn: Doragon Bōru) is a Japanese media franchise created by Akira Toriyama in 1984. The initial manga, written and illustrated by Toriyama, was serialized in Weekly Shōnen Jump from 1984 to 1995, with the 519 individual chapters collected into 42 tankōbon volumes by its publisher Shueisha.");

        mImageUrls.add("https://m.media-amazon.com/images/M/MV5BZmQ5NGFiNWEtMmMyMC00MDdiLTg4YjktOGY5Yzc2MDUxMTE1XkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_.jpg");
        mNames.add("Naruto");
        mDescription.add("A story of a ninja");
        mDetailedDescription.add("Naruto (Japanese: ナルト) is a Japanese manga series written and illustrated by Masashi Kishimoto. It tells the story of Naruto Uzumaki, a young ninja who seeks recognition from his peers and dreams of becoming the Hokage, the leader of his village. The story is told in two parts – the first set in Naruto's pre-teen years, and the second in his teens. The series is based on two one-shot manga by Kishimoto: Karakuri (1995), which earned Kishimoto an honorable mention in Shueisha's monthly Hop Step Award the following year, and Naruto (1997).");

        mImageUrls.add("https://www.denofgeek.com/wp-content/uploads/2020/07/One-Piece-Full-Cast-Header-Image.jpg?resize=768%2C432");
        mNames.add("One Piece");
        mDescription.add("Monkey D Luffy looks for a treasure called the One Piece");
        mDetailedDescription.add("One Piece (stylized as ONE PIECE) is a Japanese manga series written and illustrated by Eiichiro Oda. It has been serialized in Shueisha's Weekly Shōnen Jump magazine since July 1997, with its individual chapters compiled into 97 tankōbon volumes as of September 2020. The story follows the adventures of Monkey D. Luffy, a boy whose body gained the properties of rubber after unintentionally eating a Devil Fruit.");

        mImageUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSjVozE6j3MbZynE3s6CfJx8EkdoctN1aEUPg&usqp=CAU");
        mNames.add("Death Note");
        mDescription.add("A notebook that whatever name you write in it, the person will die.");
        mDetailedDescription.add("Death Note (Japanese: デスノート, Hepburn: Desu Nōto) is a Japanese manga series written by Tsugumi Ohba and illustrated by Takeshi Obata. The story follows Light Yagami, a teen genius who stumbles across a mysterious otherworldly notebook: the \"Death Note\", which belonged to the Shinigami Ryuk and grants the user the supernatural ability to kill anyone whose name is written in its pages.");


        mImageUrls.add("https://vignette.wikia.nocookie.net/naruto/images/9/9d/Lee_Pose.png/revision/latest/scale-to-width-down/340?cb=20150124171221");
        mNames.add("Rock Lee");
        mDescription.add("Rock Lee Approves");
        mDetailedDescription.add("Rock Lee (Japanese: ロック・リー, Hepburn: Rokku Rī) is a fictional character in the anime and manga series Naruto created by Masashi Kishimoto. Kishimoto considers Lee his favorite character to draw, and at first designed Lee to symbolize human weakness.[3][4] In the anime and manga, Lee is a ninja affiliated with the village of Konohagakure, and is a member of Team Guy, which consists of himself, Neji Hyuga, Tenten, and Might Guy—the team's leader. Unable to use most ninja techniques, Lee dedicates himself to using solely taijutsu, ninja techniques similar to martial arts. Lee dreams of becoming a \"splendid ninja\" despite his inabilities. Lee has appeared in several pieces of Naruto media, including the third and fourth featured films in the series, the third original video animation, and multiple video games.");

        mImageUrls.add("https://m.media-amazon.com/images/M/MV5BZmE1NjIyNjYtMTVmMy00M2YyLTljMjMtZGQwYmUxOTU4NjRlXkEyXkFqcGdeQXVyNjc3OTE4Nzk@._V1_.jpg");
        mNames.add("Mob Pyscho 100");
        mDescription.add("Basically ghost busters but with superpowers");
        mDetailedDescription.add("Mob Psycho 100 (Japanese: モブサイコ100, Hepburn: Mobu Saiko Hyaku) is a Japanese manga series written and illustrated by ONE. It began publication on Shogakukan's Ura Sunday website in April 2012 and concluded in December 2017. It has been also available online on Shogakukan's mobile app MangaOne since December 2014. Shogakukan compiled its chapters into sixteen tankōbon volumes.");


        mImageUrls.add("https://www.monstersandcritics.com/wp-content/uploads/2020/03/Haikyuu-Season-5-release-date-Haikyuu-To-The-Top-Season-2-Part-2-summer-2020.jpg");
        mNames.add("Haikyuu!!");
        mDescription.add("The Greatest sports anime of all time");
        mDetailedDescription.add("Haikyu!! (Japanese: ハイキュー!!, Hepburn: Haikyu!!, from the kanji 排球 \"volleyball\") is a Japanese manga series written and illustrated by Haruichi Furudate. The story follows Shōyō Hinata, a boy determined to become a great volleyball player despite his small stature. Its individual chapters were serialized in Weekly Shōnen Jump from February 2012 through July 2020. As of May 2020, forty-three tankōbon volumes have been released in Japan by Shueisha.");

        mImageUrls.add("https://cdn1.i-scmp.com/sites/default/files/2015/06/15/maxresdefault.jpg");
        mNames.add("Attack on Titan");
        mDescription.add("An apocalypse of giants and the survival of the human race");
        mDetailedDescription.add("Attack on Titan (Japanese: 進撃の巨人, Hepburn: Shingeki no Kyojin, lit. \"The Advancing Giant[s]\") is a Japanese manga series written and illustrated by Hajime Isayama. It is set in a world where humanity lives within cities surrounded by enormous walls that protect them from gigantic man-eating humanoids referred to as Titans; the story follows Eren Yeager, who vows to retake the world after a Titan brings about the destruction of his home town and the death of his mother. Attack on Titan has been serialized in Kodansha's monthly Bessatsu Shōnen Magazine since September 2009, and collected into 32 tankōbon volumes as of September 2020.");

        mImageUrls.add("https://occ-0-990-987.1.nflxso.net/dnm/api/v6/E8vDc_W8CLv7-yMQu8KMEC7Rrr8/AAAABUS0tODygRPvN6Ekv8edM7fDKBMYR0-ZnptNi6Oo8O4dDaOg7yfpGQMdi-COGkltQqoNq5e5g4mS43KiuLPGev2c3MfO.jpg?r=48d");
        mNames.add("Sword Art Online");
        mDescription.add("Teens gets stuck in a VR Game that they need to beat to escape");
        mDetailedDescription.add("Sword Art Online (Japanese: ソードアート・オンライン, Hepburn: Sōdo Āto Onrain) is a Japanese light novel series written by Reki Kawahara and illustrated by abec. The series takes place in the near future and focuses on protagonist Kazuto \"Kirito\" Kirigaya and Asuna Yuuki as they play through various virtual reality MMORPG worlds. Kawahara originally wrote the series as a web novel on his website from 2002 to 2008. The light novels began publication on ASCII Media Works' Dengeki Bunko imprint from April 10, 2009, with a spin-off series launching in October 2012. The series has spawned nine manga adaptations published by ASCII Media Works and Kadokawa. The novels and the manga adaptations have been licensed for release in North America by Yen Press.");

    }
}