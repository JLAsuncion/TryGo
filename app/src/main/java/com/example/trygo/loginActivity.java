package com.example.trygo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;
import android.app.Activity;


public class loginActivity extends AppCompatActivity {

    EditText editTextTextEmailAddress, inputPassword;
    Button logIN;

    String correct_email = "pablo@gmail.com";
    String correct_pass = "pabloisgyatt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextTextEmailAddress = findViewById(R.id.editTextTextEmailAddress);
        inputPassword = findViewById(R.id.inputPassword);
        logIN = findViewById(R.id.logIN);

        logIN.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                if (TextUtils.isEmpty(editTextTextEmailAddress.getText().toString())
                        || TextUtils.isEmpty(inputPassword.getText().toString())) {

                    Toast.makeText(loginActivity.this, "Please type email and password", Toast.LENGTH_LONG).show();
                } else if (editTextTextEmailAddress.getText().toString().equals(correct_email)) {

                    //check password
                    if (inputPassword.getText().toString().equals(correct_pass)) {
                        Toast.makeText(loginActivity.this, "Successful Log In", Toast.LENGTH_LONG).show();
                        Intent intent =new Intent(loginActivity.this, MapTest.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(loginActivity.this, "Invalid Username & Password", Toast.LENGTH_LONG).show();
                    }

                } else {
                    Toast.makeText(loginActivity.this, "Login Failed", Toast.LENGTH_LONG).show();
                }

            }

        });
    }
}
