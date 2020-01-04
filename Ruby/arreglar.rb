system( "rm /var/lib/dpkg/lock ")
system( "dpkg --configure -a ")
system( "apt-get remove libappstream3 ")
