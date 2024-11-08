package io.vertx.ext.bridge;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

/**
 * Converter and mapper for {@link io.vertx.ext.bridge.BridgeOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.ext.bridge.BridgeOptions} original class using Vert.x codegen.
 */
public class BridgeOptionsConverter {

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, BridgeOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "inboundPermitteds":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<io.vertx.ext.bridge.PermittedOptions> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof JsonObject)
                list.add(new io.vertx.ext.bridge.PermittedOptions((io.vertx.core.json.JsonObject)item));
            });
            obj.setInboundPermitteds(list);
          }
          break;
        case "outboundPermitteds":
          if (member.getValue() instanceof JsonArray) {
            java.util.ArrayList<io.vertx.ext.bridge.PermittedOptions> list =  new java.util.ArrayList<>();
            ((Iterable<Object>)member.getValue()).forEach( item -> {
              if (item instanceof JsonObject)
                list.add(new io.vertx.ext.bridge.PermittedOptions((io.vertx.core.json.JsonObject)item));
            });
            obj.setOutboundPermitteds(list);
          }
          break;
      }
    }
  }

   static void toJson(BridgeOptions obj, JsonObject json) {
    toJson(obj, json.getMap());
  }

   static void toJson(BridgeOptions obj, java.util.Map<String, Object> json) {
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
