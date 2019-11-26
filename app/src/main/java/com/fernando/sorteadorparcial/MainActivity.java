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

    public void searchDraw(View v){
        setContentView(R.layout.activity_search);
    }

//    public void searchDraw (View v){
//        Intent intent = new Intent(this, SearchActivity.class);
//        startActivity(intent);
//    }




}
