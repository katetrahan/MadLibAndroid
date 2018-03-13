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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNounEditText = (EditText)  findViewById(R.id.nounEditText);

        mCreateMadLibsButton = (Button) findViewById(R.id.createMadLibsButton);

        mCreateMadLibsButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String noun = mNounEditText.getText().toString();
//                Log.d(TAG, noun);
                Intent intent = new Intent(MainActivity.this, StoryActivity.class);
                intent.putExtra("noun",noun);
                startActivity(intent);
            }

        });

    }
}
