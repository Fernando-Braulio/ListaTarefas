package com.fernando.sorteadorparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void searchDraw(View view){
        Intent it = new Intent(MainActivity.this, SearchActivity.class);
        startActivity(it);
    }

//    public void searchDraw(View v) {
//        startActivity(new Intent(getBaseContext(), SearchActivity.class));
//    }

}
