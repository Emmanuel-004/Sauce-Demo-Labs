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

WebUI.openBrowser(GlobalVariable.Url)

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('Login/btn-login'), 10)

WebUI.setText(findTestObject('Login/field-username'), 'standard_user')

WebUI.setEncryptedText(findTestObject('Login/field-password'), 'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Login/btn-login'))

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('Product/product_backpack'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Product/product_light'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Cart/btn-add-backpack'))

WebUI.click(findTestObject('Cart/btn-add-light'))

WebUI.takeScreenshot()

itemCount = WebUI.getText(findTestObject('Cart/cart-badge'))

WebUI.verifyMatch(itemCount, '2', false)

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('Cart_Item/cart-item-1'))

WebUI.verifyElementVisible(findTestObject('Cart/btn-checkout'))

WebUI.click(findTestObject('Cart/btn-checkout'))

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('Checkout/info-checkout'), 10)

WebUI.setText(findTestObject('Checkout/field-firstname'), 'John')

WebUI.setText(findTestObject('Checkout/field-lastname'), 'Doe')

WebUI.setText(findTestObject('Checkout/field-postalcode'), '13460')

WebUI.verifyElementVisible(findTestObject('Checkout/btn-continue'))

WebUI.click(findTestObject('Checkout/btn-continue'))

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('Checkout/item-checkout'))

WebUI.verifyElementVisible(findTestObject('Checkout/btn-finish'))

WebUI.click(findTestObject('Checkout/btn-finish'))

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('Checkout/btn-home'), 10)

WebUI.click(findTestObject('Checkout/btn-home'))

WebUI.takeScreenshot()

WebUI.verifyElementNotPresent(findTestObject('Cart/cart-badge'), 0)

