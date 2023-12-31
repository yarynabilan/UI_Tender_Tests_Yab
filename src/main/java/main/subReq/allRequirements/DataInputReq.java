package main.subReq.allRequirements;

import main.subReq.SubmissionRequirements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DataInputReq extends SubmissionRequirements {
    public DataInputReq(WebDriver driver) {
        super(driver);
    }

    private By dataInputNameFiled = By.xpath("//input[@class=\"contentNormal\"]");
    private By descriptionFiled = By.xpath("//textarea[@class=\"contentNormal\" and @name=\"description\"]");
    private By editButton = By.xpath("//input[@value=\"Edit\"]");
    private By field1 = By.xpath("//*[@id=\"1_field_name\"]");
    private By field2 = By.xpath("//*[@id=\"2_field_name\"]");
    private By field3 = By.xpath("//*[@id=\"3_field_name\"]");
    private By field4 = By.xpath("//*[@id=\"4_field_name\"]");
    private By field5 = By.xpath("//*[@id=\"5_field_name\"]");
    private By field6 = By.xpath("//*[@id=\"6_field_name\"]");
    private By field7 = By.xpath("//*[@id=\"6_field_name\"]");


    private By fieldTypeTextShort = By.xpath("//select[@name=\"1_field_type\"]/option[text()=\"Text field (short)\"]");
    private By fieldTypeTextLong = By.xpath("//select[@name=\"2_field_type\"]/option[text()=\"Text field (long)\"]");
    private By fieldTypeNumbers = By.xpath("//select[@name=\"3_field_type\"]/option[text()=\"Numbers\"]");
    private By fieldTypeCurrencyAmount = By.xpath("//select[@name=\"4_field_type\"]/option[text()=\"Currency amount\"]");
    private By fieldTypeDate = By.xpath("//select[@name=\"5_field_type\"]/option[text()=\"Date\"]");
    private By fieldTypeBooleanValue = By.xpath("//select[@name=\"6_field_type\"]/option[text()=\"Boolean value\"]");

    private By currencyDropdown = By.xpath("//select[@id='4_currency_type']");
    private By currencyTypeDKK = By.xpath("//select[@id='4_currency_type']//option[text()='DKK']");

    private By mandatoryForNumbersDropdown = By.xpath("//select[@name='3_data_input']");
    private By mandatoryForCurrencyDropdown = By.xpath("//select[@name='4_data_input']");

   private By mandatoryForNumbers = By.xpath("//select[@id='3_data_input']//option[text()='Mandatory']");
   private By mandatoryForCurrency = By.xpath("//select[@id='4_data_input']//option[text()='Mandatory']");

    private By fieldTypeDropdown1 = By.xpath("//select[@id=\"1_field_type\"]");
    private By fieldTypeDropdown2 = By.xpath("//select[@id=\"2_field_type\"]");
    private By fieldTypeDropdown3 = By.xpath("//select[@id=\"3_field_type\"]");
    private By fieldTypeDropdown4 = By.xpath("//select[@id=\"4_field_type\"]");
    private By fieldTypeDropdown5 = By.xpath("//select[@id=\"5_field_type\"]");
    private By fieldTypeDropdown6 = By.xpath("//select[@id=\"6_field_type\"]");


    private By addButton = By.xpath("//input[@type='button' and @value='Add' and @onclick='add_datafield();']");
    private By guidingField1 = By.xpath("//input[@id='1_field_description']");
    private By guidingField2 = By.xpath("//input[@id='2_field_description']");
    private By guidingField3 = By.xpath("//input[@id='3_field_description']");
    private By guidingField4 = By.xpath("//input[@id='4_field_description']");
    private By guidingField5 = By.xpath("//input[@id='5_field_description']");
    private By guidingField6 = By.xpath("//input[@id='6_field_description']");
    private By guidingField7 = By.xpath("//input[@id='7_field_description']");
    private By okButton = By.xpath("//input[@name='button_ok' and @type='button' and @value='OK' and @onclick='validate()']");
    private By lastOkButton = By.xpath("//input[@name='x' and @value='OK']");
    private By reqToDelete = By.xpath("//span[text()='Data Input Requirement To Delete Test']\n");

    public WebElement dataInputNameFiled() {
        return driver.findElement(dataInputNameFiled);
    }

    public WebElement descriptionFiled() {
        return driver.findElement(descriptionFiled);
    }

    public WebElement editButton() {
        return driver.findElement(editButton);
    }

    public WebElement okButton() {
        return driver.findElement(okButton);
    }

    public WebElement field1() {
        return driver.findElement(field1);
    }

    public WebElement field2() {
        return driver.findElement(field2);
    }

    public WebElement field3() {
        return driver.findElement(field3);
    }

    public WebElement field4() {
        return driver.findElement(field4);
    }

    public WebElement field5() {
        return driver.findElement(field5);
    }

    public WebElement field6() {
        return driver.findElement(field6);
    }




    public WebElement guidingField1() {
        return driver.findElement(guidingField1);
    }

    public WebElement guidingField2() {
        return driver.findElement(guidingField2);
    }

    public WebElement guidingField3() {
        return driver.findElement(guidingField3);
    }

    public WebElement guidingField4() {
        return driver.findElement(guidingField4);
    }

    public WebElement guidingField5() {
        return driver.findElement(guidingField5);
    }

    public WebElement guidingField6() {
        return driver.findElement(guidingField6);
    }

    public WebElement guidingField7() {
        return driver.findElement(guidingField7);
    }

    public WebElement lastOkButton() {
        return driver.findElement(lastOkButton);
    }

    private WebElement addButton() {
        return driver.findElement(addButton);
    }

    public void fillInNameOfDataInputReq() {
        dataInputNameFiled().click();
    }

    public void clickEditButton() {
        editButton().click();
    }

    public void clickAddButton() {
        addButton().click();
    }

    public void clickOkButton() {
        okButton().click();
    }

    public void clickOnlastOkButton() {
        lastOkButton().click();
    }


    public DataInputReq fillInNameOfDataInputReq(String newName) {
        WebElement dataInputNameFiled = dataInputNameFiled();
        dataInputNameFiled.clear();
        dataInputNameFiled.sendKeys(newName);
        return this;
    }

    public DataInputReq fillInDescriptionFiled(String newDescription) {
        WebElement descriptionFiled = descriptionFiled();
        descriptionFiled.clear();
        descriptionFiled.sendKeys(newDescription);
        return this;
    }

    public DataInputReq fillInfield1(String field1Description) {
        WebElement field1 = field1();
        field1.clear();
        field1.sendKeys(field1Description);
        return this;
    }

    public DataInputReq fillInfield2(String field2Description) {
        WebElement field2 = field2();
        field2.clear();
        field2.sendKeys(field2Description);
        return this;
    }

    public DataInputReq fillInfield3(String field3Description) {
        WebElement field3 = field3();
        field3.clear();
        field3.sendKeys(field3Description);
        return this;
    }

    public DataInputReq fillInfield4(String field4Description) {
        WebElement field4 = field4();
        field4.clear();
        field4.sendKeys(field4Description);
        return this;
    }

    public DataInputReq fillInfield5(String field5Description) {
        WebElement field5 = field5();
        field5.clear();
        field5.sendKeys(field5Description);
        return this;
    }

    public DataInputReq fillInfield6(String field6Description) {
        WebElement field6 = field6();
        field6.clear();
        field6.sendKeys(field6Description);
        return this;
    }

    public DataInputReq fillInGuidField1(String guidingField1Description) {
        WebElement guidingField1 = guidingField1();
        guidingField1.clear();
        guidingField1.sendKeys(guidingField1Description);
        return this;
    }

    public DataInputReq fillInGuidField2(String guidingField2Description) {
        WebElement guidingField2 = guidingField2();
        guidingField2.clear();
        guidingField2.sendKeys(guidingField2Description);
        return this;
    }

    public DataInputReq fillInGuidField3(String guidingField3Description) {
        WebElement guidingField3 = guidingField3();
        guidingField3.clear();
        guidingField3.sendKeys(guidingField3Description);
        return this;
    }

    public DataInputReq fillInGuidField4(String guidingField4Description) {
        WebElement guidingField4 = guidingField4();
        guidingField4.clear();
        guidingField4.sendKeys(guidingField4Description);
        return this;
    }

    public DataInputReq fillInGuidField5(String guidingField5Description) {
        WebElement guidingField5 = guidingField5();
        guidingField5.clear();
        guidingField5.sendKeys(guidingField5Description);
        return this;
    }

    public DataInputReq fillInGuidField6(String guidingField6Description) {
        WebElement guidingField6 = guidingField6();
        guidingField6.clear();
        guidingField6.sendKeys(guidingField6Description);
        return this;
    }

    public DataInputReq fillInGuidField7(String guidingField7Description) {
        WebElement guidingField7 = guidingField7();
        guidingField7.clear();
        guidingField7.sendKeys(guidingField7Description);
        return this;

        }

    public void clickOnFiledTypeDropdown1() {
        WebElement fieldTypeDropdown1 = driver.findElement(this.fieldTypeDropdown1);
        fieldTypeDropdown1.click();
    }
    public void clickOnFiledTypeDropdown2() {
        WebElement fieldTypeDropdown2 = driver.findElement(this.fieldTypeDropdown2);
        fieldTypeDropdown2.click();
    }
    public void clickOnFiledTypeDropdown3() {
        WebElement fieldTypeDropdown3 = driver.findElement(this.fieldTypeDropdown3);
        fieldTypeDropdown3.click();
    }
    public void clickOnFiledTypeDropdown4() {
        WebElement fieldTypeDropdown4 = driver.findElement(this.fieldTypeDropdown4);
        fieldTypeDropdown4.click();
    }
    public void clickOnFiledTypeDropdown5() {
        WebElement fieldTypeDropdown5 = driver.findElement(this.fieldTypeDropdown5);
        fieldTypeDropdown5.click();
    }
    public void clickOnFiledTypeDropdown6() {
        WebElement fieldTypeDropdown6 = driver.findElement(this.fieldTypeDropdown6);
        fieldTypeDropdown6.click();
    }

    public void selectFieldTypeTextShort() {
        WebElement option = driver.findElement(this.fieldTypeTextShort);
        option.click();
    }

    public void selectFieldTypeTextLong() {
        WebElement option = driver.findElement(this.fieldTypeTextLong);
        option.click();
    }

    public void selectFieldTypeNumbers() {
        WebElement option = driver.findElement(this.fieldTypeNumbers);
        option.click();
    }

    public void selectFieldTypeCurrencyAmount() {
        WebElement option = driver.findElement(this.fieldTypeCurrencyAmount);
        option.click();
    }

    public void selectFieldTypeDate() {
        WebElement option = driver.findElement(this.fieldTypeDate);
        option.click();
    }

    public void clickOnCurrencyDropdown() {
        WebElement currencyDropdown = driver.findElement(this.currencyDropdown);
        currencyDropdown.click();
    }

    public void selectCurrencyTypeDKK() {
        WebElement option = driver.findElement(this.currencyTypeDKK);
        option.click();
    }

    public void selectFieldTypeBooleanValue() {
        WebElement option = driver.findElement(this.fieldTypeBooleanValue);
        option.click();
    }

    public void clickOnMandatoryForNumbersDropdown() {
        WebElement dropdown = driver.findElement(this.mandatoryForNumbersDropdown);
        dropdown.click();
    }

    public void selectMandatoryForNumbers() {
        WebElement option = driver.findElement(this.mandatoryForNumbers);
        option.click();
    }

    public void clickOnMandatoryForCurrencyDropdown() {
        WebElement dropdown = driver.findElement(this.mandatoryForCurrencyDropdown);
        dropdown.click();
    }

    public void selectMandatoryForCurrency() {
        WebElement option = driver.findElement(this.mandatoryForCurrency);
        option.click();
    }
        public void selectDataReqToDelete() {
            WebElement dataReqToDelete = driver.findElement(this.reqToDelete);
            dataReqToDelete.click();
        }
    }

