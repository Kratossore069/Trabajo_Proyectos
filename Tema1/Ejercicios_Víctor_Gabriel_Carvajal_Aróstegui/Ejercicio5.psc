Algoritmo Ejercicio5
	
	definir num como entero;
	definir i como entero;
	definir premio como entero;
	
	Escribir "Acertar el n�mero oculto: ";
	
	premio=1+azar(100);
	//escribir premio;
	
	i=1;
	Repetir
		Escribir "Intento n�mero ",i," . Introduzca un n�mero: ";
		Leer num;
		si num == premio
			Escribir "has acertado";
		FinSi
		i=i+1;
	Hasta Que i>6 o num == premio
	
	si i>6
		Escribir "Lo siento has perdido";
	FinSi
	
FinAlgoritmo
