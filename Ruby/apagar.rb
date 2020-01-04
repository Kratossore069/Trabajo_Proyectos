# encoding: utf-8

a = ARGV[0].to_s

if a == "off"
	`shutdown now`
elsif a == "reon"
	`reboot`
else 
	puts "No entiendo la orden"
end
