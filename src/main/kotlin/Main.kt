import data_classes.Person

fun main(args: Array<String>) {
//     germanNumbers()
    Person ("Musyoka", 23, "Nairobi").let {
        println(it)
        it.moveTo("Durban")
        it.incrementAge()
        println(it)
    }

/**
 * Prevents writing code as below
 * Which instantiates a new object of the person
 **/
//    val person = Person("Musyoka", 23, "Nairobi")
//    person.incrementAge()
//    person.moveTo("Washington")
//    println(person)
}

fun germanNumbers (){
    for (index in 0..10 step 2) {
        when (index) {
            0 -> println("Zero")
            1 -> println("Eins")
            2 -> println("Zwei")
            3 -> println("Drei")
            4 -> println("Vier")
            5 -> println("Funf")
            6 -> println("Sechs")
            7 -> println("Sieben")
            8 -> println("Acht")
            9 -> println("Neun")
            10 -> println("Zehn")
            else -> println("Something bigger than four")
        }
    }
}

//Scope functions
/**
 * Executes a block of code within the context of an object
 * Example below shows the use of scope functions
 */