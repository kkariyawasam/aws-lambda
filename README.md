# aws-lambda

# SimpleLambdaHandler

This project demonstrates a simple AWS Lambda function written in Java that converts an input string to lowercase. The function implements the `RequestHandler` interface provided by AWS Lambda and processes incoming string requests.

## Project Structure

- **`SimpleLambdaHandler.java`**: The main Lambda handler that processes the input and converts it to lowercase.

## Requirements

- Java 8 or higher
- AWS Lambda
- AWS SDK for Java (for local development and testing)

## How to Use

1. **Set Up AWS Lambda**:
   - Create an AWS Lambda function in the AWS Management Console.
   - Set the runtime to Java 8 or higher.
   - Upload the compiled JAR file containing this Lambda function.

2. **Lambda Handler**:
   - The fully qualified class name for the handler is:  
     `com.example.SimpleLambdaHandler::handleRequest`.

3. **Functionality**:
   - This Lambda function takes a string input, converts it to lowercase, and returns the result.
   
## Example

### Input:

```json
"HELLO WORLD"
