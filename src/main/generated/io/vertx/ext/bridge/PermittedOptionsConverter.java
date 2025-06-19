package io.vertx.ext.bridge;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

/**
 * Converter and mapper for {@link io.vertx.ext.bridge.PermittedOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.ext.bridge.PermittedOptions} original class using Vert.x codegen.
 */
public class PermittedOptionsConverter {


  private static final Base64.Decoder BASE64_DECODER = JsonUtil.BASE64_DECODER;
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, PermittedOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "address":
          if (member.getValue() instanceof String) {
            obj.setAddress((String)member.getValue());
          }
          break;
        case "addressRegex":
          if (member.getValue() instanceof String) {
            obj.setAddressRegex((String)member.getValue());
          }
          break;
        case "match":
          if (member.getValue() instanceof JsonObject) {
            obj.setMatch(((JsonObject)member.getValue()).copy());
          }
          break;
        case "requiredAuthority":
          if (member.getValue() instanceof String) {
            obj.setRequiredAuthority((String)member.getValue());
          }
          break;
      }
    }
  }

   static void toJson(PermittedOptions obj, JsonObject json) {
    toJson(obj, json.getMap());
  }

   static void toJson(PermittedOptions obj, java.util.Map<String, Object> json) {
    if (obj.getAddress() != null) {
      json.put("address", obj.getAddress());
    }
    if (obj.getAddressRegex() != null) {
      json.put("addressRegex", obj.getAddressRegex());
    }
    if (obj.getMatch() != null) {
      json.put("match", obj.getMatch());
    }
    if (obj.getRequiredAuthority() != null) {
      json.put("requiredAuthority", obj.getRequiredAuthority());
    }
  }
}
