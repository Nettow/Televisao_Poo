import java.util.Scanner;
import java.util.Locale;

//Author: Raimundo Neto

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Variavel obj
        TV Tvsala = null, TvQuarto = null, TvVaranda = null;
        Controle con = new Controle();

        //Variaveis int do main
        int local, tipo = 0, ts = 0, tq = 0, tvv = 0, v1 = 0, v2 = 0, v3 = 0;

        //Variaveis String do main

        //Escolha do local onde a televisão ira ficar
        //Os print ao redor são so para estética do texto

        for (int i=0; i<3; i++) {
            System.out.println("=======================");
            System.out.println("Onde colocará a sua televisão: ");
            if (v1 == 0){
                System.out.println("1 - Sala");
            }
            if (v2 == 0){
                System.out.println("2 - Quarto");

            }
            if (v3 == 0){
                System.out.println("3 - Varanda");
            }
            System.out.println("=======================");
            local = sc.nextInt();

            //Escolha do tipo de televisão, sendo televisão digital, ou smartv
            System.out.println("=======================");
            System.out.println("Qual tipo de televisão irá colocar: \n1 - Televisão Digital\n2 - Smartv");
            System.out.println("=======================");
            tipo = sc.nextInt();


            if(local == 1){
                ts = tipo;
                v1 = 1;

            }
            else if (local == 2){
                tq = tipo;
                v2 = 1;

            }
            else if(local == 3){
                tvv = tipo;
                v3 = 1;

            }

            if (local<1 || local>3 || tipo<1 || tipo>2){
                System.out.println("Opções invalida");
                i--;
                if (local == 1){
                    v1 = 0;

                }
                else if (local == 2){
                    v2 = 0;

                }
                else if (local == 3){
                    v3 = 0;

                }

            }

            if(local == 1){
                if(tipo == 1){
                    Tvsala = new TV();

                }
                else if (tipo == 2){
                    Tvsala = new Smarttv();

                }
            }
            else if (local == 2){
                if (tipo == 1){
                    TvQuarto = new TV();

                }
                else if (tipo == 2){
                    TvQuarto = new Smarttv();

                }
            }
            else if (local == 3){
                if (tipo == 1){
                    TvVaranda = new TV();

                }
                else if (tipo == 2){
                    TvVaranda = new Smarttv();
                }
            }
        }


                do {
                    System.out.println("=======================");
                    System.out.println("Qual televisão irá acessar\n1 - Sala\n2 - Quarto\n3 - Varanda\n4 - Sair");
                    System.out.println("=======================");
                    local = sc.nextInt();



                    if (local == 1) {
                        tipo = ts;
                    } else if (local == 2) {
                        tipo = tq;
                    } else if (local == 3) {
                        tipo = tvv;
                    }


                    //switch para a escolha do local e da televisão
                    switch (local) {
                        case 1:

                            switch (tipo) {
                                case 1:
                                    //Esse case lançara o obj da televisão digital no metodo da televisão digital
                                    con.ConDigital(Tvsala, local);
                                    break;

                                case 2:
                                    //Esse case lançara o obj da smartv no metodo da smartv
                                    con.ConSmartv((Smarttv) Tvsala, local);
                                    break;

                                default:
                                    System.out.println("Opção invalida");
                                    break;
                            }

                            break;

                        case 2:

                            switch (tipo) {
                                case 1:
                                    con.ConDigital(TvQuarto , local);
                                    break;

                                case 2:
                                    con.ConSmartv((Smarttv)TvQuarto, local);
                                    break;

                                default:
                                    System.out.println("Opção invalida");
                                    break;
                            }

                            break;

                        case 3:

                            switch (tipo) {
                                case 1:
                                    con.ConDigital(TvVaranda, local);
                                    break;

                                case 2:
                                    con.ConSmartv((Smarttv)TvVaranda, local);
                                    break;

                                default:
                                    System.out.println("Opção invalida");
                                    break;
                            }

                            break;

                        case 4:

                            break;

                        default:
                            System.out.println("Opção inválida");
                            break;
                    }

                }while (local != 4);

    }
}