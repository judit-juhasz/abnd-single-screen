package com.example.android.singlescreen;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.R.id.message;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Typeface typeface=Typeface.createFromAsset(getAssets(),
                "fonts/Montserrat-Regular.ttf");

        TextView businessNameTextView = (TextView)findViewById(R.id.tv_business_name);
        businessNameTextView.setTypeface(typeface);

        final TextView websiteTextView = (TextView)findViewById(R.id.tv_website);
        websiteTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openWebsite = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.tanits.com"));
                startActivity(openWebsite);
            }
        });

        final TextView twitterTextView = (TextView)findViewById(R.id.tv_twitter);
        twitterTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openWebsite = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.twitter.com/TanitsHQ"));
                startActivity(openWebsite);
            }
        });

        final TextView linkedinTextView = (TextView)findViewById(R.id.tv_linkedin);
        linkedinTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openWebsite = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.linkedin.com/company/tanits"));
                startActivity(openWebsite);
            }
        });
    }
}
