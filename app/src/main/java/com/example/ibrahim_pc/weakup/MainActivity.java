package com.example.ibrahim_pc.weakup;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static boolean avilable=false;
    private Button bton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         bton=findViewById(R.id.btnOn_id);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        MyReciver.stop();
    }

    public void on(View view) {
        if (avilable==false) {
            avilable = true;
            bton.setBackgroundColor(Color.GREEN);
        }else {
            avilable = false;
            bton.setBackgroundColor(Color.WHITE);
        }
    }


}
