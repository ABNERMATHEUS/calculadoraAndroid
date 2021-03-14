package com.abnerdev.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    TextView resultView;
    EditText valor1;
    EditText valor2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultView = findViewById(R.id.result);
        valor1 = findViewById(R.id.inputValue1);
        valor2 = findViewById(R.id.inputValue2);
    }

    public void clickButton(View view){
        double result=0;
        Calculadora calculadora = new Calculadora();
        Button botao = (Button)view;
        String valorButton = botao.getText().toString();
        double valor1Double = Double.parseDouble(valor1.getText().toString());
        double valor2Double = Double.parseDouble(valor2.getText().toString());
        switch (valorButton){
            case "+" :
                result = calculadora.soma(valor1Double,valor2Double);
                break;
            case "-" :
                result = calculadora.substracao(valor1Double,valor2Double);
                break;
            case "*" :
                result = calculadora.mutiplicacao(valor1Double,valor2Double);
                break;
            case "/" :
                if(valor2Double <= 0.0){
                    Toast.makeText(MainActivity.this,"Divisão infinito",Toast.LENGTH_LONG).show();
                    resultView.setText("Result:");
                    return;
                }
                result = calculadora.divisao(valor1Double,valor2Double);
                break;
            default:
                break;
        }

        resultView.setText("Result: "+String.valueOf(result));
    }



}