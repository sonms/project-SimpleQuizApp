package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_start.setOnClickListener {
            if (et_name.text.toString().isEmpty()) {//text라인에서 이름을 입력받지 못했다면
                Toast.makeText(this,"Please enter yout name", Toast.LENGTH_SHORT).show() //짧게 토스트메세지
            } else {
                val intent = Intent(this, QuizQuestionActivity::class.java) //원하는 클래스로 데이터 받기
                intent.putExtra(Constants.USER_NAME, et_name.text.toString()) //이름전송
                startActivity(intent) //intent로 넘겨준 값을 토대로 액티비티 실행
                finish() //종료
            }
        }
    }
}
