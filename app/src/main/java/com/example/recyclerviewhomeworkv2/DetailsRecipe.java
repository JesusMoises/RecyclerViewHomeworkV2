package com.example.recyclerviewhomeworkv2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailsRecipe extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.prueba.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_recipes);

        String value = "";
        Bundle extras = getIntent().getExtras();
        if(extras!= null){
            value = extras.getString(EXTRA_MESSAGE);
        }
        TextView textView = findViewById(R.id.textRecipeDet);
        textView.setText(value);


        Button btn = (Button) findViewById(R.id.btn_back);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }


}
