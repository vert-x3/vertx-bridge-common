package io.vertx.kotlin.ext.bridge.inheritance

import io.vertx.ext.bridge.inheritance.MyBridgeOptions
import io.vertx.ext.bridge.PermittedOptions

/**
 * A function providing a DSL for building [io.vertx.ext.bridge.inheritance.MyBridgeOptions] objects.
 *
 *
 * @param flag 
 * @param inboundPermitteds 
 * @param outboundPermitteds 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.bridge.inheritance.MyBridgeOptions original] using Vert.x codegen.
 */
fun MyBridgeOptions(
  flag: Boolean? = null,
  inboundPermitteds: Iterable<io.vertx.ext.bridge.PermittedOptions>? = null,
  outboundPermitteds: Iterable<io.vertx.ext.bridge.PermittedOptions>? = null): MyBridgeOptions = io.vertx.ext.bridge.inheritance.MyBridgeOptions().apply {

  if (flag != null) {
    this.setFlag(flag)
  }
  if (inboundPermitteds != null) {
    this.setInboundPermitteds(inboundPermitteds.toList())
  }
  if (outboundPermitteds != null) {
    this.setOutboundPermitteds(outboundPermitteds.toList())
  }
}

