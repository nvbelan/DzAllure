package ru.appline.framework.baseTestsClass;


import org.junit.After;
import org.junit.Before;

import ru.appline.framework.managers.InitManager;
import ru.appline.framework.managers.ManagerPages;

import ru.appline.framework.utils.MyAllureListener;

public class BaseTests {

    protected ManagerPages app = ManagerPages.getManagerPages();

    @Before
    public void beforeEach() {
        InitManager.initFramework();
    }

    @After
    public void afterEach() {
        MyAllureListener.addScreenshot();
        InitManager.quitFramework();
    }
}
