package com.example.android.europeangeographyquiz;


import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitAnswers(View view) {

        //First four objects are the button choices for question one
        RadioButton qOneButtonOne = (RadioButton) findViewById(R.id.questionOneButtonOne);
        boolean radioOne = qOneButtonOne.isChecked();

        RadioButton qOneButtonTwo = (RadioButton) findViewById(R.id.questionOneButtonTwo);
        boolean radioTwo = qOneButtonTwo.isChecked();

        RadioButton qOneButtonThree = (RadioButton) findViewById(R.id.questionOneButtonThree);
        boolean radioThree = qOneButtonThree.isChecked();

        RadioButton qOneButtonFour = (RadioButton) findViewById(R.id.questionOneButtonFour);
        boolean radioFour = qOneButtonFour.isChecked();

        //These next two are the choices for question two (as seen in the id variables)
        RadioButton qTwoButtonOne = (RadioButton) findViewById(R.id.questionTwoButtonOne);
        boolean radioFive = qTwoButtonOne.isChecked();

        RadioButton qTwoButtonTwo = (RadioButton) findViewById(R.id.questionTwoButtonTwo);
        boolean radioSix = qTwoButtonTwo.isChecked();

        //These four are the checkbox choices for question three
        CheckBox qThreeBoxOne = (CheckBox) findViewById(R.id.questionThreeButtonOne);
        boolean checkOne = qThreeBoxOne.isChecked();

        CheckBox qThreeBoxTwo = (CheckBox) findViewById(R.id.questionThreeButtonTwo);
        boolean checkTwo = qThreeBoxTwo.isChecked();

        CheckBox qThreeBoxThree = (CheckBox) findViewById(R.id.questionThreeButtonThree);
        boolean checkThree = qThreeBoxThree.isChecked();

        CheckBox qThreeBoxFour = (CheckBox) findViewById(R.id.questionThreeButtonFour);
        boolean checkFour = qThreeBoxFour.isChecked();

        //Four more radio buttons for question four
        RadioButton qFourButtonOne = (RadioButton) findViewById(R.id.questionFourButtonOne);
        boolean radioSeven = qFourButtonOne.isChecked();

        RadioButton qFourButtonTwo = (RadioButton) findViewById(R.id.questionFourButtonTwo);
        boolean radioEight = qFourButtonTwo.isChecked();

        RadioButton qFourButtonThree = (RadioButton) findViewById(R.id.questionFourButtonThree);
        boolean radioNine = qFourButtonThree.isChecked();

        RadioButton qFourButtonFour = (RadioButton) findViewById(R.id.questionFourButtonFour);
        boolean radioTen = qFourButtonFour.isChecked();

        //Four more for question five
        RadioButton qFiveButtonOne = (RadioButton) findViewById(R.id.questionFiveButtonOne);
        boolean radioEleven = qFiveButtonOne.isChecked();

        RadioButton qFiveButtonTwo = (RadioButton) findViewById(R.id.questionFiveButtonTwo);
        boolean radioTwelve = qFiveButtonTwo.isChecked();

        RadioButton qFiveButtonThree = (RadioButton) findViewById(R.id.questionFiveButtonThree);
        boolean radioThirteen = qFiveButtonThree.isChecked();

        RadioButton qFiveButtonFour = (RadioButton) findViewById(R.id.questionFiveButtonFour);
        boolean radioFourteen = qFiveButtonFour.isChecked();

        //EditText field for question six
        EditText qSixField = (EditText) findViewById(R.id.questionSixField);
        String fieldOne = qSixField.getText().toString();

        //EditText field for question seven
        EditText qSevenField = (EditText) findViewById(R.id.questionSevenField);
        String fieldTwo = qSevenField.getText().toString();

        //Finally we have the last four checkboxes for question eight
        CheckBox qEightButtonOne = (CheckBox) findViewById(R.id.questionEightButtonOne);
        boolean checkFive = qEightButtonOne.isChecked();

        CheckBox qEightButtonTwo = (CheckBox) findViewById(R.id.questionEightButtonTwo);
        boolean checkSix = qEightButtonTwo.isChecked();

        CheckBox qEightButtonThree = (CheckBox) findViewById(R.id.questionEightButtonThree);
        boolean checkSeven = qEightButtonThree.isChecked();

        CheckBox qEightButtonFour = (CheckBox) findViewById(R.id.questionEightButtonFour);
        boolean checkEight = qEightButtonFour.isChecked();

        int answer = rightAnswer(radioTwo, radioFive, checkTwo, checkThree, radioNine, radioTwelve, fieldOne, fieldTwo, checkSix, checkSeven);
        String answerMessage = answerScore(answer, radioTwo, radioFive, checkTwo, checkThree, radioNine, radioTwelve, fieldOne, fieldTwo, checkSix, checkSeven);
        displayMessage(answerMessage);

        Context context = getApplicationContext();
        CharSequence text = "You scored a " + answer + " out of 10";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    private int rightAnswer(boolean rTwo, boolean rFive, boolean cTwo, boolean cThree, boolean rNine, boolean rTwelve, String fOne, String fTwo, boolean cSix, boolean cSeven) {

        int finalScore = 0;
        String iansOne = "Berlin";
        String iansOneHalf = "berlin";
        String iansTwo = "Euro";
        String iansTwoHalf = "euro";

        if (rTwo) {
            finalScore+=1;

        }
        if (rFive) {
            finalScore+=1;

        }
        if (cTwo) {
            finalScore+=1;

        }
        if (cThree) {
            finalScore += 1;

        }
        if (rNine) {
            finalScore += 1;

        }
        if (rTwelve) {
            finalScore += 1;

        }
        if (fOne.equals(iansOne))   {
            finalScore += 1;

        } else if (fOne.equals(iansOneHalf)) {
            finalScore += 1;
        }
        if (fTwo.equals(iansTwo)) {
            finalScore += 1;

        } else if (fTwo.equals(iansTwoHalf)) {
            finalScore += 1;
        }
        if (cSix) {
            finalScore += 1;

        }
        if (cSeven) {
            finalScore += 1;

        }

        return finalScore;
    }

    private String answerScore(int answer, boolean rTwo, boolean rFive, boolean cTwo, boolean cThree, boolean rNine, boolean rTwelve, String fOne, String fTwo, boolean cSix, boolean cSeven) {

        String answerMessage = "You scored a " + answer + " out of 10";
        return answerMessage;
    }

    private void displayMessage(String message) {
        TextView answerScoreTextView = (TextView) findViewById(R.id.scoreTextView);
        answerScoreTextView.setText(message);
    }

}