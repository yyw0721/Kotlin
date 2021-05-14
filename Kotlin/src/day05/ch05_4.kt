package day05

open class Ch05_4{
    fun fly() = println("Fly wing")
    open fun sing() = println("Sing")
}

class Duck : Ch05_4(){}
class Chicken : Ch05_4(){
    override fun sing() = println("I'm Chicken. I can speak!")
}

fun main(){
    val bird1: Ch05_4 = Ch05_4(); val bird2: Ch05_4 = Duck(); val bird3: Ch05_4 = Chicken()


    bird1.sing()
    bird2.sing()
    bird3.sing();
}