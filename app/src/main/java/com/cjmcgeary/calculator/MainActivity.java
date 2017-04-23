package com.cjmcgeary.calculator;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (TextView) findViewById(R.id.result_text);
    }

    static String operation = "";               // Keeps track of which operation was most recently pressed.
    static String valOne = "";
    static String valTwo = "";
    static double d_valOne = 0.0;
    static double d_valTwo = 0.0;
    static double d_result = 0.0;
    static boolean operationPressed = false;
    static boolean isDecimal = false;
    private int length = 10;                    // Max allowable string length of the text view.

    // TOP OPERATIONS ------------------
    public void btn_ACPressed(View view) {
        operation = "";
        valOne = "";
        valTwo = "";
        d_valOne = 0.0;
        d_valTwo = 0.0;
        d_result = 0.0;
        operationPressed = false;
        isDecimal = false;
        result.setText("0");
    }

    public void btn_SignPressed(View view) {
        if (!result.getText().toString().contains("-")) {
            result.setText(String.valueOf("-" + result.getText()));
            length = 11;
        }
        else {
            result.setText(String.valueOf(result.getText().toString().substring(1)));
            length = 10;
        }
    }

    public void btn_PercentPressed(View view) {

    }


    // OPERATIONS -------------------------
    public void btn_DividePressed(View view) {
        operation = "/";
        operationPressed = true;
        valOne = result.getText().toString();
        result.setText("0");
    }

    public void btn_MultiplyPressed(View view) {
        operation = "*";
        operationPressed = true;
        valOne = result.getText().toString();
        result.setText("0");
    }

    public void btn_SubtractPressed(View view) {
        operation = "-";
        operationPressed = true;
        valOne = result.getText().toString();
        result.setText("0");
    }

    public void btn_AddPressed(View view) {
        operation = "+";
        operationPressed = true;
        valOne = result.getText().toString();
        result.setText("0");
    }

    public void btn_EqualsPressed(View view) {
        valTwo = result.getText().toString();

        if (operationPressed) {

                d_valOne = Double.parseDouble(valOne);
                d_valTwo = Double.parseDouble(valTwo);

                if (operation.equals("/"))
                    d_result = (d_valOne / d_valTwo);
                else if (operation.equals("*"))
                    d_result = (d_valOne * d_valTwo);
                else if (operation.equals("-"))
                    d_result = (d_valOne - d_valTwo);
                else if (operation.equals("+"))
                    d_result = (d_valOne + d_valTwo);

            if (Double.toString(d_result).substring(Double.toString(d_result).length() - 2).equals(".0")) {
                if (Double.toString(d_result).length() > 10)
                    result.setText(String.format("%11.3E", d_result));
                else
                    result.setText(String.valueOf((int) d_result));
            }
            else {
                if (Double.toString(d_result).length() > 10)
                    result.setText(String.format("%11.3E", d_result));
                else
                    result.setText(String.valueOf(d_result));
            }

            operationPressed = false;
        }
    }


    // BOOLEANS -------------------------
    public boolean isNegative() {
        return result.getText().toString().contains("-");
    }

    public boolean isZero() {
        String value = result.getText().toString();
        return !(value.contains("1") || value.contains("2") || value.contains("3") || value.contains("4") || value.contains("5")
                || value.contains("6") || value.contains("7") || value.contains("8") || value.contains("9") || value.contains("."));
    }

    public void btn_DecimalPressed(View view) {
        if (result.getText().length() < length) {
            if (!result.getText().toString().contains("."))
                result.setText(String.valueOf(result.getText() + "."));
        }
    }


    // NUMBERS --------------------------
    public void btn_NinePressed(View view) {
        if (result.getText().length() < length) {
            if (isZero()) {
                if (isNegative())
                    result.setText("-9");
                else result.setText("9");
            }
            else result.setText(String.valueOf(result.getText() + "9"));
        }}

    public void btn_EightPressed(View view) {
        if (result.getText().length() < length) {
            if (isZero()) {
                if (isNegative())
                    result.setText("-8");
                else result.setText("8");
            }
            else result.setText(String.valueOf(result.getText() + "8"));
        }}

    public void btn_SevenPressed(View view) {
        if (result.getText().length() < length) {
            if (isZero()) {
                if (isNegative())
                    result.setText("-7");
                else result.setText("7");
            }
            else result.setText(String.valueOf(result.getText() + "7"));
        }}

    public void btn_SixPressed(View view) {
        if (result.getText().length() < length) {
            if (isZero()) {
                if (isNegative())
                    result.setText("-6");
                else result.setText("6");
            }
            else result.setText(String.valueOf(result.getText() + "6"));
        }}

    public void btn_FivePressed(View view) {
        if (result.getText().length() < length) {
            if (isZero()) {
                if (isNegative())
                    result.setText("-5");
                else result.setText("5");
            }
            else result.setText(String.valueOf(result.getText() + "5"));
        }}

    public void btn_FourPressed(View view) {
        if (result.getText().length() < length) {
            if (isZero()) {
                if (isNegative())
                    result.setText("-4");
                else result.setText("4");
            }
            else result.setText(String.valueOf(result.getText() + "4"));
        }}

    public void btn_ThreePressed(View view) {
        if (result.getText().length() < length) {
            if (isZero()) {
                if (isNegative())
                    result.setText("-3");
                else result.setText("3");
            }
            else result.setText(String.valueOf(result.getText() + "3"));
        }}

    public void btn_TwoPressed(View view) {
        if (result.getText().length() < length) {
            if (isZero()) {
                if (isNegative())
                    result.setText("-2");
                else result.setText("2");
            }
            else result.setText(String.valueOf(result.getText() + "2"));
        }}

    public void btn_OnePressed(View view) {
        if (result.getText().length() < length) {
            if (isZero()) {
                if (isNegative())
                    result.setText("-1");
                else result.setText("1");
            }
            else result.setText(String.valueOf(result.getText() + "1"));
        }}

    public void btn_ZeroPressed(View view) {
        if (result.getText().length() < length) {
            if (isZero()) {
                if (isNegative())
                    result.setText("-0");
                else result.setText("0");
            }
            else result.setText(String.valueOf(result.getText() + "0"));
        }}

}
