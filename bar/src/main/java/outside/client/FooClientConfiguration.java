package outside.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ywb Date: 2019/4/12
 */
@Configuration
public class FooClientConfiguration {

  @Bean
  public FooClientFallback fooClientFallback(){
    return new FooClientFallback();
  }

}
