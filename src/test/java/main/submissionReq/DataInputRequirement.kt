package main.submissionReq
import main.BaseTest
import main.PublicTenderPage
import main.TendersPage
import main.subReq.SubmissionRequirements
import main.subReq.allRequirements.DataInputReq
import org.testng.annotations.BeforeMethod
import org.testng.annotations.Test

    class DataInputRequirement : BaseTest() {
        private lateinit var tendersPage: TendersPage
        private lateinit var publicTenderPage: PublicTenderPage
        private lateinit var submissionRequirements: SubmissionRequirements
        private lateinit var dataInputReq: DataInputReq
        @BeforeMethod
        fun setUpTest() {
            tendersPage = TendersPage(driver)
            tendersPage.switchToBrowserFrame()
            publicTenderPage = PublicTenderPage(driver)
            publicTenderPage.submissionRequirementsTab?.click()
            driver!!.switchTo().defaultContent()
            tendersPage.switchToNavigationFrame()
            submissionRequirements = SubmissionRequirements(driver)
            dataInputReq = DataInputReq(driver)
    }

    @Test
    fun CreateDataInputRequirement() {
        submissionRequirements.clickOnCreateSubReqButton()
        Thread.sleep(3000)
        submissionRequirements.switchToNewWindowTest()
        submissionRequirements.clickOnDataInputReqLink()
        dataInputReq.dataInputNameFiled().clear()
        dataInputReq.fillInNameOfDataInputReq("Data Input Requirement test")
        dataInputReq.fillInDescriptionFiled("test description")
        dataInputReq.clickEditButton()
        dataInputReq.switchToNewWindowTest()
        dataInputReq.fillInfield1("test1")
        dataInputReq.clickAddButton()
        dataInputReq.fillInfield2("test2")
        dataInputReq.clickAddButton()
        dataInputReq.fillInfield3("test3")
        dataInputReq.clickAddButton()
        dataInputReq.fillInfield4("test4")
        dataInputReq.clickAddButton()
        dataInputReq.fillInfield5("test5")
        dataInputReq.clickAddButton()
        dataInputReq.fillInfield6("test6")
        dataInputReq.clickOnFiledTypeDropdown1()
        dataInputReq.selectFieldTypeTextShort()
        dataInputReq.clickOnFiledTypeDropdown2()
        dataInputReq.selectFieldTypeTextLong()
        dataInputReq.clickOnFiledTypeDropdown3()
        dataInputReq.selectFieldTypeNumbers()
        dataInputReq.clickOnFiledTypeDropdown4()
        dataInputReq.selectFieldTypeCurrencyAmount()
        dataInputReq.clickOnFiledTypeDropdown5()
        dataInputReq.selectFieldTypeDate()
        dataInputReq.clickOnFiledTypeDropdown6()
        dataInputReq.selectFieldTypeBooleanValue()
        dataInputReq.clickOnCurrencyDropdown()
        dataInputReq.selectCurrencyTypeDKK()
        dataInputReq.clickOnMandatoryForCurrencyDropdown()
        dataInputReq.selectMandatoryForCurrency()
        dataInputReq.clickOnMandatoryForNumbersDropdown()
        dataInputReq.selectMandatoryForNumbers()
        dataInputReq.fillInGuidField1("Test1")
        dataInputReq.fillInGuidField2("Test2")
        dataInputReq.fillInGuidField3("Test3")
        dataInputReq.fillInGuidField4("Test4")
        dataInputReq.fillInGuidField5("Test5")
        dataInputReq.fillInGuidField6("Test6")
        dataInputReq.clickOkButton()
        dataInputReq.clickOnlastOkButton()
        Thread.sleep(2000)
    }

    @Test
    fun CreateDataInputRequirementToDelete() {
        submissionRequirements.clickOnCreateSubReqButton()
        Thread.sleep(3000)
        submissionRequirements.switchToNewWindowTest()
        submissionRequirements.clickOnDataInputReqLink()
        dataInputReq.dataInputNameFiled().clear()
        dataInputReq.fillInNameOfDataInputReq("Data Input Requirement To Delete Test")
        dataInputReq.fillInDescriptionFiled("test description - to delete")
        dataInputReq.clickEditButton()
        dataInputReq.switchToNewWindowTest()
        dataInputReq.fillInfield1("test1")
        dataInputReq.clickAddButton()
        dataInputReq.fillInfield2("test2")
        dataInputReq.clickAddButton()
        dataInputReq.fillInfield3("test3")
        dataInputReq.clickAddButton()
        dataInputReq.fillInfield4("test4")
        dataInputReq.clickAddButton()
        dataInputReq.fillInfield5("test5")
        dataInputReq.clickAddButton()
        dataInputReq.fillInfield6("test6")
        dataInputReq.clickOnFiledTypeDropdown1()
        dataInputReq.selectFieldTypeTextShort()
        dataInputReq.clickOnFiledTypeDropdown2()
        dataInputReq.selectFieldTypeTextLong()
        dataInputReq.clickOnFiledTypeDropdown3()
        dataInputReq.selectFieldTypeNumbers()
        dataInputReq.clickOnFiledTypeDropdown4()
        dataInputReq.selectFieldTypeCurrencyAmount()
        dataInputReq.clickOnFiledTypeDropdown5()
        dataInputReq.selectFieldTypeDate()
        dataInputReq.clickOnFiledTypeDropdown6()
        dataInputReq.selectFieldTypeBooleanValue()
        dataInputReq.clickOnCurrencyDropdown()
        dataInputReq.selectCurrencyTypeDKK()
        dataInputReq.clickOnMandatoryForCurrencyDropdown()
        dataInputReq.selectMandatoryForCurrency()
        dataInputReq.clickOnMandatoryForNumbersDropdown()
        dataInputReq.selectMandatoryForNumbers()
        dataInputReq.fillInGuidField1("Test1")
        dataInputReq.fillInGuidField2("Test2")
        dataInputReq.fillInGuidField3("Test3")
        dataInputReq.fillInGuidField4("Test4")
        dataInputReq.fillInGuidField5("Test5")
        dataInputReq.fillInGuidField6("Test6")
        dataInputReq.clickOkButton()
        dataInputReq.clickOnlastOkButton()
        Thread.sleep(2000)
    }

    @Test
    fun DeleteDatainputReq() {
        driver!!.switchTo().defaultContent()
        tendersPage.switchToDirectoryFrame()
        dataInputReq.selectDataReqToDelete()
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        submissionRequirements.clickOnDeleteSubReqButton()
        submissionRequirements.switchToNewWindowTest()
        dataInputReq.confirmDeletion()
    }
}

