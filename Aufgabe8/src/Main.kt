fun main(){

    var car1 = Car(150, "Silber", 5)

    println(car1.freeSeats)
    car1.getIn()
    car1.getIn()
    println(car1.freeSeats)
    car1.startEngine()

    var car2: Car = Car(220, "Schwarz", 2)
    car2.getIn()
    car2.getIn()
    println(car2.freeSeats)
    car2.getIn()
    car2.getOut()
    car2.getOut()
    car2.startEngine()

}