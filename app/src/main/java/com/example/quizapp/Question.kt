package com.example.quizapp

data class Question(
    val id: Int,
    val question: String,
    val image: Int,
    val optionOne: String, //option은 객관식 답변들
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val correctAnswer: Int //정답
)