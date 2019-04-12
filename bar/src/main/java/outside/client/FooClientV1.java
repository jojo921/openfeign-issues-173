package outside.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author ywb Date: 2019/4/12
 */
@FeignClient(contextId = "foo-FooClientV1", name = "foo",
    configuration = FooClientConfiguration.class, fallback = FooClientFallback.class)
public interface FooClientV1 {

  @GetMapping("foo/v1")
  String fooV1();

}
