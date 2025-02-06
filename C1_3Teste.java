public class C1_3Teste {
    public static void main(String[] args) {
        int pizza = 80;
        String compraria = (pizza < 100) ? "compro" : "não compro";
        System.out.println("Eu compraria a pizza? " + compraria);
    }
}

// esse tipo de código se chama syntax sugar - operador ternário
// usa 3 "mecanismos" em uma mesma linha
// primeiro verifica a condição (pizza < 100) e então valida se compra ou não