fun main(){
    var str1: String = "Hello Kotlin"
    var str2: String? = "Hello Kotlin"
    println("str1 : ${str1}, str2 : ${str2}")

    str2 = null
    println("str1 : ${str1}, str2 : ${str2}")

    str2 = "Hello Kotlin2"
    str1 = str2
    println(str1)
}