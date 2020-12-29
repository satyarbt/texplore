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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('http://live.demoguru99.com/index.php/')

WebUI.maximizeWindow()

WebUI.sendKeys(findTestObject('Flipkart/item_mobile'), Keys.chord(Keys.ENTER))

WebUI.waitForElementClickable(findTestObject('Flipkart/item_mobile_firstproduct'), 5)

WebUI.sendKeys(findTestObject('Flipkart/item_mobile_firstproduct'), Keys.chord(Keys.ENTER))

WebUI.waitForElementClickable(findTestObject('Flipkart/btn_addtocart'), 5)

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Flipkart/btn_addtocart'), Keys.chord(Keys.ENTER))

WebUI.selectOptionByValue(findTestObject('Flipkart/list_state'), '1', false)

WebUI.setText(findTestObject('Flipkart/input_postcode'), '10001')

WebUI.sendKeys(findTestObject('Flipkart/btn_proceedtocheckout'), Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('Flipkart/btn_guestregister'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Flipkart/input_firstname'), 'Satya')

WebUI.setText(findTestObject('Flipkart/input_lastname'), 'Ranimekala')

WebUI.setText(findTestObject('Flipkart/input_email'), 'satyarbt@gmail.com')

WebUI.setText(findTestObject('Flipkart/input_city'), 'Washington')

WebUI.setText(findTestObject('Flipkart/input_street1'), '4th avenue, washington dc')

WebUI.selectOptionByValue(findTestObject('Flipkart/list_states'), '1', false)

WebUI.setText(findTestObject('Flipkart/input_billing_postcode'), '10001')

WebUI.setText(findTestObject('Flipkart/input_billing_telephone'), '9966166066')

WebUI.scrollToElement(findTestObject('Flipkart/btn_billing_continue'), 2)

WebUI.sendKeys(findTestObject('Flipkart/btn_billing_continue'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Flipkart/btn_shipmethod_continue'), Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('Flipkart/btn_paymentmode_check'), Keys.chord(Keys.SPACE))

WebUI.sendKeys(findTestObject('Flipkart/btn_payment_confirm'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Flipkart/btn_placeorder'), 3)

WebUI.sendKeys(findTestObject('Flipkart/btn_placeorder'), Keys.chord(Keys.ENTER))

