package ConstrutoresThisSobrecargaEncapsulamento;


// Esta classe tem como objetivo abordar o conceito de encapsulamento.
// O encapsulamento serve para impedir o acesso e a manipulação direta dos atributos
// de uma classe por outras classes, protegendo seus dados internos.
// Para isso, utilizamos o modificador de acesso 'private', que restringe o acesso
// direto aos atributos.
//
// Mas então, como acessar ou modificar esses atributos?
// Utilizamos métodos de acesso, também conhecidos como Getters e Setters.
// - O método get[Atributo]() retorna o valor do atributo (apenas leitura).
// - O método set[Atributo]() permite definir ou alterar o valor do atributo (escrita),
//   podendo incluir validações antes de atribuir o valor.
//
// Dessa forma, conseguimos controlar como os dados são acessados e modificados,
// mantendo a integridade da classe.
public class ProductEncapsulation {

    // MODIFICADORES DE ACESSO
    // private = o membro só pode ser acessado na própria classe
    // (nada) = o membro só pode ser acessado nas classes do mesmo pacote
    // protected = o membro só pode ser acessado no mesmo pacote, bem como em subclasses de pacotes diferentes
    // public = o membro é acessado por todas as classes (ao menos que ele resida em um módulo diferente que não exporte o
    // pacote o qual ele pertence

    private String name;
    private double price;
    private int quantity;

    public String getName(){
        // Get que tem como objetivo retornar o nome do produto, ele é definido como public e o tipo do atributo que será
        // retornado, no caso uma String
        return name;
    }

    public void setName(String name){
        // Set que tem como objetivo atribuir o nome do produto, ele é definido como public e void
        // pois nao retornará nenhuma informação, apenas receberá o name por parametro e o atribuira ao objeto da classe.
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity(){
        return quantity;
    }
}
