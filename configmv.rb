#enconding: utf-8
# objetivo: Cambiar ip y hostname 
# agrumento 1 ip 
# argumento 2 mascara 
# argumento 3 gateway
# argumento 4 hostname

ip     = ARGV[0].to_s
mask   = ARGV[1].to_s
gate   = ARGV[2].to_s
name   = ARGV[3].to_s
name_interface = `ip a |grep BROAD`.chomp.split(" ")[1].split(":")[0] #Saca el nombre de la interfaz de red.


if ARGV.empty?
 
  puts " Argumento 1 ip \n Argumento 2 máscara \n Argumento 3 gateway \n Argumento 4 hostname"

else

  system( "/etc/init.d/networking stop") 
  system( " echo 'auto #{name_interface}' > /etc/network/interfaces ")
  system( " echo 'iface #{name_interface} inet static' >> /etc/network/interfaces ")
  system( " echo 'address \t #{ip}' >> /etc/network/interfaces ")
  system( " echo 'netmask \t #{mask}' >> /etc/network/interfaces ")
  system( " echo 'gateway \t #{gate}' >> /etc/network/interfaces ")
  system( " echo 'dns-nameservers 8.8.8.8' >> /etc/network/interfaces ")
  system( "/etc/init.d/networking start")


  system( " echo '#{name}' > /etc/hostname ") 
  system( " echo '127.0.0.1 \t localhost' > /etc/hosts")
  system( " echo '127.0.1.1 \t #{name}' >> /etc/hosts")
  system( " echo '::1     ip6-localhost ip6-loopback \n fe00::0 ip6-localnet ' >> /etc/hosts")
  system( "hostname #{name}")
  puts    "Cambios realizados correctamente, abra una nueva pestaña para ver su nuevo hostname"

end



