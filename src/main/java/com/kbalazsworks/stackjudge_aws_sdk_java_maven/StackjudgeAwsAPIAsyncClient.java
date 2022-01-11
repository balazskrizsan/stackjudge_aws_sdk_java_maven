package com.kbalazsworks.stackjudge_aws_sdk_java_maven;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.Response;
import com.kbalazsworks.stackjudge_aws_sdk_java_maven.implementation.StackjudgeAwsAPIImpl;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous StackjudgeAwsAPI type. */
@ServiceClient(builder = StackjudgeAwsAPIBuilder.class, isAsync = true)
public final class StackjudgeAwsAPIAsyncClient {
    @Generated private final StackjudgeAwsAPIImpl serviceClient;

    /**
     * Initializes an instance of StackjudgeAwsAPI client.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    StackjudgeAwsAPIAsyncClient(StackjudgeAwsAPIImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * @param to The to parameter.
     * @param varName The varName parameter.
     * @param varOwnUrl The varOwnUrl parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> postSendActionWithResponse(String to, String varName, String varOwnUrl) {
        return this.serviceClient.postSendActionWithResponseAsync(to, varName, varOwnUrl);
    }

    /**
     * @param to The to parameter.
     * @param varName The varName parameter.
     * @param varOwnUrl The varOwnUrl parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> postSendAction(String to, String varName, String varOwnUrl) {
        return this.serviceClient.postSendActionAsync(to, varName, varOwnUrl);
    }
}
