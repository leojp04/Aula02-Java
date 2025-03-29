public class Tenis {


    String cor;
    String modelo;
    double tamanho;
    double preco;
    boolean disponivel;

    //Atributo de referencia(outra classe que iremos criar)
    Marca marca;

    //Métodos
    //Método aumentar o preço do tenis em porcentagem (10,20)

        double checarPreco(float porcentagem){
            return preco * porcentagem/100;

    }
        void aumentarPreco(double valor){
            preco += valor;
            //Quando você vai criar um método que faz algo, mas não precisa devolver um valor (como exibir uma mensagem, realizar um cálculo, etc.), você usa o void
            //É como uma "instrução" que você pode chamar para fazer algo específico, como calcular algo, exibir informações, alterar valores, etc.
    }
}

