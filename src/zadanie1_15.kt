fun main()
{
    try {
        var studik:zadanie1_15class=zadanie1_15class("Ванюша", "Литература", "23/03/2018", 5.0)
        studik.Proverka()
        if(studik.amrt==true)
        {
            studik.Main1()
        }
        println("---------------------------------------------------")
        studik.Vvod()
        println("---------------------------------------------------")
        studik.Proverka()
        if(studik.amrt==true)
        {
            studik.Main1()
        }
    } catch (e:Exception)
    {
        println("Найдена ошибка при вводе данных")
    }
}
