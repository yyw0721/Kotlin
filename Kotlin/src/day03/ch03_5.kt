package day03
fun main(){
    val oper = getOperator("add")
    val result = calc2(30, 10, oper!!)
    println("계산 결과 : ${result}")
}

fun getOperator(name: String) : ((Int, Int) -> Int)? {
    var oper:((Int, Int) -> Int)? = null

    if(name == "add"){
        oper = { a, b -> a+ b}
    } else if(name == "subtract"){
        oper = { a, b -> a - b}
    }
    return oper
}

fun calc2(first: Int, second: Int, oper: (Int, Int) -> Int) : Int{
    return oper(first, second)
}