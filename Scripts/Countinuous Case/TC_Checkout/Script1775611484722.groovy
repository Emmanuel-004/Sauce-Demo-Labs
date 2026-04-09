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

WebUI.verifyElementVisible(findTestObject('Cart Item/cart-item-1'))

WebUI.verifyElementVisible(findTestObject('Cart/btn-checkout'))

WebUI.click(findTestObject('Cart/btn-checkout'))

WebUI.verifyElementPresent(findTestObject('Checkout/info-checkout'), 10)

WebUI.setText(findTestObject('Checkout/field-firstname'), 'John')

WebUI.setText(findTestObject('Checkout/field-lastname'), 'Doe')

WebUI.setText(findTestObject('Checkout/field-postalcode'), '13460')

WebUI.verifyElementVisible(findTestObject('Checkout/btn-continue'))

WebUI.click(findTestObject('Checkout/btn-continue'))

WebUI.verifyElementVisible(findTestObject('Checkout/item-checkout'))

WebUI.verifyElementVisible(findTestObject('Checkout/btn-finish'))

WebUI.click(findTestObject('Checkout/btn-finish'))

WebUI.verifyElementPresent(findTestObject('Checkout/btn-home'), 10)

WebUI.click(findTestObject('Checkout/btn-home'))

WebUI.verifyElementNotPresent(findTestObject('Cart/cart-badge'), 0)

