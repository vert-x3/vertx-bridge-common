package io.vertx.kotlin.ext.bridge

import io.vertx.ext.bridge.BridgeOptions

fun BridgeOptions(
        inboundPermitteds: List<io.vertx.ext.bridge.PermittedOptions>? = null,
    outboundPermitteds: List<io.vertx.ext.bridge.PermittedOptions>? = null): BridgeOptions = io.vertx.ext.bridge.BridgeOptions().apply {

    if (inboundPermitteds != null) {
        this.inboundPermitteds = inboundPermitteds
    }

    if (outboundPermitteds != null) {
        this.outboundPermitteds = outboundPermitteds
    }

}

