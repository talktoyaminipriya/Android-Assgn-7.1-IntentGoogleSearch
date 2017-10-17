package com.example.intentgooglesearch;

import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et);
        bt1 = (Button) findViewById(R.id.bt);
        bt1.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_WEB_SEARCH);
                String str = et1.getText().toString();
                i.putExtra(SearchManager.QUERY,str);
                startActivity(i);


            }
        });
    }
}
