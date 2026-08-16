package br.edu.fatecpg.appcalc

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val edtValor1 = findViewById<EditText>(R.id.edt_valor1)
        val edtValor2 = findViewById<EditText>(R.id.edt_valor2)
        val edtValor3 = findViewById<EditText>(R.id.edt_valor3)
        val btnCalcular = findViewById<Button>(R.id.btn_calcular)
        val txvResultado = findViewById<TextView>(R.id.txv_resultado)
        btnCalcular.setOnClickListener {
            val valorT = edtValor1.text.toString().toDoubleOrNull()
            val valorR = edtValor2.text.toString().toDoubleOrNull()
            val valorC = edtValor3.text.toString().toDoubleOrNull()
            if (valorT != null && valorR != null && valorC == null){
                txvResultado.setText("O resultado é: ${valorT / valorR}A")
                val msg = Toast.makeText(this, "Calculo Realizado!", Toast.LENGTH_SHORT).show()
            }
            else if (valorT != null && valorC != null && valorR == null){
                txvResultado.setText("O resultado é: ${valorT / valorC}Ω")
                val msg = Toast.makeText(this, "Calculo Realizado!", Toast.LENGTH_SHORT).show()
            }
            else if (valorR != null && valorC != null && valorT == null){
                txvResultado.setText("O resultado é: ${valorR * valorC}V")
                val msg = Toast.makeText(this, "Calculo Realizado!", Toast.LENGTH_SHORT).show()
            }
            else{
                val msg = Toast.makeText(this, "Preencha 2 valores!", Toast.LENGTH_SHORT).show()
            }
            edtValor1.text.clear()
            edtValor2.text.clear()
            edtValor3.text.clear()


        }
    }
}