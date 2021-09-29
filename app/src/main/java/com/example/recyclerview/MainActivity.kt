package com.example.recyclerview

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.annotation.RequiresApi
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import java.util.Map.entry

class MainActivity : AppCompatActivity() {
    private lateinit var buton: Button
    private  var savedtext= ArrayList<String>()
    private lateinit var Editre: EditText
    private lateinit var mylayout:ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         mylayout=findViewById(R.id.conLayout)
         savedtext=ArrayList()

        rvMessages.adapter = RecyclerViewAdapter(this,savedtext)
        rvMessages.layoutManager = LinearLayoutManager(this)

        Editre = findViewById(R.id.Editre)
        buton = findViewById(R.id.submitt)

        buton.setOnClickListener {
            enatry() }




    }

    private fun enatry() {

            val etexts = Editre.text.toString()

            if (etexts.isNotEmpty()){
                savedtext.add(etexts)
                Editre.text.clear()
                Editre.clearFocus()
            }
            else{
                Snackbar.make(mylayout,"please enter text",Snackbar.LENGTH_LONG).show()
            }
        }
    }
