Funcion tabla(n)
	
	
		para i=1 Hasta 10 con paso 1
			Escribir n,"x",i,"=",n*i;
		FinPara
	
	
FinFuncion


Algoritmo numeroshastamenos
	
	Repetir
		Escribir "Número";
		Leer n;
		si n>0
			tabla(n);
		SiNo
			Escribir "Número erróneo."
		FinSi
		
	Hasta Que n<0;
	
FinAlgoritmo
