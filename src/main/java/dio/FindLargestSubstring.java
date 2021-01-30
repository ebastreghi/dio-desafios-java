package dio;

import java.io.IOException;
import java.util.Scanner;


public class FindLargestSubstring {
    public static void main(String[] args) throws IOException, Exception {
        Scanner scr = new Scanner(System.in);
        String string1, string2;

        while (scr.hasNextLine()) {
            string1 = scr.nextLine();
            string2 = scr.nextLine();
            System.out.println(lengthLargestSubstring(string1, string2));
        }

        scr.close();
    }

    private static int lengthLargestSubstring(String s1, String s2) {
        int maxLength = 0;

        if (s2.length() > s1.length()) {
            String s3 = s2;
            s2 = s1;
            s1 = s3;
        }

        for (int i = 0; i < s2.length(); i++) {
            for (int j = 0; j < i + 1; j++) {
                if (s1.contains(s2.substring(j, s2.length() - i + j))) {
                    maxLength = (maxLength > s2.length() - i) ? maxLength : s2.length() - i;
                }
            }
        }
        return maxLength;
    }

}


/**
 * Challenge
 * Find the largest common substring between the two reported strings. The substring can be any part of the string, including the whole. If there is no common substring, the output must be “0”. The comparison is case sensitive ('x'! = 'X').
 * <p>
 * Input
 * The entry contains several test cases. Each test case consists of two lines, each containing a string. Both input strings contain between 1 and 50 characters ('A' - 'Z', 'a' - 'z' or space ''), including, or at least one letter ('A' - 'Z', 'a '-'z').
 * <p>
 * Output
 * The size of the largest subsequence common between the two Strings.
 * <p>
 * <p>
 * Input Example Output Example
 * abcdef
 * cdofhij
 * TWO
 * FOUR
 * abracadabra
 * open
 * Hey This java is hot
 * Java is a new paradigm
 * <p>
 * two
 * 1
 * 0
 * 7
 * <p>
 * Desafio
 * Encontre a maior substring comum entre as duas strings informadas. A substring pode ser qualquer parte da string, inclusive ela toda. Se não houver subseqüência comum, a saída deve ser “0”. A comparação é case sensitive ('x' != 'X').
 * <p>
 * Entrada
 * A entrada contém vários casos de teste. Cada caso de teste é composto por duas linhas, cada uma contendo uma string. Ambas strings de entrada contém entre 1 e 50 caracteres ('A'-'Z','a'-'z' ou espaço ' '), inclusive, ou no mínimo uma letra ('A'-'Z','a'-'z').
 * <p>
 * Saída
 * O tamanho da maior subsequência comum entre as duas Strings.
 * <p>
 * <p>
 * Exemplo de Entrada	Exemplo de Saída
 * abcdef
 * cdofhij
 * TWO
 * FOUR
 * abracadabra
 * open
 * Hey This java is hot
 * Java is a new paradigm
 * <p>
 * 2
 * 1
 * 0
 * 7
 */


/**
 *Desafio
 * Encontre a maior substring comum entre as duas strings informadas. A substring pode ser qualquer parte da string, inclusive ela toda. Se não houver subseqüência comum, a saída deve ser “0”. A comparação é case sensitive ('x' != 'X').
 *
 * Entrada
 * A entrada contém vários casos de teste. Cada caso de teste é composto por duas linhas, cada uma contendo uma string. Ambas strings de entrada contém entre 1 e 50 caracteres ('A'-'Z','a'-'z' ou espaço ' '), inclusive, ou no mínimo uma letra ('A'-'Z','a'-'z').
 *
 * Saída
 * O tamanho da maior subsequência comum entre as duas Strings.
 *
 *
 * Exemplo de Entrada	Exemplo de Saída
 * abcdef
 * cdofhij
 * TWO
 * FOUR
 * abracadabra
 * open
 * Hey This java is hot
 * Java is a new paradigm
 *
 * 2
 * 1
 * 0
 * 7
 */