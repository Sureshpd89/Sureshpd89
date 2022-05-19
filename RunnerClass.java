package org.junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

public class RunnerClass {
	
	@Test
	
	public void executeAll() {
		
		Result r = JUnitCore.runClasses(ExecutableClass.class,BrowserLaunch.class);
		System.out.println("Failure Count is:"+r.getFailureCount());
		System.out.println("Ignore Count is:"+r.getIgnoreCount());
		System.out.println("Run Count is:"+r.getRunCount());
		System.out.println("Run Time is:"+r.getRunTime());
	}
	
}
