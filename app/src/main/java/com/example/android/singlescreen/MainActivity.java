package com.example.android.singlescreen;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Typeface typeface=Typeface.createFromAsset(getAssets(), "fonts/Montserrat-Regular.ttf");

        TextView businessNameTextView = (TextView)findViewById(R.id.tv_business_name);
        businessNameTextView.setTypeface(typeface);
    }
}
