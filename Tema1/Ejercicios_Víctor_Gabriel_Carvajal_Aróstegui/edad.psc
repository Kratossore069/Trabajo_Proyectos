Algoritmo trabajar
	
	Escribir "EDAD PARA TRABAJAR Y BEBER"
	Escribir "Inserte su edad: "
	Leer edad
	si edad <= 0
		Escribir "No existe"
	sino	
	FinSi
	si edad >= 18 y edad <= 21
		Escribir "Usted puede trabajar pero no beber."
	sino 
		si edad >= 21
			Escribir "Usted puede trabajar y beber."
		sino
			si edad < 18
				Escribir "Usted es muy pequeño para trabajar y beber."
			sino	
			FinSi
		FinSi
		
	FinSi
	
FinAlgoritmo
