package StepDefinitions;

import Pages.postajobPage;
import Utility.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class postajobStep {

      public WebDriver driver;

      postajobPage postajobPage;
//      public postajobStep ()throws Exception {
//
//          this.driver = Hooks.getDriver();
//          postajobPage = new postajobPage(driver);
//
//      }

      public postajobStep()throws Exception
      {
          this.driver=Hooks.getDriver();
          postajobPage=new postajobPage(driver);

      }


    @When("user click job management menu")
    public void user_click_job_management_menu() throws InterruptedException {
        postajobPage.click_jobmanageMenu();
        Thread.sleep(2000);
    }


    @And("user clicks post a job")
    public void user_clicks_post_a_job() throws InterruptedException {

        postajobPage.click_postajob();
          Thread.sleep(2000);

    }
    @And("user enters job summery")
    public void user_enters_job_summery() throws InterruptedException {

        postajobPage.upload_demandletter();
          Thread.sleep(2000);


    }
    @And("user enters Basic Info")
    public void user_enters_basic_info() throws InterruptedException {

        postajobPage.input_basicInfo();
          Thread.sleep(2000);

    }


    @When("user clicks post a skill search job")
    public void userClicksPostASkillSearchJob() throws InterruptedException {

        postajobPage.click_post_a_skillsearch_btn();
        Thread.sleep(2000);


    }


    @And("user inputs skill search job post")
    public void userInputsSkillSearchJobPost() throws InterruptedException {

        postajobPage.input_skill_search_job_post();
        Thread.sleep(2000);
    }


    @When("user clicks post an internal job")
    public void userClicksPostAnInternalJob() throws InterruptedException {
        postajobPage.user_clicks_PostAnInternalJob_btn();
        Thread.sleep(2000);

    }

    @And("user clicks internal job summery")
    public void userClicksInternalJobSummery() throws InterruptedException {

        postajobPage.user_inputs_InternalJobSummery();
        Thread.sleep(2000);

    }

    @And("user inputs internal basic info")
    public void userInputsInternalBasicInfo() throws InterruptedException {

        postajobPage.user_inputs_InternalBasicInfo();
        Thread.sleep(2000);
    }

}
