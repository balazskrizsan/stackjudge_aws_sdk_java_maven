package com.kbalazsworks.stackjudge_aws_sdk_java_maven.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PostCompanyOwnEmailRequest model. */
@Fluent
public final class PostCompanyOwnEmailRequest {
    /*
     * The to property.
     */
    @JsonProperty(value = "to")
    private String to;

    /*
     * The varName property.
     */
    @JsonProperty(value = "varName")
    private String varName;

    /*
     * The varOwnUrl property.
     */
    @JsonProperty(value = "varOwnUrl")
    private String varOwnUrl;

    /**
     * Get the to property: The to property.
     *
     * @return the to value.
     */
    public String getTo() {
        return this.to;
    }

    /**
     * Set the to property: The to property.
     *
     * @param to the to value to set.
     * @return the PostCompanyOwnEmailRequest object itself.
     */
    public PostCompanyOwnEmailRequest setTo(String to) {
        this.to = to;
        return this;
    }

    /**
     * Get the varName property: The varName property.
     *
     * @return the varName value.
     */
    public String getVarName() {
        return this.varName;
    }

    /**
     * Set the varName property: The varName property.
     *
     * @param varName the varName value to set.
     * @return the PostCompanyOwnEmailRequest object itself.
     */
    public PostCompanyOwnEmailRequest setVarName(String varName) {
        this.varName = varName;
        return this;
    }

    /**
     * Get the varOwnUrl property: The varOwnUrl property.
     *
     * @return the varOwnUrl value.
     */
    public String getVarOwnUrl() {
        return this.varOwnUrl;
    }

    /**
     * Set the varOwnUrl property: The varOwnUrl property.
     *
     * @param varOwnUrl the varOwnUrl value to set.
     * @return the PostCompanyOwnEmailRequest object itself.
     */
    public PostCompanyOwnEmailRequest setVarOwnUrl(String varOwnUrl) {
        this.varOwnUrl = varOwnUrl;
        return this;
    }
}
