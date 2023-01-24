import java.time.LocalDate
import java.util.*

class Person(name: String, age: Int){
    var name = name
    var age = age

    init{
        println("Die Person mit dem Namen: $name und dem Alter: $age wurde angelegt")
    }
}