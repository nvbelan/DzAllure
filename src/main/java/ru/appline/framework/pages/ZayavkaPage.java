package ru.appline.framework.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;


public class ZayavkaPage extends BasePage {
    @FindBy(xpath = "//h1[@class='shell_commonHeadingHeader']")
    WebElement title;
    @FindBy(xpath = "//div[@data-label='Цель кредита']//input[@class='dc-input__input-4-7-0']")
    WebElement loanPurpose;
    @FindBy(xpath = "//span[text()='Есть зарплатная карта Сбербанка']/..//input")
    WebElement sWitchCard;
    @FindBy(xpath = "//span[text()='Есть возможность подтвердить доход справкой']/..//input")
    WebElement certificateSwitch;
    @FindBy(xpath = "//span[text()='Использовать материнский капитал']/..//input")
    WebElement motherMoneySwitch;
    @FindBy(xpath = "//span[contains(text(),'Скидка')]/../..//input[@type = 'checkbox']")
    WebElement domClickSaleSwitch;
    @FindBy(xpath = "//span[contains(text(),'Страхование жизни')]/../..//input[@type = 'checkbox']")
    WebElement lifeInsuranceSwitch;
    @FindBy(xpath = "//span[contains(text(),'Молодая семья')]/../..//input[@type = 'checkbox']")
    WebElement youngFamilySwitch;
    @FindBy(xpath = "//span[contains(text(),'Электронная регистрация сделки')]/../..//input[@type = 'checkbox']")
    WebElement webDealSwitch;
    @FindBy(xpath = "//div[@data-label='Стоимость недвижимости']/input")
    WebElement costHouse;
    @FindBy(xpath = "//div[@data-label='Первоначальный взнос']/input")
    WebElement yourMoney;
    @FindBy(xpath = "//div[@data-label='Срок кредита']/input")
    WebElement years;
    @FindBy(xpath = "//span[text()='Процентная ставка']/..//span[contains(text(),'%')]")
    WebElement procent;
    @FindBy(xpath = "//span[@data-e2e-id='mland-calculator/medium-result-monthly-payment']/span")
    WebElement monthPayment;
    @FindBy(xpath = "//span[@data-e2e-id='mland-calculator/medium-result-credit-sum']/span")
    WebElement creditSumm;
    @FindBy(xpath = "//span[@data-e2e-id='mland-calculator/medium-result-required-income']/span")
    WebElement needIncome;

    @Step("Проверяем заголовок: выберите программу и рассчитайте условия")
    public ZayavkaPage checkTitle() {
        checkTextT(title, "Выберите программу и рассчитайте условия", "Переход на страницу не произведен");
        return this;
    }

    @Step("Проверяем цель кредита")
    public ZayavkaPage checkAndSetLoanPurpose() {

        wait.until(ExpectedConditions.visibilityOf(loanPurpose));
        if (!(loanPurpose.getAttribute("value").contains("Готовое жилье"))) {
            throw new AssertionError("Неверно предустановлена цель кредита");
        }
        return this;
    }

    @Step("Проверяем и устанавливаем галочку Зарплатная карта")
    public ZayavkaPage setCardSwitch() {
        checkAndSetSwitch(sWitchCard, "false");
        return this;
    }

    @Step("Проверяем и устанавливаем галочку сертификат")
    public ZayavkaPage checkAndSetSwitchCertificate() {
        checkAndSetSwitch(certificateSwitch, "true");
        return this;
    }

    @Step("Проверяем и устанавливаем галочку Материнский капитал")
    public ZayavkaPage checkAndSetMotherMoneySwitch() {
        checkAndSetSwitch(motherMoneySwitch, "false");
        return this;
    }

    @Step("Проверяем и устанавливаем галочку Скидка домклик")
    public ZayavkaPage checkAndSetDomClickSaleSwitch() {
        checkAndSetSwitch(domClickSaleSwitch, "true");
        return this;
    }

    @Step("Проверяем и устанавливаем галочку страхование жизни")
    public ZayavkaPage checkAndSetLifeInsuranceSwitch() {
        checkAndSetSwitch(lifeInsuranceSwitch, "true");
        return this;
    }

    @Step("Проверяем и устанавливаем галочку сертификат молодая семья")
    public ZayavkaPage checkAndSetYoungFamilySwitch() {
        checkAndSetSwitch(youngFamilySwitch, "true");
        return this;
    }

    @Step("Проверяем и устанавливаем галочку Онлайн сделка")
    public ZayavkaPage checkAndSetWebDealSwitch() {
        checkAndSetSwitch(webDealSwitch, "true");
        return this;
    }

    @Step("Устанавливаем Стоимость недвижимости")
    public ZayavkaPage fillFullPriceValue() {
        fillInputField(costHouse, "5180000");
        return this;
    }

    @Step("Устанавливаем Первоначальный взнос")
    public ZayavkaPage fillYourMoney() {
        fillInputField(yourMoney, "3058000");
        return this;
    }

    @Step("Устанавливаем количество лет")
    public ZayavkaPage fillYears() {
        fillInputField(years, "30");
        return this;
    }

    @Step("Проверяем ЕП")
    public ZayavkaPage checkMonthPayment() {
        checkText(monthPayment, "26491", "Сумма ЕП не совпадает");
        return this;
    }

    @Step("Проверяем сумму кредита")
    public ZayavkaPage checkCreditSumm() {
        checkText(creditSumm, "3680000", "Сумма кредита не совпадает");
        return this;
    }

    @Step("Проверяем необходимый уровень дохода")
    public ZayavkaPage checkNeedIncome() {
        checkText(needIncome, "34103", "Сумма необходимого дохода не совпадает");
        return this;
    }

    @Step("Проверяем процентную ставку")
    public ZayavkaPage checkProcent() {
        checkText(procent, "11%", "Так и задумано");
        return this;
    }
}
