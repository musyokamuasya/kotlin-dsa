package arrays

fun main (){
arrayOps()
}

fun arrayOps(){
    val schools = arrayOf("Bush", "Boma", "Across", "Changez", "Katchez", "MaHill")
    val topSchool = schools[0]
    println("Top school $topSchool")

    val thirdItem = schools.elementAt(3)
    val thirdItem2 = schools[3]

    println("The third item $thirdItem and thirdItem through index $thirdItem2 are basically the same things")

//    To print a custom message if the item is unavailable
    val ninthSchool = schools.elementAtOrElse(9, {_ -> "Not reachable"})
    println(ninthSchool)

    val ninthItemOrNull = schools.elementAtOrNull(9)
    println(ninthItemOrNull)

    for (schoolIndex in schools.indices){
        if (schoolIndex % 2==0){
            println(schools[schoolIndex].lowercase())
        }
        else{
            println(schools[schoolIndex].uppercase())
        }
    }
}