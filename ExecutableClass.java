package org.junit;

import java.io.IOException;

import org.base.BaseClass;
import org.pojo.LoginPojo;

public class ExecutableClass extends BaseClass {
	@Test

	public void tc6() throws IOException {

		launchBrowser();
		loadUrl("https://www.facebook.com/");
		maxBrowser();

		LoginPojo l = new LoginPojo();
		fill(l.getTxtEmail(), "suresh@gmail.com");
		fill(l.getTxtpass(), "greens123");
		btnClick(l.getBtnLogin());
		toQuit();

	}

	@Ignore
	@Test

	public void tc4() throws IOException {

		launchBrowser();
		loadUrl("https://www.facebook.com/");
		maxBrowser();

		LoginPojo l = new LoginPojo();

		fill(l.getTxtEmail(), "pranav@gmail.com");
		fill(l.getTxtpass(), "pranav123");
		btnClick(l.getBtnLogin());
		toQuit();

	}

	@Test

	public void tc5() throws IOException {

		launchBrowser();
		loadUrl("https://www.facebook.com/");
		maxBrowser();

		LoginPojo l = new LoginPojo();

		fill(l.getTxtEmail(), "revathy@gmail.com");
		fill(l.getTxtpass(), "revathy123");
		btnClick(l.getBtnLogin());
		toQuit();

	}


}
