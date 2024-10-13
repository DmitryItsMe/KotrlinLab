package p8

fun main() {
    println(p37())
}

fun p37(){
    for(i in 1 .. 10){
        for(j in 1 .. 10){
            println("$i * $j = ${i*j}")
        }
    }
}