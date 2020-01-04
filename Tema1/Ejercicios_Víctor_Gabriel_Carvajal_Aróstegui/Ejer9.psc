Algoritmo cuadrado_exacto
	
	Escribir "Escribe tu primer número: "
	Leer num1
	Escribir "Escribir el segundo número: "
	Leer num2
	op1 = num1^2
	
	si num2 == op1
		Escribir "Su número es ", op2, " y se trata del cuadrado exacto del primero, que es ", op1
		sino
		si op1 < num2
			Escribir "Su número es ", op2, " y es menor que el cuadrado del primero."
			sino
				Escribir "Su número es ", op2, " y es mayor que el cuadrado del primero."
			FinSi
		FinSi
	FinSi
	
	
FinAlgoritmo
