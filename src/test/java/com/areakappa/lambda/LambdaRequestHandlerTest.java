package com.areakappa.lambda;

import com.areakappa.model.LambdaParams;
import com.areakappa.model.LambdaRequest;
import com.areakappa.model.QueryString;
import org.junit.Test;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

public class LambdaRequestHandlerTest {

    @Test
    public void testHandleRequest() {
        // given
        LambdaRequest lr = new LambdaRequest();
        QueryString querystring = new QueryString();
        LambdaParams lambdaParams = new LambdaParams();

        lr.setParams(lambdaParams);
        lr.getParams().setQuerystring(querystring);
        querystring.setInput("test");

        //when
        LambdaRequestHandler lrh = new LambdaRequestHandler();
        String result = lrh.handleRequest(lr, null);

        //then
        assert result.equals("{\"params\":{\"path\":null,\"querystring\":{\"myquerystring\":null,\"input\":\"test\"},\"header\":null},\"bodyJson\":null}");
    }
}
