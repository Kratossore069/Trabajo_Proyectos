Algoritmo multiplos_n_por_n
	
	Escribir "Introduzca un número: ";
	Leer n;
	Escribir "Introduzca el número: ";
	Leer m;
	Escribir "La tabla queda así para bucle for...";
	
	
	Para i=n Hasta n*m Con Paso n Hacer
		escribir i;
	Fin Para
	
	
	Escribir "La tabla queda así para bucle mientras...";
	i=1;
	Mientras n*i<=n*m
		Escribir n*i;
		i = i+1;
	FinMientras
	
FinAlgoritmo
