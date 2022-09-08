package com.example.parcial_c1;

import androidx.appcompat.app.AppCompatActivity;
import android.view.*;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {
    private TextView res_1, res_2;
    private EditText valor_1, valor_2, valor_3, valor_4;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valor_1 = findViewById(R.id.valor_1);
        valor_2 = findViewById(R.id.valor_2);
        valor_3 = findViewById(R.id.valor_3);
        valor_4 = findViewById(R.id.valor_4);
        res_1 = findViewById(R.id.res_1);
        res_2 = findViewById(R.id.res_2);
        }
        public void factorial (View view)
        {
            int valor1 = Integer.parseInt(valor_1.getText().toString());
            int valor2 = Integer.parseInt(valor_2.getText().toString());
            int valor3 = Integer.parseInt(valor_3.getText().toString());

            int factorial1 = 1;
            int factorial2 = 1;
            int factorial3 = 1;

            for (int i = 1; i <= valor1; i++)
            {
                factorial1= factorial1 * i;
            }
            for (int i = 1; i <= valor2; i++)
            {
                factorial2= factorial2 * i;
            }
            for (int i = 1; i <= valor3; i++)
            {
                factorial3= factorial3 * i;
            }
            int resultado = factorial1+ factorial2 + factorial3;

            res_1.setText(resultado + " ");


   }

   public void multisuma (View view)
   {
       int valor1 = Integer.parseInt(valor_1.getText().toString());
       int valor2 = Integer.parseInt(valor_2.getText().toString());
       int valor3 = Integer.parseInt(valor_3.getText().toString());

       int multi = valor1*valor2;

       int res =multi+ valor3;

       res_1.setText(res + " ");

   }

    public void fibonicci (View view)
    {
        int numero = Integer.parseInt(valor_4.getText().toString());
        int fibonicci = 1;
        int num1=0;
        int num2=1;

        for (int i = 0; i < numero; i++)
        {
            fibonicci= num1 + num2;
            num1 = num2;
            num2= fibonicci;
        }
        res_2.setText(fibonicci+ " ");
    }

}
