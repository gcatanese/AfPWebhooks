# Adyen for Platforms: webhook samples and best practises

Adyen sends notifications through webhooks to inform your system about events and changes occurring in your platform.

There are various types of events:
* [Configuration webhooks](https://docs.adyen.com/api-explorer/balanceplatform-webhooks/1/overview): these events include, 
for example, when an account holder's capabilities are updated, or when a sweep configuration is created or updated.
* [Transfer webhooks](https://docs.adyen.com/api-explorer/transfer-webhooks/3/overview): updates on incoming and outgoing transfers in the platform
* [Report webhooks](https://docs.adyen.com/api-explorer/report-webhooks/1/overview): a report has been generated and is ready to be downloaded

You should receive, process and accept webhooks in your own applications/systems and perform the required changes on
your side.

## Consume a webhook

Consuming a webhook involves few steps:
1. create a webhook handler: this is a service/application where Adyen will `POST` the webhook events
2. validate the HMAC signature
3. mark the webhook as `accepted`
4. process the event

### 1) Webhook handler

It can be implemented in your preferred language/framework. This repository provides a Java (Springboot) sample 
(see [WebhookController](src/main/java/com/adyen/examples/controller/WebhookController.java))

### 2) HMAC signature

Adyen signs every webhook with an HMAC signature in the request header `HmacSignature`. 
Verify the signature to confirm that the webhook was sent by Adyen and was not modified during transmission.

Check [HMACValidator](src/main/java/com/adyen/examples/util/HMACValidator.java) to see how to calculate and validate the signature

### 3) Accept the webhook

Once the HMAC signature is valid you should mark the webhook as **accepted**. This can be done sending back a response that has:
* `200` status code
* and `[accepted]` in the response body

It is **highly recommended** to process the webhook asynchronously: store the information in the database of queue, accept
the webhook, and then perform your logic and workflow.

### 4) Process the event

Deserialise the JSON payloand in a Java object and implement your worfklow.

Check [EventHandler](src/main/java/com/adyen/examples/util/EventHandler.java) to see a possible Jackson-approach.

The package [model](src/main/java/com/adyen/examples/model) contains the Java classes mapping the [Adyen OpenAPI](https://github.com/Adyen/adyen-openapi) specifications.
