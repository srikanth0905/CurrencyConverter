package com.greymat9er.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    Button euro, usDollar, pound, dirham, yen, bitcoin, ruble, canDollar, ethereum;
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        euro = findViewById(R.id.euro);
        usDollar = findViewById(R.id.usDollar);
        pound = findViewById(R.id.pound);
        dirham = findViewById(R.id.dirham);
        yen = findViewById(R.id.japaneseYen);
        bitcoin = findViewById(R.id.bitcoin);
        ruble = findViewById(R.id.russianRuble);
        canDollar = findViewById(R.id.canadianDollar);
        ethereum = findViewById(R.id.ethereum);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);

        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(editText.getText().toString()))
                    editText.setError("Empty user input");
                else{
                    double userInput, convertedValue;

                    userInput = Double.parseDouble(editText.getText().toString());
                    textView.setText(null);
                    convertedValue = userInput * 0.012;

                    DecimalFormat decimalFormat = new DecimalFormat("#.000");
//                    textView.setText(String.format("%s", decimalFormat.format(convertedValue)));
                    textView.setText(String.format("%s %s", getString(R.string.euro_symbol), decimalFormat.format(convertedValue)));
                }
            }
        });

        usDollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(editText.getText().toString()))
                    editText.setError("Empty user input");
                else{
                    double userInput, convertedValue;

                    userInput = Double.parseDouble(editText.getText().toString());
                    textView.setText(null);
                    convertedValue = userInput * 0.013;

                    DecimalFormat decimalFormat = new DecimalFormat("#.000");
//                    textView.setText(String.format("%s", decimalFormat.format(convertedValue)));
                    textView.setText(String.format("%s %s", getString(R.string.dollar_symbol), decimalFormat.format(convertedValue)));

                }
            }
        });

        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(editText.getText().toString()))
                    editText.setError("Empty user input");
                else{
                    double userInput, convertedValue;

                    userInput = Double.parseDouble(editText.getText().toString());
                    textView.setText(null);
                    convertedValue = userInput * 0.011;

                    DecimalFormat decimalFormat = new DecimalFormat("#.000");
//                    textView.setText(String.format("%s", decimalFormat.format(convertedValue)));
                    textView.setText(String.format("%s %s", getString(R.string.pound_symbol), decimalFormat.format(convertedValue)));

                }
            }
        });

        dirham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(editText.getText().toString()))
                    editText.setError("Empty user input");
                else{
                    double userInput, convertedValue;

                    userInput = Double.parseDouble(editText.getText().toString());
                    textView.setText(null);
                    convertedValue = userInput * 0.049;

                    DecimalFormat decimalFormat = new DecimalFormat("#.000");
//                    textView.setText(String.format("%s", decimalFormat.format(convertedValue)));
                    textView.setText(String.format("%s %s", decimalFormat.format(convertedValue), getString(R.string.dirham_symbol)));

                }
            }
        });

        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(editText.getText().toString()))
                    editText.setError("Empty user input");
                else{
                    double userInput, convertedValue;

                    userInput = Double.parseDouble(editText.getText().toString());
                    textView.setText(null);
                    convertedValue = userInput * 1.42;

                    DecimalFormat decimalFormat = new DecimalFormat("#.000");
//                    textView.setText(String.format("%s", decimalFormat.format(convertedValue)));
                    textView.setText(String.format("%s %s", getString(R.string.Japaneseyen_symbol), decimalFormat.format(convertedValue)));

                }
            }
        });

        bitcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(editText.getText().toString()))
                    editText.setError("Empty user input");
                else{
                    double userInput, convertedValue;

                    userInput = Double.parseDouble(editText.getText().toString());
                    textView.setText(null);
                    convertedValue = userInput * 0.0000015;

                    DecimalFormat decimalFormat = new DecimalFormat("#.000");
//                    textView.setText(String.format("%s", decimalFormat.format(convertedValue)));
                    textView.setText(String.format("%s %s", getString(R.string.bitcoin_symbol), decimalFormat.format(convertedValue)));

                }
            }
        });

        ruble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(editText.getText().toString()))
                    editText.setError("Empty user input");
                else{
                    double userInput, convertedValue;

                    userInput = Double.parseDouble(editText.getText().toString());
                    textView.setText(null);
                    convertedValue = userInput * 0.94;

                    DecimalFormat decimalFormat = new DecimalFormat("#.000");
//                    textView.setText(String.format("%s", decimalFormat.format(convertedValue)));
                    textView.setText(String.format("%s %s", getString(R.string.russian_ruble_symbol), decimalFormat.format(convertedValue)));
                }
            }
        });

        canDollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(editText.getText().toString()))
                    editText.setError("Empty user input");
                else{
                    double userInput, convertedValue;

                    userInput = Double.parseDouble(editText.getText().toString());
                    textView.setText(null);
                    convertedValue = userInput * 0.018;

                    DecimalFormat decimalFormat = new DecimalFormat("#.000");
//                    textView.setText(String.format("%s", decimalFormat.format(convertedValue)));
                    textView.setText(String.format("%s %s", getString(R.string.canadian_dollar_symbol), decimalFormat.format(convertedValue)));

                }
            }
        });

        ethereum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(editText.getText().toString()))
                    editText.setError("Empty user input");
                else{
                    double userInput, convertedValue;

                    userInput = Double.parseDouble(editText.getText().toString());
                    textView.setText(null);
                    convertedValue = userInput * 0.000066;

                    DecimalFormat decimalFormat = new DecimalFormat("#.000");
//                    textView.setText(String.format("%s", decimalFormat.format(convertedValue)));
                    textView.setText(String.format("%s %s", getString(R.string.ethereum_symbol), decimalFormat.format(convertedValue)));
                }
            }
        });

    }
}
