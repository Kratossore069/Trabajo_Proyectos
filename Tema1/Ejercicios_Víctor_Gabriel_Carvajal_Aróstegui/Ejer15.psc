Algoritmo multiplos_n_por_n
	
	Escribir "Introduzca un n�mero: ";
	Leer n;
	Escribir "Introduzca el n�mero: ";
	Leer m;
	Escribir "La tabla queda as� para bucle for...";
	
	
	Para i=n Hasta n*m Con Paso n Hacer
		escribir i;
	Fin Para
	
	
	Escribir "La tabla queda as� para bucle mientras...";
	i=1;
	Mientras n*i<=n*m
		Escribir n*i;
		i = i+1;
	FinMientras
	
FinAlgoritmo
