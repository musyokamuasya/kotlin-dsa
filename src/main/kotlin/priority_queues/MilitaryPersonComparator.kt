package priority_queues
/**
 * This is a ticketing platform
 * Checks whether someone is in military
 * If in military looks at the rank
 * -> It is supposed to give higher priority to people in military, and of higher rank
 * */
object MilitaryPersonComparator : Comparator<Person> {
    override fun compare(firstPerson: Person, secondPerson: Person): Int {

        if (firstPerson.isMilitary && !secondPerson.isMilitary){
            return 1
        }
        if (!firstPerson.isMilitary && secondPerson.isMilitary){
            return -1
        }
        else if (firstPerson.isMilitary && secondPerson.isMilitary){
            return firstPerson.age.compareTo(secondPerson.age)
        }
        return 0
    }

}