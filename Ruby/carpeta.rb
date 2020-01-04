# encoding: utf-8
puts "1 para crear y 2 para eliminar. 3 para salir."
elecc = gets.chomp.to_i
if elecc == 1
	puts "Introduzca el nombre de la carpeta a crear."
	pa = gets.chomp
	la = `mkdir #{pa}`
	puts "#{la}"
	puts "Carpeta #{pa} creada"
elsif elecc == 2
	puts "Nombre de la carpeta a eliminar."
	yu = gets.chomp
	re = `rmdir #{yu}`
	puts "#{re}"
	puts "Carpeta #{yu} eliminada."
elsif elecc == 3
	puts "Saliendo..."
end
