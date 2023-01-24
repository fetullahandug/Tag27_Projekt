class GameCharacter {
    var name: String
    var hasWeapon: Boolean
    var level: Int

    constructor(name: String, hasWeapon: Boolean, level: Int) {
        this.name = name
        this.hasWeapon = hasWeapon
        this.level = level
    }
}

/*
    Der Code erstellt eine Klasse "GameCharacter" die einen Spielecharakter darstellen soll.
    Die Klasse besteht aus Eigenschaften wie der Name des Charakters, ob er eine Waffe hat oder nicht und das Level des Charakters.
    Ebensogibt es einen Konstruktor der zur Erstellung eines Objekts dieser Klasse dient bzw. beim initialisieren aufgerufen wird/muss.
*/

var gameCharacter1: GameCharacter = GameCharacter("Legolas", false, 20)
var gameCharacter2: GameCharacter = GameCharacter("Frodo", true, 3)

println(gameCharacter1.name + " ist Level " + gameCharacter1.level +
". Hat er eine Waffe? " + gameCharacter1.hasWeapon)
println(gameCharacter2.name + " ist Level " + gameCharacter2.level +
". Hat er eine Waffe? " + gameCharacter2.hasWeapon)

/*
    Bei diesem Code werden zwei Charaktere mit den Namen Logolas und Frodo erstellt.
    Die Level und der Zustand ob Sie eine Waffe haben oder nicht wird ausgegeben.
*/

// Frodo findet ein magisches Amulett
gameCharacter2.level = 5
// Legolas baut sich einen Bogen aus Zweigen
gameCharacter1.hasWeapon = true
// Legolas besiegt eine Armee Orks
gameCharacter1.level = 50
// Legolas Bogen ist kaputtgegangen
gameCharacter1.hasWeapon = false
// Frodo kaempft in einer Hoelle
gameCharacter2.level = 7
// Frodo muss fliehen und verliert sein Schwert
gameCharacter2.hasWeapon = false

println(gameCharacter1.name + " ist Level " + gameCharacter1.level +
". Hat er eine Waffe? " + gameCharacter1.hasWeapon)
println(gameCharacter2.name + " ist Level " + gameCharacter2.level +
". Hat er eine Waffe? " + gameCharacter2.hasWeapon)

/*
    Die Spielereignisse werden hier in den Eigenschaften/Attributen festgehalten.
    z.B. der Wafffenbau führt dazu, dass das Attribut hasWeapon zu true umgeändert wird.
    Jegliche Kämpfe führen zum Levelaufstieg
*/