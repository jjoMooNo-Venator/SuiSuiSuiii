//코틀린 첫 작품
fun main() {
    var takanashi: Int = 102
    var rikuhachima: Double = 3.12
    var takanachima: Any = 0
    
    println(takanashi)
    println(rikuhachima)
    println(takanashi + rikuhachima)
    
    takanachima = takanashi + rikuhachima
    
    intDoubleTypeCheck(takanachima)
}

fun intDoubleTypeCheck(Subject: Any) {
    when(Subject) {
        is Double -> println("Int + Double = Double")
        is Float -> println("Int + Double = Float")
        else -> println("Int + Double != Double/Float")
    }
}
