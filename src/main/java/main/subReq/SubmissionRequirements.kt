package main.subReq

import lombok.Getter
import main.PublicTenderPage
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

@Getter
open class SubmissionRequirements(driver: WebDriver?) : PublicTenderPage(driver) {

    private val createSubReqButton: By = By.xpath("//img[@title=\"Register submission requirement\"]")
    private val editSubReqButton: By = By.xpath("//img[@title=\"Edit submission requirement\"]")
    private val deleteSubReqButton: By = By.xpath("//img[@title=\"Delete submission requirement\"]")
    private val dataInputReqLink: By = By.xpath("//span[text()=\"Data input requirement\"]")
    private val fileUploadReqLink: By = By.xpath("//span[text()=\"File upload requirement\"]")
    private val edpdReqLink: By = By.xpath("//span[text()=\"European Single Procurement Document (ESPD)\"]")
    private val copyReqFromPhaseOrRoundLink: By = By.xpath("//span[text()=\"Copy requirements from phase or round\"]")
    private val copyReqFromAnotherTenderLink: By = By.xpath("//span[text()=\"Copy requirements from another tender\"]")
    private val okButton: By = By.xpath("//input[@value='OK']")
    private val confirmDeletion: By = By.xpath("//input[@type='BUTTON' and @value='OK']")

    fun createSubReqButton(): WebElement {
        return driver!!.findElement(createSubReqButton)
    }
    fun dataInputReqLink(): WebElement {
        return driver!!.findElement(dataInputReqLink)
    }
    fun fileUploadReqLink(): WebElement {
        return driver!!.findElement(fileUploadReqLink)
    }
    fun edpdReqLink(): WebElement {
        return driver!!.findElement(edpdReqLink)
    }
    fun copyReqFromPhaseOrRoundLink(): WebElement {
        return driver!!.findElement(copyReqFromPhaseOrRoundLink)
    }
    fun copyReqFromAnotherTenderLink(): WebElement {
        return driver!!.findElement(copyReqFromAnotherTenderLink)
    }
    fun clickOnCreateSubReqButton() {
        createSubReqButton().click()
    }
    fun clickOnDataInputReqLink() {
        dataInputReqLink().click()
    }
    fun clickOnFileUploadReqLink() {
        fileUploadReqLink().click()
    }
    fun clickOnEdpdReqLink() {
        edpdReqLink().click()
    }
    fun clickOnCopyReqFromPhaseOrRoundLink() {
        copyReqFromPhaseOrRoundLink().click()
    }
    fun clickOncopyReqFromAnotherTenderLink() {
        copyReqFromAnotherTenderLink().click()
    }

    fun clickOnEditSubReqButton() {
        val editSubReqButton = driver!!.findElement(this.editSubReqButton)
        editSubReqButton.click()
    }
    fun clickOnDeleteSubReqButton() {
        val deleteSubReqButton = driver!!.findElement(this.deleteSubReqButton)
        deleteSubReqButton.click()
    }
    fun clickOnOkButton() {
        val okButton = driver!!.findElement(this.okButton)
        okButton.click()
    }
    fun confirmDeletion() {
        val confirmDeletion = driver!!.findElement(this.confirmDeletion)
        confirmDeletion.click()
    }
}