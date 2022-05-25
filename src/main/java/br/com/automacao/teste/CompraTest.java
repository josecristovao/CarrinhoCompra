package br.com.automacao.teste;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.automacao.pages.BuscaPage;
import br.com.automacao.pages.CarrinhoPage;
import br.com.automacao.pages.InicialPage;
import br.com.automacao.pages.ProdutoPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CompraTest {

	private WebDriver driver;
	private DSL dsl;
	private InicialPage pageHome;
	private BuscaPage pageSearch;
	private ProdutoPage productPage;
	private CarrinhoPage cartPage;

	@Before
	public void inicializa() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		dsl = new DSL(driver);
		pageHome = new InicialPage(driver);
		pageSearch = new BuscaPage(driver);
		productPage = new ProdutoPage(driver);
		cartPage = new CarrinhoPage(driver);
	}

	@After
	public void finaliza() {
		driver.quit();
	}

	@Test
	public void Compras() {
		pageHome.escreverSearch();
		pageHome.submitSearch();
		pageSearch.validarPesquisa();
		pageSearch.clicarItem();
		productPage.clicarBotaoAddCart();
		productPage.esperarElementoAparecer();
		productPage.irParaCarrinho();
		cartPage.validarCarrinho();
	}
}
