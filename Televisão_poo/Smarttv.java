public class Smarttv extends TV{

    //Variaveis int do Smartv
    public int conect;
    public int mode;
    public int login = 123456;
    public int senha = 987654;

    public int sttc(){
    int res = super.Status();

        if(res == 0){
            conect = 0;
            mode = 0;
        }

       return 0;
    }


    public int conect(int login, int senha){

        if(this.login == login && this.senha == senha){
            conect = 1;
            return 1;
        }
        else{
            return 0;
        }

    }


   public int mode() {
       if (conect == 1) {
           if (mode == 0) {
               mode = 1;
           } else {
               mode = 0;
           }
       } else {
           return 0;
       }
       return -1;
   }

   public void mconta(int login, int senha){
        this.login = login;
        this.senha = senha;

   }

}
