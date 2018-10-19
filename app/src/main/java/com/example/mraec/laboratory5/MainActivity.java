package com.example.mraec.laboratory5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button actTwo = (Button) findViewById(R.id.button1);
        Button mapGoogle = (Button) findViewById(R.id.button2);

        mapGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri googIntentUri = Uri.parse("geo:-33.8666154,151.193664,17z");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, googIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if(mapIntent.resolveActivity(getPackageManager()) != null){
                    startActivity(mapIntent);
                }

            }
        });

        actTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(getApplicationContext(),MainActivityTwo.class);
                startActivity(back);
            }
        });

    }
}
