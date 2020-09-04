package com.example.ragistration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class secondActivity extends AppCompatActivity {

    boolean isvalid  = false;
    private EditText username,password;
    private Button btnSUBMIT;
    private TextView textViewThird;
    private String username =" ";
    private String password =" ";
    private char counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setupUIViewS();

        btnSUBMIT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(validate());
            }
        });
    }
    private void setupUIViewS() {
        username = (EditText) findViewById(R.id.editTextUsername);
        password = (EditText) findViewById(R.id.editTextpassword);
        btnSUBMIT = (Button) findViewById(R.id.btnsignup);
    }
    private Boolean validate(){
        String inputeusername =editTextusername.getText().toString();
        String inputepassword =password.getText().toString();
        if (inputeusername.isEmpty() || inputepassword.isEmpty()) {
            Toast.makeText(secondActivity.this, "please enter the correct details", Toast.LENGTH_SHORT).show();
        } else {

        }
        isvalid = validate(inputeusername,inputepassword);
        if (!isvalid) {
            counter--;
            Toast.makeText(secondActivity.this, "incorrect credetial enterd!", Toast.LENGTH_SHORT).show();
            textViewThird.setText("welcom to the third Activity" +counter);
            if (counter ==0){
                btnSUBMIT.setEnabled(false);
                }
            }else {
            Toast.makeText(secondActivity.this, "signup successfully!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(secondActivity.this, thirdActivity.class);
            startActivity(intent);

                }

        }
    });
}

private boolean validate(String username, String password){
        if (username.equals(username) || password.equals(password)) {
         return true;
        }else {
         return false;
            }
        }

    }
