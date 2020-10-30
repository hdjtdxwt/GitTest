package com.hdjtdxwt.gittest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textView;
    Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        textView.setOnClickListener(this);

        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(this);

        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.textView:{
                Toast.makeText(this, "第一个textView", Toast.LENGTH_SHORT).show();
            } break;
            case R.id.btn1:{
                Toast.makeText(this, "按钮1", Toast.LENGTH_SHORT).show();
            }break;
            case R.id.btn2:{
                Toast.makeText(this, "按钮2点击了", Toast.LENGTH_SHORT).show();
            }break;
        }
    }
}