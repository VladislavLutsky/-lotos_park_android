package com.example.vlad_project.GalleryHolls;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.vlad_project.R;

public class gallery3 extends AppCompatActivity {

    Gallery simpleGallery;
    CustomGalleryAdapter3 customGalleryAdapter;
    ImageView selectedImageView;
    // array of images
    int[] images = {R.drawable.fon__1_,R.drawable.fon__1_};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery3);
        simpleGallery = (Gallery) findViewById(R.id.simpleGallery3); // get the reference of Gallery
        selectedImageView = (ImageView) findViewById(R.id.selectedImageView3); // get the reference of ImageView
        customGalleryAdapter = new CustomGalleryAdapter3(getApplicationContext(), images); // initialize the adapter
        simpleGallery.setAdapter(customGalleryAdapter); // set the adapter
        // perform setOnItemClickListener event on the Gallery
        simpleGallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // set the selected image in the ImageView
                selectedImageView.setImageResource(images[position]);


            }

        });
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
