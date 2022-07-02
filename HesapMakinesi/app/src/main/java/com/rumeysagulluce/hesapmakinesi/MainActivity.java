package com.rumeysagulluce.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText text;
    EditText text1;
    TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=findViewById(R.id.textId1);
        text1=findViewById(R.id.textId2);
        textView=findViewById(R.id.sonucId);

    }
    public void topla(View view){

        if (text.getText().toString().matches("")||text1.getText().toString().matches("")){

            textView.setText("Enter Number");

        }
        else{
            int gelen =Integer.parseInt(text.getText().toString());
            int gelen2 =Integer.parseInt(text1.getText().toString());

            int toplam=gelen+gelen2;
            textView.setText("Toplam:"+toplam);
        }


    }
    public void cıkar(View view){


        if (text.getText().toString().matches("")||text1.getText().toString().matches("")){
            textView.setText("Enter Number");

        }
        else{
            int gelen =Integer.parseInt(text.getText().toString());
            int gelen2 =Integer.parseInt(text1.getText().toString());
            int cıkan=gelen-gelen2;
            textView.setText("Toplam:"+cıkan);
        }


    }
    public void bol(View view){


        if (text.getText().toString().matches("")||text1.getText().toString().matches("")){
            textView.setText("Enter Number");

        }
        else{
            int gelen =Integer.parseInt(text.getText().toString());
            int gelen2 =Integer.parseInt(text1.getText().toString());
            int bol=gelen/gelen2;
            textView.setText("Bölüm:"+bol);
        }



    }
    public void carp(View view){

        if (text.getText().toString().matches("")||text1.getText().toString().matches("")){
            textView.setText("Enter Number");

        }
        else {
            int gelen =Integer.parseInt(text.getText().toString());
            int gelen2 =Integer.parseInt(text1.getText().toString());
            int carp = gelen * gelen2;
            textView.setText("carpma:" + carp);
        }
    }
}