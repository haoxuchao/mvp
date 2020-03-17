package com.example.im_test.Utils;

import android.content.Context;

public class uploadImg {
    private  static  Context context;

    public uploadImg(Context context) {
        this.context=context;
    }

    public interface loginLisenter {
        void sueccess(String response, String tag);

        void error(Exception error, String tag);
    }
}
