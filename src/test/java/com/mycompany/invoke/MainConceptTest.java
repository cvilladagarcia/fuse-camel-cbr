package com.mycompany.invoke;

import org.apache.camel.main.Main;

public class MainConceptTest {

	public static void main(String... args) throws Exception {
		Main main = new Main();
		main.addRouteBuilder(new TestInvokeServices());
		main.run(args);
	}
}
