package com.example.burgerrating;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RatingBar ratingBar;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar = findViewById(R.id.ratingBar);
        textView = findViewById(R.id.textView);

    }

    public void submit(View view) {
        float ratingvalue = ratingBar.getRating();

        if (ratingvalue < 2){
            textView.setText("Rating :" + ratingvalue + "\nSorry For InConvinience");
        }
        else if (ratingvalue <=3 && ratingvalue>=2){
            textView.setText("Rating :" + ratingvalue + "\nWe are Improving Day by Day");
        }
        else if (ratingvalue <=5 && ratingvalue >3){
            textView.setText("Rating :" + ratingvalue + "\nThank You For The Rating");
        }




    }
}