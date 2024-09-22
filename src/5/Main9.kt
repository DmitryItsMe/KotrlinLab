package `5`

fun main() {
    println("Введите строку: ")
    val s = readln()
    var l = s.length-1
    while(l >= 0){
        print(s.get(l))
        l--
    }
}