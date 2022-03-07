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
public final class PostUploadRequest implements IOpenSdkPostable
{
    private final String cdnNamespace;
    private final String subFolder;
    private final String fileName;
    private final String fileExtension;
    private final HttpEntity<ByteArrayResource> content;

    @Override
    public MultiValueMap<String, Object> toOpenSdkPost()
    {
        return new LinkedMultiValueMap<>()
        {{
            addAll("cdnNamespace", List.of(cdnNamespace));
            addAll("subFolder", List.of(subFolder));
            addAll("fileName", List.of(fileName));
            addAll("fileExtension", List.of(fileExtension));
            addAll("content", List.of(content));
        }};
    }
}
