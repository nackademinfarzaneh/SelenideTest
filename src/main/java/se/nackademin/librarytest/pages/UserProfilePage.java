/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin.librarytest.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author testautom-nack
 */
public class UserProfilePage extends MenuPage {

    @FindBy(css = "#gwt-uid-5")
    SelenideElement userNameFiled;

    @FindBy(css = "#gwt-uid-13")
    SelenideElement emailFiled;

    @FindBy(css = "#edit-user")
    SelenideElement editUserButton;

    public String getUserName() {
        return userNameFiled.getText();
    }

    public String getEmailFiled() {
        return emailFiled.getText();
    }

    public void clickEditUserButton() {

        clickButton("Edit user button", editUserButton);
    }

}