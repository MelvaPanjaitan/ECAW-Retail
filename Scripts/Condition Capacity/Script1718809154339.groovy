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

TestData excelMelva = findTestData('Data Files/Condition Capacity')

WebUI.click(findTestObject('Object Repository/Credit Analyst Review/Condition Capacity/a_Condition Capacity'))

for (int row = 1; row <= excelMelva.getRowNumbers(); row++) {
    if (excelMelva.getValue('input', row) == 'YES') {
        WebUI.click(findTestObject('Object Repository/Credit Analyst Review/Condition Capacity/Coverage Area - DDL/Coverage Area'))

        WebUI.click(findTestObject('Object Repository/Credit Analyst Review/Condition Capacity/Coverage Area - DDL/Coverage ' + 
                excelMelva.getValue('Coverage Zone', row)))

        WebUI.click(findTestObject('Object Repository/Credit Analyst Review/Condition Capacity/Jenis Konsumen - DDL/Jenis Konsumen'))

        WebUI.delay(5)

        WebUI.click(findTestObject('Object Repository/Credit Analyst Review/Condition Capacity/Jenis Konsumen - DDL/Jenis ' + 
                excelMelva.getValue('Jenis Konsumen', row)))
		
		WebUI.delay(5)
		
		WebUI.click(findTestObject('Object Repository/Credit Analyst Review/Condition Capacity/a_Condition Capacity'))
		
		WebUI.delay(5)
		
		WebUI.click(findTestObject('Object Repository/Credit Analyst Review/Condition Capacity/Bukti Kapasitas - DDL/Bukti Kapasitas'))
		
		WebUI.delay(5)
		
		WebUI.click(findTestObject('Object Repository/Credit Analyst Review/Condition Capacity/Bukti Kapasitas - DDL/Bukti ' +
				excelMelva.getValue('Bukti Kapasitas', row)))

        WebUI.delay(5)


        WebUI.setText(findTestObject('Object Repository/Credit Analyst Review/Condition Capacity/Pendapatan Perbulan'), 
            excelMelva.getValue('Pendapatan Per Bulan', row))


        WebUI.delay(5)

        WebUI.setText(findTestObject('Object Repository/Credit Analyst Review/Condition Capacity/Jumlah Pemasukan'), excelMelva.getValue(
                'Jumlah Pemasukan', row))

        WebUI.delay(10)

        WebUI.setText(findTestObject('Object Repository/Credit Analyst Review/Condition Capacity/Angsuran Kontrak Aktif'), 
            excelMelva.getValue('Angsuran Kontrak Aktif', row))

        WebUI.delay(5)

        WebUI.click(findTestObject('Object Repository/Credit Analyst Review/Condition Capacity/Tipe Industri'))

        WebUI.click(findTestObject('Object Repository/Credit Analyst Review/Condition Capacity/Tipe Industri Yang Dipilih'))

        WebUI.setText(findTestObject('Object Repository/Credit Analyst Review/Condition Capacity/Angsuran Fincoy'), excelMelva.getValue(
                'Angsuran Fincoy', row))

        WebUI.setText(findTestObject('Object Repository/Credit Analyst Review/Condition Capacity/Lama KerjaUsaha (Tahun)'), 
            excelMelva.getValue('Lama Kerja Usaha', row))

        WebUI.setText(findTestObject('Object Repository/Credit Analyst Review/Condition Capacity/Dokumen Pendukung Usaha'), 
            excelMelva.getValue('Dok Pendukung', row))

        WebUI.setText(findTestObject('Object Repository/Credit Analyst Review/Condition Capacity/Analisa Income'), excelMelva.getValue(
                'An Income', row))

        WebUI.setText(findTestObject('Object Repository/Credit Analyst Review/Condition Capacity/Penjelasan Jenis Konsumen'), 
            excelMelva.getValue('Penj Jns Konsumen', row))

        WebUI.setText(findTestObject('Object Repository/Credit Analyst Review/Condition Capacity/Penjelasan Bukti Kapasitas'), 
            excelMelva.getValue('Penj Bkt Kps', row))

        WebUI.setText(findTestObject('Object Repository/Credit Analyst Review/Condition Capacity/Penjelasan Bukti Kapasitas Pasangan'), 
            excelMelva.getValue('Penj Bkt Kps s', row)) //		WebUI.click(findTestObject('Object Repository/Credit Analyst Review/Customer Information/save'))
    }
}

