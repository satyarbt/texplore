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

WebUI.openBrowser(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.click(findTestObject('HomePage/btn_lang'))

WebUI.click(findTestObject('HomePage/btn_menu'))

WebUI.waitForElementClickable(findTestObject('HomePage/btn_loginRegister'), 10)

WebUI.click(findTestObject('HomePage/btn_loginRegister'))

WebUI.setText(findTestObject('LoginPage/input_email'), GlobalVariable.email)

WebUI.setText(findTestObject('LoginPage/input_password'), GlobalVariable.password)

WebUI.click(findTestObject('LoginPage/btn_continue'))

WebUI.waitForElementClickable(findTestObject('HomePage/btn_menu'), 10)

WebUI.click(findTestObject('HomePage/btn_menu'))

WebUI.verifyTextPresent(GlobalVariable.email, false)

WebUI.closeBrowser()

