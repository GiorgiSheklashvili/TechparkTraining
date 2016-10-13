package com.example.gio.intentexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Data extends AppCompatActivity {
        Button btn1,btn2,click;
    EditText name,surname,age;
    String man;
    int ResultCode=10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        btn1=(Button)findViewById(R.id.button2);
        btn2=(Button)findViewById(R.id.button);
        age=(EditText) findViewById(R.id.ageedittext);
        click=(Button)findViewById(R.id.click);
        name=(EditText)findViewById(R.id.Edittext1);
        surname=(EditText)findViewById(R.id.editText);
        btn1.setPressed(false);
        btn2.setPressed(false);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn1.setSelected(true);
                btn2.setSelected(false);
                man="kaci";
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn2.setSelected(true);
                btn1.setSelected(false);
                man="qali";
            }
        });
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent();
                i.putExtra("age",age.getText().toString());
                i.putExtra("name",name.getText().toString());
                i.putExtra("surname",surname.getText().toString());
                i.putExtra("sex",man);
                setResult(ResultCode,i);
                finish();
            }
        });

    }

}
