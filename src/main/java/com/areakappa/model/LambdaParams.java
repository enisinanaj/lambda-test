package com.areakappa.model;

public class LambdaParams {

    private LambdaPath path;
    private QueryString querystring;
    private LambdaHeader header;

    public LambdaPath getPath() {
        return path;
    }

    public void setPath(LambdaPath path) {
        this.path = path;
    }

    public QueryString getQuerystring() {
        return querystring;
    }

    public void setQuerystring(QueryString querystring) {
        this.querystring = querystring;
    }

    public LambdaHeader getHeader() {
        return header;
    }

    public void setHeader(LambdaHeader header) {
        this.header = header;
    }
}
