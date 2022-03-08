package com.kbalazsworks.stackjudge_aws_sdk.schema_parameter_objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kbalazsworks.stackjudge_aws_sdk.common.interfaces.IOpenSdkPostable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
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
@AllArgsConstructor
@Getter
public final class CdnServicePutResponse implements IOpenSdkPostable
{
    @JsonProperty("path")
    private final String path;
    @JsonProperty("fileName")
    private final String fileName;
    @JsonProperty("s3eTag")
    private final String s3eTag;
    @JsonProperty("s3contentMd5")
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
