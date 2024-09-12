package testAPI;

import org.testng.annotations.Test;

import client.Client;

public class DummyTest extends Client {

	@Test
	public void dummyTest() {
		System.out.println(albums());
		System.out.println(comments());
		System.out.println(photos());
		System.out.println(posts());
		System.out.println(todos());
		System.out.println(users());
	}
}
