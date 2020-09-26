package com.example.demolist2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listView = findViewById<ListView>(R.id.lv_Show)

        var list = mutableListOf<Model>()

        list.add(Model("Title one","Description one",R.drawable.php_logo))
        list.add(Model("Title Two","Description Two",R.drawable.python_logo))
        list.add(Model("Title Three","Description Three",R.drawable.r_logo))
        list.add(Model("Title Four","Description Four",R.drawable.rails_logo))
        list.add(Model("Title Five","Description Five",R.drawable.ruby_logo))

        listView.adapter = MyAdapter(this,R.layout.row,list)

        listView.setOnItemClickListener { parent, view, position, id ->
             if (position == 0){
                 Toast.makeText(this,"Php language",Toast.LENGTH_SHORT).show()
             }

            if (position == 1){
                Toast.makeText(this,"Python language",Toast.LENGTH_SHORT).show()
            }

            if (position == 2){
                Toast.makeText(this,"R language",Toast.LENGTH_SHORT).show()
            }

            if (position == 3){
                Toast.makeText(this,"Rails language",Toast.LENGTH_SHORT).show()
            }

            if (position == 4){
                Toast.makeText(this,"Ruby language",Toast.LENGTH_SHORT).show()
            }
        }
    }
}