package io.vertx.ext.bridge.inheritance;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

/**
 * Converter for {@link io.vertx.ext.bridge.inheritance.MyBridgeOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.ext.bridge.inheritance.MyBridgeOptions} original class using Vert.x codegen.
 */
public class MyBridgeOptionsConverter {

  public static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, MyBridgeOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "flag":
          if (member.getValue() instanceof Boolean) {
            obj.setFlag((Boolean)member.getValue());
          }
          break;
        case "inboundPermitteds":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<io.vertx.ext.bridge.PermittedOptions> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof JsonObject)
                list.add(new io.vertx.ext.bridge.PermittedOptions((JsonObject)item));
            });
            obj.setInboundPermitteds(list);
          }
          break;
        case "outboundPermitteds":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<io.vertx.ext.bridge.PermittedOptions> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof JsonObject)
                list.add(new io.vertx.ext.bridge.PermittedOptions((JsonObject)item));
            });
            obj.setOutboundPermitteds(list);
          }
          break;
      }
    }
  }

  public static void toJson(MyBridgeOptions obj, JsonObject json) {
    toJson(obj, json.getMap());
  }

  public static void toJson(MyBridgeOptions obj, java.util.Map<String, Object> json) {
    json.put("flag", obj.isFlag());
    if (obj.getInboundPermitteds() != null) {
      JsonArray array = new JsonArray();
      obj.getInboundPermitteds().forEach(item -> array.add(item.toJson()));
      json.put("inboundPermitteds", array);
    }
    if (obj.getOutboundPermitteds() != null) {
      JsonArray array = new JsonArray();
      obj.getOutboundPermitteds().forEach(item -> array.add(item.toJson()));
      json.put("outboundPermitteds", array);
    }
  }
}
