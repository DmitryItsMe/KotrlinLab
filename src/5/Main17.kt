package `5`


fun main() {

    println("Введите строку: ")
    val s = readln()
    for(i in 0 ..s.length-1){
        println(s.get(i))
    }
}