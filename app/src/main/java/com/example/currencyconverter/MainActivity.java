package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {




    public void btnclicked(View view){
        final String TAG = "values";
////        to see if its working or not use logcat
//        Log.i(TAG, "button clickd ");
//        EditText newed=(EditText)findViewById(R.id.newed) ;
//        Log.i(TAG, newed.getText().toString());

//        to give toast when button clicked
//        Toast.makeText(this,"IT worked",Toast.LENGTH_SHORT).show();
        EditText newed=(EditText)findViewById(R.id.newed) ;
        String txt=newed.getText().toString();
        double d = Double.parseDouble(txt);
        d = d*0.012;
        String str = Double.toString(d);
//        Log.i(TAG, "btnclicked: "+str);
        Toast.makeText(this,"Amount is"+str+"in dollars",Toast.LENGTH_SHORT).show();



    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}