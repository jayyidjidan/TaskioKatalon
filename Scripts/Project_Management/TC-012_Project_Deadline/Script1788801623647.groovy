import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.llm.keyword.LlmKeywords as LLM
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

WebUI.openBrowser(null)

WebUI.navigateToUrl('http://127.0.0.1:8000/login')




WebUI.click(findTestObject('Page_Laravel/summary_Project Management'))

WebUI.click(findTestObject('Page_Laravel/a_Projects (1)'))

WebUI.click(findTestObject('Page_Laravel/button_Add Project (1)'))

WebUI.setText(findTestObject('Page_Laravel/input_Project Name'), 'TestProject')

WebUI.setText(findTestObject('Page_Laravel/input_Deadline'), '2026-09-01')

WebUI.selectOptionByValue(findTestObject('Page_Laravel/select_Project Status'), '3', false)

WebUI.selectOptionByValue(findTestObject('Page_Laravel/select_Project Status'), '1', false)

WebUI.selectOptionByValue(findTestObject('Page_Laravel/select_Project Type'), '5', false)

WebUI.click(findTestObject('Page_Laravel/input_nama_klien'))

WebUI.selectOptionByValue(findTestObject('Page_Laravel/select_client_select'), 'Gibran', false)

WebUI.setText(findTestObject('Page_Laravel/input_Total Payment'), '100000000')

WebUI.click(findTestObject('Page_Laravel/label_Web Design'))

WebUI.click(findTestObject('Page_Laravel/input_Ilustration'))

WebUI.click(findTestObject('Page_Laravel/input_WebApp'))

WebUI.click(findTestObject('Page_Laravel/input_Framer'))

WebUI.click(findTestObject('Page_Laravel/button_Save (3)'))

WebUI.assertElementText(findTestObject(null), 'Deadline Over, Select Other Deadline', 0)

