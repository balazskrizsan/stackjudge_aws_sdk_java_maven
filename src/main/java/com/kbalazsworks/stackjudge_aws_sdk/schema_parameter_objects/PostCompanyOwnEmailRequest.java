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
public final class PostCompanyOwnEmailRequest implements IOpenSdkPostable
{
    private final String to;
    private final String varName;
    private final String varOwnUrl;

    @Override
    public MultiValueMap<String, Object> toOpenSdkPost()
    {
        return new LinkedMultiValueMap<>()
        {{
            addAll("to", List.of(to));
            addAll("varName", List.of(varName));
            addAll("varOwnUrl", List.of(varOwnUrl));
        }};
    }
}
