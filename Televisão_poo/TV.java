import java.util.ArrayList;
import java.util.Arrays;


//Aqui sera a class TV, posuirá todas as variaveis e metodos de uma televisão digital, ela está sendo implementada por uma interface
public class TV implements FuncoesDaTvDigital{
    //Variaveis int da TV
    public int status = 0;
    public int volume = 0;
    public int canal = 1;

    //Variavel array
    static ArrayList<Integer> Canal = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 11));

    //Variaveis String da TV

    //Get e set


    //@override serve para sobrescrever um metodo que está  em uma intecface um uma herança anterior
    //O metodo status vai ligar e desligar a televisão
    @Override
    public int Status(){
        //Essa função retornará 1 para informar que a Tv esta ligada, e 0 para desligada, mudando atraves do if
        if (status == 0){
            status = 1;
            return 1;
        }
        else{
            status = 0;
           return 0;
        }
    }

    //O metodo canais irá mudar os canais da televisão
    //Incompleto com problema

    public int Canais(int mcanal){

        if (Canal.contains(mcanal)){
            canal = mcanal;

            return 0;
        }
        return 1;
    }

    //Metodo para adicionar um novo canal
    public int addcanal(int acanal) {

        if (Canal.contains(acanal)) {
            return 1;
        } else {
            Canal.add(acanal);
            return 0;
        }
    }

    //Metodo para excluir um canal
    public int removecanal(int recanal){

        if (Canal.contains(recanal)){
           Canal.remove(Canal.indexOf(recanal));

            return 0;
        }
        return 1;
    }

    //O metodo Volume_aum irá aumentar o volume da tv
    @Override
    public void Volume_aum(){
        if(volume < 100){
            volume++;

        }

    }

    //O metodo Volume_dim irá diminuir o volume da tv
    @Override
    public void Volume_dim(){
        if (volume > 0){
            volume--;

        }
    }

}
