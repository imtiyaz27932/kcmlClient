import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
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

Windows.delay(3)

Windows.click(findWindowsObject('CRM_Manager_View/new_contract'))

Windows.switchToWindowTitle('Select Contract Type')

Windows.click(findWindowsObject('CRM_Manager_View/btn_extended_waranty'))

Windows.delay(1)

Windows.click(findWindowsObject('CRM_Manager_View/btn_ok'))

Windows.switchToWindowTitle('Vehicle contract')

Windows.setText(findWindowsObject('New_Contract/txt_description'), 'Extended Test Waranty')

Windows.click(findWindowsObject('New_Contract/txt_contract_reference'))

Windows.setText(findWindowsObject('New_Contract/txt_contract_reference'), 'Test Contract Reference')

Windows.click(findWindowsObject('Object Repository/New_Contract/dates_tab'))

Windows.click(findWindowsObject('New_Contract/date_dropDown'))

Windows.delay(2)

Windows.sendKeys(findWindowsObject('New_Contract/date_dropDown'), Keys.chord(Keys.ARROW_UP))

Windows.sendKeys(findWindowsObject('New_Contract/date_dropDown'), Keys.chord(Keys.ENTER))

Windows.delay(1)

Windows.click(findWindowsObject('Object Repository/New_Contract/Start_Date field'))

Windows.doubleClick(findWindowsObject('Object Repository/New_Contract/doubleClk_dateNumber'))

//Windows.click(findWindowsObject('Object Repository/New_Contract/End_Date field'))
Windows.delay(3)
Windows.click(findWindowsObject('Object Repository/New_Contract/Conditions_Tab'))

Windows.delay(2)
Windows.click(findWindowsObject('Object Repository/New Folder/Edit(9)'))
Windows.setText(findWindowsObject('Object Repository/New Folder/Edit(9)'), '5000')

Windows.click(findWindowsObject('Object Repository/New_Contract/Internal_Tab'))

Windows.delay(1)

Windows.click(findWindowsObject('Object Repository/New Folder/Edit(10)'))

Windows.setText(findWindowsObject('Object Repository/New Folder/Edit(10)'), 'https://www.gogomotor.com')

Windows.click(findWindowsObject('Object Repository/New_Contract/External_Tab'))

Windows.delay(1)

Windows.click(findWindowsObject('Object Repository/New Folder/Edit(11)'))

Windows.setText(findWindowsObject('Object Repository/New Folder/Edit(11)'), 'https://www.gogomotor.com')

Windows.click(findWindowsObject('CRM_Manager_View/btn_ok'))

Windows.switchToWindowTitle('Vehicle Display')

contractText = Windows.getText(findWindowsObject('New_Contract/validate_contract_text'))

Windows.verifyMatch(contractText, 'Extended Test Waranty', false)

