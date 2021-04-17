package com.example.myspace

object Constants {
    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val question1 = Question(
            1,
            "Combien de planètes orbitent autour du Soleil ?",
            "Huit",
            "Neuf",
            "Dix",
            1
        )
        questionList.add(question1)
        val question2 = Question(
            2,
            "Quelle est la planète la plus proche du Soleil ?",
            "Terre",
            "Jupiter",
            "Mercure",
            3
        )
        questionList.add(question2)
        val question3 = Question(
            3,
            "Quelle est la plus grosse planète du Système Solaire ?",
            "Mars",
            "Jupiter",
            "Neptune",
            2
        )
        questionList.add(question3)
        val question4 = Question(
            4,
            "Quelle est la planète la plus lointaine du système solaire ?",
            "Neptune",
            "Uranus",
            "Pluton",
            1
        )
        questionList.add(question4)

        return questionList
    }
}