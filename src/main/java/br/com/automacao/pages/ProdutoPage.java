package br.com.automacao.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.automacao.teste.DSL;

public class ProdutoPage {

	private DSL dsl;

	public ProdutoPage(WebDriver driver) {
		dsl = new DSL(driver);
	}

	public void clicarBotaoAddCart() {
		dsl.clicarBotao(By.xpath("//span[contains(text(),'Add to cart')]"));
	}

	public void esperarElementoAparecer() {
		dsl.esperarElemento(By.linkText("Proceed to checkout"));
	}

	public void irParaCarrinho() {
		dsl.clicarBotao(By.linkText("Proceed to checkout"));
	}

}
