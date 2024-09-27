package io.vertx.ext.bridge.tests;

import io.vertx.core.json.JsonObject;
import io.vertx.ext.bridge.BridgeOptions;
import io.vertx.ext.bridge.PermittedOptions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author <a href="http://escoffier.me">Clement Escoffier</a>
 */
public class BridgeOptionsTest {

  @Test
  public void testInstantiation() {
    BridgeOptions options = new BridgeOptions();
    assertThat(options.getInboundPermitteds()).isEmpty();
    assertThat(options.getOutboundPermitteds()).isEmpty();
  }

  @Test
  public void testInstantiationByCopy() {
    BridgeOptions options = new BridgeOptions();
    options.addInboundPermitted(new PermittedOptions().setAddress("foo"))
        .addInboundPermitted(new PermittedOptions().setAddress("bar"))
        .addOutboundPermitted(new PermittedOptions().setAddress("foo"));
    assertThat(options.getInboundPermitteds()).hasSize(2);
    assertThat(options.getOutboundPermitteds()).hasSize(1);

    BridgeOptions options2 = new BridgeOptions(options);
    assertThat(options).isNotSameAs(options2);

    assertThat(options2.getInboundPermitteds()).hasSize(2);
    assertThat(options2.getOutboundPermitteds()).hasSize(1);
  }

  @Test
  public void testSetInboundAndOutboundPermitted() {
    BridgeOptions options = new BridgeOptions();
    List<PermittedOptions> inbound = new ArrayList<>();
    List<PermittedOptions> outbound = new ArrayList<>();
    inbound.add(new PermittedOptions().setAddress("foo"));
    inbound.add(new PermittedOptions().setAddress("bar"));
    outbound.add(new PermittedOptions().setAddress("foo"));
    options.setInboundPermitteds(inbound).setOutboundPermitteds(outbound);
    assertThat(options.getInboundPermitteds()).hasSize(2);
    assertThat(options.getOutboundPermitteds()).hasSize(1);
  }

  @Test
  public void testSerializationOfEmptyOptions() {
    BridgeOptions options = new BridgeOptions();
    JsonObject json = options.toJson();
    assertThat(json.getJsonArray("inboundPermitteds")).isEmpty();
    assertThat(json.getJsonArray("outboundPermitteds")).isEmpty();

    BridgeOptions options2 = new BridgeOptions(json);
    assertThat(options2.getInboundPermitteds()).isEmpty();
    assertThat(options2.getOutboundPermitteds()).isEmpty();
  }

  @Test
  public void testSerialization() {
    BridgeOptions options = new BridgeOptions();
    List<PermittedOptions> inbound = new ArrayList<>();
    List<PermittedOptions> outbound = new ArrayList<>();
    inbound.add(new PermittedOptions().setAddress("foo"));
    inbound.add(new PermittedOptions().setAddress("bar"));
    outbound.add(new PermittedOptions().setAddress("foo"));
    options.setInboundPermitteds(inbound).setOutboundPermitteds(outbound);

    JsonObject json = options.toJson();
    assertThat(json.getJsonArray("inboundPermitteds")).hasSize(2);
    assertThat(json.getJsonArray("outboundPermitteds")).hasSize(1);

    BridgeOptions options2 = new BridgeOptions(json);
    assertThat(options2.getInboundPermitteds()).hasSize(2);
    assertThat(options2.getOutboundPermitteds()).hasSize(1);
  }

}
