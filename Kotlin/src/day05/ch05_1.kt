package day05

class Ch05_1(var name: String, var wing: Int, var beak: String, var color: String){

    fun fly() = println("Fly wing: ${wing}")
    fun sing(vol: Int) = println("Sing vol: ${vol}")
}

fun main(){
    val coco: Ch05_1 = Ch05_1("myBird", 2, "short", "blue")

    coco.color = "yellow"
    println("coco.color: ${coco.color}")
    coco.fly()
    coco.sing(3)
}