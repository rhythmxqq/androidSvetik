package com.example.svetik;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        public void onClickGreenC(View view)
        {
            ConstraintLayout constraintLayout = findViewById(R.id.main);
            constraintLayout.setBackgroundColor(Color.GREEN);
        }
        public void onClickYellowC(View view)
        {
            ConstraintLayout constraintLayout = findViewById(R.id.main);
            constraintLayout.setBackgroundColor(Color.YELLOW);
        }
        public void onClickRedC(View view)
        {
            ConstraintLayout constraintLayout = findViewById(R.id.main);
            constraintLayout.setBackgroundColor(Color.RED);
        }
    }
