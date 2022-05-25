package br.com.automacao.pages;

import org.openqa.selenium.WebDriver;

import br.com.automacao.teste.DSL;

public class InicialPage {

	private DSL dsl;

	public InicialPage(WebDriver driver) {
		dsl = new DSL(driver);
	}

	public void escreverSearch() {
		dsl.escrever("//input[@id='search_query_top']", "Short");
	}

	public void submitSearch() {
		dsl.submit("//input[@id='search_query_top']");

	}

}
