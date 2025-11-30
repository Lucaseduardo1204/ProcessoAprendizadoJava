package memoriaarrayslistas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
    public static void main(String[] args) {

        //Não aceita tipos primitivos, apenas Wrapper class
        List<String> list;

        //Instância
        list = new ArrayList<>();

        //Inserir elemento na lista: add(obj), add(int, obj)
        list.add("teste");
        list.add("Teste 2");
        list.add("Teste 3");
        list.add(1, "Teste 1");

        //Tamanho da lista: size()
        System.out.println(list.size());

        //Remover elementos da lista: remove(obj), remove(int), removeIf(Predicate)
        list.remove("teste"); //-> remove a partir da comparação do valor, posição, ou que atenda um predicado,Ex: todos que começam com M

        list.removeIf(x -> x.charAt(0) == 'M');

        //Encontrar posição de elemento: indexOf(obj), lastIndexOf(obj)
        list.indexOf("teste");

        //Filtrar lista com base em predicado:
        List <String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        //Encontrar primeira ocorrência com base em predicado:4
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);



        for( String x : list){
            System.out.println(x);
        }

    }
}
