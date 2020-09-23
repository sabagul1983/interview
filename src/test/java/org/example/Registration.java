package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Registration {
    WebDriver driver;

    public Registration (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(css="input[id=\"gender-male\"]")
    WebElement search;
    public void doSearch(){
        search.click();
    }

    @FindBy(css="input[data-val-required=\"First name is required.\"]")
    WebElement firstName;
    public void putName(String name){
        firstName.sendKeys(name);
        System.out.println(name);
    }

    @FindBy(css="input[data-val-required=\"Last name is required.\"]")
    WebElement lastName;
    public void putLast(String name){
        lastName.sendKeys(name);
        System.out.println(name);
    }

    @FindBy(css="select[name=\"DateOfBirthDay\"]")
    WebElement select;
    public void choseDate(String date){
        Select scl= new Select(select);
        scl.selectByVisibleText(date);
        System.out.println(date);
    }
    @FindBy(css="select[name=\"DateOfBirthMonth\"]")
    WebElement months;
    public void selectMonth(String month){
        Select scl= new Select(months);
        scl.selectByVisibleText(month);
        System.out.println(month);
    }

    @FindBy(css="select[name=\"DateOfBirthYear\"]")
    WebElement year;
    public void selectYear(String years){
        Select scl= new Select(year);
        scl.selectByVisibleText(years);
        System.out.println(years);

    }
    @FindBy(css="input[data-val-required=\"Email is required.\"]")
    WebElement email;
    public void putEmail(String emailsId){
        email.sendKeys(emailsId);
        System.out.println(emailsId);

    }
    @FindBy(css="input[id=\"Company\"]")
    WebElement company;
    public void companyName(String nameOfCompany){
        company.sendKeys(nameOfCompany);
        System.out.println(nameOfCompany);

    }
    @FindBy(css="input[data-val-required=\"The Newsletter field is required.\"]")
    WebElement tick;
    public void tickBox(){
        tick.click();

    }
    @FindBy(css="input[id=\"Password\"]")
    WebElement password;
    public void putPassword(String pass){
        password.sendKeys(pass);
        System.out.println(pass);

    }
    @FindBy(css="input[id=\"ConfirmPassword\"]")
    WebElement confirmPass;
    public void newPass(String passWords){
        confirmPass.sendKeys(passWords);
        System.out.println(passWords);

    }
    @FindBy(css="input[name=\"register-button\"]")
    WebElement register;
    public void doRegister(){
        register.click();
    }
}
