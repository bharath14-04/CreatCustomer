package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

import net.bytebuddy.description.method.ParameterDescription.Token.TypeList;

@Listeners(com.actitime.generic.Listenerimplementation.class)
public class CustomerModule extends BaseClass{

	@Test
	public void testCreateCustomer() throws InterruptedException {
		Reporter.log("CreateCustomer",true);
		HomePage h = new HomePage(driver);
		h.settasktab();
		TaskListPage t = new TaskListPage(driver);
		t.setaddNewBtn();
	}
	
	
}



