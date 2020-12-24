import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

int max = 99999

Random rand = new Random()

random_num = rand.nextInt(max + 1)

String reg_email = ('satya88in+' + random_num) + '@gmail.com'

GlobalVariable.Email_new = reg_email

WebUI.openBrowser(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.click(findTestObject('HomePage/btn_lang'))

WebUI.waitForElementClickable(findTestObject('HomePage/btn_menu'), 10)

WebUI.click(findTestObject('HomePage/btn_menu'))

println(random_num)

WebUI.waitForElementClickable(findTestObject('HomePage/btn_loginRegister'), 10)

WebUI.click(findTestObject('HomePage/btn_loginRegister'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('LoginPage/link_register'), 0)

WebUI.click(findTestObject('LoginPage/link_register'))

WebUI.click(findTestObject('SignupPage/btn_email'))

WebUI.setText(findTestObject('LoginPage/input_email'), GlobalVariable.Email_new)

WebUI.setText(findTestObject('LoginPage/input_password'), GlobalVariable.Password_new)

WebUI.scrollToPosition(42, 372)

WebUI.delay(2)

WebUI.click(findTestObject('SignupPage/btn_register'))

String success_text = 'A Confirmation email has been sent to ' + GlobalVariable.Email_new

WebUI.verifyTextPresent(success_text, false)

WebUI.closeBrowser()

