package com.example.boxselected;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText currentEmail;
    private CheckBox checkRed;
    private CheckBox checkBlue;
    private CheckBox checkGreen;
    private TextView currentText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        currentEmail = findViewById(R.id.editText);
        checkRed = findViewById(R.id.checkBox);
        checkBlue = findViewById(R.id.checkBox2);
        checkGreen = findViewById(R.id.checkBox3);
        currentText = findViewById(R.id.textView);
    }
    public void getEmail() {
        String email = "Email: "+ currentEmail.getText().toString()+"\n";
        currentText.setText(email);
    }

    public void check(){
        // verificando se a checkbox esta marcada ou não
        Boolean isRed = checkRed.isChecked();
        Boolean isBlue = checkBlue.isChecked();
        Boolean isGreen = checkGreen.isChecked();

        // criando variavel String para atribuir os valores
        String texto = "";
        if (isRed) {
            // Acessando o nome dos valores do checkbox
            String checkText = checkRed.getText().toString();
            texto = texto + checkText +" escolhido\n";
        }
        if(isBlue) {
            String checkText = checkBlue.getText().toString();
            texto = texto + checkText +" escolhido\n";
        }
        if (isGreen) {
            String checkText = checkGreen.getText().toString();
            texto = texto + checkText +" escolhido\n";
        }
        // setando o textView com os valores gravados em texto
        currentText.setText(texto);
    }
    public void enviar(View view) {
        check();
    }

    public void limpar(View view) {
        // limpando o textView
        currentText.setText("");
    }
}