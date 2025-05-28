//코틀린 첫 작품
fun main() {
    var Takanashi: Int = 102
    var Rikuhachima: Double = 3.12
    var Takanachima: Any = 0
    
    println(Takanashi)
    println(Rikuhachima)
    println(Takanashi + Rikuhachima)
    
    Takanachima = Takanashi + Rikuhachima
    
    intDoubleTypeCheck(Takanachima)
}

fun intDoubleTypeCheck(Subject: Any) {
    when(Subject) {
        is Double -> println("Int + Double = Double")
        is Float -> println("Int + Double = Float")
        else -> println("Int + Double != Double/Float")
    }
}
