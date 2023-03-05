package com.psja.factory.client;

import static java.lang.System.out;

public class FactoryClient {

	public static void client() {
		FactoryServer factoryServer = new FactoryServer();
		OS obj = factoryServer.getInstanceOfOperatingSystem("WINDOWS");
		obj.specification();
	}
	
}
