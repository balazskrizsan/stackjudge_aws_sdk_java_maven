package com.kbalazsworks.stackjudge_aws_sdk.common.exceptions;

class ResponseException extends Exception
{
    public ResponseException()
    {
    }

    public ResponseException(String message)
    {
        super(message);
    }
}
