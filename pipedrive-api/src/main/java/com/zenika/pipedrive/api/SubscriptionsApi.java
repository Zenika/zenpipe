package com.zenika.pipedrive.api;

import com.zenika.pipedrive.invoker.ApiClient;
import com.zenika.pipedrive.invoker.EncodingUtils;
import com.zenika.pipedrive.model.ApiResponse;

import com.zenika.pipedrive.model.AddRecurringSubscriptionRequest;
import com.zenika.pipedrive.model.AddSubscriptionInstallmentRequest;
import com.zenika.pipedrive.model.CancelRecurringSubscriptionRequest;
import com.zenika.pipedrive.model.PaymentResponse200;
import com.zenika.pipedrive.model.SubscriptionsIdResponse200;
import com.zenika.pipedrive.model.UpdateRecurringSubscriptionRequest;
import com.zenika.pipedrive.model.UpdateSubscriptionInstallmentRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public interface SubscriptionsApi extends ApiClient.Api {


  /**
   * Add a recurring subscription
   * Adds a new recurring subscription.
   * @param addRecurringSubscriptionRequest  (optional)
   * @return SubscriptionsIdResponse200
   */
  @RequestLine("POST /subscriptions/recurring")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SubscriptionsIdResponse200 addRecurringSubscription(AddRecurringSubscriptionRequest addRecurringSubscriptionRequest);

  /**
   * Add a recurring subscription
   * Similar to <code>addRecurringSubscription</code> but it also returns the http response headers .
   * Adds a new recurring subscription.
   * @param addRecurringSubscriptionRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /subscriptions/recurring")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SubscriptionsIdResponse200> addRecurringSubscriptionWithHttpInfo(AddRecurringSubscriptionRequest addRecurringSubscriptionRequest);



  /**
   * Add an installment subscription
   * Adds a new installment subscription.
   * @param addSubscriptionInstallmentRequest  (optional)
   * @return SubscriptionsIdResponse200
   */
  @RequestLine("POST /subscriptions/installment")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SubscriptionsIdResponse200 addSubscriptionInstallment(AddSubscriptionInstallmentRequest addSubscriptionInstallmentRequest);

  /**
   * Add an installment subscription
   * Similar to <code>addSubscriptionInstallment</code> but it also returns the http response headers .
   * Adds a new installment subscription.
   * @param addSubscriptionInstallmentRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /subscriptions/installment")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SubscriptionsIdResponse200> addSubscriptionInstallmentWithHttpInfo(AddSubscriptionInstallmentRequest addSubscriptionInstallmentRequest);



  /**
   * Cancel a recurring subscription
   * Cancels a recurring subscription.
   * @param id The ID of the subscription (required)
   * @param cancelRecurringSubscriptionRequest  (optional)
   * @return SubscriptionsIdResponse200
   */
  @RequestLine("PUT /subscriptions/recurring/{id}/cancel")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SubscriptionsIdResponse200 cancelRecurringSubscription(@Param("id") Integer id, CancelRecurringSubscriptionRequest cancelRecurringSubscriptionRequest);

  /**
   * Cancel a recurring subscription
   * Similar to <code>cancelRecurringSubscription</code> but it also returns the http response headers .
   * Cancels a recurring subscription.
   * @param id The ID of the subscription (required)
   * @param cancelRecurringSubscriptionRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /subscriptions/recurring/{id}/cancel")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SubscriptionsIdResponse200> cancelRecurringSubscriptionWithHttpInfo(@Param("id") Integer id, CancelRecurringSubscriptionRequest cancelRecurringSubscriptionRequest);



  /**
   * Delete a subscription
   * Marks an installment or a recurring subscription as deleted.
   * @param id The ID of the subscription (required)
   * @return SubscriptionsIdResponse200
   */
  @RequestLine("DELETE /subscriptions/{id}")
  @Headers({
    "Accept: application/json",
  })
  SubscriptionsIdResponse200 deleteSubscription(@Param("id") Integer id);

  /**
   * Delete a subscription
   * Similar to <code>deleteSubscription</code> but it also returns the http response headers .
   * Marks an installment or a recurring subscription as deleted.
   * @param id The ID of the subscription (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /subscriptions/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<SubscriptionsIdResponse200> deleteSubscriptionWithHttpInfo(@Param("id") Integer id);



  /**
   * Find subscription by deal
   * Returns details of an installment or a recurring subscription by the deal ID.
   * @param dealId The ID of the deal (required)
   * @return SubscriptionsIdResponse200
   */
  @RequestLine("GET /subscriptions/find/{dealId}")
  @Headers({
    "Accept: application/json",
  })
  SubscriptionsIdResponse200 findSubscriptionByDeal(@Param("dealId") Integer dealId);

  /**
   * Find subscription by deal
   * Similar to <code>findSubscriptionByDeal</code> but it also returns the http response headers .
   * Returns details of an installment or a recurring subscription by the deal ID.
   * @param dealId The ID of the deal (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /subscriptions/find/{dealId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<SubscriptionsIdResponse200> findSubscriptionByDealWithHttpInfo(@Param("dealId") Integer dealId);



  /**
   * Get details of a subscription
   * Returns details of an installment or a recurring subscription.
   * @param id The ID of the subscription (required)
   * @return SubscriptionsIdResponse200
   */
  @RequestLine("GET /subscriptions/{id}")
  @Headers({
    "Accept: application/json",
  })
  SubscriptionsIdResponse200 getSubscription(@Param("id") Integer id);

  /**
   * Get details of a subscription
   * Similar to <code>getSubscription</code> but it also returns the http response headers .
   * Returns details of an installment or a recurring subscription.
   * @param id The ID of the subscription (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /subscriptions/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<SubscriptionsIdResponse200> getSubscriptionWithHttpInfo(@Param("id") Integer id);



  /**
   * Get all payments of a subscription
   * Returns all payments of an installment or recurring subscription.
   * @param id The ID of the subscription (required)
   * @return PaymentResponse200
   */
  @RequestLine("GET /subscriptions/{id}/payments")
  @Headers({
    "Accept: application/json",
  })
  PaymentResponse200 getSubscriptionPayments(@Param("id") Integer id);

  /**
   * Get all payments of a subscription
   * Similar to <code>getSubscriptionPayments</code> but it also returns the http response headers .
   * Returns all payments of an installment or recurring subscription.
   * @param id The ID of the subscription (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /subscriptions/{id}/payments")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<PaymentResponse200> getSubscriptionPaymentsWithHttpInfo(@Param("id") Integer id);



  /**
   * Update a recurring subscription
   * Updates a recurring subscription.
   * @param id The ID of the subscription (required)
   * @param updateRecurringSubscriptionRequest  (optional)
   * @return SubscriptionsIdResponse200
   */
  @RequestLine("PUT /subscriptions/recurring/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SubscriptionsIdResponse200 updateRecurringSubscription(@Param("id") Integer id, UpdateRecurringSubscriptionRequest updateRecurringSubscriptionRequest);

  /**
   * Update a recurring subscription
   * Similar to <code>updateRecurringSubscription</code> but it also returns the http response headers .
   * Updates a recurring subscription.
   * @param id The ID of the subscription (required)
   * @param updateRecurringSubscriptionRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /subscriptions/recurring/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SubscriptionsIdResponse200> updateRecurringSubscriptionWithHttpInfo(@Param("id") Integer id, UpdateRecurringSubscriptionRequest updateRecurringSubscriptionRequest);



  /**
   * Update an installment subscription
   * Updates an installment subscription.
   * @param id The ID of the subscription (required)
   * @param updateSubscriptionInstallmentRequest  (optional)
   * @return SubscriptionsIdResponse200
   */
  @RequestLine("PUT /subscriptions/installment/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SubscriptionsIdResponse200 updateSubscriptionInstallment(@Param("id") Integer id, UpdateSubscriptionInstallmentRequest updateSubscriptionInstallmentRequest);

  /**
   * Update an installment subscription
   * Similar to <code>updateSubscriptionInstallment</code> but it also returns the http response headers .
   * Updates an installment subscription.
   * @param id The ID of the subscription (required)
   * @param updateSubscriptionInstallmentRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /subscriptions/installment/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SubscriptionsIdResponse200> updateSubscriptionInstallmentWithHttpInfo(@Param("id") Integer id, UpdateSubscriptionInstallmentRequest updateSubscriptionInstallmentRequest);


}
