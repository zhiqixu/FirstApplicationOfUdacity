package com.example.lynn.firstapplicationofudacity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Btn_PopMoview = (Button) findViewById(R.id.button_PopMovies);//获取按钮资源
        Btn_PopMoview.setOnClickListener(listener);//设置监听

        Button Btn_Stock = (Button) findViewById(R.id.button_Stock);//获取按钮资源
        Btn_Stock.setOnClickListener(listener);//设置监听

        Button Btn_Bigger = (Button) findViewById(R.id.button_Bigger);//获取按钮资源
        Btn_Bigger.setOnClickListener(listener);//设置监听

        Button Btn_Material = (Button) findViewById(R.id.button_Material);//获取按钮资源
        Btn_Material.setOnClickListener(listener);//设置监听

        Button Btn_Ubiquitous = (Button) findViewById(R.id.button_Ubiquitous);//获取按钮资源
        Btn_Ubiquitous.setOnClickListener(listener);//设置监听

        Button Btn_Capston = (Button) findViewById(R.id.button_Capstone);//获取按钮资源
        Btn_Capston.setOnClickListener(listener);//设置监听
    }

    Button.OnClickListener listener = new Button.OnClickListener(){//创建监听对象
        public void onClick(View v){
            String toastString = "";
            switch (v.getId()){
                case R.id.button_PopMovies:
                    toastString = "This button will launch my 'Popular Movies' app!";
                    break;
                case R.id.button_Stock:
                    toastString = "This button will launch my 'Stock Hawk' app!";
                    break;
                case R.id.button_Bigger:
                    toastString = "This button will launch my 'Build it bigger' app!";
                    break;
                case R.id.button_Material:
                    toastString = "This button will launch my 'Make Your App Material' app!";
                    break;
                case R.id.button_Ubiquitous:
                    toastString = "This button will launch my 'Go Ubiquitous' app!";
                    break;
                case R.id.button_Capstone:
                    toastString = "This button will launch my 'Capstone' app!";
                    break;
            }
            Toast.makeText(getApplicationContext(), toastString,Toast.LENGTH_SHORT).show();
        }
    };
}
