package io.vertx.ext.bridge.tests;

import io.vertx.core.json.JsonObject;
import io.vertx.ext.bridge.PermittedOptions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author <a href="http://escoffier.me">Clement Escoffier</a>
 */
public class PermittedOptionsTest {


  @Test
  public void testEmptyInstantiation() {
    PermittedOptions options = new PermittedOptions();
    assertThat(options.getAddress()).isEqualTo(PermittedOptions.DEFAULT_ADDRESS);
    assertThat(options.getAddressRegex()).isEqualTo(PermittedOptions.DEFAULT_ADDRESS_REGEX);
    assertThat(options.getMatch()).isEqualTo(PermittedOptions.DEFAULT_MATCH);
  }

  @Test
  public void testCopyConstructor() {
    PermittedOptions options = new PermittedOptions();
    options.setAddress("foo").setAddressRegex(".ert\\..").setMatch(new JsonObject().put("foo", ""));

    assertThat(options.getAddress()).isEqualTo("foo");
    assertThat(options.getAddressRegex()).isEqualTo(".ert\\..");
    assertThat(options.getMatch()).isEqualTo(new JsonObject().put("foo", ""));

    PermittedOptions options2 = new PermittedOptions(options);
    assertThat(options).isNotSameAs(options2);

    assertThat(options2.getAddress()).isEqualTo("foo");
    assertThat(options2.getAddressRegex()).isEqualTo(".ert\\..");
    assertThat(options2.getMatch()).isEqualTo(new JsonObject().put("foo", ""));
  }

  @Test
  public void testSerializationOfEmptyPermittedOption() {
    PermittedOptions options = new PermittedOptions();
    JsonObject json = options.toJson();
    assertThat(json.getString("address")).isNull();

    PermittedOptions options2 = new PermittedOptions(json);
    assertThat(options).isNotSameAs(options2);
    assertThat(options.getAddress()).isNull();
  }

  @Test
  public void testSerializationPermittedOption() {
    PermittedOptions options = new PermittedOptions();
    options.setAddress("foo").setAddressRegex(".ert\\..").setMatch(new JsonObject().put("foo", ""));
    JsonObject json = options.toJson();
    assertThat(json.getString("address")).isEqualTo("foo");

    PermittedOptions options2 = new PermittedOptions(json);
    assertThat(options2.getAddress()).isEqualTo("foo");
    assertThat(options2.getAddressRegex()).isEqualTo(".ert\\..");
    assertThat(options2.getMatch()).isEqualTo(new JsonObject().put("foo", ""));
  }

}
