package org.junit;

import java.io.IOException;

import org.base.BaseClass;
import org.pojo.LoginPojo;

public class BrowserLaunch extends BaseClass {
	@Test

	public void tc2() throws IOException {

		launchBrowser();
		loadUrl("https://www.facebook.com/");
		maxBrowser();

		LoginPojo l = new LoginPojo();

		fill(l.getTxtEmail(), "Greens");
		
		fill(l.getTxtpass(), "greens123");
		btnClick(l.getBtnLogin());
		toQuit();

	}

	
	@Test

	public void tc1() throws IOException {

		launchBrowser();
		loadUrl("https://www.facebook.com/");
		maxBrowser();

		LoginPojo l = new LoginPojo();

		fill(l.getTxtEmail(), "JAVA");
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
		fill(l.getTxtpass(), "SELENIUM123");
		btnClick(l.getBtnLogin());
		toQuit();

	}

}
