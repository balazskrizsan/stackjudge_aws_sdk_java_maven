package com.kbalazsworks.stackjudge_aws_sdk.schema_parameter_objects;

import com.kbalazsworks.stackjudge_aws_sdk.common.interfaces.IOpenSdkPostable;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import javax.annotation.processing.Generated;
import java.util.List;

@Generated("OpenSDK: https://github.com/balazskrizsan/OpenSdk")
public final class ApiResponseDataCdnServicePutResponse implements IOpenSdkPostable
{
    private final CdnServicePutResponse cdnServicePutResponse;
    private final Boolean success;
    private final Integer errorCodeerrorCode;
    private final String requestId;

    public ApiResponseDataCdnServicePutResponse(
        CdnServicePutResponse cdnServicePutResponse,
        Boolean success,
        Integer errorCodeerrorCode,
        String requestId
    )
    {
        this.cdnServicePutResponse = cdnServicePutResponse;
        this.success = success;
        this.errorCodeerrorCode = errorCodeerrorCode;
        this.requestId = requestId;
    }

    public CdnServicePutResponse cdnServicePutResponse()
    {
        return cdnServicePutResponse;
    }

    public Boolean success()
    {
        return success;
    }

    public Integer errorCodeerrorCode()
    {
        return errorCodeerrorCode;
    }

    public String requestId()
    {
        return requestId;
    }

    @Override
    public MultiValueMap<String, Object> toOpenSdkPost()
    {
        return new LinkedMultiValueMap<>()
        {{
            addAll("cdnServicePutResponse", List.of(cdnServicePutResponse()));
            addAll("success", List.of(success()));
            addAll("errorCodeerrorCode", List.of(errorCodeerrorCode()));
            addAll("requestId", List.of(requestId()));
        }};
    }

    // not yet supported in the generator
//    @Override
//    public boolean equals(Object obj)
//    {
//    }

    // not yet supported in the generator
//    @Override
//    public int hashCode()
//    {
//    }

    // not yet supported in the generator
//    @Override
//    public String toString()
//    {
//    }
}
