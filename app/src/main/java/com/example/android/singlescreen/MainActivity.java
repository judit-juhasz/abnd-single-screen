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
    }

    public void openMainWebsite(View view) {
        Intent openWebsite = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.tanits.com"));
        startActivity(openWebsite);
    }

    public void sendEmail(View view) {
        Intent sendEmailIntent = new Intent(Intent.ACTION_SENDTO,
                Uri.fromParts("mailto","judit@juhasz.name", null));
        sendEmailIntent.putExtra(Intent.EXTRA_SUBJECT, "The subject comes here");
        sendEmailIntent.putExtra(Intent.EXTRA_TEXT, "Write your message here.");
        startActivity(Intent.createChooser(sendEmailIntent, "Choose and Email client: "));
    }

    public void openTwitterWebsite(View view) {
        Intent openWebsite = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.twitter.com/TanitsHQ"));
        startActivity(openWebsite);
    }

    public void openLinkedinWebsite(View view) {
        Intent openWebsite = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.linkedin.com/company/tanits"));
        startActivity(openWebsite);
    }
}
