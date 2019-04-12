package io.ywb.foo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FooApplication {

  public static void main(String[] args) {
    SpringApplication.run(FooApplication.class, args);
  }

  @GetMapping("foo")
  public String foo() {
    return "foo";
  }


}
