package br.edu.fatecpg.appcalc2

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
        val btnSoma = findViewById<Button>(R.id.btn_soma)
        val btnSub = findViewById<Button>(R.id.btn_sub)
        val btnMulti = findViewById<Button>(R.id.btn_mult)
        val btnDiv = findViewById<Button>(R.id.btn_div)
        val txvResultado = findViewById<TextView>(R.id.txv_resultado)


        btnSoma.setOnClickListener {
            val valor1 = edtValor1.text.toString().toDouble()
            val valor2 = edtValor2.text.toString().toDouble()
            val soma = valor1 + valor2

            txvResultado.setText("A soma é: $soma")
            edtValor1.text.clear()
            edtValor2.text.clear()

            val msg = Toast.makeText(this, "Calculo Realizado!"
                ,Toast.LENGTH_SHORT).show()

        }

        btnSub.setOnClickListener {
            val valor1 = edtValor1.text.toString().toDouble()
            val valor2 = edtValor2.text.toString().toDouble()
            val sub = valor1 - valor2

            txvResultado.setText("A subtração é: $sub")
            edtValor1.text.clear()
            edtValor2.text.clear()

            val msg = Toast.makeText(this, "Calculo Realizado!"
                ,Toast.LENGTH_SHORT).show()

        }

        btnMulti.setOnClickListener {
            val valor1 = edtValor1.text.toString().toDouble()
            val valor2 = edtValor2.text.toString().toDouble()
            val mult = valor1 * valor2

            txvResultado.setText("A multiplicação é: $mult")
            edtValor1.text.clear()
            edtValor2.text.clear()

            val msg = Toast.makeText(this, "Calculo Realizado!"
                ,Toast.LENGTH_SHORT).show()

        }
            btnDiv.setOnClickListener {
            val valor1 = edtValor1.text.toString().toDouble()
            val valor2 = edtValor2.text.toString().toDouble()
            val div = valor1 / valor2

            txvResultado.setText("A multiplicação é: $div")
            edtValor1.text.clear()
            edtValor2.text.clear()

            val msg = Toast.makeText(this, "Calculo Realizado!"
                ,Toast.LENGTH_SHORT).show()

        }
    }
}