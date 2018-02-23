package com.squad.stopby;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {
    private Button toPostButton;
    private Button toSearchButton;
    private Button toProfileButton;
    private Button toSettingsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        toPostButton = (Button) findViewById(R.id.toPostButton);
        toSearchButton = (Button) findViewById(R.id.toSearchButton);
        toProfileButton = (Button) findViewById(R.id.toProfileButton);
        toSettingsButton = (Button) findViewById(R.id.toSettingsButton);

        toPostButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu2Post();
            }
        });

        toSearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu2Search();
            }
        });
    }

    public void menu2Post() {
        Intent intent = new Intent(this, Post.class);
        startActivity(intent);
    }

    public void menu2Search() {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }
}
