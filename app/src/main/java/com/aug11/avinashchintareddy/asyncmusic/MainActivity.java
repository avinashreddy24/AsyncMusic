package com.aug11.avinashchintareddy.asyncmusic;

import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp=MediaPlayer.create(this,R.raw.music);

        button= (Button) findViewById(R.id.button);
        new Asynchtask().execute(mp);




    }

    class Asynchtask extends AsyncTask{

        @Override
        protected Object doInBackground(Object[] objects) {
            MediaPlayer mp2= (MediaPlayer) objects[0];
            mp2.start();

            return null;
        }
    }




}
