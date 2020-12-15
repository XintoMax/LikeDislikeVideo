package org.horizoncolumbus.hs.likedislikevideo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView videoView;
    MediaPlayer mainMediaPlayer;
    int[] likeDislike = new int[](R.raw.cha_ching, R.raw.glass_break);

    public void likeClick(View v) {
        mainMediaPlayer.create(this, likeDislike[0]);
        mainMediaPlayer.start();
    }
    public void dislikeClick(View v) {
        mainMediaPlayer.create(this, likeDislike[1]);
        mainMediaPlayer.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoView.findViewById(R.id.videoView);
    }
}