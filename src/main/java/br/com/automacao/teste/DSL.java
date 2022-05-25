package br.com.automacao.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.automacao.teste.CompraTest;

public class DSL {

	protected WebDriver driver;

	public DSL(WebDriver driver) {
		this.driver = driver;
	}

	public void escrever(String xpath_campo, String texto) {
		driver.findElement(By.xpath(xpath_campo)).sendKeys(texto);

	}

	public void submit(String xpath_campo) {
		driver.findElement(By.xpath(xpath_campo)).submit();
	}

	public String obterTexto(By by) {
		return driver.findElement(by).getText();
	}

	public void validarLista(By by) {
		String texto_1 = driver.findElement(by).getText();
		Assert.assertTrue(texto_1.contains("SHORT"));
	}

	public void esperaElemento(By by) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	public void validarCarrinho(String texto1) {
		String texto = driver.findElement(By.xpath("//tbody/tr[@id='product_1_1_0_0']/td[2]/p[1]/a[1]")).getText();
		assertEquals(texto1, texto);
	}
	
	public void clicarBotao(By by) {
		driver.findElement(by).click();
	}
}
