package com.kbalazsworks.stackjudge_aws_sdk.schema_interfaces;

import com.kbalazsworks.stackjudge_aws_sdk.common.interfaces.IOpenSdkPostable;

import javax.annotation.processing.Generated;

@Generated("OpenSDK: https://github.com/balazskrizsan/OpenSdk")
public interface ISesSendCompanyownemail
{
    default String getApiUri()
    {
        return "/ses/send/company-own-email";
    }

    void execute(IOpenSdkPostable postCompanyOwnEmailRequest);
}
