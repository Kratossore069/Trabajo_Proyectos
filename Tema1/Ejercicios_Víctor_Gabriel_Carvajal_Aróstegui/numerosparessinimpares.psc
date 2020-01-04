Algoritmo mostrandonumeros
	
	Escribir "Desde";
	Leer num1;
	Escribir "Hasta";
	Leer num2;
	
	suma=0;
	si num2<num1 //Para que siempre sea num1>num2
		help=num2;
		num2=num1;
		num1=help;
	FinSi
	
	si (num2 mod 2 != 0)
		num2 = num2 +1;
	FinSi
	
	si (num1 mod 2 != 0)
		num1 = num1 +1;
	FinSi
	
FinAlgoritmo
