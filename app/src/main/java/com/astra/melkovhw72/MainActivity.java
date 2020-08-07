package com.astra.melkovhw72;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final View simple = findViewById(R.id.simple_view);
        final View engineer = findViewById(R.id.engineer_view);

        Button btnChangeView = findViewById(R.id.button_change_view);
        btnChangeView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(simple.getVisibility() == View.GONE) {
                       simple.setVisibility(View.VISIBLE);
                       engineer.setVisibility(View.GONE);
                } else {
                    simple.setVisibility(View.GONE);
                    engineer.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}