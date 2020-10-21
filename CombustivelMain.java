
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class CombustivelMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String op1;
		int op2, nn;
		String n;
		double val, p;
		BigDecimal litros;
		BigDecimal valor;
		
		Scanner input = new Scanner(System.in);
		BombaCombustivel a = new BombaCombustivel();
		BombaCombustivel b = new BombaCombustivel();
		BombaCombustivel c = new BombaCombustivel();
		a.setId(1);
		b.setId(2);
		c.setId(3);
		
		
		do{
			System.out.println("----------MENU DE INTERAÇÃO DE BOMBAS DE COMBUSTIVEL----------");
			System.out.println("Bombas disponiveis:");
			System.out.println("Bomba a");
			System.out.println("Bomba b");
			System.out.println("Bomba c");
			System.out.println("Sair (pressione s)");
			System.out.println("Selecione bomba de combustivel: ");
			op1 = input.next();
			switch(op1) {
				case "a":
					do {
						System.out.println("1 - Registrar novo combustivel");
						System.out.println("2 - Abastecer em R$");
						System.out.println("3 - Abastecer em litros");
						System.out.println("0 - Sair da bomba a");
						System.out.println("Selecione uma opção: ");
						op2 = input.nextInt();
						if(op2 == 1) {
								TipoCombustivel aa = new TipoCombustivel();
								System.out.println("Nome do combustivel");
								n = input.next();
								//input.nextLine();
								aa.setNomeComb(n);
								System.out.println("Preço do combustivel");
								valor = input.nextBigDecimal();
								aa.setPreco(valor);
								a.insertTipo(aa);
						}
						if(op2 == 2) {
							ArrayList<TipoCombustivel> bombaA = a.getListaTipo();
							System.out.println("Qual o combustivel desejado?");
							for(int i = 0; i < bombaA.size();i++) {
								System.out.printf("Tipo %d: %s\n", i, bombaA.get(i).getNomeComb());
							}
							nn = input.nextInt();
							System.out.println("Valor para abastecimento em R$:");
							valor = input.nextBigDecimal();
							TipoCombustivel aux = bombaA.get(nn);
							BigDecimal litragem_final = (valor.divide(aux.getPreco()));
							System.out.println("Litragem final: "+ litragem_final.toString() +" Litros");
							
						}
						
						if(op2 == 3) {
								ArrayList<TipoCombustivel> bombaA = a.getListaTipo();
								System.out.println("Qual o combustivel desejado?");
								for(int i = 0; i < bombaA.size();i++) {
									System.out.printf("%d: %s\n", i, bombaA.get(i).getNomeComb());
								}
								nn = input.nextInt();
								System.out.println("Quantidade em litros para abastecer:");
								litros = input.nextBigDecimal();
								TipoCombustivel aux = bombaA.get(nn);
								BigDecimal preco_final = litros.multiply(aux.getPreco());
								System.out.println("Preco final: "+ preco_final +"R$");
						}
						if(op2 == 0) {
							System.out.println("Saindo...");
						}
					}while(op2 != 0);
					break;
					
					
					
				case "b":
					do {
						System.out.println("1 - Registrar novo combustivel");
						System.out.println("2 - Abastecer em R$");
						System.out.println("3 - Abastecer em litros");
						System.out.println("0 - Sair da bomba b");
						System.out.println("Selecione uma opção: ");
						op2 = input.nextInt();
						if(op2 == 1) {
							TipoCombustivel bb = new TipoCombustivel();
							System.out.println("Nome do combustivel");
							n = input.next();
							//input.nextLine();
							bb.setNomeComb(n);
							System.out.println("Preço do combustivel");
							valor = input.nextBigDecimal();
							bb.setPreco(valor);
							b.insertTipo(bb);
						}
						if(op2 == 2) {
							ArrayList<TipoCombustivel> bombaB = b.getListaTipo();
							System.out.println("Qual o combustivel desejado?");
							for(int i = 0; i < bombaB.size();i++) {
								System.out.printf("Tipo %d: %s\n", i, bombaB.get(i).getNomeComb());
							}
							nn = input.nextInt();
							System.out.println("Valor para abastecimento em R$:");
							valor = input.nextBigDecimal();
							TipoCombustivel aux = bombaB.get(nn);
							BigDecimal litragem_final = valor.divide(aux.getPreco());
							System.out.println("Litragem final: "+ litragem_final.toString() +" Litros");
							
						}
						
						if(op2 == 3) {
							ArrayList<TipoCombustivel> bombaB = b.getListaTipo();
							System.out.println("Qual o combustivel desejado?");
							for(int i = 0; i < bombaB.size();i++) {
								System.out.printf("%d: %s\n", i, bombaB.get(i).getNomeComb());
							}
							nn = input.nextInt();
							System.out.println("Quantidade em litros para abastecer:");
							litros = input.nextBigDecimal();
							TipoCombustivel aux = bombaB.get(nn);
							BigDecimal preco_final = litros.multiply(aux.getPreco());
							System.out.println("Preco final: "+ preco_final +"R$");
						}
						if(op2 == 0) {
							System.out.println("Saindo...");
						}
					}while(op2 != 0);
					break;
				
				case "c":
					do {
						System.out.println("1 - Registrar novo combustivel");
						System.out.println("2 - Abastecer em R$");
						System.out.println("3 - Abastecer em litros");
						System.out.println("0 - Sair da bomba c");
						System.out.println("Selecione uma opção: ");
						op2 = input.nextInt();
						if(op2 == 1) {
							TipoCombustivel cc = new TipoCombustivel();
							System.out.println("Nome do combustivel");
							n = input.next();
							//input.nextLine();
							cc.setNomeComb(n);
							System.out.println("Preço do combustivel");
							valor = input.nextBigDecimal();
							cc.setPreco(valor);
							c.insertTipo(cc);
						}
						if(op2 == 2) {
							ArrayList<TipoCombustivel> bombaC = c.getListaTipo();
							System.out.println("Qual o combustivel desejado?");
							for(int i = 0; i < bombaC.size();i++) {
								System.out.printf("Tipo %d: %s\n", i, bombaC.get(i).getNomeComb());
							}
							nn = input.nextInt();
							System.out.println("Valor para abastecimento em R$:");
							valor = input.nextBigDecimal();
							TipoCombustivel aux = bombaC.get(nn);
							BigDecimal litragem_final = (valor.divide(aux.getPreco()));
							System.out.println("Litragem final: "+ litragem_final.toString() +" Litros");
							
						}
						
						if(op2 == 3) {
							ArrayList<TipoCombustivel> bombaC = c.getListaTipo();
							System.out.println("Qual o combustivel desejado?");
							for(int i = 0; i < bombaC.size();i++) {
								System.out.printf("%d: %s\n", i, bombaC.get(i).getNomeComb());
							}
							nn = input.nextInt();
							System.out.println("Quantidade em litros para abastecer:");
							litros = input.nextBigDecimal();
							TipoCombustivel aux = bombaC.get(nn);
							BigDecimal preco_final = litros.multiply(aux.getPreco());
							System.out.println("Preco final: "+ preco_final +"R$");
						}
						
						if(op2 == 0) {
							System.out.println("Saindo...");
						}
				}while(op2 != 0);
				break;
				
				case "s":
					System.out.println("Saindo do app...");
					System.exit(0);
					
				default: System.out.println("Opção inválida");
			}
		}while(op1 != "s");
		input.close();
	}

}
