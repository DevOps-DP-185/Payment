#!bin/bash

bash /opt/tomcat/bin/catalina.sh start
cd /home && ./SumoCollector.sh -q -varfile /home/sumo_credentials.txt -Vcollector.name=payment &
tail -f /dev/null