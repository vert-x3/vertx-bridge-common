/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.vertx.ext.bridge.inheritance;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;

/**
 * Converter for {@link io.vertx.ext.bridge.inheritance.MyBridgeOptions}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.ext.bridge.inheritance.MyBridgeOptions} original class using Vert.x codegen.
 */
public class MyBridgeOptionsConverter {

  public static void fromJson(JsonObject json, MyBridgeOptions obj) {
    if (json.getValue("flag") instanceof Boolean) {
      obj.setFlag((Boolean)json.getValue("flag"));
    }
    if (json.getValue("inboundPermitteds") instanceof JsonArray) {
      json.getJsonArray("inboundPermitteds").forEach(item -> {
        if (item instanceof JsonObject)
          obj.addInboundPermitted(new io.vertx.ext.bridge.PermittedOptions((JsonObject)item));
      });
    }
    if (json.getValue("outboundPermitteds") instanceof JsonArray) {
      json.getJsonArray("outboundPermitteds").forEach(item -> {
        if (item instanceof JsonObject)
          obj.addOutboundPermitted(new io.vertx.ext.bridge.PermittedOptions((JsonObject)item));
      });
    }
  }

  public static void toJson(MyBridgeOptions obj, JsonObject json) {
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