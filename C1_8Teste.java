import java.util.Scanner;

public class C1_8Teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o dia da semana: ");
        String dia = entrada.next();  // Lê a string digitada pelo usuário
        
        // Usando switch com string insensível a maiúsculas/minúsculas
        switch(dia.toLowerCase()) {  // Converte a string para minúsculas
            case "segunda":
                System.out.println("Início da semana");
                break;
            case "sexta":
                System.out.println("Quase fim de semana");
                break;
            default:
                System.out.println("Nem uma das opções");
        }
        
        entrada.close();
    }
}

// Nesse caso não tem nem uma listagem fixa para o usuário por isso não tem int ou char
// usamos 'next' para que o programa leia a linha inteira do código
// o usuário pode digitar segunda ou sexta, se digitar QUALQUER outra coisa o switch vai fazer executar o default


