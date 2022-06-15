package com.example.register_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class final_page extends AppCompatActivity {
    //Initialize a button//
    Button b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        try {
            this.getSupportActionBar().hide();

        } catch (NullPointerException e) {
        }
        //Define a button GOBACK

        //Call OnClickListner//

    }
    //Create intent to go back to home page//
    public void goBack(){
        Intent int4=new Intent(final_page.this,Home_page.class);
        startActivity(int4);

    }
}