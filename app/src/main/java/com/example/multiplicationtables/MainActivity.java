package com.example.multiplicationtables;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.renderscript.Sampler;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     Button button;
     EditText editText;
     TextView textView;
     String Value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button =(Button) findViewById(R.id.button);
        editText =(EditText) findViewById(R.id.editTextNumber);
        textView =(TextView) findViewById(R.id.textView2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(editText.getText().toString())){
                    Toast.makeText(MainActivity.this, "INVALID INPUT", Toast.LENGTH_SHORT).show();
                }
                else{
                String s = editText.getText().toString();
                int n = Integer.parseInt(s);
                Value="";
                for (int i =1;i<= 10; i++ ) {
                    Value += n + " " + "X" + " " + i + " " + "=" + " " + i * n + "\n";
                    textView.setText(Value);
                }
                }
            }
        });
    }
}