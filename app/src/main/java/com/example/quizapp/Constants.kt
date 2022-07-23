package com.example.quizapp

object Constants{

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS : String = "correct_answer"

    fun getQuestions() : ArrayList<Question> {//질문배열목록을 반환해야함
        val questionsList = ArrayList<Question>() //실제 문제에 적용될 리스트
        val set = mutableSetOf<Question>() //temp문제 set(중복체크를 위함)
        val que1 = Question(
            1,
            "이것은 총 얼마 인가요?", //문제
            R.drawable.onehun,
            "2000원",
            "500원",
            "100원",
            "1000원",
            3
        )
        set.add(que1)
        //2
        val que2 = Question(
            2,
            "이것은 총 얼마 인가요?", //문제
            R.drawable.twohun1,
            "2000원",
            "200원",
            "10000원",
            "1000원",
            2
        )
        set.add(que2)

        //3
        val que3 = Question(
            3,
            "이것은 총 얼마 인가요?", //문제
            R.drawable.threehun,
            "300원",
            "500원",
            "100원",
            "1000원",
            1
        )
        set.add(que3)

        //4
        val que4 = Question(
            4,
            "이것은 총 얼마 인가요?", //문제
            R.drawable.fourhun,
            "400원",
            "500원",
            "100원",
            "10000원",
            1
        )
        set.add(que4)
        //5
        val que5 = Question(
            5,
            "이것은 총 얼마 인가요?", //문제
            R.drawable.fiveonehun,
            "2000원",
            "1500원",
            "500원",
            "1000원",
            3
        )
        set.add(que5)
        //6
        val que6 = Question(
            6,
            "이것은 총 얼마 인가요?", //문제
            R.drawable.twothousand,
            "1000원",
            "1500원",
            "2000원",
            "1000원",
            3
        )
        set.add(que6)
        //7
        val que7 = Question(
            7,
            "이것은 총 얼마 인가요?", //문제
            R.drawable.f2hun,
            "2000원",
            "1500원",
            "10000원",
            "1000원",
            4
        )
        set.add(que7)
        //8
        val que8 = Question(
            8,
            "이것은 총 얼마 인가요?", //문제
            R.drawable.thousand,
            "10000원",
            "1000원",
            "500원",
            "5000원",
            2
        )
        set.add(que8)
        //9
        val que9 = Question(
            9,
            "이것은 총 얼마 인가요?", //문제
            R.drawable.fivehun,
            "5000원",
            "10000원",
            "1500원",
            "500원",
            4
        )
        set.add(que9)

        while (questionsList.size < 5) {
            val ran = set.random()
            if (questionsList.contains(ran)) {
                continue
            }
            questionsList.add(ran)
        }
        return questionsList
    }
}