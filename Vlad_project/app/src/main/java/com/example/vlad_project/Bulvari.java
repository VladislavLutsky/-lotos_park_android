package com.example.vlad_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.vlad_project.GalleryArchitech.gallery2;
import com.example.vlad_project.GalleryBulvari.gallery;
import com.example.vlad_project.GalleryHolls.gallery3;

public class Bulvari extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bulvari);
    }
    public void openGallery(View view) {
        Intent intent = new Intent(this, gallery.class);
        startActivity(intent);
    }
    public void openGallery2(View view) {
        Intent intent = new Intent(this, gallery2.class);
        startActivity(intent);
    }
    public void openGallery3(View view) {
        Intent intent = new Intent(this, gallery3.class);
        startActivity(intent);
    }
}
