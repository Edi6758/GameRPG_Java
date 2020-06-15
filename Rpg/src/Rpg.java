import java.util.Random;
import java.util.Scanner;

public class Rpg {

	public static void main(String[] args) {
		// Scanner
		Scanner input = new Scanner(System.in);
		
		// Randomizar
		Random rand = new Random();
		
		//Variaveis texto
		String resposta, nome, elemento;
		
		//Variaveis numericas
		int dano =39, poder =39, vida =39, agilidade =39, vidaInimigo, danoInimigo, resultadoBatalha;
		
		//Variaveis boolean
		boolean genio = false, anjo = false, demonio = false;
		
		//Introdução
		System.out.print("Bem vindo a Wodlavid, um mundo místico que se passa\n"
				+ "a um universo paralelo ao de vocês. Oque você esta presenciando\n"
				+ "aqui nada mais é que uma viagem temporal editavel. Ou seja,\n"
				+ "sempre que você fechar esse arquivo essa linha temporal \n"
				+ "entre os dois mundos é encerrada e você terá que recomeçar.\n"
				+ "Cada ação influencia de maneira direta a sua sobrevivência \n"
				+ "em Wodlavid. As suas chances de viver ou morrer, ficar rico ou pobre,\n"
				+ "são uma junção das suas escolhas mais o destino presente nessa \n"
				+ "linha temporal.\n"
				+ "\n"
				+ "Deseja continuar? (Sim)(Não)");
		resposta = input.next();
		if(resposta.equals("sim") || resposta.equals("Sim")) {
			System.out.print("\nMuito bem peregrino...\n");
			
		}else if(resposta.equals("não") || resposta.equals("Não") ) {
			System.out.print("Você destruiu essa linha temporal. GAME OVER");
			System.exit(0);
		}else {
			System.out.print("Você DESOBEDECEU A ENTIDADE. GAME OVER");
			System.exit(0);
		}
		
		System.out.print("Vamos começar então."
				+ "\n\nComo você quer ser chamado?\n ");
		
		nome = input.next();
		
		
		System.out.print("Muito bem, "+nome+" "
				+ "\nEscolha um elemento\n"
				+ "(Agua, Terra, Fogo, Ar)\n"
				+ "NÃO QUEBRE AS REGRAS\n");
		elemento = input.next();
		
		if(elemento.equals("Agua")) {
			dano += rand.nextInt(63);
			poder += rand.nextInt(85);
			vida += rand.nextInt(63);
			agilidade += rand.nextInt(63);
			System.out.print("Ok "+nome+ " você é do elemento "+elemento+" seus atributos são:\n"
					+ "dano: "+dano+" poder: "+poder+" vida: "+vida+" agilidade: "+agilidade);
			
		}else if(elemento.equals("Terra")) {
			dano += rand.nextInt(63);
			poder += rand.nextInt(63);
			vida += rand.nextInt(85);
			agilidade += rand.nextInt(63);
			System.out.print("Ok "+nome+ " você é do elemento "+elemento+" seus atributos são:\n"
					+ "dano: "+dano+" poder: "+poder+" vida: "+vida+" agilidade: "+agilidade);
			
		}else if(elemento.equals("Fogo")) {
			dano += rand.nextInt(88);
			poder += rand.nextInt(61);
			vida += rand.nextInt(61);
			agilidade += rand.nextInt(61);
			System.out.print("Ok "+nome+ " você é do elemento "+elemento+" seus atributos são:\n"
					+ "dano: "+dano+" poder: "+poder+" vida: "+vida+" agilidade: "+agilidade);
		}
		
		else if(elemento.equals("Ar")) {
			dano += rand.nextInt(63);
			poder += rand.nextInt(63);
			vida += rand.nextInt(63);
			agilidade += rand.nextInt(85);
			System.out.print("Ok "+nome+ " você é do elemento "+elemento+" seus atributos são:\n"
					+ "dano: "+dano+" poder: "+poder+" vida: "+vida+" agilidade: "+agilidade);
		}
		
		else {
			System.out.print("Você destruiu essa linha temporal. GAME OVER");
			System.exit(0);
		}
		
		//Algoritimo que verefica genialidade
		
		if(dano >= 100 || poder >= 100 || vida >= 100 || agilidade >=100 ) {
			System.out.print("\n\nSuas atitudes desde criança sempre foram destacadas\n"
					+ "aos 10 anos já era formado na academia de batalha\n"
					+ "todo esse talento lhe torna um GÊNIO.");
					genio = true;
			
		}else if(dano >= 99 && poder >= 99 && vida >= 99 && agilidade >=99) {
			System.out.print("\n\nA graça de Deus ungiu seu nascimento, por mais que\n"
					+ "ninguem perceba você tem um DOM divino...");
					anjo = true;
			
		}else if(dano == 66 && poder == 66 && vida == 66 && agilidade == 66) {
			System.out.print("\n\nSua mãe morreu no parto, seu nascimento foi uma \n"
					+ "desgraça para todos presentes. A aflição era visivel a todos\n"
					+ "oque você é afinal?");
					demonio = true;
			
		}else {
			System.out.print("\n\nVocê nasceu e cresceu com muita saúde, você tem \n"
					+ "certa afeição pelo(a)"+elemento);
		}
		
		System.out.print("\n\nVocê cresceu em um povoado pequeno em uma vila de artesões \n"
				+ "apesar de talentoso de maneira artística, você quer ser um guarda da elite real.\n"
				+ "Logo você foi treinado e formado na academia de batalha, você espera ser chamado\n"
				+ "pra fazer um teste pela Elite do rei, assim você consegue avaliar se esta ou não\n"
				+ "pronto para ser um soldado...");
		
		System.out.print("\n\nSeu pai esta trabalhando como ferreiro no momento. Oque deseja fazer?\n"
				+ "(a comida está acabando)"
				+ "\nOque deseja fazer? "
				+ "\n(Ir caçar na floresta mais proxima (caçar)) (esperar seu pai chegar (esperar))");
		
		resposta = input.next();
		if(resposta.equals("caçar")){
			
			vidaInimigo = rand.nextInt(200);
			danoInimigo = rand.nextInt(200);
			
			System.out.print("\n\nEntrando um pouco na floresta você acha um porco selvagem, e resolve caça-lo:"
					+ "\nPorco selvagem Surgiu: " + vidaInimigo + "HP" + " dano: " + danoInimigo
					+ "\nOque deseja fazer?"
					+ "\n(atacar): (conjurar): ");
					resposta = input.next();
					if(resposta.equals("atacar")) {
						resultadoBatalha = vidaInimigo - dano;
						if(resultadoBatalha <= 0) {
							vida = vida + 10;
							System.out.print("Você o matou e levou a carne para casa."
									+ "\nSeus pais ficaram tão contentes que você recebeu uma malha de couro\n"
									+ "sua vida aumentou em 10: " + vida+" HP");
						}else {
							System.out.print("\nO seu ataque causou : "+dano+" dano");
							System.out.print("\nO porco lhe ataca: ");
							vida = vida - danoInimigo; 
							if(vida <= 0 ) {
								System.out.print("Você morreu, essa linha temporal foi destruida.");
								
							}else	{
								System.out.print("Sua vez\n (atacar) (conjurar)");
								resposta = input.next();
								if(resposta.equals("atacar")) {
									resultadoBatalha = vidaInimigo - dano;
									if(resultadoBatalha <= 0) {
										vida = vida + 10;
										System.out.print("Você o matou e levou a carne para casa. vida do porco = "+vidaInimigo+" HP"
												+ "\nSeus pais ficaram tão contentes que você recebeu uma malha de couro\n"
												+ "sua vida aumentou em 10: " + vida+" HP");
									}else {
										System.out.print("\nO porco lhe ataca: ");
										vida = vida - danoInimigo; 
										if(vida <= 0 ) {
											System.out.print("Você morreu, essa linha temporal foi destruida.");

									}
							}

						}
					}
				}
					
					
			}
		}else {
			System.out.print("Parabéns você é preguiçoso");
		}
		
	}

}
