package com.kbalazsworks.stackjudge_aws_sdk.schema_parameter_objects;

import com.kbalazsworks.stackjudge_aws_sdk.common.interfaces.IOpenSdkPostable;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import javax.annotation.processing.Generated;
import java.util.List;

@Generated("OpenSDK: https://github.com/balazskrizsan/OpenSdk")
public final class PostCompanyOwnEmailRequest implements IOpenSdkPostable
{
    private final String to;
    private final String varName;
    private final String varOwnUrl;

    public PostCompanyOwnEmailRequest(
        String to,
        String varName,
        String varOwnUrl
    )
    {
        this.to = to;
        this.varName = varName;
        this.varOwnUrl = varOwnUrl;
    }

    public String to()
    {
        return to;
    }

    public String varName()
    {
        return varName;
    }

    public String varOwnUrl()
    {
        return varOwnUrl;
    }

    @Override
    public MultiValueMap<String, Object> toOpenSdkPost()
    {
        return new LinkedMultiValueMap<>()
        {{
            addAll("to", List.of(to()));
            addAll("varName", List.of(varName()));
            addAll("varOwnUrl", List.of(varOwnUrl()));
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
