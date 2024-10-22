package com.layout.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FrameLayoutActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imageViewApple,imageViewMango,imageViewStrowberri;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);


        imageViewApple = findViewById(R.id.appleId);
        imageViewMango = findViewById(R.id.mangoId);
        imageViewStrowberri = findViewById(R.id.strowberriId);


        imageViewStrowberri.setOnClickListener(this);
        imageViewApple.setOnClickListener(this);
        imageViewMango.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if (view.getId()==R.id.strowberriId){

            imageViewStrowberri.setVisibility(View.GONE);
            imageViewApple.setVisibility(View.VISIBLE);

        }
        if (view.getId()==R.id.appleId){

            imageViewApple.setVisibility(View.GONE);
            imageViewMango.setVisibility(View.VISIBLE);

        }
        if (view.getId()==R.id.mangoId){

            imageViewMango.setVisibility(View.GONE);
            imageViewStrowberri.setVisibility(View.VISIBLE);

        }



    }
}