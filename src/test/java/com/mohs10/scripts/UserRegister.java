package com.mohs10.scripts;

import org.testng.annotations.Test;

import com.moh10.base.StartBrowser;
import com.mohs10.reuse.Home;

public class UserRegister extends StartBrowser
{
	//Registration of new user #6
		@Test
		public void RegisterPageTestCase() throws Exception 
		{
				  Home hm = new Home();
				  hm.Register("Manisha", "Koyla", "manish123411111@hotmail.com", "Test@444", "Test@444");
				  Thread.sleep(5000);
		}

}
