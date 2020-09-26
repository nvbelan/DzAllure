package ru.appline.framework.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class StartPage extends BasePage {

    @FindBy(xpath = "//div[@class='kitt-content']/ul/li")
    List<WebElement> uPMenu2;
    @FindBy(xpath = "//a[text()='Ипотека на готовое жильё']/..")
    List<WebElement> secMenu;

   @Step("Выбираем меню Ипотека")
   public StartPage selectMenuIpoteka() {
        selectMenu(uPMenu2, "Ипотека");
        return this;
    }
    @Step("Выбираем подменю: Ипотека на готовое жильё")
    public IpotekaPage selectSecMenu() {
        selectMenu(secMenu, "Ипотека на готовое жильё");
        return app.getIpotekaPage();
    }
}
