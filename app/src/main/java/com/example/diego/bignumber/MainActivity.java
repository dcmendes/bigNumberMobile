package com.example.diego.bignumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigInteger;

public class MainActivity extends AppCompatActivity {

    int fibonnaci;
    BigInteger big, in , end, swap;

    EditText edit;
    TextView text;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //i = new BigInteger(fibonnaci, );
        edit = (EditText) findViewById(R.id.input);
        text = (TextView) findViewById(R.id.nFibonnaci);
        button = (Button) findViewById(R.id.button);
        in = BigInteger.valueOf(0);
        end = BigInteger.valueOf(1);
        swap = BigInteger.valueOf(1);
    }
     public void calcFibonnaci(int n){
        //in = 0;
        //end = 1;
        for ( int i = 2; i <= n; i++){
            swap = in.add(end);
            in = end;
            end = swap;
        }
        //return String.valueOf(in);
        text.setText(in.toString());
    }

    public void fiboCalc(View view){
        calcFibonnaci(Integer.parseInt(edit.getText().toString()));
    }


}
