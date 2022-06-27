package data_classes

data class Person(
    var name: String? = null,
    var age: Int,
    var city: String? = null
){
    fun moveTo(newCity: String){
        city = newCity
    }

    fun incrementAge(){
        age ++
    }
}


