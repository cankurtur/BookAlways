package com.metric.bookalways;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button btn_kitapGir,btn_kitapBak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btn_kitapGir=(Button)findViewById(R.id.btn_kitapGir);
        btn_kitapBak=(Button)findViewById(R.id.btn_kitapBak);

    }



    public void kitapGir(View view){

        Intent intent = new Intent(HomeActivity.this,UploadActivity.class);
        startActivity(intent);

    }

    public void kitapBak(View view){
        Intent intent = new Intent(HomeActivity.this,FeedActivity.class);
        startActivity(intent);
    }

}
