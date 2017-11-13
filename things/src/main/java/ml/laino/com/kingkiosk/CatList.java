package ml.laino.com.kingkiosk;

import android.text.Spanned;

/**
 * Created by LAINO on 2017. 11. 13..
 */

public class CatList {
    int image;
    String title;

    int getImage(){
        return this.image;
    }
    String getTitle(){
        return this.title;
    }

    CatList(int image, String title){
        this.image=image;
        this.title=title;
    }
}