fun main()
{
    try
    {
        var moloko:zadanie1_5class=zadanie1_5class("Молоко", 65.0, 0.5, "Простоквашино",65.0 )
        moloko.Proverka()
        if(moloko.amrt==true)
        {
            moloko.Main1()
        }
        println("---------------------------------------------------")
        moloko.Vvod()
        println("---------------------------------------------------")
        moloko.Proverka()
        if(moloko.amrt==true)
        {
            moloko.Main1()
        }
        println("---------------------------------------------------")
        moloko.Proverka()
        if(moloko.amrt==true)
        {
            moloko.Main3()
        }
    }
    catch (e:Exception)
    {
        print("Ошибка ввода данных")
    }
}