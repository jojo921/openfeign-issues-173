package outside.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author ywb Date: 2019/4/12
 */
@FeignClient(contextId = "foo-FooClient", name = "foo",
    configuration = FooClientConfiguration.class, fallback = FooClientFallback.class)
public interface FooClient {

  @GetMapping("foo")
  String foo();

}
