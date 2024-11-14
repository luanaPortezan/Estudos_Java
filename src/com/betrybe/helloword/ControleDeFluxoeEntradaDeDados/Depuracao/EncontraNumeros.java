package com.betrybe.helloword.ControleDeFluxoeEntradaDeDados.Depuracao;

import java.util.Scanner;

public class EncontraNumeros {
    public void buscar() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scan.nextInt();

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("O número " + numero + " tem " + antecessor + " como seu antecessor e " + sucessor + " como seu sucessor.");
        scan.close();

        // Dentre os principais conceitos relacionados a depuração estão:
        //
        //Os breakpoints (pontos de parada), são as linhas de código que marcamos como possível ponto de interesse e onde a execução será parcialmente interrompida. É aqui que os atuais valores para cada objeto e/ou variável podem ser recuperados e acessados para acompanhar possíveis atualizações, afinal de contas não queremos que a variável que deveria armazenar a soma de 2 + 2 tenha o valor 5 em nenhum momento, correto?
        //O step into nos permite entrar em um método que esteja sendo chamado em alguma linha de código, por exemplo o método de somar() que retorna a soma de dois números inteiros;
        //Já sua contraparte, o step out nos tira do método que entramos e nos leva de volta a linha que fez a chamada deste método;
        //O step over nos permite pular para a próxima linha durante a depuração e pode ser utilizado até que todo o programa já tenha sido percorrido;
        //Por fim, o resume, que permite que o programa siga o fluxo natural de execução, seja até o fim do programa ou até o próximo breakpoint.
        //Dicas valiosas:
        //
        //Projetos com erros de compilação não podem ser depurados;
        //Para a maioria dos testes que falham, o IntelliJ sublinha a linha em que a falha ocorreu na classe de testes correspondente. Ao passar o cursor do mouse por cima dessa linha, você verá um link (Debug NomeDaClasseDeTeste) que irá te permitir realizar a depuração do seu código, com isso você poderá comparar o resultado esperado pelo teste com o resultado obtido;
    }
}
