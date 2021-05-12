package day03

/*
함수형 프로그래밍
    : 순수 함수를 작성하여 프로그램의 부작용을 줄이는 프로그래밍 기법
    : 람다식과 고차 함수를 사용해서 구성

    순수함수 -> 함수의 외부의 상태를 변경하거나, 외부의 상태에 영향을 받으면 안된다.
            -> 동일한 인풋(인자)에는 항상 동일한 결과를 내야한다.
*/
fun main(){
    val multi = {x: Int, y: Int -> x * y}
    val result1 = multi(10, 20)
    println(result1)

    val addFunc = {x: Int, y : Int -> x + y}
    val subtratFunc = {x: Int, y: Int -> x - y}
    val multipleFunc = {x: Int, y: Int -> x * y}
    val divisionFunc = {x: Int, y: Int -> x / y}

    val result2 = calc1(30, 10, addFunc)
    println("더하기 결과 ${result2}")
}

fun calc1(first: Int, second: Int, oper: (Int, Int) -> Int) : Int {
    val result = oper(first, second)
    return result
}