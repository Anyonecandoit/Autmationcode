package com.tmb.tests;

import java.util.Map;

import org.assertj.core.api.Assertions;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.tmb.annotations.FrameworkAnnotation;
import com.tmb.enums.CategoryType;
import com.tmb.pages.OrangeHRMLoginPage;

/**
 * Contains the tests related to Orange HRM page. For more details,
 * 
 * <pre>
 * <b>
 * <a href=
"https://www.youtube.com/channel/UC6PTXUHb6j4Oxf0ccdRI11A">Testing Mini Bytes Youtube channel</a>
 * </b>
 * </pre>
 * 
 * Jan 22, 2021
 * 
 * @author Amuthan Sakthivel
 * @version 1.0
 * @since 1.0
 */
public final class OrangeHRMTests extends BaseTest {

	/**
	 * Private constructor to avoid external instantiation
	 */
	private OrangeHRMTests() {
	}

	/**
	 * Test Name mentioned here should match the column name "testname" in excel
	 * sheet.This is mandatory to run this test. Otherwise it will be ignored. The
	 * match has to be there in both of the RUNMANAGER and TESTDATA sheet Set the
	 * authors who have the created the test which will be logged to the reports Set
	 * the category which this particular test case belongs to
	 * 
	 * @author Amuthan Sakthivel Jan 22, 2021
	 * @param data HashMap containing all the values of test data needed to run the
	 *             tests
	 */
	//EPIC
	//PRODUCT OWNER 
	// BA : BUSINESS ANALYST 
	//Userstory :   NEW LOGIN PAGE  STORY POINT : FRONT , BACK , TESTER MANUAL & AUTOMATION 
	// ACCEPTANCE CRITERIA :
	// ???


	//Testscenario : login to orange hrm application
	//Test cases : Test case id : 001 : title : To verify login to orange hrm application by the user .  LABEL : HRM_SANITY , HRM_SMOKE , HRM_REGRESSION , HRM_E2E  ,HRM_AUTOMATION.
	//Test steps : Step1 : Actual : load the url of orange hrm  Expected Result : User should be able to load the url  , step 2 :Actual : In username text box give the username Expected : User should be enter the user name  , step 3: ACTUAL : in password test feild give the password Expected Result: User should be able to enter password , step 4
	//Actual : Now click on login button Expected : User should be login to application sucesfully
	// TC1 .........TC100 - CATEGORISATION WILL BE DONE BY USING LABEL , THEN WE WILL RECALL THOSE TC IDS & WE WILL WORK ON AUTOMATION .



	// DEVELOPMENT : DEV WILL DEVELOP     USER NAME , PASSWORD FEATURE & DEPLOYED --- BUILD NO 1 : RELEASE TO DEV , UNIT TESTING -> QA SAME BUILD RELEASE 
	// BUILD NO 2 : LOGIN  BUTTON - DEPLOYED TO DEV & QA ---  QA GIVEN SIGN OFF FOR THE BUILD 2 .
	// BUILD NO 3 : FORGOT YOUR PASSWORD  - DEPLOYED TO DEV & QA -> WHEN QA TESTING THE FEATURE  ,,, THIS POINT OF TIME YOU SAW LOGIN BUTTON IS MISSING , AND BUILD 3 FEATURE "FORGOT YOUR PASSWORD " IS AVAILABLE . -> QA DIDNT GIVEN SIGN OFF , REPORTED A BUG .  & ASSIGN THE BUG TO RESPECTED DEVELOPERS( YOU WILL CHECK WITH YOUR LEAD , YOU WILL CONFIRM THE ISSUE WITH ONE DEVELOPER , THEN YOU WILL CONFIRM THE ISSUE  COMES UNDER BACK END OR FRONT END ) -> YOU WILL ASSIGN THE BUG TO THAT DEVELOPER NAME . 
	//SANITY TESTING  --- WHENEVER WE GOT NEW BUILD , WE WILL TEST THE HIGH LEVEL FUNCTIONALITIES OR MODULES WHICH EVER IS BREAKING THE SYSTEM
	//SMOKE TESTING   --  
	//REGRESSION TESTING 
	//END TO END TESTING 


	//CHANGE REQUEST :  STORY POINTS (FRONT END , BACK END & TESTER )  , FIBONACCI SERIES   1, 3 , 5 , 7, 8 , 9 , 11, 13 


	//SPRINT : 14 DAYS - 2 WEEKS  , 4 SAT SUN HOLIDAY . 4 USER STORIES - DELIVER  - AGILE 


	/**
	 *   MANUAL TESTING : MANUAL EFFORT  ---   BUILD NO 1 ,2 ,3 .......20 ....100....N , ALTERNATE TASK . 
	 *   AUTOMATION TESTING : TO AVOID MANUAL WORK . BUILD 1 ,2,  ....20 ...100  , BUILD RUN , ALTERNATE TASK.
	 * 
	 * 
	 * 
	 * 
	 * @param data
	 */

	@Test
	@FrameworkAnnotation(author = { "kranthi", "kumar" }, category = { CategoryType.REGRESSION })
	public void loginLogoutTest(Map<String, String> data) {

	
		
		
		String title = new OrangeHRMLoginPage().
				.enterUserName(data.get("username"))
				.enterPassWord(data.get("password"))
				.clickLogin()
				.clickWelcome()
				.clickLogout()
				.getTitle();
		
		
		Assertions.assertThat(title).isEqualTo("OrangeHRM123");

		
	


	}

	@Test
	public void newTest(Map<String, String> data) {
		String title = new OrangeHRMLoginPage().enterUserName(data.get("username")).enterPassWord(data.get("password"))
				.clickLogin().clickWelcome().clickLogout().getTitle();
		throw new SkipException("skip");
		/*
		 * Assertions.assertThat(title) .isEqualTo("OrangeHRM");
		 */

	}

}
