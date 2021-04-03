/**
 * 
 */
package com.mycompany.invoke;

import org.apache.camel.builder.RouteBuilder;

/**
 * @author Crist
 *
 */
public class TestInvokeServices extends RouteBuilder {
	
	@Override
	public void configure() throws Exception {

		from("timer:simple?period=5000")
		.to("direct:getOperator")
		.end();
		
		from("direct:getOperator")
		.to("https://u9b7la614a.execute-api.us-east-1.amazonaws.com/TestEnv/getoperator?id=" + 1)
		.log("Response getOperator: ${body}");
	}

}
