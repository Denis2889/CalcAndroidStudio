package com.example.cursoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  Button btnCalculadora;//Creo variable tipo button
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    btnCalculadora=findViewById(R.id.btnCalc);//Instanciamos
    btnCalculadora.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Toast.makeText(MainActivity.this,
          "Muy bien ingresaste a la calculadora", Toast.LENGTH_LONG).show();
        Intent salto= new Intent(MainActivity.this, CalcActivity.class);
        startActivity(salto);
      }
    });
  }
}