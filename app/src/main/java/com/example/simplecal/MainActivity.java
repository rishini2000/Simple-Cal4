package com.example.simplecal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtValue1;
    EditText txtValue2;
    TextView lblAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtValue1 = findViewById(R.id.txtValue1);
        txtValue2 = findViewById(R.id.txtValue2);
        lblAnswer = findViewById(R.id.lblAnswer);
    }

    int value1 = 0;
    int value2 = 0;
    int answer = 0;

    public void calculate(View v) {

        String tag = v.getTag().toString();
        lblAnswer.setText(tag);

        String value1 = txtValue1.getText().toString();
        String value2 = txtValue2.getText().toString();

        Double x = Double.parseDouble(value1);
        Double y = Double.parseDouble(value2);


        double answer = 0;

        switch (tag){
            case "add": answer = x+y; break;
            case "sub": answer = x-y; break;
            case "mul": answer = x*y; break;
            case "div": answer = x/y; break;
        }
        lblAnswer.setText("Answer is: " + answer);
    }




    }


