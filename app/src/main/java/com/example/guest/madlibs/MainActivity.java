package com.example.guest.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
//    public static final String TAG = MainActivity.class.getSimpleName();
    private Button mCreateMadLibsButton;
    private EditText mNounEditText;
    private EditText mVerbEditText;
    private EditText mAdjEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNounEditText = (EditText)  findViewById(R.id.nounEditText);
        mVerbEditText = (EditText)  findViewById(R.id.verbEditText);
        mAdjEditText = (EditText) findViewById(R.id.adjEditText);

        mCreateMadLibsButton = (Button) findViewById(R.id.createMadLibsButton);

        mCreateMadLibsButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String noun = mNounEditText.getText().toString();
                String verb = mVerbEditText.getText().toString();
                String adj = mAdjEditText.getText().toString();
//                Log.d(TAG, noun);
                Intent intent = new Intent(MainActivity.this, StoryActivity.class);
                intent.putExtra("noun",noun);
                intent.putExtra("verb", verb);
                intent.putExtra("adj",adj);
                startActivity(intent);
            }

        });

    }
}
