package day06

object OCustomer{
    var name = "Hong"
    fun greeting() = println("Hello World!")
    init{ println("Init!") }
}

class CCustomer{
    companion object {
        const val HELLO = "hello"
        var name = "Park"
        @JvmStatic fun greeting() = println("Hello World!")
    }
}

fun main(){
    OCustomer.greeting()
    OCustomer.name = "Dooly"
    println("name = ${OCustomer.name}")

    CCustomer.greeting()
    println("name = ${CCustomer.name}, HELLO= ${CCustomer.HELLO}")
}