class Dog {
    var name: String? = null

    fun sayHi(ownerName: String) {
        println("Hi $ownerName, my name is $name")
    }
}

class Trick {
    val tricks = listOf("sit", "lay", "turn")  // Usar uma lista para armazenar múltiplos truques

    fun theTricks() {
        println("What tricks can you do? ${tricks.joinToString(", ")}")  // Juntar os truques em uma string
    }

    fun doTrick(trick: String) {
        if (tricks.contains(trick)) {
            println("Doing the trick: $trick")
        } else {
            println("I don't know that trick.")
        }
    }
}

fun main() {
    val dog = Dog()
    dog.name = "Scooby"
    dog.sayHi("Caio")

    val dogDuda = Dog()
    dogDuda.name = "Skrib"
    dogDuda.sayHi("Duda")

    val dogTrick = Trick()
    dogTrick.theTricks()
    dogTrick.doTrick("sit")  
}
