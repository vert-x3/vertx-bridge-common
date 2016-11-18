package io.vertx.ext.bridge.inheritance;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.bridge.BridgeOptions;

/**
 * @author <a href="http://escoffier.me">Clement Escoffier</a>
 */
@DataObject(generateConverter = true, inheritConverter = true)
public class MyBridgeOptions extends BridgeOptions {

  private boolean flag;

  public MyBridgeOptions() {

  }

  public MyBridgeOptions(MyBridgeOptions that) {
    super(that);
    this.flag = that.flag;
  }

  public MyBridgeOptions(JsonObject json) {
    MyBridgeOptionsConverter.fromJson(json, this);
  }

  public JsonObject toJson() {
    JsonObject json = new JsonObject();
    MyBridgeOptionsConverter.toJson(this, json);
    return json;
  }

  public boolean isFlag() {
    return flag;
  }

  public MyBridgeOptions setFlag(boolean flag) {
    this.flag = flag;
    return this;
  }

}
