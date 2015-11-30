package io.vertx.ext.bridge.inheritance;

import io.vertx.core.json.JsonObject;
import io.vertx.ext.bridge.PermittedOptions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author <a href="http://escoffier.me">Clement Escoffier</a>
 */
public class InheritanceTest {

  @Test
  public void testInheritance() {
    MyBridgeOptions options = new MyBridgeOptions();
    options.setFlag(true);
    options.addInboundPermitted(new PermittedOptions().setAddress("foo"));

    JsonObject json = options.toJson();

    MyBridgeOptions options2 = new MyBridgeOptions(json);
    assertThat(options2.isFlag()).isTrue();
    assertThat(options2.getInboundPermitteds().get(0).getAddress()).isEqualTo("foo");
  }
}
