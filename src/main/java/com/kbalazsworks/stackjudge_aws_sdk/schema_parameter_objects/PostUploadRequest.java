package com.kbalazsworks.stackjudge_aws_sdk.schema_parameter_objects;

import com.kbalazsworks.stackjudge_aws_sdk.common.interfaces.OpenSdkPostable;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import javax.annotation.processing.Generated;
import java.util.List;

@Generated("OpenSDK: https://github.com/balazskrizsan/OpenSdk")
public final class PostUploadRequest implements OpenSdkPostable

{
    private final String cdnNamespace;
    private final String fileName;
    private final String fileExtension;
    private final HttpEntity<ByteArrayResource> content;

    public PostUploadRequest(
        String cdnNamespace,
        String fileName,
        String fileExtension,
        HttpEntity<ByteArrayResource> content
    )
    {
        this.cdnNamespace = cdnNamespace;
        this.fileName = fileName;
        this.fileExtension = fileExtension;
        this.content = content;
    }

    public String cdnNamespace()
    {
        return cdnNamespace;
    }

    public String fileName()
    {
        return fileName;
    }

    public String fileExtension()
    {
        return fileExtension;
    }

    public HttpEntity<ByteArrayResource> content()
    {
        return content;
    }

    @Override
    public MultiValueMap<String, Object> toOpenSdkPost()
    {
        return new LinkedMultiValueMap<>()
        {{
            addAll("cdnNamespace", List.of(cdnNamespace()));
            addAll("fileName", List.of(fileName()));
            addAll("fileExtension", List.of(fileExtension()));
            addAll("content", List.of(content()));
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
