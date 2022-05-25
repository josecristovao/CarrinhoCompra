package br.com.automacao.pages;

import org.openqa.selenium.WebDriver;

import br.com.automacao.teste.DSL;

public class CarrinhoPage {

	private DSL dsl;

	public CarrinhoPage(WebDriver driver) {
		dsl = new DSL(driver);
	}

	public void validarCarrinho() {
		dsl.validarCarrinho("Faded Short Sleeve T-shirts");
	}

}
