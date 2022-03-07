package com.revature.demo.controller;

import io.javalin.http.Handler;

public class HandlerController {
	
	public static Handler addNums = ctx->{
		int num1 = Integer.parseInt(ctx.pathParam("n1"));
		int num2 = Integer.parseInt(ctx.pathParam("n2"));
		int result = num1 + num2;
		ctx.result("Sum of " + num1 + "+" + num2 + "=" + result);
		
	};

}
