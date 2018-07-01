package com.grazactech.quizapp;

public class Questions {
    public  String mQuestions[] = {
            "Who wrote the first 5 chapters of the Bible?",
            "Most of the epistles were written by ?",
            "How many chapters are in the Bible",
            "Who gave birth to Jesus Christ",
            "The wisest man recorded in the Bible is ?",
            "According to Scripture, David was a man after the heart of who?",
            "The man that betrayed Jesus is ?",
    };
    private  String mChoices[][] = {
            {"Moses","Daniel","Samuel","Joshua"},
            {"Peter","Apostle Paul","Samuel","Solomon"},
            {"45","66" ,"67","54"},
            {"Mary","Mariam","Bilal","Martha"},
            {"Peter","Apostle Paul","Samuel","Solomon"},
            {"John","God","Samuel","Solomon"},
            {"Peter","Saul","Judas Iscariot","Joshua"},


    };
    private String mCorrectAnswers[] = {"Moses","Apostle Paul","66","Mary","Solomon","God","Judas Iscariot"};
    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }

    public String getmChoice1(int a) {
        String choice = mChoices[a][0];
        return choice;
    }
    public String getmChoice2(int a) {
        String choice = mChoices[a][1];
        return choice;
    }
    public String getmChoice3(int a) {
        String choice = mChoices[a][2];
        return choice;
    }
    public String getmChoice4(int a) {
        String choice = mChoices[a][3];
        return choice;
    }
    public String getCorrectAnswers(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
