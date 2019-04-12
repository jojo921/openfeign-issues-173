package io.ywb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import outside.client.FooClient;
import outside.client.FooClientV1;

//@EnableFeignClients(clients = {FooClient.class,FooClientV1.class})
@EnableFeignClients(basePackages = "outside.client")
@SpringBootApplication
@RestController
public class BarApplication {

  public static void main(String[] args) {
    SpringApplication.run(BarApplication.class, args);
  }

  @Autowired
  private FooClient fooClient;

  @Autowired
  private FooClientV1 fooClientV1;

  @GetMapping("bar")
  public String bar(){
    return fooClient.foo();
  }

}
