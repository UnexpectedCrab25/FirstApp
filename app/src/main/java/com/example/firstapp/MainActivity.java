package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button incrementButton;
TextView greetingDisplay;
EditText getName;
int count = 0;
String displayChange;
char[] letters;
String[] randoms;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        incrementButton = findViewById(R.id.incrementbutton);
        greetingDisplay = findViewById(R.id.greetingtext);
        displayChange = "";
        randoms = new String[]{"apple", "banana", "bababna","jonkers scabby","taco cat","bonkers", "maurice", "carrot", "amogus", "pile", "caret", "aululughugh", "chevron", "hubert", "jimmy"};
        getName = findViewById(R.id.textediter);
        incrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayChange = getName.getText().toString();
                //System.out.println("Text Accepted" + ++count);
                Log.i("Text Accepted", "nice");
                greetingDisplay.setText(displayChange);
            }
        });
    }

    public void Reverse(View view) {
        System.out.println("Reversing...");
        letters = greetingDisplay.getText().toString().toCharArray();
        char[] temp = new char[letters.length];
        for(int n = 0; n<letters.length; n++) {
        temp[letters.length-1-n]= letters[n];
        }
        letters = temp;
        displayChange = "";
        for(char c:letters){
            displayChange = displayChange + "" + c;

        }
        greetingDisplay.setText(displayChange);
    }
    public void RandoWord(View view){
        int rand = (int)(Math.random() * randoms.length);
        displayChange = randoms[rand];
        greetingDisplay.setText(displayChange);
    }
}