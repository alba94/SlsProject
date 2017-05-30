package com.example.albal.slsproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import at.lukle.clickableareasimage.OnClickableAreaClickedListener;

/**
 * Created by albal on 12/05/2017.
 */

public class Anatomi extends AppCompatActivity implements OnClickableAreaClickedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anatomi);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }

    @Override
    public void onClickableAreaTouched(Object o) {
        if (o instanceof Character) {
            Intent intent = new Intent(Anatomi.this, Act_Koka.class);
            startActivity(intent);
        }
    }
}
