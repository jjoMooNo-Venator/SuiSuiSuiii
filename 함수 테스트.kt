//함수 테스트
fun main() {
    typeChecker(10)
    typeChecker(1)
    typeChecker(424L)
    typeChecker("Siuuu")
    typeChecker("jjoMooNo")
    typeChecker(0)
    
    println()
    
    println(addCalc(1, 2, 3))
    println(addCalc(5, 6, 7))
    println(addCalc(10, 11, 12))
    println(addCalc(102, 312, 424))
}

fun typeChecker(subject: Any) {
    when(subject) {
        0 -> println("Int Zero")
        1 -> println("The first natural number")
        "jjoMooNo" -> println("Yeah its me :D")
        is Int -> println("This is Int")
        is String -> println("This is Str")
        is Long -> println("This is Long")
    }
}

fun addCalc(one: Int, two: Int, three: Int): Int {
    return one + two + three
}
