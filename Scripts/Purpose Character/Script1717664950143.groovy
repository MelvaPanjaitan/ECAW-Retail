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

TestData excelMelva = findTestData('Data Files/Purpose Character')

WebUI.click(findTestObject('Object Repository/Credit Analyst Review/Purpose Character/a_Purpose Caracter'))

for (int row = 1; row <= excelMelva.getRowNumbers(); row++) {
	if (excelMelva.getValue('input', row) == 'YES') {
		WebUI.setText(findTestObject('Object Repository/Credit Analyst Review/Purpose Character/Penjelasan dari Purpose'), excelMelva.getValue('Penjelasan', row))
		WebUI.click(findTestObject('Object Repository/Credit Analyst Review/Purpose Character/Kategori Debitur/Kategori Debitur - DDL'))
		WebUI.click(findTestObject('Object Repository/Credit Analyst Review/Purpose Character/Kategori Debitur/Kategori ' + excelMelva.getValue(
			'Penjelasan kategori', row)))
		WebUI.click(findTestObject('Object Repository/Credit Analyst Review/Customer Information/save'))
	}
}