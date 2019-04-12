package outside.client;

/**
 * @author ywb Date: 2019/4/12
 */
public class FooClientFallback implements FooClient {

  @Override
  public String foo() {
    return "foo:fallback";
  }
}
