fun main() {
    var venatoria: Int = 0
    
    println("After")
    while(venatoria < 10) {
        println(venatoria++)
    }
    println()
    
    venatoria = 0
    
    println("Before")
    while(venatoria < 10) {
        println(++venatoria)
    }
}
