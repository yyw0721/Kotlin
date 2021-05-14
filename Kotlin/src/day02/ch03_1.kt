package day02

fun main(){
    println("덧셈 : " + sum(10, 20))
    println("뺄셈 : " + subtration(10, 20))
    println("곱셈 : " + multiple(10, 20))
    println("나눗셈 : " + division(20, 10))

    add("홍길동", "장성")
    add( "둘리", "북극")

    add(address = "모블")

}

fun sum(a: Int, b: Int) = a + b
fun subtration(a : Int, b : Int) = a - b
fun division(a : Int, b: Int) = a / b
fun multiple(a: Int, b: Int) = a * b

fun add(name: String = "이름", address:String = "천안"){
    println("${name}님의 주소는 ${address}입니다.")
}
