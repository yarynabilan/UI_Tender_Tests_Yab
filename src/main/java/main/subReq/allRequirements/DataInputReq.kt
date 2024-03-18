package main.subReq.allRequirements

import main.subReq.SubmissionRequirements
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

class DataInputReq(driver: WebDriver?) : SubmissionRequirements(driver) {
    private val dataInputNameFiled: By = By.xpath("//input[@class=\"contentNormal\"]")
    private val descriptionFiled: By = By.xpath("//textarea[@class=\"contentNormal\" and @name=\"description\"]")
    private val editButton: By = By.xpath("//input[@value=\"Edit\"]")
    private val field1: By = By.xpath("//*[@id=\"1_field_name\"]")
    private val field2: By = By.xpath("//*[@id=\"2_field_name\"]")
    private val field3: By = By.xpath("//*[@id=\"3_field_name\"]")
    private val field4: By = By.xpath("//*[@id=\"4_field_name\"]")
    private val field5: By = By.xpath("//*[@id=\"5_field_name\"]")
    private val field6: By = By.xpath("//*[@id=\"6_field_name\"]")
    private val field7: By = By.xpath("//*[@id=\"6_field_name\"]")


    private val fieldTypeTextShort: By = By.xpath("//select[@name=\"1_field_type\"]/option[text()=\"Text field (short)\"]")
    private val fieldTypeTextLong: By = By.xpath("//select[@name=\"2_field_type\"]/option[text()=\"Text field (long)\"]")
    private val fieldTypeNumbers: By = By.xpath("//select[@name=\"3_field_type\"]/option[text()=\"Numbers\"]")
    private val fieldTypeCurrencyAmount: By = By.xpath("//select[@name=\"4_field_type\"]/option[text()=\"Currency amount\"]")
    private val fieldTypeDate: By = By.xpath("//select[@name=\"5_field_type\"]/option[text()=\"Date\"]")
    private val fieldTypeBooleanValue: By = By.xpath("//select[@name=\"6_field_type\"]/option[text()=\"Boolean value\"]")

    private val currencyDropdown: By = By.xpath("//select[@id='4_currency_type']")
    private val currencyTypeDKK: By = By.xpath("//select[@id='4_currency_type']//option[text()='DKK']")

    private val mandatoryForNumbersDropdown: By = By.xpath("//select[@name='3_data_input']")
    private val mandatoryForCurrencyDropdown: By = By.xpath("//select[@name='4_data_input']")

    private val mandatoryForNumbers: By = By.xpath("//select[@id='3_data_input']//option[text()='Mandatory']")
    private val mandatoryForCurrency: By = By.xpath("//select[@id='4_data_input']//option[text()='Mandatory']")

    private val fieldTypeDropdown1: By = By.xpath("//select[@id=\"1_field_type\"]")
    private val fieldTypeDropdown2: By = By.xpath("//select[@id=\"2_field_type\"]")
    private val fieldTypeDropdown3: By = By.xpath("//select[@id=\"3_field_type\"]")
    private val fieldTypeDropdown4: By = By.xpath("//select[@id=\"4_field_type\"]")
    private val fieldTypeDropdown5: By = By.xpath("//select[@id=\"5_field_type\"]")
    private val fieldTypeDropdown6: By = By.xpath("//select[@id=\"6_field_type\"]")


    private val addButton: By = By.xpath("//input[@type='button' and @value='Add' and @onclick='add_datafield();']")
    private val guidingField1: By = By.xpath("//input[@id='1_field_description']")
    private val guidingField2: By = By.xpath("//input[@id='2_field_description']")
    private val guidingField3: By = By.xpath("//input[@id='3_field_description']")
    private val guidingField4: By = By.xpath("//input[@id='4_field_description']")
    private val guidingField5: By = By.xpath("//input[@id='5_field_description']")
    private val guidingField6: By = By.xpath("//input[@id='6_field_description']")
    private val guidingField7: By = By.xpath("//input[@id='7_field_description']")
    private val okButton: By = By.xpath("//input[@name='button_ok' and @type='button' and @value='OK' and @onclick='validate()']")
    private val lastOkButton: By = By.xpath("//input[@name='x' and @value='OK']")
    private val reqToDelete: By = By.xpath("//span[text()='Data Input Requirement To Delete Test']\n")

    fun dataInputNameFiled(): WebElement {
        return driver!!.findElement(dataInputNameFiled)
    }

    fun descriptionFiled(): WebElement {
        return driver!!.findElement(descriptionFiled)
    }

    fun editButton(): WebElement {
        return driver!!.findElement(editButton)
    }

    fun okButton(): WebElement {
        return driver!!.findElement(okButton)
    }

    fun field1(): WebElement {
        return driver!!.findElement(field1)
    }

    fun field2(): WebElement {
        return driver!!.findElement(field2)
    }

    fun field3(): WebElement {
        return driver!!.findElement(field3)
    }

    fun field4(): WebElement {
        return driver!!.findElement(field4)
    }

    fun field5(): WebElement {
        return driver!!.findElement(field5)
    }

    fun field6(): WebElement {
        return driver!!.findElement(field6)
    }


    fun guidingField1(): WebElement {
        return driver!!.findElement(guidingField1)
    }

    fun guidingField2(): WebElement {
        return driver!!.findElement(guidingField2)
    }

    fun guidingField3(): WebElement {
        return driver!!.findElement(guidingField3)
    }

    fun guidingField4(): WebElement {
        return driver!!.findElement(guidingField4)
    }

    fun guidingField5(): WebElement {
        return driver!!.findElement(guidingField5)
    }

    fun guidingField6(): WebElement {
        return driver!!.findElement(guidingField6)
    }

    fun guidingField7(): WebElement {
        return driver!!.findElement(guidingField7)
    }

    fun lastOkButton(): WebElement {
        return driver!!.findElement(lastOkButton)
    }

    private fun addButton(): WebElement {
        return driver!!.findElement(addButton)
    }

    fun fillInNameOfDataInputReq() {
        dataInputNameFiled().click()
    }

    fun clickEditButton() {
        editButton().click()
    }

    fun clickAddButton() {
        addButton().click()
    }

    fun clickOkButton() {
        okButton().click()
    }

    fun clickOnlastOkButton() {
        lastOkButton().click()
    }


    fun fillInNameOfDataInputReq(newName: String?): DataInputReq {
        val dataInputNameFiled = dataInputNameFiled()
        dataInputNameFiled.clear()
        dataInputNameFiled.sendKeys(newName)
        return this
    }

    fun fillInDescriptionFiled(newDescription: String?): DataInputReq {
        val descriptionFiled = descriptionFiled()
        descriptionFiled.clear()
        descriptionFiled.sendKeys(newDescription)
        return this
    }

    fun fillInfield1(field1Description: String?): DataInputReq {
        val field1 = field1()
        field1.clear()
        field1.sendKeys(field1Description)
        return this
    }

    fun fillInfield2(field2Description: String?): DataInputReq {
        val field2 = field2()
        field2.clear()
        field2.sendKeys(field2Description)
        return this
    }

    fun fillInfield3(field3Description: String?): DataInputReq {
        val field3 = field3()
        field3.clear()
        field3.sendKeys(field3Description)
        return this
    }

    fun fillInfield4(field4Description: String?): DataInputReq {
        val field4 = field4()
        field4.clear()
        field4.sendKeys(field4Description)
        return this
    }

    fun fillInfield5(field5Description: String?): DataInputReq {
        val field5 = field5()
        field5.clear()
        field5.sendKeys(field5Description)
        return this
    }

    fun fillInfield6(field6Description: String?): DataInputReq {
        val field6 = field6()
        field6.clear()
        field6.sendKeys(field6Description)
        return this
    }

    fun fillInGuidField1(guidingField1Description: String?): DataInputReq {
        val guidingField1 = guidingField1()
        guidingField1.clear()
        guidingField1.sendKeys(guidingField1Description)
        return this
    }

    fun fillInGuidField2(guidingField2Description: String?): DataInputReq {
        val guidingField2 = guidingField2()
        guidingField2.clear()
        guidingField2.sendKeys(guidingField2Description)
        return this
    }

    fun fillInGuidField3(guidingField3Description: String?): DataInputReq {
        val guidingField3 = guidingField3()
        guidingField3.clear()
        guidingField3.sendKeys(guidingField3Description)
        return this
    }

    fun fillInGuidField4(guidingField4Description: String?): DataInputReq {
        val guidingField4 = guidingField4()
        guidingField4.clear()
        guidingField4.sendKeys(guidingField4Description)
        return this
    }

    fun fillInGuidField5(guidingField5Description: String?): DataInputReq {
        val guidingField5 = guidingField5()
        guidingField5.clear()
        guidingField5.sendKeys(guidingField5Description)
        return this
    }

    fun fillInGuidField6(guidingField6Description: String?): DataInputReq {
        val guidingField6 = guidingField6()
        guidingField6.clear()
        guidingField6.sendKeys(guidingField6Description)
        return this
    }

    fun fillInGuidField7(guidingField7Description: String?): DataInputReq {
        val guidingField7 = guidingField7()
        guidingField7.clear()
        guidingField7.sendKeys(guidingField7Description)
        return this
    }

    fun clickOnFiledTypeDropdown1() {
        val fieldTypeDropdown1 = driver!!.findElement(this.fieldTypeDropdown1)
        fieldTypeDropdown1.click()
    }

    fun clickOnFiledTypeDropdown2() {
        val fieldTypeDropdown2 = driver!!.findElement(this.fieldTypeDropdown2)
        fieldTypeDropdown2.click()
    }

    fun clickOnFiledTypeDropdown3() {
        val fieldTypeDropdown3 = driver!!.findElement(this.fieldTypeDropdown3)
        fieldTypeDropdown3.click()
    }

    fun clickOnFiledTypeDropdown4() {
        val fieldTypeDropdown4 = driver!!.findElement(this.fieldTypeDropdown4)
        fieldTypeDropdown4.click()
    }

    fun clickOnFiledTypeDropdown5() {
        val fieldTypeDropdown5 = driver!!.findElement(this.fieldTypeDropdown5)
        fieldTypeDropdown5.click()
    }

    fun clickOnFiledTypeDropdown6() {
        val fieldTypeDropdown6 = driver!!.findElement(this.fieldTypeDropdown6)
        fieldTypeDropdown6.click()
    }

    fun selectFieldTypeTextShort() {
        val option = driver!!.findElement(this.fieldTypeTextShort)
        option.click()
    }

    fun selectFieldTypeTextLong() {
        val option = driver!!.findElement(this.fieldTypeTextLong)
        option.click()
    }

    fun selectFieldTypeNumbers() {
        val option = driver!!.findElement(this.fieldTypeNumbers)
        option.click()
    }

    fun selectFieldTypeCurrencyAmount() {
        val option = driver!!.findElement(this.fieldTypeCurrencyAmount)
        option.click()
    }

    fun selectFieldTypeDate() {
        val option = driver!!.findElement(this.fieldTypeDate)
        option.click()
    }

    fun clickOnCurrencyDropdown() {
        val currencyDropdown = driver!!.findElement(this.currencyDropdown)
        currencyDropdown.click()
    }

    fun selectCurrencyTypeDKK() {
        val option = driver!!.findElement(this.currencyTypeDKK)
        option.click()
    }

    fun selectFieldTypeBooleanValue() {
        val option = driver!!.findElement(this.fieldTypeBooleanValue)
        option.click()
    }

    fun clickOnMandatoryForNumbersDropdown() {
        val dropdown = driver!!.findElement(this.mandatoryForNumbersDropdown)
        dropdown.click()
    }

    fun selectMandatoryForNumbers() {
        val option = driver!!.findElement(this.mandatoryForNumbers)
        option.click()
    }

    fun clickOnMandatoryForCurrencyDropdown() {
        val dropdown = driver!!.findElement(this.mandatoryForCurrencyDropdown)
        dropdown.click()
    }

    fun selectMandatoryForCurrency() {
        val option = driver!!.findElement(this.mandatoryForCurrency)
        option.click()
    }

    fun selectDataReqToDelete() {
        val dataReqToDelete = driver!!.findElement(this.reqToDelete)
        dataReqToDelete.click()
    }
}

