package seleniumgluecode;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Test {

    private WebDriver driver =Hooks.getDriver();

    @Given("^El usuario se encuentra en la pagina Home de iamalittletester$")
    public void el_usuario_se_encuentra_en_la_pagina_Home_de_iamalittletester() throws Throwable {
        String titleHomePage = "imalittletester – Testing. With Java, Selenium, TestNG, Maven, Spring, IntelliJ and friends.";
        Assert.assertEquals(titleHomePage,driver.getTitle());

    }

    @When("^Hace clic solo el boton de The little tester comics$")
    public void hace_clic_solo_el_boton_de_The_little_tester_comics() throws Throwable {
        WebElement titleComicsLocator= driver.findElement(By.id("menu-item-2008"));
        titleComicsLocator.click();
    }

    @Then("^Se debe redirigir a la pantalla Comics$")
    public void se_debe_redirigir_a_la_pantalla_Comics() throws Throwable {
        WebElement pageTitleLocator = driver.findElement(By.className("page-title"));
        Assert.assertTrue ( "No se redirecciono a la pagina de comics", pageTitleLocator.isDisplayed());
        Assert.assertEquals ( "Category: comics", pageTitleLocator.getText());


    }

    @When("^Hace clic solo el boton de My tutorial and talks$")
    public void hace_clic_solo_el_boton_de_My_tutorial_and_talks() throws Throwable {
        WebElement titleTutorialLocator= driver.findElement(By.id("menu-item-2007"));
        titleTutorialLocator.click();
    }

    @Then("^Se debe redirigir a la pantalla Tutorial$")
    public void se_debe_redirigir_a_la_pantalla_Tutorial() throws Throwable {
        WebElement pageTitleLocator = driver.findElement(By.tagName("h4"));
        Assert.assertTrue ( "No se redirecciono a la pagina de tutorial", pageTitleLocator.isDisplayed());
        Assert.assertEquals ( "Tutorials", pageTitleLocator.getText());
    }


}
