package com.salmeron.mario.fizzbuzz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    protected int digitToLoop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    private void obtainData(){

        EditText inputDigit = (EditText)findViewById(R.id.digit);
        Editable inputDigitEditable = inputDigit.getText();
        String inputDigitString = inputDigitEditable.toString();
        try {
            digitToLoop= Integer.parseInt(inputDigitString);
        }catch (Exception ex){
            digitToLoop=0;
        }

    }


    public void showArrayFizzBuzz (View v){

        TextView fizzBuzzArray=(TextView)findViewById(R.id.textViewArray);

        obtainData();

        int N = digitToLoop;
        String[] anArray;
        anArray = new String[N];
        String finalView = "";


        for (int i = 1; i <= N; i++) {

            if (i % 15 == 0) {
                anArray[i-1]= "FizzBuzz";
            }else if(i % 5 == 0){
                anArray[i-1] = "Buzz";
            }else if(i % 3 == 0){
                anArray[i-1] = "Fizz";
            }else{
                anArray[i-1] = String.valueOf(i);
            }

            if (i-1<1) {
                finalView=anArray[i-1];
            }else {
                finalView = finalView + " , " + anArray[i - 1];
            }

        }

        fizzBuzzArray.setText(finalView);

    }

}
