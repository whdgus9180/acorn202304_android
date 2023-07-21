package com.example.step01example;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //이동 버튼의 참조값 얻어오기
        Button sendBtn=findViewById(R.id.sendBtn);
        //버튼을 눌렀을때 동작하기 위한 리스너 등록
        sendBtn.setOnClickListener(this);

        Button sendBtn2=findViewById(R.id.sendBtn2);
        sendBtn2.setOnClickListener(view->{
            EditText editText=findViewById(R.id.editText);
            String msg=editText.getText().toString();
            //TextView 에 출력하기
            TextView textView=findViewById(R.id.textView);
            textView.setText(msg);
        });


    }

    @Override
    public void onClick(View view) {
        //1.Editor 에 입력한 문자열을 읽어와서
        EditText editText=findViewById(R.id.editText);
        String msg=editText.getText().toString();
        //TextView 에 출력하기
        TextView textView=findViewById(R.id.textView);
        textView.setText(msg);
    }
}