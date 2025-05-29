fun main() {
    var venatoria: Int = 0
    for(i in 0..9) {
        venatoria = i
        print(venatoria)
    }
    println()
    
    for(i in 0..9 step 2) {
        venatoria = i
        print(venatoria)
    }
    println()
    
    for(i in 9 downTo 0) {
        venatoria = i
        print(venatoria)
    }
    println()
    
    for(i in 9 downTo 0 step 2) {
        venatoria = i
        print(venatoria)
    }
}
