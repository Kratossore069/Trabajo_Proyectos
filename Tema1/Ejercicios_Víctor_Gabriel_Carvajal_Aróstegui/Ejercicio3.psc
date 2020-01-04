Algoritmo ejercicio3
	
	definir num como entero;
	definir comodin como entero;
	
	Escribir "Introduzca números hasta que inserte un número negativo: ";
	Leer num;
	
	comodin=0;
	mientras num>0
		Leer num;
		si comodin>num
			comodin=comodin;
		SiNo
			comodin=num;
		FinSi
	FinMientras
	
	Escribir "El numero más alto de los insertados es: ",comodin;
	
FinAlgoritmo
