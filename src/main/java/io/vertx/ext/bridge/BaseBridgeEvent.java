package io.vertx.ext.bridge;

import io.vertx.codegen.annotations.CacheReturn;
import io.vertx.codegen.annotations.Fluent;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.Promise;
import io.vertx.core.json.JsonObject;

/**
 * Represents an event that occurs on the event bus bridge.
 * <p>
 * Please consult the documentation for a full explanation.
 *
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
@VertxGen
public interface BaseBridgeEvent extends Promise<Boolean> {

  /**
   * @return  the type of the event
   */
  @CacheReturn
  BridgeEventType type();

  /**
   * Get the raw JSON message for the event. This will be null for SOCKET_CREATED or SOCKET_CLOSED events as there is
   * no message involved. If the returned message is modified, {@link #setRawMessage} should be called with the
   * new message.
   *
   * @return the raw JSON message for the event
   */
  JsonObject getRawMessage();

  /**
   * Override the raw JSON message for the event. It is ideally using it when publish back message from server to client in RECEIVE event
   *
   * @param message the raw message
   * @return this reference, so it can be used fluently
   */
  @Fluent
  BaseBridgeEvent setRawMessage(JsonObject message);
}
