package com.example.p3geographyquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

/**
 * This app displays a Geography Quiz.
 */
public class MainActivity extends AppCompatActivity {

    // This are the initial values of each question.
    int Q1 = 25;
    int Q2 = 10;
    int Q3 = 20;
    int Q4 = 20;
    int Q5 = 10;
    int Q6 = 15;

    int Q1result;
    int Q2result;
    int Q3result;
    int Q4result;
    int Q5result;
    int Q6result;

    Button Submit;
    TextView SubmitText;
    String Result;

    CheckBox Q4checkBoxA;
    CheckBox Q4checkBoxB;
    CheckBox Q4checkBoxC;
    CheckBox Q4checkBoxD;
    CheckBox Q4checkBoxE;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Q4checkBoxA = findViewById(R.id.q4_check_box_a);
        Q4checkBoxB = findViewById(R.id.q4_check_box_b);
        Q4checkBoxC = findViewById(R.id.q4_check_box_c);
        Q4checkBoxD = findViewById(R.id.q4_check_box_d);
        Q4checkBoxE = findViewById(R.id.q4_check_box_e);

        Button Reset = (Button) findViewById(R.id.reset_button);
        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Using a Flag method, this Intent object quickly restarts the app when the "Try again" Button is clicked.
                Intent i = getBaseContext().getPackageManager()
                        .getLaunchIntentForPackage(getBaseContext().getPackageName());
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
            }
        });
    }

    /**
     * This method displays a specific Toast when the first "DID YOU KNOW" Button is clicked.
     */
    public void didYouKnow1(View view) {

        Toast toast = Toast.makeText(getApplicationContext(), "Canada is the \nworld's second largest \ncountry in total area.", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER | Gravity.END, 0, 0);
        View toastView = toast.getView();
        toastView.setBackgroundColor(Color.LTGRAY);
        toast.show();
    }

    /**
     * This method is called when the first "Save" Button is clicked.
     */
    public void saveQ1(View view) {

        CheckBox Q1checkBoxA = findViewById(R.id.q1_check_box_a);
        boolean firstQ1 = Q1checkBoxA.isChecked();
        CheckBox Q1checkBoxB = findViewById(R.id.q1_check_box_b);
        boolean secondQ1 = Q1checkBoxB.isChecked();
        CheckBox Q1checkBoxC = findViewById(R.id.q1_check_box_c);
        boolean thirdQ1 = Q1checkBoxC.isChecked();
        CheckBox Q1checkBoxD = findViewById(R.id.q1_check_box_d);
        boolean forthQ1 = Q1checkBoxD.isChecked();
        CheckBox Q1checkBoxE = findViewById(R.id.q1_check_box_e);
        boolean fifthQ1 = Q1checkBoxE.isChecked();

        Q1result = gradeQ1(firstQ1, secondQ1, thirdQ1, forthQ1, fifthQ1);
    }

    /**
     * Calculates the value of Q1.
     *
     * @return value of first question.
     */
    private int gradeQ1(boolean firstCheckBox, boolean secondCheckBox, boolean thirdCheckBox, boolean forthCheckBox, boolean fifthCheckBox) {

        if (firstCheckBox && !secondCheckBox && thirdCheckBox && !forthCheckBox && fifthCheckBox) {
            Toast toast = Toast.makeText(getApplicationContext(), "That's correct!", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.TOP | Gravity.END, 0, 0);
            View toastView = toast.getView();
            toastView.setBackgroundColor(Color.GREEN);
            toast.show();
        } else {
            Toast toast = Toast.makeText(getApplicationContext(), "Incorrect answer!", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.TOP | Gravity.END, 0, 0);
            View toastView = toast.getView();
            toastView.setBackgroundColor(Color.RED);
            toast.show();
            Q1 = 0;
        }
        return Q1;
    }

    /**
     * This method displays a specific Toast when the second "DID YOU KNOW" Button is clicked.
     */
    public void didYouKnow2(View view) {

        Toast toast = Toast.makeText(getApplicationContext(), "There are 115 \nspecies of fish found \nin the Caspian Sea.", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER | Gravity.END, 0, 0);
        View toastView = toast.getView();
        toastView.setBackgroundColor(Color.LTGRAY);
        toast.show();
    }

    /**
     * The following method handles the click event for both Radio Buttons on second and fifth question.
     */
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.true_radio_button:
                if (checked)
                    break;
            case R.id.false_radio_button:
                if (checked)
                    break;
        }
    }

    /**
     * This method is called when the second "Save" Button is clicked.
     */
    public void saveQ2(View view) {

        RadioButton trueQ2 = (RadioButton) findViewById(R.id.true_radio_button);
        boolean trueButton = trueQ2.isChecked();
        RadioButton falseQ2 = (RadioButton) findViewById(R.id.false_radio_button);
        boolean falseButton = falseQ2.isChecked();

        Q2result = gradeQ2(trueButton, falseButton);
    }

    /**
     * Calculates the value of Q2.
     *
     * @return value of second question.
     */
    private int gradeQ2(boolean trueRButton, boolean falseRButton) {

        if (trueRButton && !falseRButton) {
            Toast toast = Toast.makeText(getApplicationContext(), "That's correct!", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.TOP | Gravity.END, 0, 0);
            View toastView = toast.getView();
            toastView.setBackgroundColor(Color.GREEN);
            toast.show();
        } else {
            Toast toast = Toast.makeText(getApplicationContext(), "Incorrect answer!", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.TOP | Gravity.END, 0, 0);
            View toastView = toast.getView();
            toastView.setBackgroundColor(Color.RED);
            toast.show();
            Q2 = 0;
        }
        return Q2;
    }

    /**
     * This method displays a specific Toast when the third "DID YOU KNOW" Button is clicked.
     */
    public void didYouKnow3(View view) {

        Toast toast = Toast.makeText(getApplicationContext(), "The world's largest \ncattle station is \nlocated in Australia \nand it's bigger \nthan Israel.", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER | Gravity.END, 0, 0);
        View toastView = toast.getView();
        toastView.setBackgroundColor(Color.LTGRAY);
        toast.show();
    }

    /**
     * This method is called when the third "Save" Button is clicked.
     */
    public void saveQ3(View view) {

        EditText answerField = (EditText) findViewById(R.id.answerQ3);
        String responseQ3 = answerField.getText().toString();
        String correctAnswer = "Australia";

        Q3result = gradeQ3(responseQ3, correctAnswer);
    }

    /**
     * Calculates the value of Q3.
     *
     * @return value of third question.
     */
    private int gradeQ3(String responseQ3, String correctAnswer) {

        if (responseQ3.equals(correctAnswer)) {
            Toast toast = Toast.makeText(getApplicationContext(), "That's correct!", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.TOP | Gravity.END, 0, 0);
            View toastView = toast.getView();
            toastView.setBackgroundColor(Color.GREEN);
            toast.show();
        } else {
            Toast toast = Toast.makeText(getApplicationContext(), "Incorrect answer!", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.TOP | Gravity.END, 0, 0);
            View toastView = toast.getView();
            toastView.setBackgroundColor(Color.RED);
            toast.show();
            Q3 = 0;
        }
        return Q3;
    }

    /**
     * This method displays a specific Toast when the forth "DID YOU KNOW" Button is clicked.
     */
    public void didYouKnow4(View view) {

        Toast toast = Toast.makeText(getApplicationContext(), "The Scandinavian \nPeninsula is \nthe largest \npeninsula of Europe.", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER | Gravity.END, 0, 0);
        View toastView = toast.getView();
        toastView.setBackgroundColor(Color.LTGRAY);
        toast.show();
    }

    /**
     * This method is called when the forth "Save" Button is clicked.
     */
    public void saveQ4(View view) {

        boolean firstQ4 = Q4checkBoxA.isChecked();
        boolean secondQ4 = Q4checkBoxB.isChecked();
        boolean thirdQ4 = Q4checkBoxC.isChecked();
        boolean forthQ4 = Q4checkBoxD.isChecked();
        boolean fifthQ4 = Q4checkBoxE.isChecked();

        Q4result = gradeQ4(firstQ4, secondQ4, thirdQ4, forthQ4, fifthQ4);
    }

    /**
     * Calculates the value of Q4.
     *
     * @return value of forth question.
     */
    private int gradeQ4(boolean firstCheckBox, boolean secondCheckBox, boolean thirdCheckBox, boolean forthCheckBox, boolean fifthCheckBox) {

        if (!firstCheckBox && secondCheckBox && thirdCheckBox && forthCheckBox && !fifthCheckBox) {
            Toast toast = Toast.makeText(getApplicationContext(), "That's correct!", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.TOP | Gravity.END, 0, 0);
            View toastView = toast.getView();
            toastView.setBackgroundColor(Color.GREEN);
            toast.show();
        } else {
            Toast toast = Toast.makeText(getApplicationContext(), "Incorrect answer!", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.TOP | Gravity.END, 0, 0);
            View toastView = toast.getView();
            toastView.setBackgroundColor(Color.RED);
            toast.show();
            Q4 = 0;
        }
        return Q4;
    }

    /**
     * This method displays a specific Toast when the fifth "DID YOU KNOW" Button is clicked.
     */
    public void didYouKnow5(View view) {

        Toast toast = Toast.makeText(getApplicationContext(), "The Northern \nHemisphere is \nhome to 68% of the \nworld's land mass.", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER | Gravity.END, 0, 0);
        View toastView = toast.getView();
        toastView.setBackgroundColor(Color.LTGRAY);
        toast.show();
    }

    /**
     * This method is called when the fifth "Save" Button is clicked.
     */
    public void saveQ5(View view) {

        RadioButton yesQ5 = (RadioButton) findViewById(R.id.yes_radio_button);
        boolean yesButton = yesQ5.isChecked();
        RadioButton noQ5 = (RadioButton) findViewById(R.id.no_radio_button);
        boolean noButton = noQ5.isChecked();

        Q5result = gradeQ5(yesButton, noButton);
    }

    /**
     * Calculates the value of Q5.
     *
     * @return value of fifth question.
     */
    private int gradeQ5(boolean affirmative, boolean negative) {

        if (!affirmative && negative) {
            Toast toast = Toast.makeText(getApplicationContext(), "That's correct!", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.TOP | Gravity.END, 0, 0);
            View toastView = toast.getView();
            toastView.setBackgroundColor(Color.GREEN);
            toast.show();
        } else {
            Toast toast = Toast.makeText(getApplicationContext(), "Incorrect answer!", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.TOP | Gravity.END, 0, 0);
            View toastView = toast.getView();
            toastView.setBackgroundColor(Color.RED);
            toast.show();
            Q5 = 0;
        }
        return Q5;
    }

    /**
     * This method displays a specific Toast when the sixth "DID YOU KNOW" Button is clicked.
     */
    public void didYouKnow6(View view) {

        Toast toast = Toast.makeText(getApplicationContext(), "One of the most \nheavily populated \ncities in the world.", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER | Gravity.END, 0, 0);
        View toastView = toast.getView();
        toastView.setBackgroundColor(Color.LTGRAY);
        toast.show();
    }

    /**
     * This method is called when the sixth "Save" Button is clicked.
     */
    public void saveQ6(View view) {

        EditText answerField = (EditText) findViewById(R.id.answerQ6);
        String responseQ6 = answerField.getText().toString();
        String correctAnswer = "China";

        Q6result = gradeQ6(responseQ6, correctAnswer);
    }

    /**
     * Calculates the value of Q6.
     *
     * @return value of sixth question.
     */
    private int gradeQ6(String responseQ6, String correctAnswer) {

        if (responseQ6.equals(correctAnswer)) {
            Toast toast = Toast.makeText(getApplicationContext(), "That's correct!", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.TOP | Gravity.END, 0, 0);
            View toastView = toast.getView();
            toastView.setBackgroundColor(Color.GREEN);
            toast.show();
        } else {
            Toast toast = Toast.makeText(getApplicationContext(), "Incorrect answer!", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.TOP | Gravity.END, 0, 0);
            View toastView = toast.getView();
            toastView.setBackgroundColor(Color.RED);
            toast.show();
            Q6 = 0;
        }
        return Q6;
    }

    /**
     * Creates grading message for quiz submission.
     *
     * @param finalGrade of the quiz.
     * @return text summary.
     */
    private String createGrade(int finalGrade) {

        Result = "  You have scored\n" + finalGrade + " points out of 100";
        return Result;
    }

    /**
     * This method is called when the "Submit Quiz" Button is clicked.
     */
    public void SubmitQuiz(View view) {

        Submit = (Button) findViewById(R.id.submit_button);
        SubmitText = (TextView) findViewById(R.id.submit_text);
        int finalGrade = Q1result + Q2result + Q3result + Q4result + Q5result + Q6result;
        Result = createGrade(finalGrade);
        SubmitText.setText(Result);
    }
}
