package p7

fun main() {
    val dil = arrayListOf<Int>()    //Начальные карты
    dil.add((2..11).random())
    val pl = arrayListOf<Int>()
    pl.add((2..11).random())
    pl.add((2..11).random())

    var play = true;                              //Статус игры
    while((play==true) and (pl.sum() <= 21)){

        show(dil, pl)
        println("Выберите действие: \n+ (Добавить)\t- (Пасс)")    //Выбор + или -
        var ds = readln()

        if(ds == "+") {pl.add((2..11).random()); continue}  //Если нажат +

        else if(ds == "-"){                                       //Если нажат -
            while(dil.sum() < 17){
                dil.add((2..11).random())

                if(dil.sum() > 21) {                              //Условие перебора у диллера
                    show(dil, pl)
                    println("Вы выиграли")
                    play = false
                    break
                }
            }
            if(dil.sum() <= 21) {                                                                    //Сравненние очков
                if(dil.sum() > pl.sum()){ show(dil, pl); println("Вы проиграли"); play=false;}
                else if(dil.sum() < pl.sum()){ show(dil, pl); println("Вы выиграли"); play=false;}
                else { show(dil, pl); println("Ничья"); play=false;}
            }
        }
    }

    if(play==true){                      //Вывод при переборе у игрокоа
        show(dil, pl)
        println("Вы проиграли")
    }
}

fun show(dil: List<Int>, pl: List<Int>){                             //Отображение карт
    println("Карты диллера: ${dil} (Кол-во очков: ${dil.sum()})")
    println("Карты игрока: ${pl} (Кол-во очков: ${pl.sum()})")
}




