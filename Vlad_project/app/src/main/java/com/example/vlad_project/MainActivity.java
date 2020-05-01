package com.example.vlad_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void openNews(View view) {
        Intent intent = new Intent(this, Knopka1.class);
        startActivity(intent);
    }
    public void openFlats(View view) {
        Intent intent = new Intent(this, Knopka2.class);
        startActivity(intent);
    }
    public void openinfrastructure(View view) {
        Intent intent = new Intent(this, infrastucture.class);
        startActivity(intent);
    }
    public void openDolshiki(View view) {
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }
    public void openBulvari(View view) {
        Intent intent = new Intent(this, Bulvari.class);
        startActivity(intent);
    }


}
