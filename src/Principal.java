import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
    //se digitar main ele já monta toda essa frase acima
        // criar um objeto tenis com os valores digitados.
        //Exibir os valoes que estão dentro do objeto
        // Criar o objeto responsavel por ler os dados digitados no teclado

        Scanner tenis = new Scanner(System.in);

        System.out.println("Digite a cor do ténis que procura");
        String cor = tenis.next() + tenis.nextLine(); //Le a String com mais de uma palavra
        System.out.println("Digite o modelo do Tenis");
        String modelo = tenis.next() + tenis.nextLine();
        System.out.println("Digite o tamanho do tênis");
        double tamanho = tenis.nextDouble();
        System.out.println( "Digite o preço que está procurando");
        double preco = tenis.nextDouble();
        System.out.println("Gostaria de procurar algo a pronta entrega? True or False");
        boolean disponivel = tenis.nextBoolean();// quando rodar o programa escreve true or false

        //Criar o objeto Tenis
        Tenis tenis1 = new Tenis();
        //Colocar os valores lidos dentro do objeto
        tenis1.modelo = modelo; //estou linkando a variavel tenis1 com o modelo escrito anteriormente
        tenis1.cor = cor;
        tenis1.disponivel = disponivel;
        tenis1.tamanho = tamanho;
        tenis1.preco = preco;

        //Exibir os valores que estão dentro do objeto
        System.out.println("Modelo:" + tenis1.modelo);
        System.out.println("Cor" + tenis1.cor);
        System.out.println("Disponivel" + tenis1.disponivel);
        System.out.println("Tamanho" + tenis1.tamanho);
        System.out.println("Preço" + tenis1.preco);
    }
}
