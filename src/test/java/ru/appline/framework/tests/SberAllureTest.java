package ru.appline.framework.tests;

import org.junit.Test;
import ru.appline.framework.baseTestsClass.BaseTests;
import ru.appline.framework.utils.ConstConteiner;

public class SberAllureTest extends BaseTests {
    @Test
    public void startTest() {
        app.getStartPage()
                .selectMenuIpoteka()
                .selectSecMenu()
                .checkTitle()
                .pushButtonZayavka()
                .checkTitle()
                .checkAndSetLoanPurpose()
                .setCardSwitch()
                .checkAndSetSwitchCertificate()
                .checkAndSetMotherMoneySwitch()
                .checkAndSetDomClickSaleSwitch()
                .checkAndSetLifeInsuranceSwitch()
                .checkAndSetYoungFamilySwitch()
                .checkAndSetWebDealSwitch()
                .fillFullPriceValue()
                .fillYourMoney()
                .fillYears()
                .checkMonthPayment()
                .checkCreditSumm()
                .checkNeedIncome()
                .checkProcent();

    }
}
