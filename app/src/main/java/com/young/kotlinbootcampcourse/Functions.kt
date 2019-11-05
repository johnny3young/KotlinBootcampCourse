package com.young.kotlinbootcampcourse

import java.util.*


class Functions {

}

fun ramdonDay(): String {
    val week = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

fun feedTheFish(){
    val day = ramdonDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat is $food")
    println("Change water: ${shouldChangeWater(day)}")
}

fun fishFood(day: String): String{


   return when (day){
        "Monday" -> "flakes"
        "Tuesday" ->  "pellets"
        "Wednesday" ->  "redworms"
        "Thursday" ->  "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        "Sunday" ->  "plankton"
       else -> "Nothing"
    }

}

fun swim(speed: String = "fast"){
    println("swimming $speed")
}

fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20): Boolean{
    return when{
        //temperature > 30 -> true
        isTooHot(temperature) -> true
        //dirty > 30 -> true
        isDirty(dirty) -> true
        //day == "sunday" -> true
        isSunday(day) -> true
        else -> false
    }
}

fun isTooHot(temperature: Int) = temperature > 30
fun isDirty(dirty: Int) = dirty > 30
fun isSunday(day: String) = day == "Sunday"