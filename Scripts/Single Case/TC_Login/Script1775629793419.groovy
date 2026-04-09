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

WebUI.verifyElementPresent(findTestObject('Login/btn-Login'), 10)

WebUI.setText(findTestObject('Login/field-Username'), GlobalVariable.username)

WebUI.setEncryptedText(findTestObject('Login/field-Password'), 'qcu24s4901FyWDTwXGr6XA==')

startTime = System.currentTimeMillis()

WebUI.click(findTestObject('Login/btn-Login'))

duration = System.currentTimeMillis() - startTime

if (duration > 5000) {
	WebUI.comment('FAILED: Login button delay terlalu lama: ' + duration + ' ms')
	assert false : "Login button delay melebihi 5 detik: ${duration} ms"
} else {
	WebUI.comment('PASSED: Login button delay dalam batas normal: ' + duration + ' ms')
}

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('Product/product_backpack'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Product/product_light'), FailureHandling.STOP_ON_FAILURE)

