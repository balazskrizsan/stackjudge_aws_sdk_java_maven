package com.kbalazsworks.stackjudge_aws_sdk.common.interfaces;

import org.springframework.util.MultiValueMap;

public interface IOpenSdkPostable
{
    MultiValueMap<String, Object> toOpenSdkPost();
}
