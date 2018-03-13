package com.example.guest.madlibs;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


import butterknife.Bind;
import butterknife.ButterKnife;

public class StoryActivity extends AppCompatActivity {
    @Bind(R.id.storyTextView) TextView mStoryTextView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        ButterKnife.bind(this);


        Typeface ostrichFont = Typeface.createFromAsset(getAssets(), "fonts/ostrich-regular.ttf");
        mStoryTextView.setTypeface(ostrichFont);


        Intent intent = getIntent();
        String noun = intent.getStringExtra("noun");
        String noun1 = intent.getStringExtra("noun1");
        String verb = intent.getStringExtra("verb");
        String adj = intent.getStringExtra("adj");
        String adj1 = intent.getStringExtra("adj1");
        String noun2 = intent.getStringExtra("noun2");
        String adj3 = intent.getStringExtra("adj3");
//       mNounTextView.setText("Hello " + noun);
        mStoryTextView.setText("Hello" + " " + noun + ",\n" + "You will" + " " + verb + " " + "into the future," + " " + adj + " " + "and" + " " + " " + adj1 +  ".\n" + "You will find" + " "+  noun2  + "," + " " + "in" + " " +  noun1 + " " + ", and" + " " + adj3 + " " + "in" +" " + "Hell");
    }
}
