# vert.x bridge common

[![Build Status](https://github.com/vert-x3/vertx-bridge-common/workflows/CI/badge.svg?branch=3.9)](https://github.com/vert-x3/vertx-bridge-common/actions?query=workflow%3ACI)

This repository contains the common configuration for event bus bridges.

## Event Bus Bridges

Event bus bridges are components that manage a (generally bidirectional) mapping between the vert.x event bus and another protocol:

```
    Event Bus <---- BRIDGE ----> Stomp / AMQP / TCP / SOCKJS ...
```

To configure these bridges you need to configure:

* which event bus address is accepted by the bridge to be transferred to the third-party protocol.
* which address / url / topic from the third-protocol is transferred to the event bus

## Common configuration

This projects contains two data objects:

* Bridge Options
* Permitted Options

`BridgeOptions` maintains the list of inbound and outbound permitted options, while `PermittedOptions` describes an address that is accepted by the bridge.

Permitted options be used to match:

* an exact address
* an address that match a regular expression
* messages that match a specific structure (generally use in addition to one of the other option).


