package com.example.mano.quicklauncher;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if(getIntent().hasExtra("com.example.quicklauncher.SOMETHING")) {
            TextView tv = (TextView) findViewById(R.id.textViewTest);
            String text = getIntent().getExtras().getString("com.example.quicklauncher.SOMETHING");
            tv.setText(text);
        }
    }
}
