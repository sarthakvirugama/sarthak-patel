package com.example.ragistration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class thirdActivity extends AppCompatActivity {

    private TextView textViewThird;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        textViewThird = findViewById(R.id.textViewlogin);

    }
}