Algoritmo palabras
	
	Escribir "Una palabra: "
	Leer palabra
	Escribir Mayusculas(palabra)
	Escribir Minusculas(palabra)
	si palabra == "pepe"
		Escribir "Hola ", palabra, "."
	SiNo
		Escribir "Hola desconocido."
	FinSi
	
	si palabra == Mayusculas(palabra)
		Escribir "Su palabra está en mayúsculas."
	SiNo
		si palabra == Minusculas(palabra)
			Escribir "Su palabra está en minúscula."
			
		FinSi
		
	FinSi
FinAlgoritmo
