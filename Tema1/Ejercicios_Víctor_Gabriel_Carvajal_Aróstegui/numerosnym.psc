Algoritmo sumatorios
	
	Escribir "Primer número";
	Leer num1;
	num1=num1*(-1);
	Escribir "Transformado a entero -> ",num1;
	Escribir "Segundo número";
	Leer num2;
	num2=num2*(-1);
	Escribir "Transformado a entero -> ",num2;
	
	suma=0; //Siempre inicializar la variable
	para i=num1 Hasta num2 con paso 1
		suma = suma + i;
	FinPara
	Escribir suma;
	
FinAlgoritmo
