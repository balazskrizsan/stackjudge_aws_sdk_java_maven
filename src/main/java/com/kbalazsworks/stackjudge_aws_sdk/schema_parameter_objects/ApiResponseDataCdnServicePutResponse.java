package com.kbalazsworks.stackjudge_aws_sdk.schema_parameter_objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kbalazsworks.stackjudge_aws_sdk.common.interfaces.IOpenSdkPostable;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import javax.annotation.processing.Generated;
import java.util.List;

@Generated("OpenSDK: https://github.com/balazskrizsan/OpenSdk")
@Jacksonized
@Builder(access = AccessLevel.PUBLIC)
@Getter
public final class ApiResponseDataCdnServicePutResponse implements IOpenSdkPostable
{
    @JsonProperty("data")
    private final CdnServicePutResponse cdnServicePutResponse;
    @JsonProperty("success")
    private final Boolean success;
    @JsonProperty("errorCode")
    private final Integer errorCode;
    @JsonProperty("requestId")
    private final String requestId;

    @Override
    public MultiValueMap<String, Object> toOpenSdkPost()
    {
        return new LinkedMultiValueMap<>()
        {{
            addAll("cdnServicePutResponse", List.of(cdnServicePutResponse));
            addAll("success", List.of(success));
            addAll("errorCode", List.of(errorCode));
            addAll("requestId", List.of(requestId));
        }};
    }
}
