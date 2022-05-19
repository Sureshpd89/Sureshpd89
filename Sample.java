package org.junit;

import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.pojo.LoginPojo;

public class Sample extends BaseClass {

	@Test

	public void tc2() throws IOException {

		launchBrowser();
		loadUrl("https://www.facebook.com/");
		maxBrowser();

		LoginPojo l = new LoginPojo();

		fill(l.getTxtEmail(), "Greens");
		String getAttribute = toGetAttribute(l.getTxtEmail());
		System.out.println(getAttribute);
		Assert.assertTrue("To Check the Email Field",getAttribute.equals("Greens"));
		
		fill(l.getTxtpass(), "greens123");
		String getAttribute2 = toGetAttribute(l.getTxtpass());
		System.out.println(getAttribute2);
		Assert.assertTrue("To CHECK THE PASSWORD FIELD",getAttribute2.equals("greens123"));
		btnClick(l.getBtnLogin());
		toQuit();

	}

	@Ignore
	@Test

	public void tc1() throws IOException {

		launchBrowser();
		loadUrl("https://www.facebook.com/");
		maxBrowser();

		LoginPojo l = new LoginPojo();

		fill(l.getTxtEmail(), "JAVA");
		String getAttribute = toGetAttribute(l.getTxtEmail());
		System.out.println(getAttribute);
		fill(l.getTxtpass(), "JAVA123");
		btnClick(l.getBtnLogin());
		toQuit();

	}

	@Test

	public void tc3() throws IOException {

		launchBrowser();
		loadUrl("https://www.facebook.com/");
		maxBrowser();

		LoginPojo l = new LoginPojo();

		fill(l.getTxtEmail(), "SELENIUM");
		String getAttribute = toGetAttribute(l.getTxtEmail());
		System.out.println(getAttribute);
		fill(l.getTxtpass(), "SELENIUM123");
		btnClick(l.getBtnLogin());
		toQuit();

	}

}
