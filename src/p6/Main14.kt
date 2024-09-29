package p6

fun main() {
    var list = arrayListOf(3, 5, 6, 2, 10, 8, 21)
    var list2 = arrayListOf<Int>()
    for(i in 0 until list.size){
        if(list[i]%3==0) list2.add(list[i])
    }
    println(list2)
}