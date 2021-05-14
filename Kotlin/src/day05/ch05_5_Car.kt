package day05

open class Ch05_5_Car protected constructor(_year: Int, _model: String, _power: String, _wheel: String) {
    private var year: Int = _year
    public var model: String = _model
    protected open var power: String = _power
    internal var wheel: String = _wheel

    protected fun start(key: Boolean){
        if(key) println("Start the Engin!")
    }

    class Driver(_name: String, _license: String){
        private var name: String = _name
        var license: String = _license
        internal fun driveing()  = println("[Driver] Driving() - ${name}")
    }
}

class Tico(_year: Int, _model: String, _power: String, _wheel: String, var name: String, private var key: Boolean) : Ch05_5_Car(_year, _model, _power, _wheel){
    override var power: String = "50hp"
    var driver = Driver(name, "first class")

    constructor(_name: String, _key: Boolean) : this(2014, "basic", "100hp", "normal", _name, _key){
        name = _name
        key = _key
    }

    fun access(password: String){
        if(password == "gotico"){
            println("----[Tico] access()---------")
            println("super.model = ${super.model}")
            println("super.power = ${super.power}")
            println("super.wheel = ${super.wheel}")
            super.start(key)

            println("Driver().license = ${driver.license}")
            driver.driveing()
        } else{
            println("You're a burglar")
        }
    }
}

class Burglar(){
    fun steal(anycar:Any){
        if(anycar is Tico){
            println("----[Burglar] steal()---------")
            println("anycar.name = ${anycar.name}")
            println("anycar.wheel = ${anycar.wheel}")

            println(anycar.driver.license)
            anycar.driver.driveing()
            anycar.access("dontknow")
        } else {
            println("Nothing to steal")
        }
    }
}

fun main(){
    val tico = Tico("Hong", true)
    tico.access("gotico")

    var burglar = Burglar()
    burglar.steal(tico)
}