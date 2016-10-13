package com.example.gio.intentexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        public static final int REQUEST_CODE=10;
    Button btn1;
    TextView name,surname,age,sex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.button1);
        name=(TextView)findViewById(R.id.Username);
        surname=(TextView)findViewById(R.id.surname12);
        age=(TextView)findViewById(R.id.age);
        sex=(TextView)findViewById(R.id.sex);
    }

    public void getData(View view) {
        Intent i=new Intent(MainActivity.this,Data.class);
        startActivityForResult(i,REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        btn1.setVisibility(View.GONE);
        age.setText(data.getExtras().getString("age"));
        name.setText(data.getExtras().getString("name"));
        surname.setText(data.getExtras().getString("surname"));
        sex.setText(data.getExtras().getString("sex"));
        age.setVisibility(View.VISIBLE);
        name.setVisibility(View.VISIBLE);
        surname.setVisibility(View.VISIBLE);
        sex.setVisibility(View.VISIBLE);

    }
}
