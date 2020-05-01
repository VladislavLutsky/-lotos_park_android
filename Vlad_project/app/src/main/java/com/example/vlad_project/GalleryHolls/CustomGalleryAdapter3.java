package com.example.vlad_project.GalleryHolls;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class CustomGalleryAdapter3 extends BaseAdapter {

    private Context context;
    private int[] images;

    public CustomGalleryAdapter3(Context c, int[] images3) {
        context = c;
        this.images = images3;
    }

    // returns the number of images
    public int getCount() {
        return images.length;
    }

    // returns the ID of an item
    public Object getItem(int position) {
        return position;
    }

    // returns the ID of an item
    public long getItemId(int position) {
        return position;
    }

    // returns an ImageView view
    public View getView(int position, View convertView, ViewGroup parent) {

        // create a ImageView programmatically
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(images[position]); // set image in ImageView
        imageView.setLayoutParams(new Gallery.LayoutParams(150, 200)); // set ImageView param
        return imageView;
    }
}