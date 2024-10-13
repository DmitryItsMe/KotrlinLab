package pt10

fun main() {
    println("Введите текст: ")
    val s = readln()
    val fs = 3
    println(cz(s, fs, e = true))
}

fun cz(t: String, fs: Int, e: Boolean=true): String {
    var res = StringBuilder()
    val fsT = if (e) fs % 26 else -fs % 26
    for (el in t) {
        if (el.isLetter()) {
            val on = if (el.isLowerCase()) 'a' else 'A'
            val fchar = (on + (el - on + fsT + 26)%26)
            res.append(fchar)
        }
        else{
            res.append(el)
        }
    }
    return res.toString()
}