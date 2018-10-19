package com.example.mraec.laboratory5;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_two);

        Button actOne = (Button) findViewById(R.id.button3);
        Button mapIlocos = (Button) findViewById(R.id.button4);

        mapIlocos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri googIntentUri = Uri.parse("geo:18.5477358,120.7126601,13z");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, googIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if(mapIntent.resolveActivity(getPackageManager()) != null){
                    startActivity(mapIntent);
                }

            }
        });

        actOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent back = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(back);
            }
        });

    }
}
