package com.example.basicrecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var persons = mutableListOf<Person>(
        Person("Elin", 28),
        Person("Hanna", 29),
        Person("Leah", 2),
        Person("Noah", 2),
        Person("Martina", 26))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for(i in 1..100) {
            persons.add(Person("Hanna", i))
        }

        var recycleView = findViewById<RecyclerView>(R.id.personRecycleView)
        recycleView.layoutManager = LinearLayoutManager(this)

        val adapter = PersonRecycleAdapter(this, persons)

        recycleView.adapter = adapter



    }
}