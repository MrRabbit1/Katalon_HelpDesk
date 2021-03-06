import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

a = WS.sendRequest(findTestObject('Request/60ViewRequestStatistic'))

WS.verifyResponseStatusCode(a, 200)

WS.verifyElementPropertyValue(a, 'IsError', false)

/*WS.verifyElementPropertyValue(a, 'ObjReturn[0].StatusId', 5)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].StatusName', "Tạo mới")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].NumberOfStatus', 7)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].StatusId', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].StatusName', "Hoàn thành")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].NumberOfStatus', 8)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].StatusId', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].StatusName', "Chờ nhân viên xử lý")

WS.verifyElementPropertyValue(a, 'ObjReturn[2].NumberOfStatus', 8)

WS.verifyElementPropertyValue(a, 'ObjReturn[3].StatusId', 4)

WS.verifyElementPropertyValue(a, 'ObjReturn[3].StatusName', "Hủy bỏ")

WS.verifyElementPropertyValue(a, 'ObjReturn[3].NumberOfStatus', 1)*/