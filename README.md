# vert.x bridge common

[![Build Status (5.x)](https://github.com/vert-x3/vertx-bridge-common/actions/workflows/ci-5.x.yml/badge.svg)](https://github.com/vert-x3/vertx-bridge-common/actions/workflows/ci-5.x.yml)
[![Build Status (4.x)](https://github.com/vert-x3/vertx-bridge-common/actions/workflows/ci-4.x.yml/badge.svg)](https://github.com/vert-x3/vertx-bridge-common/actions/workflows/ci-4.x.yml)

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


