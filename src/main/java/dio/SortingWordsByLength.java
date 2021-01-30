package dio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class SortingWordsByLength {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        List<String> sortedWordList = new ArrayList<>();

        int countTestCases = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken());
        for (int i = 0; i < countTestCases; i++) {
            var wordList = Arrays.stream(br.readLine().split(" "))
                    .sorted(new Comparator<String>() {
                        @Override
                        public int compare(String o1, String o2) {
                            if (o1.length() == o2.length()) {
                                return o1.compareTo(o2);
                            }
                            return o2.length() - o1.length();
                        }
                    })
                    .collect(Collectors.joining(" "));

            sortedWordList.add(wordList);
        }
        sortedWordList.forEach(System.out::println);
    }
}


/**
 * Challenge
 * Create an algorithm to order a set of words by their length. Your program should receive a set of words and return this same set ordered by decreasing word size, if the word size is the same, it should be ordered in alphabetical order.
 * <p>
 * Input
 * The first line of the entry has a single integer N, which indicates the number of test cases. Each test case can contain from 1 to 50 words inclusive, and each word can contain between 1 and 50 characters inclusive. The characters can be spaces, letters, or numbers.
 * <p>
 * Output
 * The output must contain the set of words from the input ordered by the size of the words and if the size of the words is the same, it must be ordered in alphabetical order. A blank space must be printed between two words.
 * <p>
 * <p>
 * Input Example Output Example
 * two
 * One three four mond at midnight
 * one three five
 * <p>
 * midnight three four mond One at
 * three five one
 * <p>
 * Desafio
 * Crie um algoritmo para ordenar um conjunto de palavras pelo seu tamanho. Seu programa deve receber um conjunto de palavras e retornar este mesmo conjunto ordenado pelo tamanho das palavras decrescente, se o tamanho das palavras for igual, deve-se ordernar por ordem alfabética.
 * <p>
 * Entrada
 * A primeira linha da entrada possui um único inteiro N, que indica o número de casos de teste. Cada caso de teste poderá conter de 1 a 50 palavras inclusive, e cada uma das palavras poderá conter entre 1 e 50 caracteres inclusive. Os caracteres poderão ser espaços, letras, ou números.
 * <p>
 * Saída
 * A saída deve conter o conjunto de palavras da entrada ordenado pelo tamanho das palavras e caso o tamanho das palavras for igual, deve-se ordernar por ordem alfabética.. Um espaço em branco deve ser impresso entre duas palavras.
 * <p>
 * <p>
 * Exemplo de Entrada	Exemplo de Saída
 * 2
 * One three four mond at midnight
 * one three five
 * <p>
 * midnight three four mond One at
 * three five one
 * <p>
 * Desafio
 * Crie um algoritmo para ordenar um conjunto de palavras pelo seu tamanho. Seu programa deve receber um conjunto de palavras e retornar este mesmo conjunto ordenado pelo tamanho das palavras decrescente, se o tamanho das palavras for igual, deve-se ordernar por ordem alfabética.
 * <p>
 * Entrada
 * A primeira linha da entrada possui um único inteiro N, que indica o número de casos de teste. Cada caso de teste poderá conter de 1 a 50 palavras inclusive, e cada uma das palavras poderá conter entre 1 e 50 caracteres inclusive. Os caracteres poderão ser espaços, letras, ou números.
 * <p>
 * Saída
 * A saída deve conter o conjunto de palavras da entrada ordenado pelo tamanho das palavras e caso o tamanho das palavras for igual, deve-se ordernar por ordem alfabética.. Um espaço em branco deve ser impresso entre duas palavras.
 * <p>
 * <p>
 * Exemplo de Entrada	Exemplo de Saída
 * 2
 * One three four mond at midnight
 * one three five
 * <p>
 * midnight three four mond One at
 * three five one
 */


/**
 * Desafio
 * Crie um algoritmo para ordenar um conjunto de palavras pelo seu tamanho. Seu programa deve receber um conjunto de palavras e retornar este mesmo conjunto ordenado pelo tamanho das palavras decrescente, se o tamanho das palavras for igual, deve-se ordernar por ordem alfabética.
 *
 * Entrada
 * A primeira linha da entrada possui um único inteiro N, que indica o número de casos de teste. Cada caso de teste poderá conter de 1 a 50 palavras inclusive, e cada uma das palavras poderá conter entre 1 e 50 caracteres inclusive. Os caracteres poderão ser espaços, letras, ou números.
 *
 * Saída
 * A saída deve conter o conjunto de palavras da entrada ordenado pelo tamanho das palavras e caso o tamanho das palavras for igual, deve-se ordernar por ordem alfabética.. Um espaço em branco deve ser impresso entre duas palavras.
 *
 *
 * Exemplo de Entrada	Exemplo de Saída
 * 2
 * One three four mond at midnight
 * one three five
 *
 * midnight three four mond One at
 * three five one
 */