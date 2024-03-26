package support.commands;

import org.openqa.selenium.WebElement;

import java.util.NoSuchElementException;

public class Commands {
    public static boolean elementVisible(WebElement element) throws NoSuchElementException{
        try {
            return element.isDisplayed();
        } catch (NoSuchElementException e){
            return false;
        }
    }
}
