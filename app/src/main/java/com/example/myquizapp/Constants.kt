package com.example.myquizapp

object Constants {
    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            "Which country image is this?",
            R.drawable.ic_flag_of_argentina,
            "Denmark",
            "Spain",
            "Argentine",
            "Germany",
            3
        )
        questionList.add(que1);
        val que2 = Question(
            1,
            "Which country image is this?",
            R.drawable.ic_flag_of_australia,
            "Belgium",
            "Australia",
            "Argentina",
            "Germany",
            2
        )
        questionList.add(que2);
        val que3 = Question(
            1,
            "Which country image is this?",
            R.drawable.ic_flag_of_brazil,
            "Denmark",
            "Fiji",
            "Argentina",
            "Brazil",
            3
        )
        questionList.add(que3);
        val que4 = Question(
            1,
            "Which country image is this?",
            R.drawable.ic_flag_of_belgium,
            "Germany",
            "Belgium",
            "Argentina",
            "Kuwait",
            2
        )
        questionList.add(que4);
        val que5 = Question(
            1,
            "Which country image is this?",
            R.drawable.ic_flag_of_denmark,
            "Denmark",
            "Spain",
            "Argentina",
            "Germany",
            1
        )
        questionList.add(que5);
        val que6 = Question(
            1,
            "Which country image is this?",
            R.drawable.ic_flag_of_fiji,
            "Fiji",
            "Spain",
            "Denmark",
            "Germany",
            1
        )
        questionList.add(que6);
        val que7 = Question(
            1,
            "Which country image is this?",
            R.drawable.ic_flag_of_germany,
            "Denmark",
            "Spain",
            "Argentina",
            "Germany",
            4
        )
        questionList.add(que7);
        val que8 = Question(
            1,
            "Which country image is this?",
            R.drawable.ic_flag_of_india,
            "India",
            "Spain",
            "Argentine",
            "Germany",
            1
        )
        questionList.add(que8);
        val que9 = Question(
            1,
            "Which country image is this?",
            R.drawable.ic_flag_of_kuwait,
            "Denmark",
            "Kuwait",
            "Argentina",
            "Germany",
            2
        )
        questionList.add(que9);
        return questionList
    }
}