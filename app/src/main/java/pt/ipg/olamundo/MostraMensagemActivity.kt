package pt.ipg.olamundo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class MostraMensagemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostra_mensagem)

        val mensagem = intent.getStringExtra(MainActivity.INFO_EXTRA_MENSAGEM)
        val data = intent.getSerializableExtra(MainActivity.INFO_EXTRA_DATA) as Date

        val textViewMensagem = findViewById<TextView>(R.id.textView)
        textViewMensagem.setText(mensagem)

        val textViewDataHora = findViewById<TextView>(R.id.textView3)
        val df = SimpleDateFormat("HH:mm:ss")

        textViewDataHora.setText(data.toString())

    }
}