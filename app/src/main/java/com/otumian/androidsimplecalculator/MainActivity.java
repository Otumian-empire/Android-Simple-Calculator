package com.otumian.androidsimplecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText firstParam, secondParam;
    private TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstParam = findViewById(R.id.et_first_parameter);
        secondParam = findViewById(R.id.et_second_parameter);

        resultView = findViewById(R.id.tv_result);
    }

    public void onAdd(View view) {
        try {
            doCalculation(Operator.ADD);
        } catch (Exception e) {
            Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void onSub(View view) {
        try {
            doCalculation(Operator.SUB);
        } catch (Exception e) {
            Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void onDiv(View view) {
        try {
            doCalculation(Operator.DIV);
        } catch (Exception e) {
            Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void onMul(View view) {
        try {
            doCalculation(Operator.MUL);
        } catch (Exception e) {
            Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public double getInputValue(EditText editText) {
        return Double.parseDouble(editText.getText().toString());
    }

    public void doCalculation(Operator operator) {
        double firstValue = getInputValue(firstParam);
        double secondValue = getInputValue(secondParam);
        double result = 0;

        switch (operator) {
            case ADD:
                result = Operation.add(firstValue, secondValue);
                break;
            case SUB:
                result = Operation.sub(firstValue, secondValue);
                break;
            case DIV:
                result = Operation.div(firstValue, secondValue);
                break;
            case MUL:
                result = Operation.mul(firstValue, secondValue);
                break;
            default:
                break;
        }

        resultView.setText(Double.toString(result));
    }
}