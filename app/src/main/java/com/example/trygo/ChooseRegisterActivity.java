package com.example.trygo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseRegisterActivity extends AppCompatActivity {
    private Button btndriver, btncommuter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_register);

        btndriver = findViewById(R.id.btndriver);
        btncommuter = findViewById(R.id.btncommuter);

        btndriver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                    Intent intent =new Intent(ChooseRegisterActivity.this, registerActivity.class);
                    startActivity(intent);
            }

        });

        btncommuter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent =new Intent(ChooseRegisterActivity.this, registerActivity.class);
                startActivity(intent);
            }

        });
    }




    }


