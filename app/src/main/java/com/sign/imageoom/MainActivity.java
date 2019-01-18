package com.sign.imageoom;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private Bitmap mCurrentBitmap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView firImg = findViewById(R.id.first_img);
        ImageView secImg = findViewById(R.id.second_img);


    }

    /**
     * 直接加载图片
     * @param view
     */
    private void loadOriginalSize(ImageView view){

    }

    /**
     * 压缩图片
     * @param view
     */
    private void testPicOptimize(ImageView view){

    }
}
