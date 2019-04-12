consul:
	consul agent -dev > consul.log &
foo-run:
	cd foo && mvn clean spring-boot:run
bar-run:
	cd bar && mvn clean spring-boot:run