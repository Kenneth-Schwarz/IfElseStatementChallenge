package com.mycompany.if_elsestatementchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText editText1,editText2,editText3,editText4,editText5;
    Button button, clearbtn;
    TextView Text1,Text2,Text3;

    float total, percentage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);
        editText4 = findViewById(R.id.editText4);
        editText5 = findViewById(R.id.editText5);

        button = findViewById(R.id.button);
        clearbtn = findViewById(R.id.clearbtn);

        Text1 = findViewById(R.id.Text1);
        Text2 = findViewById(R.id.Text2);
        Text3 = findViewById(R.id.Text3);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check();
                iflogic();

            }
        });

        clearbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clear();
            }
        });


    }

    public void check() {
        int Class1 = Integer.parseInt(editText1.getText().toString());
        int Class2 = Integer.parseInt(editText2.getText().toString());
        int Class3 = Integer.parseInt(editText3.getText().toString());
        int Class4 = Integer.parseInt(editText4.getText().toString());
        int Class5 = Integer.parseInt(editText5.getText().toString());

         total = Class1 + Class2 + Class3 + Class4 + Class5;
         percentage = (total/500) * 100;

         Text1.setText(String.valueOf(total));
        Text2.setText(String.valueOf(percentage));

    }

    //Whatever logic i want to input, it might be easiest to do something like this
    public void iflogic() {
        if(percentage >=90){
            Text3.setText(("Grade A"));
        }
        else if (percentage >=80)
            Text3.setText(("Grade B"));

        else if(percentage >=70)
            Text3.setText(("Grade C"));

        else if (percentage >=60)
            Text3.setText("Grade D");


        else if (percentage >=40)
            Text3.setText("Grade E");

        else {
            Text3.setText(("Fuck you,you failed!"));
        }

    }


    public void clear() {
        editText1.setText("");
        editText2.setText("");
        editText3.setText("");
        editText4.setText("");
        editText5.setText("");

        Text3.setText("");
        Text2.setText("");
        Text1.setText("");

    }

}

/*Create a Grade Calculator App using if-else statement logic
 Add 5 EditTextfields
 Add 1 buttons
 Add 1 TextFields

On the app, have the app ask the user's five grades.
There should be 5 EditText's where the user can enter in their grades.
Once the user enters everything in, have the app display the total marks and their
percentage

Display the correct grade

Example:
(These will be the five edit texts)Enter five subject marks: 65 85, 95, 70,88

(This will be a textView) Total marks = 403.0
(This will be a textView) Marks percentage = 80.6

(This will be a textView) Grade B

https://www.tutorialgateway.org/java-program-to-find-student-grade/

https://www.youtube.com/watch?v=YGDDoad8s9g

COMPLETED!!!

Optional Objectives!

Add a toast to indicate a missing field using the if-else statement
If there is a missing edittext field, prompt up a red text alert!
The app seems to crash when the user does not input all of their grades into the edittext fields...figure out why?
 */