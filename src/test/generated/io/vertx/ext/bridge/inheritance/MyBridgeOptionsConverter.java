package io.vertx.ext.bridge.inheritance;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

/**
 * Converter and mapper for {@link io.vertx.ext.bridge.inheritance.MyBridgeOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.ext.bridge.inheritance.MyBridgeOptions} original class using Vert.x codegen.
 */
public class MyBridgeOptionsConverter {


  private static final Base64.Decoder BASE64_DECODER = JsonUtil.BASE64_DECODER;
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, MyBridgeOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "flag":
          if (member.getValue() instanceof Boolean) {
            obj.setFlag((Boolean)member.getValue());
          }
          break;
      }
    }
  }

   static void toJson(MyBridgeOptions obj, JsonObject json) {
    toJson(obj, json.getMap());
  }

   static void toJson(MyBridgeOptions obj, java.util.Map<String, Object> json) {
    json.put("flag", obj.isFlag());
  }
}
