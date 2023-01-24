class Hund(name: String, rasse: String, alter: Int){
    var name = name
    var rasse = rasse
    var alter = alter

    fun altern(){
        this.alter++
    }

    fun bellen(){
        println("$name: Wuff, Wuff Wuff!")
    }
}