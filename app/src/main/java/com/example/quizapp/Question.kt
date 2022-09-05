package com.example.quizapp

data class Question(
    val id: Int, //문제 아이디값(몇 번째 문제인지)
    val question: String,//문제
    val image: Int,//문제에 보여질 이미지
    val optionOne: String, //option은 객관식 답변들
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val correctAnswer: Int //정답
)
