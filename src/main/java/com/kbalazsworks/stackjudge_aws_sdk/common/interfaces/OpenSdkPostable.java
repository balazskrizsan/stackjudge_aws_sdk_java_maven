package com.kbalazsworks.stackjudge_aws_sdk.common.interfaces;

import org.springframework.util.MultiValueMap;

public interface OpenSdkPostable
{
    MultiValueMap<String, Object> toOpenSdkPost();
}
