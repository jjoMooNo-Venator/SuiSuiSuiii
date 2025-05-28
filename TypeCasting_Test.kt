//형변환
fun main() {
    var venatoria: Short = 424
    var takanashi: Int = 102 + venatoria.toShort()
    var hoshino: Long = 2025 + takanashi.toLong()
    
    println(hoshino)
}
