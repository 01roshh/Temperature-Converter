package com.example.resourceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class UnitConverter extends AppCompatActivity {


    //Declaring widgets
    EditText editText;
    TextView textView8,textView5,textView7,valueOfPounds;
TextView valueofpounds2;

    Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit_converter);



        //Instaniating widgets


        textView5=findViewById(R.id.textView5);
        textView7=findViewById(R.id.textView7);
        valueOfPounds=findViewById(R.id.valueOfpounds);
        textView8=findViewById(R.id.textView8);
        valueofpounds2=findViewById(R.id.valueOfpounds2);



        editText=findViewById(R.id.editTextNumber);


        button=findViewById(R.id.button5);


        //Adding a click event for button(Executing the convert method)

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //calling convertfrom kilo To pound

                ConvertFromCelsiusToFahrenheit();
                ConvertFromCelsiusTokelvin();

            }


        });



    }

    private void ConvertFromCelsiusTokelvin() {
        String valueEnteredInCelsius = editText.getText().toString();
        try {
            // Converting the string to a double
            double celsius = Double.parseDouble(valueEnteredInCelsius);

            // Converting Celsius to Fahrenheit using the correct formula
            double fahrenheit = (celsius * 9/5) + 32;

            // Displaying the result in the TextView
            valueOfPounds.setText(String.format("%.2f", fahrenheit) + " °F");
        } catch (NumberFormatException e) {
            valueOfPounds.setText("Invalid input");
        }
    }

    private void ConvertFromCelsiusToFahrenheit() {
        // This method will convert the values entered in the EditText from Celsius to Fahrenheit.
        String valueEnteredInCelsius = editText.getText().toString();

        try {
            // Converting the string to a double
            double celsius = Double.parseDouble(valueEnteredInCelsius);

            // Converting Celsius to Fahrenheit using the correct formula
            double kelvin = (celsius+273.15);

            // Displaying the result in the TextView
           valueofpounds2.setText(String.format("%.2f", kelvin) + " °K");
        } catch (NumberFormatException e) {
            valueOfPounds.setText("Invalid input");
        }
    }


}