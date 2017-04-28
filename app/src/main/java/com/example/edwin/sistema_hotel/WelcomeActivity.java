package com.example.edwin.sistema_hotel;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;

public class WelcomeActivity extends AppCompatActivity {

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p__bienvenida);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.layout.activity_navegador, menu);
        return super.onCreateOptionsMenu(menu);
    }


}
