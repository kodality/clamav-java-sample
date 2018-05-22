# Using ClamAV antivirus from java

Antivirus daemon is running inside docker container and updates signature database from internet automatically.
Docker image used: https://github.com/mko-x/docker-clamav
To run it: `docker-compose up -d`

Docker container is exposing port 3310 which can be used to scan files.

An example Java code is provided along with fake virus (http://www.eicar.org/86-0-Intended-use.html).

Java uses Clam AV client: https://github.com/solita/clamav-java


 