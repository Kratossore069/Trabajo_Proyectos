Algoritmo multipli_tabla
	
	Escribir "Escribe tres n�meros: "
	Leer num1, num2, num3
	
	Escribir "N�mero m�s cercano al primero"
	sol = abs(num1 - num2)
	sol2 = abs(num1 - num3)
	
	si sol < sol2
		Escribir "El n�mero dos est� m�s cerca del primero, que es el ", num2
	SiNo
		Escribir "El n�mero 3 est� m�s cercano del primeroque es el ", num3
	FinSi
	
	
FinAlgoritmo
