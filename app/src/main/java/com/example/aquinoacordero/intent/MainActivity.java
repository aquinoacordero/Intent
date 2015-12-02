package com.example.aquinoacordero.intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getResources().getBoolean(R.bool.dual_panel)) {
            TextView textView = (TextView) findViewById(R.id.texto);
            textView.setText("land");
        } else {
            TextView textView = (TextView) findViewById(R.id.texto);
            textView.setText("port");
        }


    }
}

