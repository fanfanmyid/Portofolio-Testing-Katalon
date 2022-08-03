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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/span_TENTANG MAKASSAR_uc_dactive bbb headin_fc150b'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/span_PETA  WILAYAH ADMINISTRASI KOTA MAKASS_464718'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/i_ORGANISASI PERANGKAT DAERAH_fas fa-plus'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/span_satpolpp.makassarkota.go.id_uc_dactive_c0138f'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/span__uc_dactive bbb heading-padding ue_acc_8c892d'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/span__uc_dactive bbb heading-padding ue_acc_8c892d_1'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/i_INOVASI_fas fa-plus'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/span_DINAS_elementor-toggle-icon-closed'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/i_arsip.makassarkota.go.id_fas fa-caret-right'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/i_dinaskebudayaan.makassarkota.go.id_fas fa_5684f0'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/i_dukcapil.makassarkota.go.id_fas fa-caret-right'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/span__elementor-toggle-icon-closed'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/i_dkp.makassarkota.go.id_fas fa-caret-right'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_DINAS KOMUNIKASI DAN INFORMATIKA'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_DINAS KOPERASI, USAHA KECIL DAN MENENGAH'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_DINAS LINGKUNGAN HIDUP'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/div_DINAS PARIWISATA'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_DINAS PEKERJAAN UMUM'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_DINAS PEMADAM KEBAKARAN'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_DINAS PEMBERDAYAAN PEREMPUAN DAN PERLINDU_24eb9d'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_DINAS PEMUDA DAN OLAHRAGA'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_DINAS PENANAMAN MODAL DAN PTSP'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_DINAS PENATAAN RUANG'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_DINAS PENGENDALIAN PENDUDUK DAN KB'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_DINAS PERDAGANGAN'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_DINAS PERHUBUNGAN'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_DINAS PERIKANAN DAN PERTANIAN'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_DINAS PERPUSTAKAAN'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_DINAS PERTANAHAN'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_DINAS PERUMAHAN DAN KAWASAN PEMUKIMAN'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_DINAS SOSIAL'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_INSPEKTORAT KOTA MAKASSAR'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_SEKRETARIAT DPRD'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_SATPOL PP'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_BAGIAN HUKUM'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_BAGIAN KESEJAHTERAAN RAKYAT'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_BAGIAN KEUANGAN SETDA'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_BAGIAN LAYANAN PENGADAAN BARANG DAN JASA'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_BAGIAN ORGANISASI'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_BAGIAN PEREKONOMIAN'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/div_BAGIAN PEMBERDAYAAN MASYARAKAT'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_BAGIAN PROTOKOL DAN KOMUNIKASI PIMPINAN'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_BAGIAN UMUM DAN PERLENGKAPAN'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/div_BAGIAN KERJASAMA'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_BAGIAN ADMINISTRASI PEMBANGUNAN'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_BAGIAN TATA PEMERINTAHAN'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_BADAN KEPEGAWAIAN  PENGEMBANGAN SDM DAERAH'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_BADAN KESATUAN BANGSA DAN POLITIK'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/div_BADAN PENDAPATAN DAERAH'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_BADAN PENELITIAN DAN PENGEMBANGAN'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_BADAN PENGELOLA KEUANGAN DAN ASET DAERAH'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_BADAN PERENCANA PEMBANGUNAN DAERAH'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_BADAN PENANGGULANGAN BENCANA DAERAH'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_KECAMATAN BIRINGKANAYA'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_KECAMATAN BONTOALA'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_KECAMATAN MAKASSAR'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_KECAMATAN MAMAJANG'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/div_KECAMATAN MANGGALA'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_KECAMATAN MARISO'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_KECAMATAN PANAKUKKANG'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_KECAMATAN RAPPOCINI'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_KECAMATAN KEP. SANGKARRANG'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_KECAMATAN TALLO'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_KECAMATAN TAMALANREA'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_KECAMATAN TAMALATE'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_KECAMATAN UJUNG PANDANG'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_KECAMATAN UJUNG TANAH'))

WebUI.click(findTestObject('Object Repository/Page_MakassarKota  Portal Resmi Kota Makassar/a_KECAMATAN WAJO'))

