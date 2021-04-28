package pt.ipg.olamundo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import java.util.*

class MainActivity : AppCompatActivity() {
    companion object{
        const val INFO_EXTRA_MENSAGEM="MENSAGEM"
        const val INFO_EXTRA_DATA="DATA"

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }



    fun enviaMensagem(view: View) {
        val editTextMensagem = findViewById<EditText>(R.id.editTextMensagem)
        val mensagem = editTextMensagem.text.toString()



        if(mensagem.trim().isBlank()){
            editTextMensagem.error=getString(R.string.Mensagem_vazia)
            return
        }

        //obter data e hora do sistema
        val data = Date()

        val intent = Intent(this, MostraMensagemActivity::class.java)
        intent.putExtra(INFO_EXTRA_MENSAGEM, mensagem)
        intent.putExtra(INFO_EXTRA_DATA, data)
        startActivity(intent)

    }
}