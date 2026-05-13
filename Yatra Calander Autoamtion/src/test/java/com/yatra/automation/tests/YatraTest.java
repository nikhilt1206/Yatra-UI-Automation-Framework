package com.yatra.automation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;

public class YatraTest extends BaseTest{

    @Test
    public void launchTest() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        closePopUp();
        clickOnDepartureDate(wait);
        WebElement currentMonthWebElement = selectTheMonthFromCalender(wait,0);
        WebElement nextMonthWebElement = selectTheMonthFromCalender(wait,1);
        Thread.sleep(2000);
        String lowestPriceForCurrentMonth = getMeLowestPrice(currentMonthWebElement);
        String lowestPriceForNextMonth= getMeLowestPrice(nextMonthWebElement);
        System.out.println(lowestPriceForCurrentMonth);
        System.out.println(lowestPriceForNextMonth);
        compareTwoMonthsPrices(lowestPriceForCurrentMonth,lowestPriceForNextMonth);
    }

    private static void clickOnDepartureDate(WebDriverWait wait) {
        By departureDateButtonLocator = By.xpath("//div[@aria-label='Departure Date inputbox' and@role='button']");
        WebElement departureDateButton = wait.until(ExpectedConditions.elementToBeClickable(departureDateButtonLocator));
        departureDateButton.click();
    }

    private static String getMeLowestPrice(WebElement monthWebElement) {
        By priceLocator = By.xpath(".//span[contains(@class,'custom-day-content')]");
        List<WebElement> mayPriceList = monthWebElement.findElements(priceLocator);
        int lowestPrice=Integer.MAX_VALUE;
        WebElement priceElement = null;
        for(WebElement price : mayPriceList){
            String priceString = price.getText();
            if(priceString.length()>0) {
                priceString = priceString.replace("₹", "").replace(",", "");
                int priceInt = Integer.parseInt(priceString);
                if (priceInt < lowestPrice) {
                    lowestPrice = priceInt;
                    priceElement = price;
                }
            }
        }
        WebElement dateElement = priceElement.findElement(By.xpath(".//../.."));
        String result =dateElement.getAttribute("aria-label")+"---- Price is ₹" + lowestPrice;
        return result;
    }

    public static WebElement selectTheMonthFromCalender(WebDriverWait wait, int index){
        By calenderMonthLocator = By.xpath("//div[@class='react-datepicker__month-container']");
        List<WebElement> calendarMonthsList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(calenderMonthLocator));
        WebElement monthCalendarWebElement = calendarMonthsList.get(index);
        return monthCalendarWebElement;
    }
    public static void compareTwoMonthsPrices(String currentMonthPrice,String nextMonthPrice){
        int currentMonthRSIndex = currentMonthPrice.indexOf("₹");
        int nextMonthRSIndex = nextMonthPrice.indexOf("₹");
        String currentPrice = currentMonthPrice.substring(currentMonthRSIndex+1);
        String nextPrice = nextMonthPrice.substring(nextMonthRSIndex+1);

        int current = Integer.parseInt(currentPrice);
        int next = Integer.parseInt(nextPrice);

        if(current<next){
            System.out.println("The lowest price for the two months is: "+current);
        }
        else if(current == next){
            System.out.println("Price is same for both months! Choose whatever you prefer!!");
        }
        else{
            System.out.println("The lowest price for the two months is: "+next);
        }
    }
    private void closePopUp() {
        By popUpLocator = By.xpath("//div[contains(@class,'style_popup')][1]");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            WebElement popUpWebElement = wait.until(ExpectedConditions.visibilityOfElementLocated(popUpLocator));
            WebElement crossButton = popUpWebElement.findElement(By.xpath("//img[@alt='cross']"));
            crossButton.click();
        } catch (TimeoutException e) {
            System.out.println("Pop up not shown in the screen!!!");
        }
    }
}
