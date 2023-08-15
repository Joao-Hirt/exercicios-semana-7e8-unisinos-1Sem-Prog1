import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Exercício 1:
        a) Sexo Inválido! ; b) Sexo Inválido! ; c) Sexo Inválido! ; d) Sexo Inválido! ; e) Sexo Inválido! ;

        Explicação:

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Digite seu sexo:");
        String sexo = scanner.nextLine();
        if(sexo == "F" && sexo == "f"){
            System.out.println("Sexo feminino!");
        }else if (sexo == "M" && sexo == "m"){
            System.out.println("Sexo masculino!");
        }else
            System.out.println("Sexo inválido!");

        Exercício 2:
        a)
        for(int x=10; x<100; x++){
            System.out.println(x);
        }
        b)
        for(int y=100; y>=0; y--){
            System.out.println(y);
        }
        c)
        for(int z = 50; z!=10){
            if(z>10){
                z--;
            }else{
                z++;
            }
        }

        Exercício 3:
        O comando do/while é uma estrutura que executa uma ação pelo menos uma vez antes de avaliar a condição:
        int x=10;
        do{                                         do{
            System.out.println(x);                  //bloco de código para executar
            x++;
        }while(x<10);                               }while(condição);

        O comando while é uma estrutura que executa o bloco de código caso a condição seja atendida.
        (usado quando a gente não sabe quantas vezes o loop deve ser executado.):
        int x=0;
        while(x<10){                                while(condição){
            System.out.println(x);                  //bloco de código para executar
            x++;
        }                                           }

        Já o for é uma estrutura que executa o bloco de código repetidamente enquanto a condição seja atendida.
        (usado quando a gente sabe quantas vezes o loop deve ser executado.) Também é usado para percorrer um array
        ou quando precisa executar certa função em um número específico de vezes:
        for(int x=0; x<10; x++){                    for(inicialização;condição;atualização){
            System.out.println(x);                  //bloco de código para executar
        }                                           }

        Exercício 4:
        É usada em laços (for/while/do while) e em switch para interromper imediatamente quando a condição é atendida:
        int i=0;
        while (i<10){
            if(i==5){
                break;
            }
            System.out.println(i);
            i++;
        }
        ou
        int diadaSemana = 5;
        switch (diadaSemana){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Dia de Semana");
                break;
            default:
                System.out.println("Fim de Semana");
                break;
        }

        Exercício 5:
        System.out.println(c.getMarca());

        Exercício 6:
        if (p.getIdade()>18){
            System.out.println("Maior de Idade");
        }else{
            System.out.println("Menor de Idade");
        }

        Exercício 7:
        int valor = -1
        while(valor<=0){
            System.out.println("Digite um valor inteiro positivo: ");
            valor = input.nextInt();
        }
        System.out.println(valor);

        Exercício 8:
        public class Estojo {
            private Cor cor;
            private Caneta[] canetas

            public Estojo (Cor cor, Caneta caneta1, Caneta caneta2){
                this.cor = cor;
                this.canetas = new Caneta[2];
                this.canetas[0] = caneta1;
                this.canetas[1] = caneta2;
            }
            public Cor getCor(){
                return cor;
            }
            public Caneta[] getCanetas() {
                return canetas;
            }
        }

        Exercício 9:
        (importar, class publica main, e static void main)

        System.out.println("Cor Estojo (Valor de R): ");
        int r = scanner.nextInt();

        System.out.println("Cor Estojo (Valor de G): ");
        int g = scanner.nextInt();

        System.out.println("Cor Estojo (Valor de B): ");
        int b = scanner.nextInt();

        Cor corEstojo = new Cor(r, g, b);

        System.out.println("Marca primeira Caneta: ");
        String marca1 = scanner.next();

        System.out.println("Cor primeira Caneta (Valor de R): ");
        int r1 = scanner.nextInt();

        System.out.println("Cor primeira Caneta (Valor de G): ");
        int g1 = scanner.nextInt();

        System.out.println("Cor primeira Caneta (Valor de B): ");
        int b1 = scanner.nextInt();

        Cor corCaneta1 = new Cor(r1, g1, b1);
        Caneta caneta1 = new Caneta(marca1, corCaneta1);

        System.out.println("Marca segunda Caneta: ");
        String marca2 = scanner.next();

        System.out.println("Cor segunda Caneta (Valor de R): ");
        int r2 = scanner.nextInt();

        System.out.println("Cor segunda Caneta (Valor de G): ");
        int g2 = scanner.nextInt();

        System.out.println("Cor segunda Caneta (Valor de B): ");
        int g3 = scanner.nextInt();

        Cor corCaneta2 = new Cor(r2, g2, b2);
        Caneta caneta2 = new Caneta(marca2, corCaneta2);

        Estojo estojo = new Estojo(corEstojo, caneta1, caneta2);

        Exercício 9:
        Podemos utilizar sem chaves { } caso só exista uma instrução a ser executada.
        Quando há mais de uma, deve se usar chaves obrigatóriamente.
        */
    }
}