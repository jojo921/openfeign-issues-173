consul:
  consul agent -dev
foo-run:
	cd foo && mvn clean spring-boot:run
bar-run:
	cd bar && mvn clean spring-boot:run