#!/usr/bin/env ruby
argumento = ARGV[0]

def show_error
  puts "\e[1;31m####¡WARNING!####\e[m"
  puts "\e[1;31mEstás utilizando el script erróneamente\e[m"
  puts "\e[1;31mPuedes consultar la ayuda poniendo -A\e[m"
end

def show_help
  puts "\e[1;31m####¡HOLA!####\e[m"
  puts "\e[0;33mEstás en la ayuda del script de apagado ssh\e[m"
  puts "\e[0;33mDebes escribir ~ruby ssh.rb <nombre_de_la_maquina>~\e[m"
  puts "\e[0;33mSi además *NO* tiene instalado el ~sshpass~ en su máquina deberá hacerlo con el argumento -Y\e[m"
end

def unistall
  puts ("Si desea desinstalar el ~sshpass~ inserte <si> de lo contrario <no>.")
  opcion = STDIN.gets.chomp
  if opcion == "si"
    puts ("Se desinstalará en breve...")
    system ("apt-get purge -y sshpass > /dev/null")
  elsif opcion == "no"
    puts ("No se desinstalará...")
  else
    puts ("No entiendo que requiere, dejaremos el sistema tal cual.")
  end
end

if argumento == nil
  show_error
elsif argumento == "-A"
  show_help
elsif maquina == "-Y"
  puts ("Se instalará el paquete sshpass...")
  system ("apt-get install -y sshpass > /dev/null")
  puts ("Ahora escriba el nombre de la máquina que quiere apagar...")
  maquina = STDIN.gets.chomp
  if maquina == "client26w"
    puts ("Necesitamos saber la contraseña del usuario al que accederemos del Cliente Windows...")
    contrawin = STDIN.gets.chomp
    system ("echo #{contrawin} >> sshwin")
    system ("sshpass -f sshwin ssh alejandra@#{maquina} shutdown /p")
  elsif maquina == "client26g"
    puts ("Necesitamos saber la contraseña del usuario al que accederemos del Cliente Linux...recuerde que ha de tener ~privilegios de root~ .")
    contralin = STDIN.gets.chomp
    system ("echo #{contralin} >> sshlin")
    system ("sshpass -f sshlin ssh root@#{maquina} shutdown -P")
  else
    unistall
  end
end
