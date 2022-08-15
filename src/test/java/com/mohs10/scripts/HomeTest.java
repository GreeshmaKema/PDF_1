package com.mohs10.scripts;

import org.testng.annotations.Test;

import com.moh10.base.StartBrowser;
import com.mohs10.reuse.Home;

	public class HomeTest extends StartBrowser{
	
	//Clicking on Categories links #4
	/*@Test
	public void CategoriesTest() throws Exception {
		Home cat = new Home();
	    cat.Categories();
		Thread.sleep(5000);
	}
	
	//Clicking on news link #5
	@Test
	public void NewsbtnTestCase() throws Exception {
		Home News = new Home();
	    News.Pagedown();
	    Thread.sleep(2000);
	    News.Newsbtn();
		Thread.sleep(5000);
	}
	//blog Link #1
	@Test
	public void BlogbtnTestCase() throws Exception {
		Home blog = new Home();
	    blog.Pagedown();
	    Thread.sleep(2000);
	    blog.Blogbtn();
		Thread.sleep(5000);
	}
		  }
	
	//Testing with invalid inputs #2
	@Test
	public void InvalidLogInTestCase() throws Exception {
			  Home hm1 = new Home();
			  hm1.invalidLogIn("Invalidlogininputs@gmail.com", "Test@1114");
			  Thread.sleep(5000);
	
}*/
	//Testing with Valid inputs #3
	@Test
		  public void LoginPageTestCase() throws Exception {
			  Home hm2 = new Home();
			  hm2.logIn("anishapatel44@gmail.com", "anishapatel123");
			  Thread.sleep(5000);
		  }
		}
