package pt9

fun main(){
    println("Введите слово (используйте только маленькие русские буквы)")
    val s = readln()
    println("Гласные: ${g(s)}")
    println("Согласные: ${s(s)}")
}

fun g(n: String): Int{
    var n1 = 0
    for(i in 0 until  n.length){
        if((n.get(i) == 'а') or (n.get(i) == 'е') or
            (n.get(i) == 'ё') or (n.get(i) == 'и') or
            (n.get(i) == 'о') or (n.get(i) == 'у') or
            (n.get(i) == 'ы') or (n.get(i) == 'э') or
            (n.get(i) == 'ю') or (n.get(i) == 'я')) n1++

    }
    return n1
}

fun s(n: String): Int{
    var n1 = 0
    for(i in 0 until  n.length){
        if((n.get(i) == 'б') or (n.get(i) == 'в') or
            (n.get(i) == 'г') or (n.get(i) == 'д') or
            (n.get(i) == 'ж') or (n.get(i) == 'з') or
            (n.get(i) == 'й') or (n.get(i) == 'к') or
            (n.get(i) == 'л') or (n.get(i) == 'м') or
            (n.get(i) == 'н') or (n.get(i) == 'п') or
            (n.get(i) == 'р') or (n.get(i) == 'с') or
            (n.get(i) == 'т') or (n.get(i) == 'ф') or
            (n.get(i) == 'х') or (n.get(i) == 'ц') or
            (n.get(i) == 'ч') or (n.get(i) == 'ш') or
            (n.get(i) == 'щ')) n1++
    }
    return n1
}