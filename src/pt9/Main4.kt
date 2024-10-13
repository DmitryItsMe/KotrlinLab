package pt9

fun main(){
    println("Введите первую сроку:")
    val s1 = readln()
    println("Введите вторую сроку:")
    val s2 = readln()
    println(an(s1, s2))
}

fun an(s1: String, s2: String): Boolean {
    val w = true
    if (s1.length != s2.length) return false
    else {
        for (i in 0 until s1.length) {
            if (!s2.contains(s1.get(i))) return false
        }
        return true
    }
}