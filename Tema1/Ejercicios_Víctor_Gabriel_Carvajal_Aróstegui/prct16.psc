Algoritmo prct16
	
	Definir num como entero;
	definir mayor1 Como Entero;
	definir mayor2 Como Entero;
	definir i Como Entero;
	dimension num[10];
	
	num[0]=1;
	num[1]=2;
	num[2]=3;
	num[3]=4;
	num[4]=5;
	num[5]=6;
	num[6]=7;
	num[7]=8;
	num[8]=9;
	num[9]=10;
	
	mayor1=0;
	para i=0 hasta 10
		si num[i]>mayor1
			mayor1=num[i];
			i=i+1;
		FinSi
	FinPara
	
	escribir mayor1;
	
FinAlgoritmo
