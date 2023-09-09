package com.notify.mvvmdaggerdi.model

object  normalmodelclass {
    val data=2
    var data1="3"
    fun data(){
        val called=2
    }

}
open class Person() {
    fun eat() = println("Eating food.")

    fun talk() = println("Talking with people.")

    open fun pray() = println("Praying god.")
}
fun main(args: Array<String>) {
    val atheist = object : Person() {
        override fun pray() = println("I don't pray. I am an atheist.")
    }

    atheist.eat()
    atheist.talk()
    atheist.pray()
}

open class geeks{
    open fun student():String ="alok"
}
class batch: geeks() {
    override fun student():String = "ashish"
}