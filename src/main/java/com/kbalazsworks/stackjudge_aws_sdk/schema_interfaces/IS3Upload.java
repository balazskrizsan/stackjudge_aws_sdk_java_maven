package com.kbalazsworks.stackjudge_aws_sdk.schema_interfaces;

import com.kbalazsworks.stackjudge_aws_sdk.common.interfaces.IOpenSdkPostable;
import com.kbalazsworks.stackjudge_aws_sdk.schema_parameter_objects.*;

import javax.annotation.processing.Generated;

@Generated("OpenSDK: https://github.com/balazskrizsan/OpenSdk")
public interface IS3Upload
{
    default String getApiUri()
    {
        return "/s3/upload";
    }

    void execute(IOpenSdkPostable postUploadRequest);
}
