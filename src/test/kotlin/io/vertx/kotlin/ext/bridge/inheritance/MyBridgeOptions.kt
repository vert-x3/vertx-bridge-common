package io.vertx.kotlin.ext.bridge.inheritance

import io.vertx.ext.bridge.inheritance.MyBridgeOptions

fun MyBridgeOptions(
        flag: Boolean? = null,
    inboundPermitteds: List<io.vertx.ext.bridge.PermittedOptions>? = null,
    outboundPermitteds: List<io.vertx.ext.bridge.PermittedOptions>? = null): MyBridgeOptions = io.vertx.ext.bridge.inheritance.MyBridgeOptions().apply {

    if (flag != null) {
        this.isFlag = flag
    }

    if (inboundPermitteds != null) {
        this.inboundPermitteds = inboundPermitteds
    }

    if (outboundPermitteds != null) {
        this.outboundPermitteds = outboundPermitteds
    }

}

