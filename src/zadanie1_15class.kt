class zadanie1_15class (var name:String, var predmet:String, var data:String,var res:Double) {
    var amrt: Boolean = true;
    fun Vvod() {
        print("Введите имя студента: ")
        name = readLine()!!.toString()
        print("Введите предмет по которому сдавался экзамен: ")
        predmet = readLine()!!.toString()
        print("Введите дату экзамена: ")
        data = readLine()!!.toString()
        print("Введите оценку: ");
        res = readLine()!!.toDouble()
    }

    fun Main1() {
        println("Имя студента: ${name}")
        println("Название предмета: ${predmet}")
        println("Дата экзамена: ${data}")
        println("Оценка за экзамен: ${res}")
    }

    fun Proverka() {
        amrt=true;
        if (name >= "a" && name <= "z" || name >= "а" && name <= "я" || name >= "A" && name <= "Z" || name >= "А" && name <= "Я")
        {
            if (predmet >= "a" && predmet <= "z" || predmet >= "а" && predmet<= "я" ||predmet >= "A" && predmet <= "Z" || predmet >= "А" && predmet <= "Я")
            {
                if (res > 0 && res <=5) { }
                else
                {
                    println("Некорректный ввод числа");
                    amrt=false
                }
            }
            else
            {
                println("Предмет не может включать числа или символы в названии")
                amrt = false
            }
        } else {
            println("Ввод числа и знаков в имени запрещен!")
            amrt = false
        }
    }
}