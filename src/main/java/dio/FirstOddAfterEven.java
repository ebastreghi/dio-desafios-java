package dio;

/**
 * Challenge
 * Create a program where you will receive non-negative integer values as input.
 *
 * Order these values according to the following criteria:
 *
 * Peers First
 * Then the Odd
 * You should display the pairs in ascending order and the odd ones in descending order.
 *
 * Input
 * The first line of input contains a single positive integer N (1 <N <10000) This is the number of lines of input that follows next. The next N lines will each have a non-negative integer value.
 *
 * Output
 * Display all values read from the entry in the order shown above. Each number should be printed on one line, as shown in the example below.
 *
 *
 * Input Example Output Example
 * 10
 * 4
 * 32
 * 34
 * 543
 * 3456
 * 654
 * 567
 * 87
 * 6789
 * 98
 *
 * 4
 * 32
 * 34
 * 98
 * 654
 * 3456
 * 6789
 * 567
 * 543
 * 87
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class FirstOddAfterEven {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        List<Integer> lista = new ArrayList<>();
        int numLinhas = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken());
        int leitura;
        if (numLinhas > 1 && numLinhas < 10000) {
            while (lista.size() != numLinhas) {
                st = new StringTokenizer(br.readLine());
                leitura = Integer.parseInt(st.nextToken());
                if (leitura > 0) {
                    lista.add(leitura);
                }
            }
            List<Integer> pares = new ArrayList<>();
            pares = lista.stream().filter(item -> item % 2 == 0).sorted().collect(Collectors.toList());
            List<Integer> impares = new ArrayList<>();
            impares = lista.stream().filter(item -> item % 2 != 0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
            for (Integer item : pares
            ) {
                System.out.println(item);
            }
            for (Integer item : impares
            ) {
                System.out.println(item);
            }
        }

    }

}


/**
 * Desafio
 * Crie um programa onde você receberá valores inteiros não negativos como entrada.
 *
 * Ordene estes valores de acordo com o seguinte critério:
 *
 * Primeiro os Pares
 * Depois os Ímpares
 * Você deve exibir os pares em ordem crescente e na sequência os ímpares em ordem decrescente.
 *
 * Entrada
 * A primeira linha de entrada contém um único inteiro positivo N (1 < N < 10000) Este é o número de linhas de entrada que vem logo a seguir. As próximas N linhas terão, cada uma delas, um valor inteiro não negativo.
 *
 * Saída
 * Exiba todos os valores lidos na entrada segundo a ordem apresentada acima. Cada número deve ser impresso em uma linha, conforme exemplo de saída abaixo.
 *
 *
 * Exemplo de Entrada	Exemplo de Saída
 * 10
 * 4
 * 32
 * 34
 * 543
 * 3456
 * 654
 * 567
 * 87
 * 6789
 * 98
 *
 * 4
 * 32
 * 34
 * 98
 * 654
 * 3456
 * 6789
 * 567
 * 543
 * 87
 */
