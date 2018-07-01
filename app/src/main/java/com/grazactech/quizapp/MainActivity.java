package com.grazactech.quizapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
Button answer1,answer2,answer3,answer4;
TextView score,question;

private Questions mQuestions = new Questions();
private String mAnswer;
private int mScore = 0;
private int mQuestionLength = mQuestions.mQuestions.length;

Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r = new Random();
        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        answer4 = (Button) findViewById(R.id.answer4);

        score = (TextView) findViewById(R.id.score);
        question = (TextView) findViewById(R.id.question);
        updateQuestion(r.nextInt(mQuestionLength));
        answer1.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View view){
                if(answer1.getText() == mAnswer){
                    mScore++;
                    score.setText("Score : "+mScore);
                    updateQuestion(r.nextInt(mQuestionLength));
                }
                else{
                    gameover();
                }
            }
        });
        answer2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(answer2.getText() == mAnswer){
                    mScore++;
                    score.setText("Score : "+mScore);
                    updateQuestion(r.nextInt(mQuestionLength));
                }
                else{
                    gameover();
                }

            }
        });
        answer3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(answer3.getText() == mAnswer){
                    mScore++;
                    score.setText("Score : "+mScore);
                    updateQuestion(r.nextInt(mQuestionLength));
                }
                else{
                    gameover();
                }
            }
        });
        answer4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (answer4.getText() == mAnswer) {
                    mScore++;
                    score.setText("Score : " + mScore);
                    updateQuestion(r.nextInt(mQuestionLength));
                }
                else{
                    gameover();
                }
            }

        });
    }
    private void updateQuestion(int num){
        question.setText(mQuestions.getQuestion(num));
        answer1.setText(mQuestions.getmChoice1(num));
        answer2.setText(mQuestions.getmChoice2(num));
        answer3.setText(mQuestions.getmChoice3(num));
        answer4.setText(mQuestions.getmChoice4(num));

        mAnswer = mQuestions.getCorrectAnswers(num);
    }

private void gameover(){
    AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
    alert.setMessage("Thank you, You scored "+mScore)
            .setCancelable(false)
            .setPositiveButton("Try again", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                }
            })
     .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialogInterface, int i) {
finish();
        }
    });
    AlertDialog alertDialog = alert.create();
    alertDialog.show();
}
}
