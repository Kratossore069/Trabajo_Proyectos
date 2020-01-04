Algoritmo multipli_tabla
	
	Escribir "Escribe tres números: "
	Leer num1, num2, num3
	
	Escribir "Número más cercano al primero"
	sol = abs(num1 - num2)
	sol2 = abs(num1 - num3)
	
	si sol < sol2
		Escribir "El número dos está más cerca del primero, que es el ", num2
	SiNo
		Escribir "El número 3 está más cercano del primeroque es el ", num3
	FinSi
	
	
FinAlgoritmo
