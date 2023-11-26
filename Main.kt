fun main(args: Array<String>) {
    var firstyear = 2000
    var lastyear = 2050

    for (year in firstyear..lastyear step 2)
    {
        if (year%4==0 && year%100!=0 || year%400==0){
            println("$year leap year")
        }
        else{
            println("$year not leap year")
        }
    }

}