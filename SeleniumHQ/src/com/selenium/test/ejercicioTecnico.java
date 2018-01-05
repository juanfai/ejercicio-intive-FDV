package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ejercicioTecnico {
	
	public static void main(String[] args) throws InterruptedException {
		
		// path del Chromedriver
		String pathChromeDriver = ("D:/Programas/eclipse/chromedriver.exe");
		
		// ubicación chromedriver
		System.setProperty("webdriver.chrome.driver", pathChromeDriver);
				
		// crear Chrome Driver en ventana del navegador
		ChromeDriver driver = new ChromeDriver();		
		
		// crear espera
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		// abrir el buscador de google
		driver.get("http://www.google.com");

		// encontrar campo de búsqueda cuando éste se haya cargado e ingresar el texto "Seleniumhq"
		WebElement buscarTexto = wait.until(ExpectedConditions.elementToBeClickable(By.id("lst-ib")));
		buscarTexto.sendKeys("Seleniumhq");
		
		// presionar la tecla ENTER
		buscarTexto.sendKeys(Keys.ENTER);
		
		// clickear link de Selenium
		WebElement linkSel = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Selenium - Web Browser Automation")));
		linkSel.click();
		
		// obtener titulo de la página a la que se accedió y cerrar navegador
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mainContent")));
		System.out.println("Ud. está en el sitio: " + (driver.getTitle()));	
		
		// esperar 5 segundos y cerrar el navegador
		Thread.sleep(5000);
		driver.close();
		
	}
	
}
