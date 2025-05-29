fun main() {
    fun addThree(a: Int, b: Int, c: Int): Int {
        return a + b + c
    }
    fun addThreeSimple(a: Int, b: Int, c: Int) = a + b + c
    
    println(addThree(5, 6, 7))
    println(addThreeSimple(102, 424, 508))
}
