public class F1_2Teste {
    public static void main(String[] args) {
        // Criando um array de inteiros
        int[] numeros = {1, 2, 3, 4, 5};
 
        // Obtendo o tamanho do array usando a propriedade length
        int tamanho = numeros.length; // método java chamado length é usado para saber o tamanho da caixa (array) e esse valor é guardado em outra variável (tamanho)
 
        // Imprimindo o tamanho do array
        System.out.println("O tamanho do array é: " + tamanho);

         // Usando o tamanho em um loop para imprimir todos os elementos
        System.out.println("Elementos do array:");
        for (int i = 0; i < numeros.length; i++) {
           System.out.println("Elemento " + i + ": " + numeros[i]); // aqui faz ele mostrar um por um dos elementos que estão dentro da caixa
 
        
        }
    }
}
 
 
 