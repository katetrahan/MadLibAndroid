package com.example.guest.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class StoryActivity extends AppCompatActivity {
    private TextView mNounTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        mNounTextView = (TextView) findViewById(R.id.nounTextView);
        Intent intent = getIntent();
        String noun = intent.getStringExtra("noun");
        mNounTextView.setText("My name is: " + noun);
    }
}
