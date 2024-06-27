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

TestData excelMelva = findTestData('Data Files/Capital Collateral')

WebUI.click(findTestObject('Object Repository/Credit Analyst Review/Capital Collateral/a_Capital Collateral'))

for (int row = 1; row <= excelMelva.getRowNumbers(); row++) {
	if (excelMelva.getValue('input', row) == 'YES') {
		WebUI.click(findTestObject('Object Repository/Credit Analyst Review/Capital Collateral/Status Rumah/Kepemilikan Rumah-DDL'))
		WebUI.click(findTestObject('Object Repository/Credit Analyst Review/Capital Collateral/Status Rumah/Rumah ' + excelMelva.getValue(
			'status rumah', row)))
		WebUI.setText(findTestObject('Object Repository/Credit Analyst Review/Capital Collateral/Penjelasan Kepemilikan Rumah'), excelMelva.getValue('penjelasan rumah', row))
		WebUI.setText(findTestObject('Object Repository/Credit Analyst Review/Capital Collateral/input_CCR'), excelMelva.getValue('ccr', row))
		WebUI.click(findTestObject('Object Repository/Credit Analyst Review/Capital Collateral/Legalitas Usaha/Izin Usah-DDL'))
		WebUI.click(findTestObject('Object Repository/Credit Analyst Review/Capital Collateral/Legalitas Usaha/Legal ' + excelMelva.getValue(
			'legalitas', row)))
		WebUI.click(findTestObject('Object Repository/Credit Analyst Review/Capital Collateral/Kategori Kendaraan/Kategori Kendaraan-DDL'))
		WebUI.click(findTestObject('Object Repository/Credit Analyst Review/Capital Collateral/Kategori Kendaraan/Kategori ' + excelMelva.getValue(
			'kategori kendaraan', row)))
		WebUI.click(findTestObject('Object Repository/Credit Analyst Review/Capital Collateral/Asset Unit Ke/Asset Unit Ke-DDL'))
		WebUI.click(findTestObject('Object Repository/Credit Analyst Review/Capital Collateral/Asset Unit Ke/Ke ' + excelMelva.getValue(
			'asset unit ke', row)))
		WebUI.click(findTestObject('Object Repository/Credit Analyst Review/Capital Collateral/Rapindo/Rapindo-DDL'))
		WebUI.click(findTestObject('Object Repository/Credit Analyst Review/Capital Collateral/Rapindo/Rapindo ' + excelMelva.getValue(
			'rapindo', row)))
		WebUI.click(findTestObject('Object Repository/Credit Analyst Review/Capital Collateral/Jumlah Asset/Jumlah Asset-DDL'))
		WebUI.click(findTestObject('Object Repository/Credit Analyst Review/Capital Collateral/Jumlah Asset/Asset ' + excelMelva.getValue(
			'jumlah asset', row)))
		WebUI.setText(findTestObject('Object Repository/Credit Analyst Review/Capital Collateral/input_Market Value'), excelMelva.getValue('market value', row))
		WebUI.setText(findTestObject('Object Repository/Credit Analyst Review/Capital Collateral/input_MRP'), excelMelva.getValue('MRP', row))
		WebUI.setText(findTestObject('Object Repository/Credit Analyst Review/Capital Collateral/Penjelasan Rapindo'), excelMelva.getValue('penj rapindo', row))
		WebUI.setText(findTestObject('Object Repository/Credit Analyst Review/Capital Collateral/Penjelasan Unit'), excelMelva.getValue('penj unit', row))
		WebUI.click(findTestObject('Object Repository/Credit Analyst Review/Capital Collateral/save'))
	}
}