Funcion comb <- combinatoria ( a, b )
	comb = factorial(n)/factorial(n-m)*factorial(m);
Fin Funcion

Funcion fact <- factorial (num)
	si num == 0
		fact = 1;
	SiNo
		fact = 1;
		Para i = 1 hasta num Con Paso 1 Hacer
			fact = fact * i;
		FinPara
	FinSi
Fin Funcion

Algoritmo combinatoria_funcion
	Escribir "introducir dos valores para calcular la combinatoria";
	Escribir "Introducir valor A";
	Leer n;
	escribir "Introducir valor B";
	Leer m;
	Escribir combinatoria(n,m);
FinAlgoritmo
