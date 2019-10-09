# encoding: utf-8

elec = ARGV[0].to_s

def crear 
  nombre = ARGV[1].to_s 
  pas = ARGV[2].to_s
  puts "Creando usuario #{nombre}." 
  `useradd #{nombre}` 
  `echo "#{nombre}:#{pas}" | chpasswd`
  `mkdir /home/#{nombre}`
  `chown -R #{nombre} /home/#{nombre}`
  puts "Usuario #{nombre} creado."
end

def eliminar 
  nombre = ARGV[1].to_s 
  puts "Eliminando usuario #{nombre}." 
  `userdel -r #{nombre}`
  puts "Usuario #{nombre} eliminado."
end

if ARGV.empty?
  puts "INSTRUCCIONES DE USO"
  puts "Pulse crear para crear un usuario, eliminar para eliminarlo ó salir para salir del programa."
elsif elec == "crear" || elec == "on"
  crear
elsif elec == "eliminar" || elec == "off"
  eliminar
else 
  puts "Salir. Comando no conocido." 
end 
todos = `ls /home/` 
puts "Así queda la lista de usuarios." 
puts "#{todos}"
