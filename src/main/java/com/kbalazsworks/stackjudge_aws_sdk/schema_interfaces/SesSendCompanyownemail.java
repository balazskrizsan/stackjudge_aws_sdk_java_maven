package com.kbalazsworks.stackjudge_aws_sdk.schema_interfaces;

import com.kbalazsworks.stackjudge_aws_sdk.schema_parameter_objects.PostCompanyOwnEmailRequest;

import javax.annotation.processing.Generated;

@Generated("OpenSDK: https://github.com/balazskrizsan/OpenSdk")
public interface SesSendCompanyownemail
{
    default String getApiUri()
    {
        return "/ses/send/company-own-email";
    }

    void execute(PostCompanyOwnEmailRequest postCompanyOwnEmailRequest);
}
