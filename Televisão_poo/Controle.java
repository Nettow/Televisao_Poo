import java.util.Locale;
import java.util.Scanner;

public class Controle {
    //Esses metodos faram a diferença entre a televisão digital e a smartv
    public void ConDigital(TV tv, int local){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        //Variaveis do obj

        //Variaveis int do ConDigital
        int tvd_es, canal_es, valid_ch, canal_add, canal_rep, canal_rem;

        //Variaveis String do ConDigital

        do {

            //O print está perguntado qual função da televisão digital o usuario irá querer
            System.out.println("==========================");
            System.out.println("1 - Ligar/Desligar televisão\n2 - Trocar de canal\n3 - Adicionar canal\n4 - Excluir canal\n5 - Aumentar volume\n6 - Diminuir volume\n7 - Sair");
            System.out.println("==========================");
            tvd_es = sc.nextInt();

            switch (tvd_es) {
                case 1:
                    tv.Status();
                    break;

                case 2:

                    //Verificando se a  televisão está ligada
                    if (tv.status == 0){
                        System.out.println("A televisão está desligada");
                        break;
                    }

                    do {
                        System.out.println("Canais disponiveis \n");
                        for (int i=0; i<TV.Canal.size(); i++){
                            System.out.print("|"+TV.Canal.get(i)+"|");
                        }

                        System.out.println("\nEscolha o canal:");
                        canal_es = sc.nextInt();
                        valid_ch = tv.Canais(canal_es);

                        if (valid_ch == 1) {
                            System.out.println("Canal invalido");
                        }
                    }while (valid_ch == 1);

                    System.out.println(tv.canal);

                    break;

                case 3:

                    if (tv.status == 0){
                        System.out.println("A televisão está desligada");
                        break;
                    }

                    do {
                        System.out.println("Digite o canal que quer adicionar");
                        canal_add = sc.nextInt();

                        canal_rep = tv.addcanal(canal_add);
                        if (canal_rep == 1) {
                            System.out.println("Digite um canal que não esteja na lista");

                        }
                    }while (canal_rep == 1);
                    break;

                case 4:

                    if (tv.status == 0){
                        System.out.println("A televisão está desligada");
                        break;
                    }

                    do{
                        System.out.println("Digite o canal que quer remover");
                        canal_rem = sc.nextInt();

                        canal_rep = tv.removecanal(canal_rem);

                        if (canal_rep == 1){
                            System.out.println("Digite um canal que esteja na lista");
                        }

                    }while (canal_rep == 1);

                    break;

                case 5:

                    if (tv.status == 0){
                        System.out.println("A televisão está desligada");
                        break;
                    }

                    tv.Volume_aum();
                    break;

                case 6:

                    if (tv.status == 0){
                        System.out.println("A televisão está desligada");
                        break;
                    }

                    tv.Volume_dim();
                    break;

                case 7:

                    break;

                default:
                    System.out.println("Opção invalida");
                    break;
            }

            //Area de status da televisão digital, aqui mostrara tudo sobre a televisão, onde o usuario estaria interessado.
            System.out.println("========================");
            if (local == 1){
                System.out.println("Televisão da sala");
            }
            else if(local == 2){
                System.out.println("Televisão do quarto");
            }
            else{
                System.out.println("Televisão da varanda");
            }

            System.out.println("Televisão Digital");

            if (tv.status == 1){
                System.out.println("Ligado");
            }
            else{
                System.out.println("Desligado");
            }

            System.out.println("Canal: "+tv.canal);

            System.out.println("Volume: "+tv.volume);
            System.out.println("========================");

        }while (tvd_es != 7);
    }

//Controle da Smartv
    public void ConSmartv(Smarttv Stv, int local){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        //Variaveis do obj

        //Variaveis int do ConSmartv
        int tvs_es, canal_es, valid_ch, canal_add, canal_rep, canal_rem;

        //Variaveis String do ConSmart

        do {

            //O print está perguntado qual função da televisão Smart o usuario irá querer
            System.out.println("==========================");
            System.out.println("1 - Ligar/Desligar televisão\n2 - Trocar de canal\n3 - Adicionar canal\n4 - Excluir canal\n5 - Aumentar volume\n6 - Diminuir volume\n7 - Conectar \n8 - Alterar modo \n9 - Alterar login e senha \n10 - Sair");
            System.out.println("==========================");
            tvs_es = sc.nextInt();

            switch (tvs_es) {
                case 1:
                    Stv.Status();
                    break;

                case 2:

                    //Verificando se a  televisão está ligada
                    if (Stv.status == 0){
                        System.out.println("A televisão está desligada");
                        break;
                    }

                    do {
                        System.out.println("Canais disponiveis \n");
                        for (int i=0; i<TV.Canal.size(); i++){
                            System.out.print("|"+ TV.Canal.get(i)+"|");
                        }

                        System.out.println("\nEscolha o canal:");
                        canal_es = sc.nextInt();
                        valid_ch = Stv.Canais(canal_es);

                        if (valid_ch == 1) {
                            System.out.println("Canal invalido");
                        }
                    }while (valid_ch == 1);

                    System.out.println(Stv.canal);

                    break;

                case 3:

                    if (Stv.status == 0){
                        System.out.println("A televisão está desligada");
                        break;
                    }

                    do {
                        System.out.println("Digite o canal que quer adicionar");
                        canal_add = sc.nextInt();

                        canal_rep = Stv.addcanal(canal_add);
                        if (canal_rep == 1) {
                            System.out.println("Digite um canal que não esteja na lista");

                        }
                    }while (canal_rep == 1);
                    break;

                case 4:

                    if (Stv.status == 0){
                        System.out.println("A televisão está desligada");
                        break;
                    }

                    do{
                        System.out.println("Digite o canal que quer remover");
                        canal_rem = sc.nextInt();

                        canal_rep = Stv.removecanal(canal_rem);

                        if (canal_rep == 1){
                            System.out.println("Digite um canal que esteja na lista");
                        }

                    }while (canal_rep == 1);

                    break;

                case 5:

                    if (Stv.status == 0){
                        System.out.println("A televisão está desligada");
                        break;
                    }

                    Stv.Volume_aum();
                    break;

                case 6:

                    if (Stv.status == 0){
                        System.out.println("A televisão está desligada");
                        break;
                    }

                    Stv.Volume_dim();
                    break;

                case 7:

                    if (Stv.status == 0){
                        System.out.println("A televisão está desligada");
                        break;
                    }

                    System.out.println("Coloque o usuario da conta");
                    int login = sc.nextInt();

                    System.out.println("Coloque a senha da conta");
                    int senha = sc.nextInt();

                    int res = Stv.conect(login, senha);

                    if (res == 0){
                        System.out.println("Usuario ou senha incorretos");

                    }


                    break;

                case 8:

                    if (Stv.status == 0){
                        System.out.println("A televisão está desligada");
                        break;
                    }

                    Stv.mode();
                    break;

                case 9:

                    if (Stv.status == 0){
                        System.out.println("A televisão está desligada");
                        break;

                    }

                    System.out.println("Coloque o usuario atual da conta");
                    int atlogin = sc.nextInt();

                    System.out.println("Coloque a senha atual da conta");
                    int atsenha = sc.nextInt();

                    int resm = Stv.conect(atlogin, atsenha);

                    if (resm == 0){
                        System.out.println("Senha ou usuario incorreto");
                        break;
                    }
                    System.out.println("Digite o novo usuario");
                    int nlogin = sc.nextInt();

                    System.out.println("Digite a nova senha");
                    int nsenha =sc.nextInt();

                    Stv.mconta(nlogin, nsenha);

                    break;

                case 10:

                    break;

                default:
                    System.out.println("Opção invalida");
                    break;
            }

            //Area de status da televisão digital, aqui mostrara tudo sobre a televisão, onde o usuario estaria interessado.
            System.out.println("========================");
            if (local == 1){
                System.out.println("Televisão da sala");
            }
            else if(local == 2){
                System.out.println("Televisão do quarto");
            }
            else{
                System.out.println("Televisão da varanda");
            }

            System.out.println("Smartv");

            if (Stv.status == 1){
                System.out.println("Ligado");
            }
            else{
                System.out.println("Desligado");
            }

            System.out.println("Canal: "+Stv.canal);

            System.out.println("Volume: "+Stv.volume);

            if (Stv.conect == 0){
                System.out.println("Desconectado");

            }
            else{
                System.out.println("Conectado");

            }

            if(Stv.mode == 0){
                System.out.println("Televisão Digital");

            }
            else{
                System.out.println("Streaming");

            }
            System.out.println("========================");

        }while (tvs_es != 10);
    }

}

