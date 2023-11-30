/*
 *  Copyright (c) 2011-2015 The original author or authors
 *  ------------------------------------------------------
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  and Apache License v2.0 which accompanies this distribution.
 *
 *       The Eclipse Public License is available at
 *       http://www.eclipse.org/legal/epl-v10.html
 *
 *       The Apache License v2.0 is available at
 *       http://www.opensource.org/licenses/apache2.0.php
 *
 *  You may elect to redistribute this code under either of these licenses.
 */

package io.vertx.ext.bridge;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.codegen.json.annotations.JsonGen;
import io.vertx.core.json.JsonObject;


/**
 * Represents a match to allow for inbound and outbound traffic.
 *
 * @author <a href="http://escoffier.me">Clement Escoffier</a>
 */
@DataObject
@JsonGen(publicConverter = false)
public class PermittedOptions {

  /**
   * The default permitted match : {@code null}.
   */
  public static JsonObject DEFAULT_MATCH = null;

  /**
   * The default permitted address : {@code null}.
   */
  public static String DEFAULT_ADDRESS = null;

  /**
   * The default permitted address regex : {@code null}.
   */
  public static String DEFAULT_ADDRESS_REGEX = null;

  /**
   * The default permitted required authority : {@code null}.
   */
  public static String DEFAULT_REQUIRED_AUTHORITY = null;

  private String address = DEFAULT_ADDRESS;
  private String addressRegex = DEFAULT_ADDRESS_REGEX;
  private String requiredAuthority = DEFAULT_REQUIRED_AUTHORITY;
  private JsonObject match = DEFAULT_MATCH;

  /**
   * Creates a new instance of {@link PermittedOptions}.
   */
  public PermittedOptions() {
  }

  /**
   * Creates a new instance of {@link PermittedOptions} copying the given {@link PermittedOptions}.
   *
   * @param that the {@link PermittedOptions} to copy
   */
  public PermittedOptions(PermittedOptions that) {
    address = that.address;
    addressRegex = that.addressRegex;
    match = that.match;
    requiredAuthority = that.requiredAuthority;
  }

  /**
   * Creates a new instance of {@link PermittedOptions} from its JSON representation.
   * This method uses the generated converter.
   *
   * @param json the serialized {@link PermittedOptions}
   * @see #toJson()
   * @see PermittedOptionsConverter
   */
  public PermittedOptions(JsonObject json) {
    PermittedOptionsConverter.fromJson(json, this);
  }

  /**
   * Serializes the current instance of {@link PermittedOptions} to JSON. This method uses the generated converter.
   *
   * @return the created JSON object
   * @see PermittedOptionsConverter
   */
  public JsonObject toJson() {
    JsonObject json = new JsonObject();
    PermittedOptionsConverter.toJson(this, json);
    return json;
  }

  /**
   * @return the address.
   */
  public String getAddress() {
    return address;
  }

  /**
   * The exact address the message is being sent to. If you want to allow messages based on
   * an exact address you use this field.
   *
   * @param address the address
   * @return a reference to this, so the API can be used fluently
   */
  public PermittedOptions setAddress(String address) {
    this.address = address;
    return this;
  }

  /**
   * @return the address regular expression.
   */
  public String getAddressRegex() {
    return addressRegex;
  }

  /**
   * A regular expression that will be matched against the address. If you want to allow messages
   * based on a regular expression you use this field. If the {@link #setAddress} value is specified
   * this will be ignored.
   *
   * @param addressRegex the address regex
   * @return a reference to this, so the API can be used fluently
   */
  public PermittedOptions setAddressRegex(String addressRegex) {
    this.addressRegex = addressRegex;
    return this;
  }

  /**
   * @return the match structure.
   */
  public JsonObject getMatch() {
    return match;
  }

  /**
   * This allows you to allow messages based on their structure. Any fields in the match must exist in the
   * message with the same values for them to be allowed. This currently only works with JSON messages.
   *
   * @param match the match json object
   * @return a reference to this, so the API can be used fluently
   */
  public PermittedOptions setMatch(JsonObject match) {
    this.match = match;
    return this;
  }

  public String getRequiredAuthority() {
    return requiredAuthority;
  }

  /**
   * Declare a specific authority that user must have in order to allow messages
   *
   * @param requiredAuthority the authority
   * @return a reference to this, so the API can be used fluently
   */
  public PermittedOptions setRequiredAuthority(String requiredAuthority) {
    this.requiredAuthority = requiredAuthority;
    return this;
  }
}
