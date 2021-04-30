package com.example.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AnotherActivity extends AppCompatActivity {

    TextView TitleTV, DetailTV;
    ImageView highlighterIV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        TitleTV = findViewById(R.id.negara);
        DetailTV = findViewById(R.id.detail);
        highlighterIV = findViewById(R.id.imageView);

        Intent intent = getIntent();

        String mNama = intent.getStringExtra("iNama");
        String mDetail = intent.getStringExtra("iDetail");
        int bitmap = getIntent().getIntExtra("iImage", 0);

        TitleTV.setText(mNama);
        DetailTV.setText(mDetail);
        highlighterIV.setImageResource(bitmap);
    }
}