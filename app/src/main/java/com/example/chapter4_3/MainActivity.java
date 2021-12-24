package com.example.chapter4_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 EditText edNum1, edNum2;
 Button btnAdd, btnSubtract,btnMultiply,btnDivide;
 TextView tvResult;
 String strNum1,strNum2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 정수 계산기");

        //위젯변수와 위젯아이디 연결(대입)
        edNum1 =(EditText)findViewById(R.id.edNum1);//각각연결
        edNum2 =(EditText)findViewById(R.id.edNum2);

        btnAdd =(Button)findViewById(R.id.btnAdd);
        btnSubtract =(Button)findViewById(R.id.btnSubtract);
        btnMultiply = (Button)findViewById(R.id.btnMultyply);
        btnDivide = (Button)findViewById(R.id.btnDivide);

        tvResult = (TextView)findViewById(R.id.tvResult);

        //버튼별로 이벤트 처리하여 연산 수행후 출력
        //더하기버튼 이벤트 핸들러
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                strNum1 = edNum1.getText().toString();
                strNum2 = edNum2.getText().toString();

                int result = Integer.parseInt(strNum1) + Integer.parseInt(strNum2);
                //double result = Double.parseDouble(strNum1)+Double.parseDouble(strNum2);

                tvResult.setText("계산결과: "+ result);


            }
        });
        //빼기버튼
        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                strNum1 = edNum1.getText().toString();
                strNum2 = edNum2.getText().toString();

                int result = Integer.parseInt(strNum1) - Integer.parseInt(strNum2);

                tvResult.setText("계산결과: "+ result);
            }
        });
        //곱하기버튼
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                strNum1 = edNum1.getText().toString();
                strNum2 = edNum2.getText().toString();

                int result = Integer.parseInt(strNum1) * Integer.parseInt(strNum2);

                tvResult.setText("계산결과: "+ result);
            }
        });
        //나누기버튼
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                strNum1 = edNum1.getText().toString();
                strNum2 = edNum2.getText().toString();

                int result = Integer.parseInt(strNum1) / Integer.parseInt(strNum2);

                tvResult.setText("계산결과: "+ result);
            }
        });
    }
}