package com.example.projetoappprogand

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.navigation.fragment.findNavController

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.FirstFragment))
        setSupportActionBar(findViewById(R.id.toolbar))

    }

        override fun onCreateOptionsMenu(menu: Menu?): Boolean {
            menuInflater.inflate(R.menu.main_menu,menu)
            return true
        }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val itemview = item.itemId

        when(itemview){
            R.id.Certificados -> Toast.makeText(applicationContext,"Certificados",Toast.LENGTH_SHORT).show()
            R.id.informações -> Toast.makeText(applicationContext,"Informações",Toast.LENGTH_SHORT).show()
        }
        return false
    }
    }









