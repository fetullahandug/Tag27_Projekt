
<h1 align="center">Grundlagen der Programmierung</h1>
<h3 align="center">Objektorientierte Programmierung</h3>

<p align="center">
  <img src="img/img.png" />
</p>

#### Beschreibung:

Willkommen zurück! Heute geht es weiter um die objektorientierte Programmierung (kurz OOP).


#### Hinweise zur Bearbeitung:

- Achte auf einen sauberen Quellcode, insbesondere Einrückungen sind wichtig!
- Wichtige Materialien für heute:
  - [Handbuch: Objektorientierte Programmierung (OOP) → Nachschlagen → Best Practice: Name für Klasse entwerfen](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.d8lnnw7x9ec3)
  - [Handbuch: Objektorientierte Programmierung (OOP) → Nachschlagen → Best Practice: Name für Instanz-Variable entwerfen](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.gxj2gu539y2v)
  - [Handbuch: Objektorientierte Programmierung (OOP)  → Implementieren → Klasse + Eigenschaften implementieren, instanzieren und nutzen](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.vyyp38n6yw1d)
  - [Handbuch: Variablen & Datentypen → Nachschlagen → Kochrezept: Compilerfehler lösen](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.bpw3da2qtpg9)

---

<details>
<summary> <b> Aufgabe 1 - Eine Person </b> </summary>

Lege in der Datei Person.kt eine Klasse “Person” an. 
Die Klasse Person soll folgende Eigenschaften besitzen:
- name vom Typ String
- age vom Typ Int

Schreibe einen Konstruktor, sodass die Eigenschaften direkt beim Erstellen der Person
Werte zugewiesen bekommen.

Erstelle in der Main.kt dann drei Instanzen mit den folgenden Werten:

Person 1:

    name: Franz Meier
    age: 28

Person 2:

    name: Jana Mueller
    age: 53

Person 3:

    name: Tanja Baecker
    age: 32

Teste deine Klasse und deine Instanzen, indem du in der main()-Funktion von jeder
Instanz ihren Namen und ihr Alter ausgibst.  
Stimmt die Ausgabe?

**Modul für die Aufgabe:** Aufgabe1  
**1. Datei für die Aufgabe:** Person  
**2. Datei für die Aufgabe:** Main.kt

</details>

---

<details>
<summary> <b> Aufgabe 2 - Ein Vogel </b> </summary>

a)

Schreibe eine Klasse mit dem Namen Vogel.
Erstelle dazu selbstständig die Dateien, die du für die Aufgabe brauchst.  
Die Klasse soll als Eigenschaften den Vogeltypen ("Amsel", "Drossel", ...) 
sowie den Futtertypen ("Ameisen", "Beeren", ...) und ein Alter haben.
Außerdem soll die Klasse die Methode zwitschern haben, die "zwitscher" in der Konsole ausgibt.

b)

Benutze einen Konstruktor, damit die Parameter, die beim Erstellen einer Vogel-Instanz
mitgegeben werden, direkt den Eigenschaften zugewiesen werden.
Wenn du Hilfe brauchst, schau dir an wie Konstruktoren in den Beispielaufgaben
oder in den Vorlesungsfolien verwendet werden.

c)

Erstelle dann drei Vogel-Instanzen mit selbst ausgedachten Werten.  
Lass mindestens eine Vogel-Instanz zwitschern.

Bonus:

Sei kreativ und erweiter deine Vogel-Klasse, sodass sie einen Vogel aus dem echten Leben noch besser abbildet.


**Modul für die Aufgabe:** Aufgabe2
</details>

---

<details>
<summary> <b> Aufgabe 3 - Ein Hund </b> </summary>

a) 

Schreibe eine Klasse mit dem Namen Hund. 
Erstelle dazu selbstständig die Dateien, die du für die Aufgabe brauchst.  
Die Klasse soll als Eigenschaften einen Hundenamen, das Alter sowie die Rasse haben.  
Die Klasse soll die Methoden bellen und altern haben.
Bei der Methode bellen wird "woof!" in der Konsole ausgegeben.
Bei der Methode altern, wird das Alter des Hundes um 1 Jahr erhöht.

b)

Benutze einen Konstruktor, damit die Parameter, die beim Erstellen einer Vogel-Instanz
mitgegeben werden, direkt den Eigenschaften zugewiesen werden.
Wenn du Hilfe brauchst, schau dir an wie Konstruktoren in den Beispielaufgaben
oder in den Vorlesungsfolien verwendet werden.

c)

Erstelle dann drei Hunde-Instanzen mit selbst ausgedachten Werten.  
Lass mindestens eine Hunde-Instanz bellen.

Bonus:

Sei kreativ und erweiter deine Hund-Klasse, sodass sie einen Hund aus dem echten Leben noch besser abbildet. 

**Modul für die Aufgabe:** Aufgabe3
</details>

---


<details>
<summary> <b> Aufgabe 4 - Text Adventure Spiel </b> </summary>

In dieser Aufgabe ist eine Klasse GameCharacter gegeben. Für einen Charakter in einem Text Adventure Spiel wird der Name gespeichert, ob der Charakter eine Waffe hat und welches Level er hat.
- Beschreibe Zeile für Zeile, was dieser Code macht.

``` kotlin
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
```

Im folgenden Code werden zwei Instanz-Variablen von der Klasse GameCharacter angelegt und initiale Werte zugewiesen.
Danach werden die aktuellen Werte der beiden Charaktere in Zeile 4 und 6 mit einer println() Anweisung ausgegeben.

Schau dir den Codeausschnitt an.
- Beschreibe Zeile für Zeile, was dieser Code macht.
- Was wird hier ausgegeben?

```kotlin
    var gameCharacter1: GameCharacter = GameCharacter("Legolas", false, 20)
    var gameCharacter2: GameCharacter = GameCharacter("Frodo", true, 3)
    
    println(gameCharacter1.name + " ist Level " + gameCharacter1.level +
              ". Hat er eine Waffe? " + gameCharacter1.hasWeapon)
    println(gameCharacter2.name + " ist Level " + gameCharacter2.level +
              ". Hat er eine Waffe? " + gameCharacter2.hasWeapon)
```

Danach passieren im Spiel einige Dinge, die im Code in Kommentaren aufgeschrieben sind.
Dadurch verändern sich Eigenschaften der Charaktere.
Am Ende werden nochmal die aktuellen Werte der Charaktere ausgegeben.

Schau dir den Codeausschnitt an.
- Beschreibe Zeile für Zeile, was dieser Code macht.
- Was wird hier ausgegeben?

```kotlin
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
```

**Modul für die Aufgabe:** Aufgabe4  
**Datei für die Aufgabe:** TextAufgabe.kt

</details>

---


<details>
<summary> <b> Aufgabe 5 - Lösung für Compilerfehler finden </b> </summary>

In den folgenden Aufgaben sollst du Compilerfehler im Zusammenhang mit Klassen lösen.
- Du darfst den Code in der Animal Klasse nicht verändern.
- Veränder den Code in der Main.kt, sodass der Code fehlerfrei ausgeführt werden kann.

**Modul für die Aufgabe:** Aufgabe5  
**1. Datei für die Aufgabe:** Animal  
**2. Datei für die Aufgabe:** Main.kt  

</details>

---

<details>
<summary> <b> Aufgabe 6 - Lösung für Compilerfehler finden </b> </summary>

In den folgenden Aufgaben sollst du Compilerfehler im Zusammenhang mit Klassen lösen.
- Du darfst den Code in der Main.kt nicht verändern.
- Veränder den Code in der Car Klasse, sodass der Code fehlerfrei ausgeführt werden kann.

**Modul für die Aufgabe:** Aufgabe6  
**1. Datei für die Aufgabe:** Car  
**2. Datei für die Aufgabe:** Main.kt  

</details>

---

<details>
<summary> <b> Aufgabe 7 - Lösung für Compilerfehler finden </b> </summary>

In den folgenden Aufgaben sollst du Compilerfehler im Zusammenhang mit Klassen lösen.
- Du darfst den Code in der Fruit Klasse nicht verändern.
- Veränder den Code in der Main.kt, sodass der Code fehlerfrei ausgeführt werden kann.

**Modul für die Aufgabe:** Aufgabe7  
**1. Datei für die Aufgabe:** Fruit  
**2. Datei für die Aufgabe:** Main.kt  

</details>

---

<details>
<summary> <b> Aufgabe 8 - Ein Auto </b> </summary>

Jetzt wollen wir ein Auto modellieren, dazu erstellen wir eine Klasse Car 
in der Aufgabendatei Car.

a)

Die Klasse hat folgende Eigenschaften:

- ps vom Typ Int
die Eigenschaft ps gibt die Anzahl Pferdestärken an.
- color vom Typ String
die Eigenschaft color gibt die Farbe des Autos an.
- seats vom Typ Int
die Eigenschaft seats gibt die Anzahl der Sitze im Auto an.
- freeSeats vom Typ Int
die Eigenschaft freeSeats gibt die Anzahl der noch freien Sitze im Auto an.

b)

Die Klasse hat auch folgende Methoden:

- **getIn()**  
Die Methode überprüft erst, ob noch ein freier Platz verfügbar ist.
Wenn ja, werden die freien Plätze um eins verringert. 
Ansonsten gib eine Fehlermeldung in der Konsole aus.
- **getOut()**  
Die Methode überprüft erst, ob mindestens ein Platz belegt ist. Wenn ja, werden die freien Plätze um eins erhöht. 
Ansonsten gib eine Fehlermeldung in der Konsole aus. 
- **startEngine()**  
Die Methode überprüft erst, ob mindestens ein Platz belegt ist.
Wenn ja, gibt die Methode "wroom wroom" in der Konsole aus. 
Ansonsten gib eine Fehlermeldung in der Konsole aus.

c)

Die Klasse hat einen Konstruktor:
Der Konstruktor weist den Eigenschaften ps, color und seats übergebene Werte zu.
Innerhalb des Konstruktors wird die Anzahl freier Sitzplätze berechnet. 
Am Anfang sitzt im Auto noch keine Person.
Stelle auch im Konstruktor sicher, dass keine negativen Parameter übergeben werden
(Es gibt keine -100 PS oder -2 Sitze). 

d)

Teste deinen Code:

Erstelle mindestens zwei Autos (mit selbst ausgedachten Werten) in der Aufgabendatei Main.kt.
- Dem 1. Auto steigen dann zwei Personen dazu.
- dann wird der Motor gestartet.
- und schlussendlich steigen wieder zwei Personen aus.

Bonus)

- Was passiert, wenn eine Person in ein bereits volles Auto zusteigen will?
- Was passiert, wenn der Motor gestartet wird, ohne das eine Person im Auto sitzt?
- Erweitere dein Auto um weitere Methoden und Eigenschaften.

**Modul für die Aufgabe:** Aufgabe8  
**1. Datei für die Aufgabe:** Car  
**2. Datei für die Aufgabe:** Main.kt

</details>

---