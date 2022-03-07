package com.kbalazsworks.stackjudge_aws_sdk.schema_parameter_objects;

import com.kbalazsworks.stackjudge_aws_sdk.common.interfaces.IOpenSdkPostable;
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
@Builder
@Getter
public final class CdnServicePutResponse implements IOpenSdkPostable
{
    private final String path;
    private final String fileName;
    private final String s3eTag;
    private final String s3contentMd5;

    @Override
    public MultiValueMap<String, Object> toOpenSdkPost()
    {
        return new LinkedMultiValueMap<>()
        {{
            addAll("path", List.of(path));
            addAll("fileName", List.of(fileName));
            addAll("s3eTag", List.of(s3eTag));
            addAll("s3contentMd5", List.of(s3contentMd5));
        }};
    }
}
