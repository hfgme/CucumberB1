package com.esty.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsyMainPage {
    public EtsyMainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "global-enhancements-search-quary")
    WebElement searchBox;

    @FindBy(xpath = "//button[@data-id='gnav-search-submit-button']")
    WebElement searchButton;

    public void searchItem(String item){
        searchBox.sendKeys(item);
        searchButton.click();
    }
}

