package `5`

fun main() {
    println("Введите число: ")
    val n1 = readln().toInt();

    for(i in 0 .. n1){
        for(j in 1 .. n1 - i ){
            print(" ")
        }
        print(i)
        for(j in 0..i){
            print("  ")
        }
        println(i)
    }
}