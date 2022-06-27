package data_classes

data class Person(
    var name: String? = null,
    var age: String? = null,
    var city: String? = null
){
    fun moveTo(newCity: String){
        city = newCity
    }

    fun incrementAge(newAge: String){
        age = newAge
    }
}


