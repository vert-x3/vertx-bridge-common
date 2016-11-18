package io.vertx.kotlin.ext.bridge

import io.vertx.ext.bridge.PermittedOptions

fun PermittedOptions(
        address: String? = null,
    addressRegex: String? = null,
    match: io.vertx.core.json.JsonObject? = null): PermittedOptions = io.vertx.ext.bridge.PermittedOptions().apply {

    if (address != null) {
        this.address = address
    }

    if (addressRegex != null) {
        this.addressRegex = addressRegex
    }

    if (match != null) {
        this.match = match
    }

}

