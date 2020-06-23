package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String number = "";
    public double num1 = 0;
    private double num2 = 0;
    protected String symbol;


    private TextView solucion;
    private Button Key_Pad0, Key_Pad1, Key_Pad2, Key_Pad3, Key_Pad4, Key_Pad5, Key_Pad6, Key_Pad7, Key_Pad8, Key_Pad9;
    private Button Key_PadSum, Key_PadSubstract, Key_PadMultiply, Key_Padequal, Key_PadClear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        solucion =  findViewById(R.id.solucion);

        Key_Pad0 = findViewById(R.id.num_cero);
        Key_Pad1 = findViewById(R.id.num_uno);
        Key_Pad2 = findViewById(R.id.num_dos);
        Key_Pad3 = findViewById(R.id.num_tres);
        Key_Pad4 = findViewById(R.id.num_cuatro);
        Key_Pad5 = findViewById(R.id.num_cinco);
        Key_Pad6 = findViewById(R.id.num_seis);
        Key_Pad7 = findViewById(R.id.num_siete);
        Key_Pad8 = findViewById(R.id.num_ocho);
        Key_Pad9 = findViewById(R.id.num_nueve);

        Key_PadClear = findViewById(R.id.CE);
        Key_PadMultiply = findViewById(R.id.multiply);
        Key_PadSum = findViewById(R.id.sum);
        Key_PadSubstract = findViewById(R.id.division);
        Key_Padequal = findViewById(R.id.equal);


        //listener for button

        Key_Pad0.setOnClickListener(this);
        Key_Pad1.setOnClickListener(this);
        Key_Pad2.setOnClickListener(this);
        Key_Pad3.setOnClickListener(this);
        Key_Pad4.setOnClickListener(this);
        Key_Pad5.setOnClickListener(this);
        Key_Pad6.setOnClickListener(this);
        Key_Pad7.setOnClickListener(this);
        Key_Pad8.setOnClickListener(this);
        Key_Pad9.setOnClickListener(this);



        Key_PadSum.setOnClickListener(this);
        Key_PadMultiply.setOnClickListener(this);
        Key_PadSubstract.setOnClickListener(this);
        Key_Padequal.setOnClickListener(this);
        Key_PadClear.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.num_cero:
                number = number + "0";
                solucion.setText(number);
                break;

            case R.id.num_uno:
                number = number + "1";
                solucion.setText(number);
                break;

            case R.id.num_dos:
                number = number + "";
                solucion.setText(number);
                break;

            case R.id.num_tres:
                number = number + "3";
                solucion.setText(number);
                break;

            case R.id.num_cuatro:
                number = number + "4";
                solucion.setText(number);
                break;

            case R.id.num_cinco:
                number = number + "5";
                solucion.setText(number);
                break;

            case R.id.num_seis:
                number = number + "6";
                solucion.setText(number);
                break;

            case R.id.num_siete:
                number = number + "7";
                solucion.setText(number);
                break;

            case R.id.num_ocho:
                number = number + "8";
                solucion.setText(number);
                break;

            case R.id.num_nueve:
                number = number + "9";
                solucion.setText(number);
                break;

            case R.id.sum:
                symbol = "+";
                num1 = Integer.parseInt(number);
                number = "";
                break;

            case R.id.substract:
                symbol = "-";
                num1 = Integer.parseInt(number);
                number = "";
                break;

            case R.id.division:
                symbol = "/";
                num1 = Integer.parseInt(number);
                number = "";
                break;

            case R.id.multiply:
                symbol = "X";
                num1 = Integer.parseInt(number);
                number = "";
                break;

            case R.id.equal:
                num2 = Integer.parseInt(number);

                switch (symbol){
                    case "+":
                        solucion.setText((int) (num1 + num2));
                        break;
                    case "-":
                        solucion.setText("solucion: " + (num1 - num2));
                        break;
                    case "/":
                        solucion.setText("solucion: " + (num1 / num2));
                        break;
                    case "X":
                        solucion.setText("solucion: " + (num1 * num2));
                        break;
                }

                num1 = 0;
                num2 = 0;
                number = "";

                break;

            case R.id.CE:
                symbol = "";
                num1 = 0;
                num2 = 0;
                number = "";
                solucion.setText("");
                break;


        }
    }
}
