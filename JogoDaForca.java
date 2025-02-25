import java.util.Scanner;

public class JogoDaForca {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palavra = "java";  // Palavra a ser adivinhada
        char[] palavraOculta = new char[palavra.length()];  // Array para a palavra oculta
        for (int i = 0; i < palavra.length(); i++) {
            palavraOculta[i] = '_';  // Inicializa a palavra oculta com underscores
        }
        int tentativas = 20;  // Número de tentativas

        while (tentativas > 0 && new String(palavraOculta).contains("_")) {
            System.out.println("Palavra: " + new String(palavraOculta));
            System.out.println("Tentativas restantes: " + tentativas);
            System.out.print("Digite uma letra: ");
            char letra = teclado.next().charAt(0);

            boolean acerto = false;

            // Verifica se a letra está na palavra
            for (int i = 0; i < palavra.length(); i++) {
                if (palavra.charAt(i) == letra) {
                    palavraOculta[i] = letra;  // Substitui o underline pela letra correta
                    acerto = true;
                }
            }

            if (!acerto) {
                tentativas--;  // Diminui o número de tentativas se a letra estiver errada
            }
        }

        if (new String(palavraOculta).equals(palavra)) {
            System.out.println("Você venceu! A palavra era: " + palavra);
        } else {
            System.out.println("Você perdeu! A palavra era: " + palavra);
        }

        teclado.close();
    }
}
