package com.example.ibrahim_pc.weakup;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Toast;


public class MyReciver extends BroadcastReceiver {
    static MediaPlayer Player1;
    static MediaPlayer Player2;

    @Override
    public void onReceive(final Context context, Intent intent) {
       if (MainActivity.avilable){
        String action = intent.getAction();
        if (action.equals(Intent.ACTION_POWER_CONNECTED)) {
            Player1 = MediaPlayer.create(context, R.raw.a);
            Player1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    mediaPlayer.start();
                }
            });
            Player1.start();
        } else if (action.equals(Intent.ACTION_POWER_DISCONNECTED)) {
            if (Player1 != null) Player1.stop();
            Player2 = MediaPlayer.create(context, R.raw.b);
            Player2.start();

        }}else {
       }
    }

public static void stop(){
        if (Player1.isPlaying()){Player1.stop();}
    if (Player2.isPlaying()){Player2.stop();}

}
}
