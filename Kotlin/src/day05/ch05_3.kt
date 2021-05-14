package day05

open class Ch05_3(var name: String, var color: String) {
    fun name() = println("Bird's name is ${name}")
}

class Parrot(name: String, color: String, var language: String) : Ch05_3(name, color) {
    fun speak() = println("Speak! ${language}")
}

fun main(){
    val parrot = Parrot("coco", "Blue", "English")
    parrot.name()
    parrot.speak()
}