package com.example.ctof;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ctof.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    EditText enteredValue;
    Button button;
    TextView convertedValue;

    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view  = binding.getRoot();
        setContentView(view);

        enteredValue = binding.CtoFValueEditText;
        button = binding.ctofButton;
        convertedValue = binding.ctofConvertedValueTextView;

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "It Worked!", Toast.LENGTH_SHORT).show();
                getValueFromDisplay();
            }
        });

    }
    void getValueFromDisplay(){
        String value;
        double fahrenheit = 0.0;
        value = enteredValue.getText().toString();
        try{
            fahrenheit = Double.parseDouble(value);
        } catch(NumberFormatException e){
            Toast.makeText(this, "Could not convert " + value, Toast.LENGTH_SHORT).show();
        }

        fahrenheit = Util.cToF(fahrenheit);
        convertedValue.setText(Double.toString(fahrenheit));
    }
}