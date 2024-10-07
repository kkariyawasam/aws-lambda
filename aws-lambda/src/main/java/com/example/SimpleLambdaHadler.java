package com.example;


import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * This class represents a simple AWS Lambda handler that processes string input.
 * It implements the RequestHandler interface provided by AWS Lambda.
 * The handler converts the input string to lowercase and returns the result.
 */
public class SimpleLambdaHadler implements RequestHandler<String, String> {
	
    /**
     * This method handles the request from AWS Lambda.
     * It receives a string input and converts it to lowercase.
     *
     * @param input   The input string passed to the Lambda function.
     * @param context The Lambda execution context (provided by AWS Lambda).
     * @return        The input string converted to lowercase.
     */
    @Override
    public String handleRequest(String input, Context context) {
        return input.toLowerCase();
    }
}