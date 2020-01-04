#encoding: utf-8

chacho = rand(0..99)
puts "Prueba suerte; escoge tu número: "
tutu = gets.chomp.to_i
puts "Tu número es #{tutu}"
if chacho == tutu
	puts "Ha salido el #{chacho}. ¡GANASTE LA PUÑETERA LOTERÍA!"
else
	puts "Eres un marica porque sacaste el #{chacho} y no es igual que #{tutu}."
end


