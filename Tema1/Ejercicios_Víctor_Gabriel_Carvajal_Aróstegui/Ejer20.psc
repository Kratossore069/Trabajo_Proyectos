Algoritmo insertarnumerosde20a230
	
	// Sacar potencias de 2 entre dos números dados por el usuario.
	Escribir "Primer número: ";
	Leer n;
	Escribir "Segundo número: ";
	Leer m;
	
	si n<m
		minimo = n;
		maximo = m;
	SiNo
		minimo = m;
		maximo = n;
	FinSi
	
	
	
	poten =1;
	Mientras poten <= m
		si poten >= n
			Escribir poten;
		FinSi
		poten = poten*2;
	FinMientras
	
FinAlgoritmo
