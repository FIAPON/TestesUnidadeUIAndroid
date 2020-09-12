package com.fiap.calculoimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_make_calc.setOnClickListener {
            val pesoTxt = edt_peso.text.toString()
            val alturaTxt = edt_altura.text.toString()

            val imcResult = getImcResult(pesoTxt, alturaTxt)

            if (imcResult.result == Result.BLANK){
                txt_result_imc_success.visibility = View.GONE
                txt_result_imc_error.visibility = View.VISIBLE
                txt_result_imc_error.text = imcResult.result.label
            } else {
                txt_result_imc_success.visibility = View.VISIBLE
                txt_result_imc_error.visibility = View.GONE
                txt_result_imc_success.text = imcResult.result.label
            }
        }
    }
}