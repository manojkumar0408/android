package com.iwave.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onDisplay(View view) {
        edit = (EditText) findViewById(R.id.editText1);
        String mMessage= edit.getText().toString();
        Toast.makeText(MainActivity.this,mMessage,Toast.LENGTH_LONG).show();
    }
}
