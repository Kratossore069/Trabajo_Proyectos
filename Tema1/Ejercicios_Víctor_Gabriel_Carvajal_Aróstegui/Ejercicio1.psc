Algoritmo tareadeclase1
	
	definir nombre Como Caracter;
	definir apellido Como Caracter;
	definir edad Como Entero;
	definir faltan como entero;
	
	Escribir "Nombre: ";
	Leer nombre;
	Escribir "Apellido: ";
	Leer apellido;
	Escribir "Edad: ";
	Leer edad;
	
	faltan=18-edad;
	si edad>=18
		Escribir "Hola ", nombre," ", apellido," ,con tu edad actual ya puedes votar. ";
	SiNo
		escribir "Hola ", nombre," ", apellido," ,te faltan ",faltan, " años para poder votar. ";
	FinSi
	
FinAlgoritmo
