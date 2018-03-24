package com.areakappa.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
import com.areakappa.model.LambdaRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class LambdaRequestHandler implements RequestHandler<LambdaRequest, String> {

    @Override
    public String handleRequest(LambdaRequest request, Context context) {
        /*StringWriter sw = new StringWriter();
        JAXB.marshal(request, sw);
        String xmlString = sw.toString();
        return xmlString;
        return "From LambdaRequest: " + request.getParams().getQuerystring().getMyquerystring();*/

        ObjectMapper om = new ObjectMapper();
        om.writer().withDefaultPrettyPrinter().forType(LambdaRequest.class);

        String result = "";

        try {
            result = om.writeValueAsString(request);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return result;
    }

    /*@Override
    public void handleRequest(InputStream input, OutputStream output, Context context) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(input);

        System.out.println(jsonNode.get("params").get("querystring").get("myquerystring").toString());
        output.write(jsonNode.get("params").get("querystring").get("myquerystring").toString().getBytes());
    }*/
}
