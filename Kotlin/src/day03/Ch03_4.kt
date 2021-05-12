package day03

fun main(){
    val out1: () -> String = { -> "Hello World!1"}
    val out2: () -> String = { -> "Hello World!2"}
    val out3: () -> String = { -> "Hello World!3"}

    noParam2({ -> "Hello World!4"})
    println(out1()); println(out2()); println(out3)

}

fun noParam1(oper: () -> String) : String {
    return oper()
}

fun noParam2(oper: () -> String){
    println(oper())
}