package br.com.automacao.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.automacao.teste.DSL;

public class BuscaPage {

	private DSL dsl;

	public BuscaPage(WebDriver driver) {
		dsl = new DSL(driver);
	}

	public void validarPesquisa() {
		dsl.validarLista(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/h1[1]"));
	}

	public void clicarItem() {
		dsl.clicarBotao(By.xpath(
				"//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]/img[1]"));
	}
}
