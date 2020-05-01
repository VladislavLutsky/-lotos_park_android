package com.example.vlad_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dolshiki);
    }
    public void MessageSendler (View view) {
        Intent intent = new Intent(this, MessageSendler.class);
        startActivity(intent);
    }
}
