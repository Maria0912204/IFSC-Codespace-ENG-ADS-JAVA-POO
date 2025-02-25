import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JogoDaForcaPlus {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tentativas = 6;
        String palavraEscolhida, palavraOculta;

        Map<String, String> dicas = new HashMap<>();
        dicas.put("java", "É uma linguagem de programação.");
        dicas.put("forca", "É um jogo popular.");
        dicas.put("carro", "É um meio de transporte.");
        dicas.put("sol", "É uma estrela no céu.");
        dicas.put("gato", "É um animal de estimação.");

        System.out.print("Jogador 1, digite seu nome: ");
        String jogador1 = teclado.nextLine();
        System.out.print("Jogador 2, digite seu nome: ");
        String jogador2 = teclado.nextLine();

        System.out.print(jogador1 + ", escolha uma palavra para o jogador 2 adivinhar: ");
        palavraEscolhida = teclado.nextLine().toLowerCase();
        String dica = dicas.getOrDefault(palavraEscolhida, "Dica não disponível.");

        palavraOculta = "_".repeat(palavraEscolhida.length());
        int estadoForca = 0;

        while (tentativas > 0 && palavraOculta.contains("_")) {
            System.out.println("\nTurno de " + jogador2);
            System.out.println("Palavra: " + palavraOculta);
            System.out.println("Tentativas restantes: " + tentativas);
            System.out.println("Dica: " + dica);
            mostrarForca(estadoForca);

            System.out.print("\nDigite uma letra: ");
            char letra = teclado.next().charAt(0);

            boolean acerto = false;
            StringBuilder novaPalavraOculta = new StringBuilder(palavraOculta);

            for (int i = 0; i < palavraEscolhida.length(); i++) {
                if (palavraEscolhida.charAt(i) == letra) {
                    novaPalavraOculta.setCharAt(i, letra);
                    acerto = true;
                }
            }

            if (!acerto) {
                tentativas--;
                estadoForca++;
            }
            palavraOculta = novaPalavraOculta.toString();
        }

        if (palavraOculta.equalsIgnoreCase(palavraEscolhida)) {
            System.out.println("Parabéns " + jogador2 + ", você acertou a palavra! A palavra era: " + palavraEscolhida);
        } else {
            System.out.println("\nVocê perdeu! A palavra era: " + palavraEscolhida);
        }

        teclado.close();
    }

    public static void mostrarForca(int estado) {
        String[] forca = {
            "  _______  \n |       |  \n |          \n |          \n |          \n |          \n_|___       ",
            "  _______  \n |       |  \n |       O  \n |          \n |          \n |          \n_|___       ",
            "  _______  \n |       |  \n |       O  \n |       |  \n |          \n |          \n_|___       ",
            "  _______  \n |       |  \n |       O  \n |      /|  \n |          \n |          \n_|___       ",
            "  _______  \n |       |  \n |       O  \n |      /|\\ \n |          \n |          \n_|___       ",
            "  _______  \n |       |  \n |       O  \n |      /|\\ \n |      /   \n |          \n_|___       ",
            "  _______  \n |       |  \n |       O  \n |      /|\\ \n |      / \\ \n |          \n_|___       "
        };
        System.out.println(forca[estado]);
    }
}
