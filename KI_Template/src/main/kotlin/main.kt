import java.io.File


fun main() {
	 /** Population erstellen:
	  * Netwerk-Arraygröße = Anzahl der Netzwerke in einer Population
	  * das IntArray ist für die Netztopologie zuständing:
	  * jeder zahl representiert eine Schicht, ihr Wert die Anzahl der Neuronen der schicht
	  * die erste zahl (links) steht für die Inputschicht, die letzte (rechts) für die Outputschicht
	  **/
	var population = Array<Netzwerk>(100){Netzwerk(arrayOf(4,4,4,2))}

	var evolutionsschritte=100
	 /** die for-Schleife kann auch durch eine while-Schleife mit Abbruchskriterium ersetzt werden.**/
	for ( i in 1 until evolutionsschritte){

		var neuepopulation =  evolution(population,100,100.0
		)
		population= neuepopulation
	}
	//population.sortByDescending { it.fitness }

/** ein Weg die netwerke abzuspeichern:**/
		var a = population[0].toString()
		var file = File("Netzwerk.txt")
		file.printWriter().use { out ->

			for (aaa in a.indices) {
				out.println(a[aaa])
			}

	}
}



