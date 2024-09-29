package p6

fun main() {
    val m = arrayOf((0..10).random(),
                    (0..10).random(),
                    (0..10).random(),
                    "ww",
                    (0..10).random())
    for(i in 0 until m.size){
        if(m[i] is String) println(m[i])
    }
}