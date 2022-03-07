package com.revature.demo;

import com.revature.demo.controller.HandlerController;

import io.javalin.Javalin;

public class HelloJavalin {
		public static void main(String[] args) {
			Javalin app = Javalin.create().start();
			
			app.get("/", ctx->{ctx.result("Hello World");});
			
			app.get("/hi", ctx->{ctx.result("Hello Worlds!!!!!");});
			
			app.get("/hi/{name}", ctx->{ctx.result("Hello Worlds!!!!! " + ctx.pathParam("name"));});
			
			app.get("/square/{num}", ctx->{int n = Integer.parseInt(ctx.pathParam("num"));
					 int res=n*n;
					ctx.result("Squared " + res);});

			app.get("/hi/{fname}/{lname}", ctx->{ctx.result("Hello Worlds!!!!! " + ctx.pathParam("fname") + ctx.pathParam("lname"));});

			app.get("/add/{n1}/{n2}", HandlerController.addNums);

		}
}
