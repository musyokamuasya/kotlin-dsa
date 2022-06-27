fun main(args: Array<String>) {
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