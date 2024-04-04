package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView text1, text2;
    CheckBox chkAgree;
    RadioGroup rGroup1;
    RadioButton dog, cat, rabbit;
    Button okbtn;
    ImageView ImgPet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("애완동물 사진 보기");

        text1 = findViewById(R.id.text1);
        chkAgree = findViewById(R.id.chkAgree);

        text2 = findViewById(R.id.text2);
        rGroup1 = findViewById(R.id.rGroup1);
        dog = findViewById(R.id.dog);
        cat = findViewById(R.id.cat);
        rabbit = findViewById(R.id.rabbit);

        okbtn = findViewById(R.id.okbtn);
        ImgPet = findViewById(R.id.ImgPet);

        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    text2.setVisibility(View.VISIBLE);
                    rGroup1.setVisibility(View.VISIBLE);
                    okbtn.setVisibility(View.VISIBLE);
                    ImgPet.setVisibility(View.VISIBLE);
                } else {
                    text2.setVisibility(View.INVISIBLE);
                    rGroup1.setVisibility(View.INVISIBLE);
                    okbtn.setVisibility(View.INVISIBLE);
                    ImgPet.setVisibility(View.INVISIBLE);
                }
            }
        });

        okbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                int checkedRadio = rGroup1.getCheckedRadioButtonId();
                if (checkedRadio == R.id.dog)
                    ImgPet.setImageResource(R.drawable.dog);
                else if (checkedRadio == R.id.cat)
                    ImgPet.setImageResource(R.drawable.cat);
                else if (checkedRadio == R.id.rabbit)
                    ImgPet.setImageResource(R.drawable.rabbit);
                else
                    Toast.makeText(getApplicationContext(), "동물을 먼저 선택하세요", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
