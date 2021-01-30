package dio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;


/**
 * Challenge
 * Pedro always works late every day, so he has little time for household chores. To save time he makes the grocery list in an app and usually writes down each item at the same time he realizes that he is missing at home.
 *
 * The problem is that the application does not delete duplicate items, as Pedro writes down the same item more than once and the list ends up getting long. His task is to improve the notes application by developing code that excludes duplicate items from the shopping list and alphabetically orders them.
 *
 * Input
 * The first entry line contains an integer N (N <100) with the number of test cases that follow, or rather, the number of shopping lists to organize. Each shopping list consists of a single line containing from 1 to 1000 items or words composed only of lowercase letters (from 1 to 20 letters), without accents and separated by a space.
 *
 * Output
 * The output contains N lines, each representing a shopping list, without repeated items and in alphabetical order.
 *
 *
 * Input Example Output Example
 * two
 * orange meat juice pickle orange pickle
 * orange pear orange pear pear
 *
 * orange meat pickle juice
 * pear orange
 */

public class SupermarketShopping {
    public static void main(String[] args) throws IOException, Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        List<List<String>> listas = new ArrayList<>();
        System.out.println("Digite a n lista");
        int numListas = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken());
        String produtos;
        if (numListas < 100) {
            while (listas.size() != numListas) {
                //digitar uma linha toda separada por espaço de 1 a 1000 itens (cada item pode ter até 20 caracteres)
                System.out.println("Digite os itens");
                produtos = br.readLine();
                List<String> listaAuxiliar = new ArrayList<>();
                var produtusAux= produtos.toLowerCase().split(" ");
                if(!(produtusAux.length > 1 && produtusAux.length <= 1000)) {
                    throw new Exception();
                }
                if(Arrays.stream(produtusAux).anyMatch(item -> item.length() < 1 || item.length() > 20)){
                    throw new Exception();
                }
                listaAuxiliar = Arrays.stream(produtusAux)
                        .filter(item -> item.length() > 1 && item.length() <= 20)
                        .distinct()
                        .sorted()
                        .collect(Collectors.toList());
                listas.add(listaAuxiliar);
            }
        }
        listas.stream()
                .map(lista -> lista.stream().collect(Collectors.joining(" ")))
                .forEach(System.out::println);
    }

}


/**
 * Desafio
 * Pedro trabalha sempre até tarde todos os dias, com isso tem pouco tempo tempo para as tarefas domésticas. Para economizar tempo ele faz a lista de compras do supermercado em um aplicativo e costuma anotar cada item na mesma hora que percebe a falta dele em casa.
 *
 * O problema é que o aplicativo não exclui itens duplicados, como Pedro anota o mesmo item mais de uma vez e a lista acaba ficando extensa. Sua tarefa é melhorar o aplicativo de notas desenvolvendo um código que exclua os itens duplicados da lista de compras e que os ordene alfabeticamente.
 *
 * Entrada
 * A primeira linha de entrada contém um inteiro N (N < 100) com a quantidade de casos de teste que vem a seguir, ou melhor, a quantidade de listas de compras para organizar. Cada lista de compra consiste de uma única linha que contém de 1 a 1000 itens ou palavras compostas apenas de letras minúsculas (de 1 a 20 letras), sem acentos e separadas por um espaço.
 *
 * Saída
 * A saída contém N linhas, cada uma representando uma lista de compra, sem os itens repetidos e em ordem alfabética.
 *
 *
 * Exemplo de Entrada	Exemplo de Saída
 * 2
 * carne laranja suco picles laranja picles
 * laranja pera laranja pera pera
 *
 * carne laranja picles suco
 * laranja pera
 */