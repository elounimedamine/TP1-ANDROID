package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //R = les ressources

        val name:EditText = findViewById(R.id.name)
        val firstname = findViewById<EditText>(R.id.firstname)
        val valider = findViewById<Button>(R.id.valider)
        val affichage:TextView = findViewById(R.id.affichage)

        valider.setOnClickListener{
            if(name.text.isEmpty() || firstname.text.isEmpty()) {
                //Toast.makeText(applicationContext, "error champs vide", Toast.LENGTH_LONG).show()
                Snackbar.make(valider, "Error champs vide", Snackbar.LENGTH_LONG).show()
                    //.setAction("Action") {
                        // Responds to click on the action
                   // }

            }else{
                Snackbar.make(valider, "Succès", Snackbar.LENGTH_LONG).show()
                    //.setAction("Action") {
                        // Responds to click on the action
                   // }
                var ch = "Bonjour ${name.text} ${firstname.text}"
                affichage.text=ch
            }
        }

        /*val name = findViewById<EditText>(R.id.name)
        val firstname =findViewById<EditText>(R.id.firstname)
        val valider = findViewById<Button>(R.id.valider)

        valider.setOnClickListener{
            /*if(name.text.isEmpty() || firstname.text.isEmpty()) {
                Toast.makeText(applicationContext, "error champs vide", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(applicationContext, "Succès", Toast.LENGTH_LONG).show()
            }*/
        }*/
    }
}