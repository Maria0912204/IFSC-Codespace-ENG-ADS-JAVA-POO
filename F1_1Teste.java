public class F1_1Teste {
    public static void main(String[] args) {
        float[] n = {12, 3.456985f, 4, -3, 9};
        System.out.printf("1o elemento %.2f\n", n[0]); // sempre começa no zero 
        System.out.printf("2o elemento %.5f\n", n[1]); // o numero 2 antes do f significa que vão ter 2 casas deciamis após a vírgula
        System.out.printf("3o elemento %.2f\n", n[2]); // o que tem dentro da caixa [] indica a posição da variável
        System.out.printf("4o elemento %.2f\n", n[3]); // o n antes da caixa é o nome da caixa (nome da variável)
        System.out.printf("5o elemento %.2f\n", n[4]); // printf tem precisão mas precisa que declarar o identificador (%.2f)
    }
 }
 
 // float, tem que por o f do lado para que possa usar casas decimais 
 // double tem a mesma funcionalidade de colocar numeros reais com casas decimais mas no double podemos usar mais caracteres
 // array (vetor) é uma caixa organizadora ([])
 // o \n é para pular linha, é um sinalizador de controle 
 // println não precisa colocar identificador, precisa por o (+ n), n sendo a variável, ou seja, + e a variável