package com.example.cursoapp;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import java.text.DecimalFormat;

public class CalcActivity extends AppCompatActivity{

  //Creamos las variables que usaremos
  EditText edtVisor, edtPrint;

  private boolean igual, inicio = true, operacion1, operacion2;
  private double resultado, valor, valor2;
  private String cadena, funciones, tipoOperaciones;

  DecimalFormat df =  new DecimalFormat("0.00");

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_calc);

    edtVisor = (EditText) findViewById(R.id.txtEdtvisor);
    edtPrint = (EditText) findViewById(R.id.txtEdtprint);

    //BLOQUEAR EL EDITEXT SOLO TOMARA DATOS AL PULSAR LOS BOTONES
    edtVisor.setInputType(InputType.TYPE_NULL);
    edtPrint.setInputType(InputType.TYPE_NULL);

  }
  //Metodos de Numeros
  public void btn_Num1(View v){
    if(inicio==true){
      edtVisor.setText("");
      edtVisor.setText("1");
      inicio = false;
    }
    else {
      edtVisor.setText(edtVisor.getText()+
        "1");
    }
  }
  public void btn_Num2(View v){
    if(inicio==true){
      edtVisor.setText("");
      edtVisor.setText("2");
      inicio = false;
    }
    else {
      edtVisor.setText(edtVisor.getText()+
        "2");
    }
  }
  public void btn_Num3(View v){
    if(inicio==true){
      edtVisor.setText("");
      edtVisor.setText("3");
      inicio = false;
    }
    else {
      edtVisor.setText(edtVisor.getText()+
        "3");
    }
  }
  public void btn_Num4(View v){
    if(inicio==true){
      edtVisor.setText("");
      edtVisor.setText("4");
      inicio = false;
    }
    else {
      edtVisor.setText(edtVisor.getText()+
        "4");
    }
  }
  public void btn_Num5(View v){
    if(inicio==true){
      edtVisor.setText("");
      edtVisor.setText("5");
      inicio = false;
    }
    else {
      edtVisor.setText(edtVisor.getText()+
        "5");
    }
  }
  public void btn_Num6(View v){
    if(inicio==true){
      edtVisor.setText("");
      edtVisor.setText("6");
      inicio = false;
    }
    else {
      edtVisor.setText(edtVisor.getText()+
        "6");
    }
  }
  public void btn_Num7(View v){
    if(inicio==true){
      edtVisor.setText("");
      edtVisor.setText("7");
      inicio = false;
    }
    else {
      edtVisor.setText(edtVisor.getText()+
        "7");
    }
  }
  public void btn_Num8(View v){
    if(inicio==true){
      edtVisor.setText("");
      edtVisor.setText("8");
      inicio = false;
    }
    else {
      edtVisor.setText(edtVisor.getText()+
        "8");
    }
  }
  public void btn_Num9(View v){
    if(inicio==true){
      edtVisor.setText("");
      edtVisor.setText("9");
      inicio = false;
    }
    else {
      edtVisor.setText(edtVisor.getText()+
        "9");
    }
  }
  public void btn_Num0(View v){
    if(inicio==true){
      edtVisor.setText("");
      edtVisor.setText("0");
      inicio = false;
    }
    else {
      edtVisor.setText(edtVisor.getText()+
        "0");
    }
  }
  //Metodos para operadciones Matemáticas
  public void btn_punto(View v){
    if(edtVisor.getText().toString().contains(".")){

    }
    else {
      edtVisor.setText(edtVisor.getText()+".");
      inicio = false;
    }
  }
  public void btn_suma(View v){
    igual = true;
    inicio = true;

    if(operacion1 = true){
      valor=Double.parseDouble(edtVisor.getText().toString());
      edtPrint.setText("");
      edtPrint.setText(edtVisor.getText().toString()+ "+");
      operacion1 = false;
    }
    else{
      if(operacion2 = true){
        valor=Double.parseDouble(edtVisor.getText().toString());
        edtPrint.setText("");
        edtPrint.setText(edtVisor.getText()+ "+");
        operacion2 = false;
      }else{
        edtPrint.setText(edtVisor.getText()+ "+");
        Operaciones(resultado, valor2);
      }
    }
    tipoOperaciones = "+";
  }
  public void btn_resta(View v){
    igual = true;
    inicio = true;

    if(operacion1 = true){
      valor=Double.parseDouble(edtVisor.getText().toString());
      edtPrint.setText("");
      edtPrint.setText(edtVisor.getText().toString()+ "-");
      operacion1 = false;
    }
    else{
      if(operacion2 = true){
        valor=Double.parseDouble(edtVisor.getText().toString());
        edtPrint.setText("");
        edtPrint.setText(edtVisor.getText()+ "-");
        operacion2 = false;
      }else{
        edtPrint.setText(edtVisor.getText()+ "-");
        Operaciones(resultado, valor2);
      }
    }
    tipoOperaciones = "-";
  }
  public void btn_multip(View v){
    igual = true;
    inicio = true;

    if(operacion1 = true){
      valor=Double.parseDouble(edtVisor.getText().toString());
      edtPrint.setText("");
      edtPrint.setText(edtVisor.getText().toString()+ "×");
      operacion1 = false;
    }
    else{
      if(operacion2 = true){
        valor=Double.parseDouble(edtVisor.getText().toString());
        edtPrint.setText("");
        edtPrint.setText(edtVisor.getText()+ "×");
        operacion2 = false;
      }else{
        edtPrint.setText(edtVisor.getText()+ "×");
        Operaciones(resultado, valor2);
      }
    }
    tipoOperaciones = "×";
  }
  public void btn_div(View v){
    igual = true;
    inicio = true;

    if(operacion1 = true){
      valor=Double.parseDouble(edtVisor.getText().toString());
      edtPrint.setText("");
      edtPrint.setText(edtVisor.getText().toString()+ "÷");
      operacion1 = false;
    }
    else{
      if(operacion2 = true){
        valor=Double.parseDouble(edtVisor.getText().toString());
        edtPrint.setText("");
        edtPrint.setText(edtVisor.getText()+ "÷");
        operacion2 = false;
      }else{
        edtPrint.setText(edtVisor.getText()+ "÷");
        Operaciones(resultado, valor2);
      }
    }
    tipoOperaciones = "÷";
  }
  public void Operaciones(double tipovalor1, double tipovalor2){
    switch (tipoOperaciones){
      case "p":
        resultado = Math.pow(tipovalor1, tipovalor2);
        edtVisor.setText(resultado+ "");
        break;
      case "+":
        resultado = tipovalor1 + tipovalor2;
        edtVisor.setText(resultado + "");
        tipovalor1 = Double.parseDouble(edtVisor.getText().toString());
        break;
      case "-":
        resultado = tipovalor1 - tipovalor2;
        edtVisor.setText(resultado + "");
        tipovalor1 = Double.parseDouble(edtVisor.getText().toString());
        break;
      case "×":
        resultado = tipovalor1 * tipovalor2;
        edtVisor.setText(resultado + "");
        tipovalor1 = Double.parseDouble(edtVisor.getText().toString());
        break;
      case "÷":
        if(tipovalor2 == 0){
          edtVisor.setText("Error");
        }
        else {
          resultado = tipovalor1 / tipovalor2;
          edtVisor.setText(resultado + "");
          tipovalor1 = Double.parseDouble(edtVisor.getText().toString());
        }
        break;
    }
  }
  public void btn_igual(View v){

    inicio = true;
    operacion1 = true;
    if(igual == true){
      if(tipoOperaciones == null){

      }
      else{
        valor2=Double.parseDouble(edtVisor.getText().toString());
        edtPrint.setText(edtPrint.getText().toString()+ edtVisor.getText().toString() + "=");
        Operaciones(valor, valor2);
        igual = false;
      }
    }
    else {
      edtPrint.setText("");
      Operaciones(valor, valor2);
    }

  }
  public void btn_csigno(View v){
   double nu1=0,nu2, nu3;
   nu2 = Double.parseDouble(edtVisor.getText().toString());
   nu3 = nu1 - nu2;
   edtVisor.setText(nu3 + " ");

  }
  public void btn_c(View v){
    edtVisor.setText("0");
    edtPrint.setText("");
    inicio= true;
    funciones = "";
    operacion1 = true;
    operacion2 = true;
    igual = true;
    valor = 0;
    valor2 = 0;
    resultado = 0;
  }

  public void btn_ce(View v){
    edtVisor.setText("0");
    edtPrint.setText("");
    inicio= true;
    funciones = "";
    operacion1 = true;
    operacion2 = true;
    igual = true;
    valor = 0;
    valor2 = 0;
    resultado = 0;
  }
  public void btn_porc(View v){
    inicio = true;
    valor = Double.parseDouble(edtVisor.getText().toString());
    edtPrint.setText(valor + "%");
    edtVisor.setText(df.format(valor * 0.01d)+"");
  }
  public void btn_ret(View v){
    if(edtVisor.getText().length()>0){
      edtVisor.setText(edtVisor.getText().toString().substring(0, edtVisor.getText().length()-1));
      if(edtVisor.getText().length() == 0){
        edtVisor.setText("0");
        edtPrint.setText("");
        inicio = true;
      }
    }
  }
  public void btn_div1(View v){
    valor = Double.parseDouble(edtVisor.getText().toString());
    if(valor > 0){
      edtPrint.setText("1/(" + valor +")");
      edtVisor.setText(df.format(1/ valor)+"");
    }
    else {
      edtVisor.setText("");
      edtPrint.setText("No se puede dividir entre cero");
    }

  }
  public void btn_pot(View v){
    inicio = true;
    valor = Double.parseDouble(edtVisor.getText().toString());
    edtPrint.setText(valor + "^");
    operacion1 = false;
    igual = true;
    tipoOperaciones="p";
  }
  public void btn_raiz(View v){
    valor = Double.parseDouble(edtVisor.getText().toString());
    if(valor>=0){
      edtPrint.setText("sqrt(" + valor+")");
      edtVisor.setText(df.format(Math.sqrt(valor)) + "");
    }
    else {
      edtPrint.setText("Error");
    }
  }

  public void btn_salir(View v) {
    AlertDialog.Builder myalert = new AlertDialog.Builder(this);
    myalert.setMessage("En verdad deseas salir de la calculadora?");
    myalert.setTitle("Alerta");
    myalert.setPositiveButton("Si", new DialogInterface.OnClickListener() {
      @Override
      public void onClick(DialogInterface dialog, int which) {

        finish();
      }
    });
    myalert.setNegativeButton("No", new DialogInterface.OnClickListener() {
      @Override
      public void onClick(DialogInterface dialog, int which) {

        dialog.cancel();
      }
    });
    AlertDialog dialog = myalert.create();
    dialog.show();

  }
}