package com.iwave.snackbar;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button normal,action;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        normal=(Button)findViewById(R.id.normal);
        action=(Button)findViewById(R.id.action);
        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar mSnackbar=Snackbar.make(normal,"i am normal snackbar",Snackbar.LENGTH_LONG);
                mSnackbar.show();
            }
        });
        action.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar mSnackbar=Snackbar.make(normal,"i am action snackbar",Snackbar.LENGTH_LONG);
                mSnackbar.setAction("ok", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this,"action clicked and i am toast",Toast.LENGTH_LONG).show();
                    }
                });
                mSnackbar.show();
            }
        });

    }
}
