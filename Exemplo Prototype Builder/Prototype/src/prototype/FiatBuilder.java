package prototype;

public class FiatBuilder extends CarroBuilder {

	
	public void buildPreco() {
		carro.preco = 1000.00;
	}


	public void buildDscMotor() {
		carro.dscMotor = "1.0 Flex";
	}


	public void buildAnoDeFabricacao() {
		carro.anoDeFabricacao = 2010;
	}

	
	public void buildModelo() {
		carro.modelo = "Palio";
	}

	
	public void buildMontadora() {
		carro.montadora = "Fiat";
	}

}
