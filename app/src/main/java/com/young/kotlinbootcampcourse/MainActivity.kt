package com.young.kotlinbootcampcourse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        feedTheFish()
        swim()
        swim("slow")
        swim(speed = "turtle-like")

        println(decorations.filter { it[0] == 'p' })
        println(decorations.filter { it[1] == 'l' })

        //eager, creates a new list
        val eager = decorations.filter { it[0] =='p' }
        println("eager: $eager")

        //lazy, will wait until asked to evaluate
        val filtered = decorations.asSequence().filter { it[0] == 'p' }
        println("filtered: + $filtered ")

        //force evaluation of the lazy list
        val newList = filtered.toList()
        println("new list: $newList")

        val lazyMap = decorations.asSequence().map {
            println("access: $it")
            it
        }
        println("lazy: $lazyMap")
        println("--------")
        println("first: ${lazyMap.first()}")
        println("---------")
        println("all: ${lazyMap.toList()}")

    }


}
