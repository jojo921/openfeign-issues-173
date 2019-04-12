# [spring-cloud-openfeign-issues-173](https://github.com/spring-cloud/spring-cloud-openfeign/issues/173)

a Minimal, Complete, and Verifiable example to reproduce the issue about spring-cloud-openfeign-issue-173.

This project consists of two simple service: service bar && service foo.
when starting bar,throw exception as follows:
```
Caused by: java.lang.IllegalStateException: No fallback instance of type class outside.client.FooClientFallback 
found for feign client foo
```
## quick start

### [install consul](https://learn.hashicorp.com/consul/getting-started/install.html)
  
### start consul
  ```make consul```
### start foo
  ```make foo-run```
### start bar
  ```make bar-run```
 



