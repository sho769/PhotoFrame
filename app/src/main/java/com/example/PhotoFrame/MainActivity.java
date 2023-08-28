package com.example.PhotoFrame;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int[] s= new int[]{R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d};
    int i=0;
    public void nextImage(View view)
    {
        ImageView img = (ImageView)findViewById(R.id.imageView);
        if(i<3) {
            i++;
            img.setImageResource(Integer.parseInt(String.valueOf(s[i])));
        }
        else
        {
            i=0;
            img.setImageResource(Integer.parseInt(String.valueOf(s[i])));
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}