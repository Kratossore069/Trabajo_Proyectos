SubProceso factorial(num)
	
	fact=1;
	Para i=num Hasta 1 Con Paso -1
		fact=i*fact;
	FinPara
	Escribir fact;
	
FinSubProceso

Algoritmo numerosinsertados
	
	Escribir "Número a factorizar: ";
	Leer n;
	factorial(n);
	
FinAlgoritmo
