

Algoritmo maximominimomedia
	
	definir notas Como Entero;
	Dimension notas[10];
	Definir i Como entero;
	definir numeroNotas Como Entero;
	numeroNotas=10;
	
	// Ponemos números a notas.
	para i=0 hasta 9
		notas[i]=azar(11);
		Escribir notas[i];
	FinPara
	
	// Mostramos por pantalla los números al azar.
//	i=0;
//	Mientras i<10
//		Escribir notas[i];
//		i=i+1;
	//	FinMientras
	
	i=0;
	suma=0;
	Mientras i<numeroNotas
		suma = suma + notas[i];
		i = i+1;
	FinMientras
	
	i=0;
	maximo=-1;
	Mientras i<numeroNotas
		si maximo < notas[i]
			maximo = notas[i];
		FinSi
		i=i+1;
	FinMientras
	
	Escribir "La nota media es: ", suma/numeroNotas, "La nota máxima es: ", maximo, "La nota mínima es: ", minimo;
	
	i=0;
	minimo=-1;
	Mientras i<numeroNotas
		si minimo > notas[i]
			minimo = notas[i];
		FinSi
		i=i+1;
	FinMientras
	
	
	
FinAlgoritmo
