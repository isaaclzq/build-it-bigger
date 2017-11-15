package com.example.android.jokesandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Isaac on 5/23/17.
 */

public class JokeDisplayActivity extends AppCompatActivity {

    private TextView jokeView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.joke_display_activity);

        Intent intent = getIntent();

        if (intent == null) {
            finish();
        }

        String joke = intent.getStringExtra("joke");

        jokeView = (TextView) findViewById(R.id.text_joke);

        jokeView.setText(joke);

    }
}
