package com.example.trygo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class DriverMainpageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_main_page);

        final CardView cardViewPopup = findViewById(R.id.cardViewPopup);
        Button btnAccept = findViewById(R.id.btnAccept);

        btnAccept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Show the CardView popup
                cardViewPopup.setVisibility(View.VISIBLE);
            }
        });

        // Optionally, you can set an OnClickListener for the CardView to make it disappear
        cardViewPopup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Hide the CardView popup
                cardViewPopup.setVisibility(View.GONE);
            }
        });
    }
}