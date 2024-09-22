package `5`


fun main() {

    println("Введите число: ")
    val n = readln().toInt()
    for(i in 1 .. n){
        for(j in 0 .. i){
            print(" ")
        }
        println('#')
    }
}