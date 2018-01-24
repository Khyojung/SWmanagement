package com.example.hyojung.swmanagement;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static final String KEY = "AIzaSyDzCc2IM3nlutZz2pnVFZwNiuDBF7RsoYg";
    public static final int REQUEST_AUTHORIZATION = 1001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.v("test","1");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v("test","test2");


       // CellAddress test = new CellAddress();

        Button myButton = this.findViewById(R.id.test);
        myButton.setOnClickListener(new View.OnClickListener()
                                    {
                                        public void onClick(View v)
                                        {

                                            /*CellAddress testC = new CellAddress();
                                            // testClass testC = new testClass();
                                            try {
                                                testC.test();
                                            } catch (Exception e) {
                                                e.printStackTrace();
                                            }*/
                                        }
                                    }
        );


    }



}

