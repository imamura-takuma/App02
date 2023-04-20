package com.example.app02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {   // Activity(画面）のクラスを継承

    private TextView text1;     // TextViewの変数を用意
    private Button btn1;        // Buttonの変数を用意
    private Button btn2;        // Buttonの変数を用意

    @Override   // オーバーライドアノテーション 親クラスのメソッドを上書きしてメソッドを定義するという印
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);         // 親クラス（AppCompatActivity）で定義されたonCreate()を実行
        setContentView(R.layout.activity_main);     // 画面をactivity_mainに設定
        text1 = findViewById(R.id.text1);           // 画面からtext1というIDのViewを探してtext1に代入
        btn1 = findViewById(R.id.btn1);             // 画面からbtn1というIDのViewを探してbtn1に代入
        btn2 = findViewById(R.id.btn2);             // 画面からbtn2というIDのViewを探してbtn2に代入

        btn1.setOnClickListener(new View.OnClickListener() {    // btn1をクリックしたときの処理を設定
            @Override
            public void onClick(View view) {
                text1.setText("確認中");   // text1のテキストを「確認中」に変更
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {    // btn2をクリックしたときの処理を設定
            @Override
            public void onClick(View view) {
                text1.setText("確認しました");    // text1のテキストを「確認しました」に変更
            }
        });
    }
}