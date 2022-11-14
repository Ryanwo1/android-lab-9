package com.example.lab9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editTextNumber1 = findViewById(R.id.numberOneEditText);
        EditText editTextNumber2 = findViewById(R.id.numberTwoEditText);
        EditText editTextNumber3 = findViewById(R.id.editTextNumber3);

        Button generateJsonButton = findViewById(R.id.generateJsonButton);
        generateJsonButton.setOnClickListener(view -> {
        String stringToMake = "{ “operation” : { “add” : { “a” : " + editTextNumber1.getText().toString() +
                " , “b” : " + editTextNumber2.getText().toString() +  "} } }";
        String partialString = "{ “add” : { “a” : " + editTextNumber1.getText().toString() +
                " , “b” : " + editTextNumber2.getText().toString() +  "} } }";
        JSONObject numbersToAddAsJSONObject = new JSONObject();

        try {
            numbersToAddAsJSONObject.put("operation", partialString);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        editTextNumber3.setText(numbersToAddAsJSONObject.toString());
        });
    }


}