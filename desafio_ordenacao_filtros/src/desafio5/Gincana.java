package desafio5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Gincana {

    private String nome;
    private int numero;

    public static void main(String[] args) throws IOException, Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        //System.out.println("Digite a quantidade de alunos");
        int quantAlunos = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken());
        List<Gincana> circulo = new ArrayList<>();
        var indiceAtual = 0;
        var indiceAlunoEliminado = 0;
        var valorAtualFicha = 0;

        while (quantAlunos > 0) {
            for (int i = 0; i < quantAlunos; i++) {
                //System.out.println("Digite o nome do aluno e um valor");
                var nomeNumeroAux = br.readLine().split(" ");
                    /*if(nomeNumeroAux[0].length() > 30){
                        throw new Exception();
                    }*/
                var gincanaModel = new Gincana();
                gincanaModel.nome = nomeNumeroAux[0];
                gincanaModel.numero = Integer.parseInt(nomeNumeroAux[1]);
                circulo.add(gincanaModel);
            }
            indiceAtual = 0;
            indiceAlunoEliminado = 0;
            valorAtualFicha = circulo.get(indiceAtual).numero;

            for (int i = 0; i < quantAlunos - 1; i++) {
                if (valorAtualFicha % 2 == 0) {
                    indiceAlunoEliminado = (circulo.size() - (valorAtualFicha % circulo.size()) + indiceAtual) % circulo.size();
                } else if (valorAtualFicha % 2 != 0) {
                    indiceAlunoEliminado = (valorAtualFicha % circulo.size() + indiceAtual) % circulo.size();
                }

                valorAtualFicha = circulo.get(indiceAlunoEliminado).numero;
                circulo.remove(indiceAlunoEliminado);

                indiceAtual = (valorAtualFicha % 2 == 0) ?
                        ((indiceAlunoEliminado <= circulo.size() - 1) ?
                                indiceAlunoEliminado : 0) :
                        ((indiceAlunoEliminado == 0) ?
                                (circulo.size() - 1) : (indiceAlunoEliminado - 1));
            }

            System.out.println("Vencedor(a): " + circulo.get(0).nome);
            circulo.clear();
            quantAlunos = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken());
        }

    }

}
