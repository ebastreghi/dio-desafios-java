package dio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Challenge
 * Professor Girafales organized the making of a uniform for the school's classes to celebrate the end of the year. After a few conversations, it was decided with the students that they could choose the uniform color between white or red. Therefore, Girafales needs your help to organize the lists of those who want the uniform in each class, listing these shirts by color, size (P, M or G) and finally by name.
 *
 * Input
 * Each test case starts with an integer and positive value N, (1 ≤ N ≤ 60), which indicates the amount of uniforms to be made for that class. The next N * 2 lines contain information for each uniform (there will be two lines of information for each uniform). The first line will contain the student's name and the second line will contain the uniform color ("white" or "red") followed by a space and the uniform size "P" "M" or "G". The entry ends when the value of N equals zero (0) and this value should not be processed.
 *
 * Output
 * For each entry case, the information ordered by color in ascending order should be printed, followed by sizes in descending order and lastly in ascending order of name, as shown in the example below.
 *
 *
 *
 * Input Example Output Example
 * 9
 * Maria Jose
 * white P
 * Mangojata Mancuda
 * red P
 * Cezar Torres Mo
 * white P
 * Baka Lhau
 * red P
 * JuJu Mentina
 * white M
 * Amaro Dinha
 * red P
 * Adabi Finho
 * white G
 * Severina Rigudinha
 * white G
 * Carlos Chad Losna
 * red P
 * 0
 *
 * white P Cezar Torres Mo
 * white P Maria Jose
 * white M JuJu Mentina
 * white G Adabi Finho
 * white G Severina Rigudinha
 * red P Amaro Dinha
 * red P Baka Lhau
 * red P Carlos Chad Losna
 * red P Mangojata Mancuda
 */

public class YearEndUniforms {
    private String nome;
    private String tamanho;
    private String cor;

    public static void main(String[] args) throws IOException, Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        List<YearEndUniforms> lista = new ArrayList<>();
        System.out.println("Digite a n lista");
        int num = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken());

        if (num >= 1 && num <= 60) {
            while (num > 0) {
                var uniformeModel = new YearEndUniforms();
                System.out.println("Digite o nome");
                uniformeModel.setNome(br.readLine());
                System.out.println("Digite a cor e o tamanho");
                var corTamanhoAux = br.readLine().split(" ");
                uniformeModel.setCor(corTamanhoAux[0]);
                uniformeModel.setTamanho(corTamanhoAux[1]);
                lista.add(uniformeModel);
                num--;
            }
        }

        lista.sort(new Comparator<YearEndUniforms>() {
            @Override
            public int compare(YearEndUniforms u1, YearEndUniforms u2) {
                if (u1.getCor().equals(u2.getCor())) {
                    if (u1.getTamanho().equals(u2.getTamanho())) {
                        return u1.getNome().compareTo(u2.getNome());
                    }
                    return u2.getTamanho().compareTo(u1.getTamanho());
                }
                return u1.getCor().compareTo(u2.getCor());
            }
        });

        //essa parte comentada da errado, nao ordena como no sql, precisei impplementar comparator
        /*Comparator<Uniforme> comparador = Comparator.comparing(Uniforme::getNome)
                                                    .thenComparing(Uniforme::getTamanho)
                                                    .thenComparing(Uniforme::getCor);
        lista = lista.stream().sorted(comparador).collect(Collectors.toList());*/
        lista.stream().forEach(uniforme -> System.out.println(uniforme.getCor() + " " + uniforme.getTamanho() + " " + uniforme.getNome()));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}

/**
 * Desafio
 * O professor Girafales organizou a confecção de um uniforme para as turmas da escola para comemorar o final do ano. Após algumas conversas, ficou decidido com os alunos que eles poderiam escolher a cor do uniforme entre branco ou vermelho. Assim sendo, Girafales precisa de sua ajuda para organizar as listas de quem quer o uniforme em cada uma das turmas, relacionando estas camisetas pela cor, tamanho (P, M ou G) e por último pelo nome.
 *
 * Entrada
 * Cada caso de teste inicia com um valor N, (1 ≤ N ≤ 60) inteiro e positivo, que indica a quantidade de uniformes a serem feitas para aquela turma. As próximas N*2 linhas contém informações de cada um dos uniformes (serão duas linhas de informação para cada uniforme). A primeira linha irá conter o nome do estudante e a segunda linha irá conter a cor do uniforme ("branco" ou "vermelho") seguido por um espaço e pelo tamanho do uniforme "P" "M" ou "G". A entrada termina quando o valor de N for igual a zero (0) e esta valor não deverá ser processado.
 *
 * Saída
 * Para cada caso de entrada deverão ser impressas as informações ordenadas pela cor em ordem ascendente, seguido pelos tamanhos em ordem descendente e por último por ordem ascendente de nome, conforme o exemplo abaixo.
 *
 *
 *
 * Exemplo de Entrada	Exemplo de Saída
 * 9
 * Maria Jose
 * branco P
 * Mangojata Mancuda
 * vermelho P
 * Cezar Torres Mo
 * branco P
 * Baka Lhau
 * vermelho P
 * JuJu Mentina
 * branco M
 * Amaro Dinha
 * vermelho P
 * Adabi Finho
 * branco G
 * Severina Rigudinha
 * branco G
 * Carlos Chade Losna
 * vermelho P
 * 0
 *
 * branco P Cezar Torres Mo
 * branco P Maria Jose
 * branco M JuJu Mentina
 * branco G Adabi Finho
 * branco G Severina Rigudinha
 * vermelho P Amaro Dinha
 * vermelho P Baka Lhau
 * vermelho P Carlos Chade Losna
 * vermelho P Mangojata Mancuda
 */