package com.example.ragistration;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean isvalid = false;
    private EditText editTextUsername;
    private EditText editTextPassword;
    private Button btnLOGIN;
    private TextView textViewlogin;
    private TextView textViewsignup;
    private String username = "";
    private String password = "";
    private char counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        btnLOGIN = findViewById(R.id.btnLOGIN);
        textViewlogin = findViewById(R.id.textViewlogin);
        textViewsignup = findViewById(R.id.textViewsignup);
        btnLOGIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputusername = editTextUsername.getText().toString();
                String inputpassword = editTextPassword.getText().toString();
                if (inputusername.isEmpty() || inputpassword.isEmpty()) {
                    Toast.makeText(MainActivity.this, "please enter the correct details", Toast.LENGTH_SHORT).show();
                } else {

                }
                isvalid = validate(inputusername, inputpassword);
                if (!isvalid) {
                    counter--;
                    Toast.makeText(MainActivity.this, "incorrect credetial enterd!", Toast.LENGTH_SHORT).show();
                    textViewlogin.setText("Already login?"+counter);

                    textViewsignup.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                    textViewsignup.setText("sign up!");
                    if (counter ==0){
                        btnLOGIN.setEnabled(false);
                    }
                }else{
                    Toast.makeText(MainActivity.this, "login successfully!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, thirdActivity.class);
                    startActivity(intent);

                }

            }
        });
    }


    private boolean validate(String username, String password){
        if (username.equals(username) && password.equals(password)) {
            return true;
        }else {
            return false;
        }
    }

}
