package com.example.guest.madlibs;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity {
//    public static final String TAG = MainActivity.class.getSimpleName();
    @Bind(R.id.createMadLibsButton)Button mCreateMadLibsButton;
    @Bind(R.id.nounEditText)EditText mNounEditText;
    @Bind(R.id.verbEditText)EditText mVerbEditText;
    @Bind(R.id.adjEditText)EditText mAdjEditText;
    @Bind(R.id.adj1EditText)EditText mAdj1EditText;
    @Bind(R.id.noun2EditText)EditText mNoun2EditText;
    @Bind(R.id.noun1EditText)EditText mNoun1EditText;
    @Bind(R.id.adj3EditText)EditText mAdj3EditText;
    @Bind(R.id.appNameTextView)TextView mAppNameTextView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mNounEditText.getText().clear();
        mVerbEditText.getText().clear();
        mAdjEditText.getText().clear();
        mAdj1EditText.getText().clear();
        mNoun2EditText.getText().clear();
        mNoun1EditText.getText().clear();
        mAdj3EditText.getText().clear();


        Typeface ostrichFont = Typeface.createFromAsset(getAssets(), "fonts/ostrich-regular.ttf");
        mAppNameTextView.setTypeface(ostrichFont);




        mCreateMadLibsButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String noun = mNounEditText.getText().toString();
                String noun1 = mNoun1EditText.getText().toString();
                String verb = mVerbEditText.getText().toString();
                String adj = mAdjEditText.getText().toString();
                String adj1 = mAdj1EditText.getText().toString();
                String noun2 = mNoun2EditText.getText().toString();
                String adj3 = mAdj3EditText.getText().toString();
//                Log.d(TAG, noun);
                Intent intent = new Intent(MainActivity.this, StoryActivity.class);
                intent.putExtra("noun",noun);
                intent.putExtra("noun1", noun1);
                intent.putExtra("verb", verb);
                intent.putExtra("adj",adj);
                intent.putExtra("adj1", adj1);
                intent.putExtra("noun2",noun2);
                intent.putExtra("adj3",adj3);
                startActivity(intent);
            }

        });

    }
}
