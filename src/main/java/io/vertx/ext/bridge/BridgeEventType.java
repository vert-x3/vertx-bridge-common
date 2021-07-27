package io.vertx.ext.bridge;

import io.vertx.codegen.annotations.VertxGen;

/**
 * Bridge Event Types.
 *
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
@VertxGen
public enum BridgeEventType {

  /**
   * This event will occur when a new SockJS socket is created.
   */
  SOCKET_CREATED,

  /**
   * This event will occur when a SockJS socket is closed.
   */
  SOCKET_CLOSED,

  /**
   * This event will occur when SockJS socket is on idle for longer period of time than configured.
   */
  SOCKET_IDLE,

  /**
   * This event will occur when the last ping timestamp is updated for the SockJS socket.
   */
  SOCKET_PING,

  /**
   * This event will occur when an underlying transport errors.
   */
  SOCKET_ERROR,

  /**
   * This event will occur when a message is attempted to be sent from the client to the server.
   */
  SEND,

  /**
   * This event will occur when a message is attempted to be published from the client to the server.
   */
  PUBLISH,

  /**
   * This event will occur when a message is attempted to be delivered from the server to the client.
   */
  RECEIVE,

  /**
   * This event will occur when a client attempts to register a handler.
   */
  REGISTER,

  /**
   * This event will occur when a client successfully registered. The raw message used for registration, notified with {@link BridgeEventType#REGISTER} event
   */
  REGISTERED,

  /**
   * This event will occur when a client attempts to unregister a handler.
   */
  UNREGISTER
}
