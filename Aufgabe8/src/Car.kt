class Car{

    var hp: Int?
    var color: String
    var seats: Int?
    var freeSeats: Int?

    constructor(power: Int, color: String, seats: Int){
        if(power < 1){
            println("Ungültiger Wert für die Leistung!")
            hp = null
        }else{
            hp = power
        }

        if(seats < 1){
            println("Ungültiger Wert für die ANzahl der Sitzplätze!")
            this.seats = null
        }else{
            this.seats = seats
            this.freeSeats = seats
        }

        this.color = color
        this.freeSeats = seats
    }

    fun getIn(){
        if(freeSeats!! >= 1){
            freeSeats = freeSeats!! - 1
        }else{
            println("Keine freien Plätze im Auto verfügbar!")
        }
    }

    fun getOut(){
        if(freeSeats!! < seats!!){
            freeSeats = freeSeats!! + 1
        }else{
            println("Es ist keiner im Auto!\nAlle Plätze sind frei.")
        }
    }

    fun startEngine(){
        if(freeSeats!! < seats!!){
            println("Wrom, Wrom Wrom!")
        }else{
            println("Fehler, es ist keiner im Auto.\nDer Motor kann nicht gestartet werden!")
        }
    }

}

