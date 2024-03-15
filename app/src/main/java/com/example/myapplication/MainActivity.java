package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonNaver = findViewById(R.id.button);
        Button button119 = findViewById(R.id.button2);
        Button buttonPopup = findViewById(R.id.button3);
        Button buttonExit = findViewById(R.id.button4);

        buttonNaver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 네이버 홈페이지 열기
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.naver.com"));
                startActivity(intent);
            }
        });

        button119.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 119 응급전화 걸기
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:119"));
                startActivity(intent);
            }
        });

        buttonPopup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 팝업창 띄우기
                Toast.makeText(MainActivity.this, "팝업창을 띄웁니다.", Toast.LENGTH_SHORT).show();
            }
        });

        buttonExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 앱 종료
                finish();
            }
        });
    }
}
