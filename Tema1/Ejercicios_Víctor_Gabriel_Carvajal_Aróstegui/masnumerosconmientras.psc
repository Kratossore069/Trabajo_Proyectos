Algoritmo numerosmayoresconmientras
	
	Escribir "4 n�meros";
	Leer num1, num2, num3, num4;
	comodin=0;
	
	i=0;
	Mientras i<4
		i=i+1;
		Escribir "Dame n�mero:",i+1;
		Leer num;
		si num>comodin
			comodin=num;
		FinSi
	FinMientras
	
FinAlgoritmo
