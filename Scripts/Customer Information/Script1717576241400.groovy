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

TestData excelMelva = findTestData('Data Files/Customer Information')

for (int row = 1; row <= excelMelva.getRowNumbers(); row++) {
	if (excelMelva.getValue('input', row) == 'YES') {
		WebUI.setText(findTestObject('Object Repository/Credit Analyst Review/Customer Information/Cek Google Text Area'), excelMelva.getValue('Cek Google', row))
		WebUI.click(findTestObject('Object Repository/Credit Analyst Review/Customer Information/Survey BM-DDL/Survey BM'))
		WebUI.click(findTestObject('Object Repository/Credit Analyst Review/Customer Information/Survey BM-DDL/Survey BM ' + excelMelva.getValue(
			'Survey BM', row)))
		WebUI.setText(findTestObject('Object Repository/Credit Analyst Review/Customer Information/RCA'), excelMelva.getValue('RCA', row))
		WebUI.click(findTestObject('Object Repository/Credit Analyst Review/Customer Information/Result Slik-DDL/Result Slik'))
		WebUI.click(findTestObject('Object Repository/Credit Analyst Review/Customer Information/Result Slik-DDL/Coll ' + excelMelva.getValue(
			'Result SLIK', row)))
		WebUI.click(findTestObject('Object Repository/Credit Analyst Review/Customer Information/Kategori Cabang-DDL/Kategori Cabang'))
		WebUI.click(findTestObject('Object Repository/Credit Analyst Review/Customer Information/Kategori Cabang-DDL/Cabang ' + excelMelva.getValue(
			'Kategori Cabang', row)))
		WebUI.setText(findTestObject('Object Repository/Credit Analyst Review/Customer Information/Penjelasan'), excelMelva.getValue('Penjelasan', row))
		WebUI.click(findTestObject('Object Repository/Credit Analyst Review/Customer Information/save'))
	}
}