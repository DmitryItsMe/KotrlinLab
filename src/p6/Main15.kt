package p6

fun main() {
    var list = arrayListOf(3, 5, 6, 6, 6, 5, 3)
    var list2 = arrayListOf<Int>()
    var list3 = arrayListOf<Int>()
    for(i in 0 until list.size){
        list2.add(list[i])
    }
    for(i in list.size-1 downTo 0){
        list3.add(list[i])
    }
    println(list)
    if(list2 == list3) println("Полиндром")
    else println("Не полиндром")
}