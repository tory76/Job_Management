package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class postajobPage {
   // public static WebDriver driver;


    @FindBy(xpath = "//*[@id=\"kt_aside_menu\"]/ul/li[7]/a/span")
    public WebElement jobManagBtn;
    @FindBy(xpath = "//*[@id=\"ra-app-v1\"]/div/div[2]/div[1]/div[1]/a")
    public WebElement postajobbtn;
    @FindBy(id ="demandLetterId")
    public WebElement uplddmndltr;


    @FindBy(xpath = "//*[@id=\"select2-jobId-container\"]")
    public WebElement selectjobCategory;

    @FindBy(xpath = "//*[@id=\"kt_body\"]/span/span/span[1]/input")
    public WebElement inputJob;

    @FindBy(xpath = "//*[@id=\"skillTypeId\"]")
    public WebElement skillType;

    @FindBy(xpath = "//*[@id=\"NoOfPost\"]")
    public WebElement NoofVacancies;

    @FindBy(xpath = "//*[@id=\"select2-countryId-container\"]")
    public WebElement selectCountry;

    @FindBy(xpath = "//*[@id=\"kt_body\"]/span/span/span[1]/input")
    public WebElement inputCountry;

    @FindBy(xpath = "//*[@id=\"EnterCity\"]")
    public WebElement enterCity;

    @FindBy(xpath = "//*[@id=\"Salary\"]")
    public WebElement salary;
    @FindBy(xpath = "//*[@id=\"select2-salaryTypeId-container\"]")
    public WebElement selectSalaryPer;

    @FindBy(xpath = "//*[@id=\"kt_body\"]/span/span/span[1]/input")
    public WebElement inputselectSalaryPer;

    @FindBy(xpath = "//*[@id=\"ra-app-v1\"]/div/div[2]/div[2]/div/div[1]/div/div[6]/div/div[1]/input")
    public WebElement contractTenure;

    @FindBy(xpath = "//*[@id=\"select2-probationId-container\"]")
    public WebElement probationperiod;

    @FindBy(xpath = "//*[@id=\"kt_body\"]/span/span/span[1]/input")
    public WebElement inputprobationper;

    @FindBy(xpath="//*[@id=\"ra-app-v1\"]/div/div[2]/div[2]/div/div[1]/div/div[7]/div/label[1]")
    public WebElement malebtn;

    @FindBy(xpath = "//*[@id=\"ra-app-v1\"]/div/div[2]/div[2]/div/div[1]/div/div[7]/div/label[2]")
    public WebElement femalebtn;

    @FindBy(xpath = "//*[@id=\"ra-app-v1\"]/div/div[2]/div[2]/div/div[1]/div/div[7]/div/label[3]")
    public WebElement bothbtn;

    @FindBy(xpath ="//*[@id=\"applicationDeadline\"]" )
    public WebElement deadline;

   @FindBy(xpath = "//*[@id=\"ra-app-v1\"]/div/div[2]/div[5]/label/span")
   public WebElement agreementchckbox;

   @FindBy(xpath = "//*[@id=\"ra-app-v1\"]/div/div[2]/div[6]/button[2]")
   public WebElement publishbtn;


    @FindBy(className ="postaskillsearchbtn pajbtn")
    public WebElement postaskillsearchbtn;

    //*[@id="ra-app-v1"]/div/div[2]/div[1]/div[2]/a

    @FindBy(id = "select2-jobId-container")
    public WebElement selectjobcategoryskill;

    @FindBy(className = "select2-search__field")
    public WebElement inputjobcategoryskill;

    @FindBy(id = "NoOfPost")
    public WebElement noofvacanciesskill;

    @FindBy(id = "select2-countryId-container")
    public WebElement selectcountryskill;

    @FindBy(xpath= "//*[@id=\"kt_body\"]/span/span/span[1]/input")
    public WebElement inputcountryskill;

    @FindBy(id = "EnterCity")
    public WebElement Entercityskill;

    @FindBy(id= "applicationDeadline")
    public WebElement applicationdeadlineskill;

    @FindBy(xpath = "//*[@id=\"ra-app-v1\"]/div/div[2]/div[3]/label/span")
    public WebElement checkboxskill;

    @FindBy(xpath = "//*[@id=\"ra-app-v1\"]/div/div[2]/div[4]/button[2]")
    public WebElement publishbtnskill;

    @FindBy(xpath = "//*[@id=\"ra-app-v1\"]/div/div[2]/div[1]/div[3]/a")
    public WebElement postaninternalbtn;

    @FindBy(className = "upload_demand_letter")
    public WebElement uplddmndltrinternal;

    @FindBy(id = "select2-jobId-container")
    public WebElement selectjobcategoryinternal;

    @FindBy(className = "select2-jobId-container")
    public WebElement inputjobinternal;

    @FindBy(id = "NoOfPost")
    public WebElement noofvacanciesinternal;

    @FindBy(id = "select2-countryId-container")
    public WebElement selectcountryinternal;

    @FindBy(className = "select2-search__field")
    public WebElement inputcountryinternal;

    @FindBy(id = "EnterCity")
    public WebElement entercityinternal;

    @FindBy(id="Salary")
    public WebElement salaryinternal;

    @FindBy(id ="select2-salaryTypeId-container")
    public WebElement salaryperinternal;

    @FindBy(className = "select2-search__field")
    public WebElement inputsalaryprinternal;

    @FindBy(xpath = "//*[@id=\"ra-app-v1\"]/div/div[2]/div[2]/div/div[1]/div/div[5]/div/div[1]/input")
    public WebElement contracttenureinternal;

    @FindBy(id = "select2-probationId-container")
    public WebElement selectprobationperiodsinternal;

    @FindBy(className = "select2-search__field")
    public WebElement inputprobationperiodsinternal;

    @FindBy(className = "position-relative")
    public WebElement maleinternal;

    @FindBy(xpath = "//*[@id=\"ra-app-v1\"]/div/div[2]/div[2]/div/div[1]/div/div[6]/div/label[2]/span")
    public WebElement femaleinternal;

    @FindBy(xpath= "//*[@id=\"ra-app-v1\"]/div/div[2]/div[2]/div/div[1]/div/div[6]/div/label[3]/span")
    public WebElement bothinternal;

    @FindBy(id= "applicationDeadline")
    public WebElement applicationdeadlineinternal;

    @FindBy(xpath = "//*[@id=\"ra-app-v1\"]/div/div[2]/div[5]/label/span")
    public WebElement agreementinternal;

    @FindBy(xpath = "//*[@id=\"ra-app-v1\"]/div/div[2]/div[6]/button[2]")
    public WebElement postinternal;

    @FindBy(className = "preview")
    public WebElement previewinternal;

    public postajobPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void click_jobmanageMenu() throws InterruptedException {

        jobManagBtn.click();
        Thread.sleep(1000);
    }

    public void click_postajob() throws InterruptedException {

        postajobbtn.click();
        Thread.sleep(1000);
    }

    public void upload_demandletter() throws InterruptedException {

        //uplddmndltr.click();
        uplddmndltr.sendKeys("E:\\old_d_drive\\p1.pdf");
        Thread.sleep(1000);
    }

    public void input_basicInfo() throws InterruptedException {
        selectjobCategory.click();
        Thread.sleep(1000);
        inputJob.sendKeys("Chambermaid");
        Thread.sleep(1000);
        inputJob.sendKeys(Keys.ENTER);
        Thread.sleep(1000);


        skillType.sendKeys("skilled");
        Thread.sleep(1000);

        NoofVacancies.sendKeys("20");
        Thread.sleep(1000);

        selectCountry.click();
        Thread.sleep(1000);
        inputCountry.sendKeys("Brunei Darussalam");
        Thread.sleep(1000);
        inputCountry.sendKeys(Keys.ENTER);
        Thread.sleep(1000);


        enterCity.sendKeys("Brunei-Muara");
        Thread.sleep(1000);

        salary.sendKeys("3450000");
        Thread.sleep(1000);

        selectSalaryPer.click();
        Thread.sleep(1000);
        inputselectSalaryPer.sendKeys("Year");
        Thread.sleep(1000);
        inputselectSalaryPer.sendKeys(Keys.ENTER);
        Thread.sleep(1000);

        contractTenure.sendKeys("6");
        Thread.sleep(1000);

        probationperiod.click();
        Thread.sleep(1000);
        inputprobationper.sendKeys("6 Months");
        Thread.sleep(1000);
        inputprobationper.sendKeys(Keys.ENTER);
        Thread.sleep(1000);


        bothbtn.click();
        Thread.sleep(1000);

        deadline.sendKeys("2024-08-31");
        Thread.sleep(1000);

        agreementchckbox.click();
        Thread.sleep(1000);

        publishbtn.click();
        Thread.sleep(1000);


    }


    public void click_post_a_skillsearch_btn() throws InterruptedException {

        postaskillsearchbtn.click();
        Thread.sleep(2000);

    }

    public void input_skill_search_job_post() throws InterruptedException {

        selectjobcategoryskill.click();
        Thread.sleep(2000);
        inputjobcategoryskill.sendKeys("Worker");
        Thread.sleep(2000);
        inputjobcategoryskill.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        noofvacanciesskill.sendKeys("20");
        Thread.sleep(2000);

        selectcountryskill.click();
        Thread.sleep(2000);
        inputcountryskill.sendKeys("Iraq");
        Thread.sleep(2000);
        inputcountryskill.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        Entercityskill.sendKeys("Karbala");
        Thread.sleep(2000);

        applicationdeadlineskill.sendKeys("2024-09-30");
        Thread.sleep(2000);

        checkboxskill.click();
        Thread.sleep(2000);

        publishbtnskill.click();
        Thread.sleep(2000);

    }


    public void user_clicks_PostAnInternalJob_btn() throws InterruptedException {

        postaninternalbtn.click();
        Thread.sleep(2000);
    }

    public void user_inputs_InternalJobSummery() throws InterruptedException {

        uplddmndltrinternal.sendKeys("E:\\old_d_drive\\p1.pdf");
        Thread.sleep(2000);
    }

    public void user_inputs_InternalBasicInfo() throws InterruptedException {

        selectjobcategoryinternal.click();
        Thread.sleep(2000);
        inputjobinternal.sendKeys("Agriculture Worker");
        Thread.sleep(2000);
        inputjobinternal.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        noofvacanciesinternal.sendKeys("15");
        Thread.sleep(2000);
        selectcountryinternal.click();
        Thread.sleep(2000);
        inputcountryinternal.sendKeys("Brunei Darussalam");
        Thread.sleep(2000);
        inputcountryinternal.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        salaryinternal.sendKeys("6565676");
        Thread.sleep(2000);
        salaryperinternal.click();
        Thread.sleep(2000);
        inputsalaryprinternal.sendKeys("Year");
        Thread.sleep(2000);
        inputsalaryprinternal.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        contracttenureinternal.sendKeys("7");
        Thread.sleep(2000);
        selectprobationperiodsinternal.click();
        Thread.sleep(2000);
        inputprobationperiodsinternal.sendKeys("9 Months");
        Thread.sleep(2000);
        inputprobationperiodsinternal.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        bothinternal.click();
        Thread.sleep(2000);
        applicationdeadlineinternal.sendKeys("2024-09-01");
        Thread.sleep(2000);
        agreementinternal.click();
        Thread.sleep(2000);
        postinternal.click();
        Thread.sleep(2000);

    }



}
