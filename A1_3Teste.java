public class A1_3Teste {
    public static final double PI = 3.14161514118;
 
    public static void main(String[] args) {
        float valor = 12.123456789f;
       
        System.out.printf("Float com 6 casas decimais: %.6f\n", valor);
        System.out.printf("Float em notação científica: %e\n", valor);
        System.out.printf("Valor da constante PI: %.4f\n", PI);
    }
 }
// o especificador 'f' serve para limitar a quantidade de caracteres em double ou float
 
 