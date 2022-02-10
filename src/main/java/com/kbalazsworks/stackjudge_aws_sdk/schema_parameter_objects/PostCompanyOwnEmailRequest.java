package com.kbalazsworks.stackjudge_aws_sdk.schema_parameter_objects;

import javax.annotation.processing.Generated;

@Generated("OpenSDK: https://github.com/balazskrizsan/OpenSdk")
public final class PostCompanyOwnEmailRequest
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
        this.to        = to;
        this.varName   = varName;
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

    // not yet supported in generator
//    @Override
//    public boolean equals(Object obj)
//    {
//    }

    // not yet supported in generator
//    @Override
//    public int hashCode()
//    {
//    }

    // not yet supported in generator
//    @Override
//    public String toString()
//    {
//    }
}
