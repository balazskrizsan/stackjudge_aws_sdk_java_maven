package com.kbalazsworks.stackjudge_aws_sdk_java_maven.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the StackjudgeAwsAPI type. */
public final class StackjudgeAwsAPIImpl {
    /** The proxy service used to perform REST calls. */
    private final StackjudgeAwsAPIService service;

    /** server parameter. */
    private final String host;

    /**
     * Gets server parameter.
     *
     * @return the host value.
     */
    public String getHost() {
        return this.host;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /**
     * Initializes an instance of StackjudgeAwsAPI client.
     *
     * @param host server parameter.
     */
    public StackjudgeAwsAPIImpl(String host) {
        this(
                new HttpPipelineBuilder()
                        .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                        .build(),
                JacksonAdapter.createDefaultSerializerAdapter(),
                host);
    }

    /**
     * Initializes an instance of StackjudgeAwsAPI client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param host server parameter.
     */
    public StackjudgeAwsAPIImpl(HttpPipeline httpPipeline, String host) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), host);
    }

    /**
     * Initializes an instance of StackjudgeAwsAPI client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param host server parameter.
     */
    public StackjudgeAwsAPIImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter, String host) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.host = host;
        this.service = RestProxy.create(StackjudgeAwsAPIService.class, this.httpPipeline, this.getSerializerAdapter());
    }

    /**
     * The interface defining all the services for StackjudgeAwsAPI to be used by the proxy service to perform REST
     * calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "StackjudgeAwsAPI")
    private interface StackjudgeAwsAPIService {
        // @Multipart not supported by RestProxy
        @Post("/ses/send/company-own-email")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> postSendAction(
                @HostParam("$host") String host,
                @BodyParam("multipart/form-data") String to,
                @BodyParam("multipart/form-data") String varName,
                @BodyParam("multipart/form-data") String varOwnUrl);
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> postSendActionWithResponseAsync(String to, String varName, String varOwnUrl) {
        return service.postSendAction(this.getHost(), to, varName, varOwnUrl);
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> postSendActionAsync(String to, String varName, String varOwnUrl) {
        return postSendActionWithResponseAsync(to, varName, varOwnUrl).flatMap((Response<Void> res) -> Mono.empty());
    }
}
