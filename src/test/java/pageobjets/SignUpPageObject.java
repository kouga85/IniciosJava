package pageobjets;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SignUpPageObject{
    private final WebDriver driver;

    public SignUpPageObject(WebDriver driver){

        this.driver = driver;

    }
//ubicación elementos
    private  By FirstNameTextbox = By.xpath("//input[@ng-model='FirstName']");
    private  By Lastnametextbox = By.xpath("//input[@ng-model='LastName']");
    private  By Adress = By.xpath("//textarea[@ng-model='Adress']");
    private  By EmailAdress = By.xpath("//input[@ng-model='EmailAdress']");
    private  By Phone = By.xpath("//input[@ng-model='Phone']");
    /*genero */
    private  By generoM = By.xpath("//input[@ng-model='radiovalue' and @value='Male']");
    private  By generoF = By.xpath("//input[@ng-model='radiovalue' and @value='FeMale']");
    /*checkbox */
    private  By CH1 = By.xpath("//input[@type='checkbox' and @value='Cricket']");
    private  By CH2 = By.xpath("//input[@type='checkbox' and @value='Movies']");
    private  By CH3 = By.xpath("//input[@type='checkbox']/following::input[@id='checkbox3']");
    private  By Skill = By.xpath("//select[@ng-model='Skill']");
    private  By Country = By.xpath("//select[contains(.,'Country')]");
    private  By SCountry = By.xpath("//span[contains(@class, 'select2') and contains(@id, 'select2-country')]");
    private  By Year = By.xpath("//select[@id='yearbox']");
    private  By Month = By.xpath("//select[@ng-model='monthbox']");
    private  By Day = By.xpath("//select[@ng-model='daybox']");
    private  By Fpass = By.xpath("//input[@id='firstpassword']");
    private  By Spass = By.xpath("//input[@id='secondpassword']");

    /*boton enviar */
    private  By btn1 = By.id("submitbtn");
    private  By btn2 = By.xpath("//button[@value='Refresh']");
    private  By Title = By.xpath("//h1");

    //primer nombre

  //acciones a ejecutar
public void go(String url) {this.driver.get(url);}
public void WriteFirstNameTextbox(String firstname){
    this.driver.findElement(this.FirstNameTextbox).sendKeys(firstname);
}

//apellido
    public void WriteLastnameTextbox(String Lastname){
        this.driver.findElement(this.Lastnametextbox).sendKeys(Lastname);
    }

//dirección
    public void WriteAdress(String Adress){
        this.driver.findElement(this.Adress).sendKeys(Adress);
    }
//correo electronico


    public void WriteEmailAdress(String EmailAdress){
        this.driver.findElement(this.EmailAdress).sendKeys(EmailAdress);
    }
 //telefono

    public void writePhone(String Phone){
        this.driver.findElement(this.Phone).sendKeys(Phone);
    }
//genero
    public void selectgeneroM(){
        this.driver.findElement(this.generoM).click();
    }
    public void selectgeneroF(){
        this.driver.findElement(this.generoF).click();
    }

    //selectors
    public void selectCH1(){
        this.driver.findElement(this.CH1).click();
    }
    public void selectCH2(){
        this.driver.findElement(this.CH2).click();
    }
    public void selectCH3(){
        this.driver.findElement(this.CH3).click();
    }



//Skill

/*    public void selectSkill(){
        this.driver.findElement(this.Skill).selectByValue(Skill);
    }
 //Country
    public void selectCountry(){
        this.driver.findElement(this.Country).isSelected(Country);
    }
    public void selectSCountry(){
        this.driver.findElement(this.SCountry).selectByIndex(SCountry);

    }
 //Years day month

    public void selectYear(){
        this.driver.findElement(this.Year).selectByValue(Year);
    }
    public void selectDay(){
        this.driver.findElement(this.Day).selectByValue(Day);
    }
    public void selectMonth(){
        this.driver.findElement(this.Month).selectByValue(Month);
    }
*/
  //pass

    public void WriteFpass(String Fpass){
        this.driver.findElement(this.Fpass).sendKeys(Fpass);
    }
    public void WriteSpass(String Spass){
        this.driver.findElement(this.Spass).sendKeys(Spass);
    }

    //boton

    public void Clickbtn1(){
        this.driver.findElement(this.btn1).click();
    }
    public void Clickbtn2(){
        this.driver.findElement(this.btn2).click();
    }











}
