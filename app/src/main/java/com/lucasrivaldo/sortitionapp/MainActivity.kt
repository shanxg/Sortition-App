package com.lucasrivaldo.sortitionapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sweep( view: View ){
        val textViewSortition = findViewById<TextView>(R.id.textSortition)
        val poolNumber = Random().nextInt(11)
        val textSortition = "Pool number is: $poolNumber"



        textViewSortition.text = textSortition
    }

    // Course's class notes
    fun courseClass( classe: String){

        //uses f or L for float and Long identification, for int and double it's not needed
         var num = 3.525
         var num1 = 5.3f
         var num2 = 21L

        var names = arrayOf("Janice", "Luna", "Snow", 4.20)

        println("Olá, $classe!!")

        val house = House("Red")
        house.openHouse()

    }

    fun sum(num1: Int, num2: Int ) : Int{
        return num1+num2
    }

    //
    open class House/*(color: String)*/ {

        /*
        * private -> visible only within the class
        * protected -> works as private but it's visible on subclasses
        * public -> public visible, can be accessed from everywhere, it's the standard definition
        * internal -> similar to public, but only accessed within a module.
        * open -> "open" means it can be extended/override, without, the class doesn't extend/override
        * */

        //var color: String = color

        var color: String
        /*
        init {
            this.color = color
        }*/

        constructor( color: String ){
            this.color = color
        }

        private fun openDoors(){
            println("House's door opened!")
        }

        private fun openWindow(){
            println("House's widow opened!")
        }

        fun openHouse(){
            this.openDoors()
            this.openWindow()
        }
    }
}
