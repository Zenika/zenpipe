package com.zenika.pipedrive.api;

import com.zenika.pipedrive.invoker.ApiClient;
import com.zenika.pipedrive.invoker.EncodingUtils;
import com.zenika.pipedrive.model.ApiResponse;

import com.zenika.pipedrive.model.AddChannel200Response;
import com.zenika.pipedrive.model.AddChannel400Response;
import com.zenika.pipedrive.model.AddChannel403Response;
import com.zenika.pipedrive.model.AddChannelRequest;
import com.zenika.pipedrive.model.DeleteChannel200Response;
import com.zenika.pipedrive.model.DeleteConversation403Response;
import com.zenika.pipedrive.model.DeleteConversation404Response;
import com.zenika.pipedrive.model.ReceiveMessage200Response;
import com.zenika.pipedrive.model.ReceiveMessage400Response;
import com.zenika.pipedrive.model.ReceiveMessageRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public interface ChannelsApi extends ApiClient.Api {


  /**
   * Add a channel
   * Adds a new messaging channel, only admins are able to register new channels. It will use the getConversations endpoint to fetch conversations, participants and messages afterward. To use the endpoint, you need to have **Messengers integration** OAuth scope enabled and the Messaging manifest ready for the [Messaging app extension](https://pipedrive.readme.io/docs/messaging-app-extension).
   * @param addChannelRequest  (optional)
   * @return AddChannel200Response
   */
  @RequestLine("POST /channels")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AddChannel200Response addChannel(AddChannelRequest addChannelRequest);

  /**
   * Add a channel
   * Similar to <code>addChannel</code> but it also returns the http response headers .
   * Adds a new messaging channel, only admins are able to register new channels. It will use the getConversations endpoint to fetch conversations, participants and messages afterward. To use the endpoint, you need to have **Messengers integration** OAuth scope enabled and the Messaging manifest ready for the [Messaging app extension](https://pipedrive.readme.io/docs/messaging-app-extension).
   * @param addChannelRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /channels")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AddChannel200Response> addChannelWithHttpInfo(AddChannelRequest addChannelRequest);



  /**
   * Delete a channel
   * Deletes an existing messenger’s channel and all related entities (conversations and messages). To use the endpoint, you need to have **Messengers integration** OAuth scope enabled and the Messaging manifest ready for the [Messaging app extension](https://pipedrive.readme.io/docs/messaging-app-extension).
   * @param id The ID of the channel provided by the integration (required)
   * @return DeleteChannel200Response
   */
  @RequestLine("DELETE /channels/{id}")
  @Headers({
    "Accept: application/json",
  })
  DeleteChannel200Response deleteChannel(@Param("id") String id);

  /**
   * Delete a channel
   * Similar to <code>deleteChannel</code> but it also returns the http response headers .
   * Deletes an existing messenger’s channel and all related entities (conversations and messages). To use the endpoint, you need to have **Messengers integration** OAuth scope enabled and the Messaging manifest ready for the [Messaging app extension](https://pipedrive.readme.io/docs/messaging-app-extension).
   * @param id The ID of the channel provided by the integration (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /channels/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DeleteChannel200Response> deleteChannelWithHttpInfo(@Param("id") String id);



  /**
   * Delete a conversation
   * Deletes an existing conversation. To use the endpoint, you need to have **Messengers integration** OAuth scope enabled and the Messaging manifest ready for the [Messaging app extension](https://pipedrive.readme.io/docs/messaging-app-extension).
   * @param channelId The ID of the channel provided by the integration (required)
   * @param conversationId The ID of the conversation provided by the integration (required)
   * @return DeleteChannel200Response
   */
  @RequestLine("DELETE /channels/{channelId}/conversations/{conversationId}")
  @Headers({
    "Accept: application/json",
  })
  DeleteChannel200Response deleteConversation(@Param("channelId") String channelId, @Param("conversationId") String conversationId);

  /**
   * Delete a conversation
   * Similar to <code>deleteConversation</code> but it also returns the http response headers .
   * Deletes an existing conversation. To use the endpoint, you need to have **Messengers integration** OAuth scope enabled and the Messaging manifest ready for the [Messaging app extension](https://pipedrive.readme.io/docs/messaging-app-extension).
   * @param channelId The ID of the channel provided by the integration (required)
   * @param conversationId The ID of the conversation provided by the integration (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /channels/{channelId}/conversations/{conversationId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DeleteChannel200Response> deleteConversationWithHttpInfo(@Param("channelId") String channelId, @Param("conversationId") String conversationId);



  /**
   * Receives an incoming message
   * Adds a message to a conversation. To use the endpoint, you need to have **Messengers integration** OAuth scope enabled and the Messaging manifest ready for the [Messaging app extension](https://pipedrive.readme.io/docs/messaging-app-extension).
   * @param receiveMessageRequest  (optional)
   * @return ReceiveMessage200Response
   */
  @RequestLine("POST /channels/messages/receive")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ReceiveMessage200Response receiveMessage(ReceiveMessageRequest receiveMessageRequest);

  /**
   * Receives an incoming message
   * Similar to <code>receiveMessage</code> but it also returns the http response headers .
   * Adds a message to a conversation. To use the endpoint, you need to have **Messengers integration** OAuth scope enabled and the Messaging manifest ready for the [Messaging app extension](https://pipedrive.readme.io/docs/messaging-app-extension).
   * @param receiveMessageRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /channels/messages/receive")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ReceiveMessage200Response> receiveMessageWithHttpInfo(ReceiveMessageRequest receiveMessageRequest);


}
