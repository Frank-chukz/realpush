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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://github.com/Frank-chukz/LearningKatalon')

WebUI.click(findTestObject('Object Repository/Artsplit/Page_ARTSPLIT/button_Sign up'))

WebUI.click(findTestObject('Object Repository/Artsplit/Page_ARTSPLIT/span_Log In'))

WebUI.setText(findTestObject('Object Repository/Artsplit/Page_ARTSPLIT/input_Welcome Back_register_email'), 'franky67@givmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Artsplit/Page_ARTSPLIT/input_Enter your email or phone number_regi_25c82e'), 
    'TqMLrzn8uxI8RIpxLtjiDA==')

WebUI.setText(findTestObject('Object Repository/Artsplit/Page_ARTSPLIT/input_Welcome Back_register_email'), 'uam1@givmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Artsplit/Page_ARTSPLIT/input_Enter your email or phone number_regi_25c82e'), 
    'TqMLrzn8uxI8RIpxLtjiDA==')

WebUI.click(findTestObject('Object Repository/Artsplit/Page_ARTSPLIT/button_Log in'))

WebUI.click(findTestObject('Object Repository/Artsplit/Page_ARTSPLIT/div_Umanyi Uma'))

WebUI.closeBrowser()

