package com.kbalazsworks.stackjudge_aws_sdk.schema_parameter_objects;

import com.kbalazsworks.stackjudge_aws_sdk.common.interfaces.IOpenSdkPostable;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import javax.annotation.processing.Generated;
import java.util.List;

@Generated("OpenSDK: https://github.com/balazskrizsan/OpenSdk")
public final class CdnServicePutResponse implements IOpenSdkPostable
{
    private final String path;
    private final String fileName;
    private final String s3eTag;
    private final String s3contentMd5;

    public CdnServicePutResponse(
        String path,
        String fileName,
        String s3eTag,
        String s3contentMd5
    )
    {
        this.path = path;
        this.fileName = fileName;
        this.s3eTag = s3eTag;
        this.s3contentMd5 = s3contentMd5;
    }

    public String path()
    {
        return path;
    }

    public String fileName()
    {
        return fileName;
    }

    public String s3eTag()
    {
        return s3eTag;
    }

    public String s3contentMd5()
    {
        return s3contentMd5;
    }

    @Override
    public MultiValueMap<String, Object> toOpenSdkPost()
    {
        return new LinkedMultiValueMap<>()
        {{
            addAll("path", List.of(path()));
            addAll("fileName", List.of(fileName()));
            addAll("s3eTag", List.of(s3eTag()));
            addAll("s3contentMd5", List.of(s3contentMd5()));
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
