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

WebUI.navigateToUrl('https://makassarkota.go.id/')

WebUI.verifyElementPresent(findTestObject('Page_MakassarKota  Portal Resmi Kota Makassar/div_BERITA TERBARU'), 0)

WebUI.verifyElementPresent(findTestObject('Page_MakassarKota  Portal Resmi Kota Makassar/div_INOVASI'), 0)

WebUI.verifyElementPresent(findTestObject('Page_MakassarKota  Portal Resmi Kota Makassar/div_LALU LINTASTweets by DiskominfoMKS'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_MakassarKota  Portal Resmi Kota Makassar/div_NTPD 112Nomor Tunggal Panggilan Darurat 112Telepon Sekarang'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_MakassarKota  Portal Resmi Kota Makassar/div_ORGANISASI PERANGKAT DAERAH'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_MakassarKota  Portal Resmi Kota Makassar/div_PPID Kota Makassar'), 0)

WebUI.verifyElementPresent(findTestObject('Page_MakassarKota  Portal Resmi Kota Makassar/div_TENTANG MAKASSAR'), 0)

WebUI.verifyElementPresent(findTestObject('Page_MakassarKota  Portal Resmi Kota Makassar/h2_KOTA MAKASSAR'), 0)

WebUI.verifyElementPresent(findTestObject('Page_MakassarKota  Portal Resmi Kota Makassar/h2_PEMERINTAH'), 0)

WebUI.verifyElementPresent(findTestObject('Page_MakassarKota  Portal Resmi Kota Makassar/h2_WEBSITE RESMI'), 0)

WebUI.verifyElementPresent(findTestObject('Page_MakassarKota  Portal Resmi Kota Makassar/img_Ongkog_attachment-medium size-medium'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_MakassarKota  Portal Resmi Kota Makassar/p_Copyright2022 Pemerintah Kota Makassar'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_MakassarKota  Portal Resmi Kota Makassar/p_Jl. Ahmad Yani No. 2Kel. Bulo GadingKec. Ujung Pandang'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_MakassarKota  Portal Resmi Kota Makassar/span_Kantor Balai Kota Makassar'), 
    0)

