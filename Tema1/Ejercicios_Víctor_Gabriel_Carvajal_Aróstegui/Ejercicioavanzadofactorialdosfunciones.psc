funcion resultado1=factorial(num)
	
	fact=1;
	Para i=num Hasta 1 Con Paso -1
		fact=i*fact;
	FinPara
	resultado1=fact;
	//Escribir resultado;
	
Finfuncion

Funcion resultado2<-combinacion(n,m)
	
	a = factorial(n)
	b = factorial(n-m)
	c = factorial(m)
	resultado2 = a / ( b * c )
	//                  5            1              4
	//resultado=factorial(n)/(factorial(n-m)*factorial(m));
	
FinFuncion

Algoritmo factorizar2
	
	Escribir "Primer número";
	Leer n;
	Escribir "Segundo número";
	Leer m;
	
	si n<m
		Escribir "Primer número debe ser mayor que el segundo."
	SiNo
		res1=combinacion(n,m);
		escribir res1;
	FinSi
	
	
FinAlgoritmo
	