import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
    //se digitar main ele já monta toda essa frase acima
        // criar um objeto tenis com os valores digitados.
        //Exibir os valores que estão dentro do objeto
        // Criar o objeto responsavel por ler os dados digitados no teclado

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a cor do ténis que procura");
        String cor = leitor.next() + leitor.nextLine(); //Le a String com mais de uma palavra
        System.out.println("Digite o modelo do Tenis");
        String modelo = leitor.next() + leitor.nextLine();
        System.out.println("Digite o tamanho do tênis");
        double tamanho = leitor.nextDouble();
        System.out.println( "Digite o preço que está procurando");
        double preco = leitor.nextDouble();
        System.out.println("Gostaria de procurar algo a pronta entrega? True or False");
        boolean disponivel = leitor.nextBoolean();// quando rodar o programa escreve true or false

        //Ler as informações da marca
        System.out.println("Digite o nome da marca");
        String nomeMarca = leitor.next() + leitor.nextLine();

        System.out.println("Digite o nome do arquivo da logo");
        String logo = leitor.next() + leitor.nextLine();

        //Criar o objeto marca 
        Marca marca= new Marca();

        //Atribuir os valores ao objeto
        marca.nome = nomeMarca;
        marca.logo = logo;
   

        //Criar o objeto Tenis
        Tenis tenis1 = new Tenis();
        //Colocar os valores lidos dentro do objeto
        tenis1.modelo = modelo; //estou linkando a variavel tenis1 com o modelo escrito anteriormente
        tenis1.cor = cor;
        tenis1.disponivel = disponivel;
        tenis1.tamanho = tamanho;
        tenis1.preco = preco;
        tenis1.marca = marca;

        //Exibir os valores que estão dentro do objeto
        System.out.println("Modelo:" + tenis1.modelo);
        System.out.println("Cor" + tenis1.cor);
        System.out.println("Disponivel" + tenis1.disponivel);
        System.out.println("Tamanho" + tenis1.tamanho);
        System.out.println("Preço" + tenis1.preco);
        //Exibir os dados da marca (através do objeto tenis)
        System.out.println("Marca" + tenis1.marca.nome);
        System.out.println("Logo" +tenis1.marca.logo);

        //Chamar (invoar) o método para aumentar o valor em 15
        double aumento = tenis1.checarPreco(15);
        tenis1.aumentarPreco(aumento); // Só passar o valor do float. O nome porcentagem já está atribuido

        //Exibir o valor atualizado do tenis
        System.out.println("Valor atualizado: "+ tenis1.preco);
        System.out.println("O aumento foi de: "+ aumento);
    }
}
