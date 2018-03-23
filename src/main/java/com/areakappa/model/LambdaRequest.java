package com.areakappa.model;

import java.util.Map;

/*
{
"body-json" : {},
"params" : {
"path" : {
    }
    ,"querystring" : {
        "myquerystring" : "222"
        ,        "input" : "111"
            }
    ,"header" : {
        "input_header" : "333"
            }
    },
"stage-variables" : {
},
"context" : {
    "account-id" : "566851567501",
    "api-id" : "o1voetkqb3",
    "api-key" : "test-invoke-api-key",
    "authorizer-principal-id" : "",
    "caller" : "566851567501",
    "cognito-authentication-provider" : "",
    "cognito-authentication-type" : "",
    "cognito-identity-id" : "",
    "cognito-identity-pool-id" : "",
    "http-method" : "GET",
    "stage" : "test-invoke-stage",
    "source-ip" : "test-invoke-source-ip",
    "user" : "566851567501",
    "user-agent" : "aws-internal/3",
    "user-arn" : "arn:aws:iam::566851567501:root",
    "request-id" : "test-invoke-request",
    "resource-id" : "jre0fl",
    "resource-path" : "/ivanogetusers"
    }
}
 */

public class LambdaRequest {

    private LambdaParams params;
    private Object bodyJson;

    public LambdaParams getParams() {
        return params;
    }

    public void setParams(LambdaParams params) {
        this.params = params;
    }

    public Object getBodyJson() {
        return bodyJson;
    }

    public void setBodyJson(Object bodyJson) {
        this.bodyJson = bodyJson;
    }
}