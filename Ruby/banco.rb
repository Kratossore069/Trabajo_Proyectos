# encoding: utf-8

def ingresar
  puts "¿Cuánto dinero desea ingresar?"
  dinero = gets.chomp.to_i
  tiempo = Time.now.asctime
  
  # Lectura
  lines = Array.new
  file = File.open('cuenta.txt', 'r')
  file.each do |line|
    lines.push(line)
  end
  file.close

  # Operaciones
  saldo = lines[0].to_i
  ingreso = saldo + dinero
  lines[0] = ingreso.to_s
  lines.push("+#{dinero} euros en fecha: #{tiempo}")
  lines.push("Dinero total: #{ingreso}")

  # Abrimos de nuevo el txt
  file = File.open('cuenta.txt', 'w')
  lines.each do |line|
    file.puts(line)
  end
  file.close
  puts "Usted ha ingresado #{dinero} euros."
end

def sacar
  puts "¿Cuánto dinero desea retirar?"
  dinero = gets.chomp.to_i 
  tiempo = Time.now.asctime
  
  # Lectura
  lines = Array.new
  file = File.open('cuenta.txt', 'r')
  file.each do |line|
    lines.push(line)
  end
  file.close

  # Operaciones
  saldo = lines[0].to_i
  resta = saldo - dinero
  lines[0] = resta.to_s
  lines.push("+#{dinero} euros en fecha: #{tiempo}")
  lines.push("Dinero total: #{resta}")

  # Abrimos de nuevo el txt
  file = File.open('cuenta.txt', 'w')
  lines.each do |line|
    file.puts(line)
  end
  file.close
  puts "Usted ha retirado #{dinero} euros."
end

def saldo
  puts "Sus últimos movimientos."
  visu = File.read("cuenta.txt")
  puts visu
end

def main
puts "Bienvenido al banco. Elija su opción."
puts " 0.-  Salir. \n 1.- Sacar dinero. \n 2.- Ingresar dinero. \n 3.- Consultar saldo."
end

main
demonio = true

while demonio
a = gets.chomp.to_i
	case a
      when 0
       demonio = false
       puts "Gracias por confiar en nosotros."
      when 1
       sacar
      when 2
       ingresar
      when 3
       saldo
	end
	
	if a != 0
	  puts "¿Desea realizar otra operación?"
	  puts " 0.-  Salir. \n 1.- Sacar dinero. \n 2.- Ingresar dinero. \n 3.- Consultar saldo."
	end
end
