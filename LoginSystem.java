
public class LoginSystem{

    private String logUse;

    private String logpass;
    public LoginSystem(String logUse, String logpass){

        this.logUse = logUse;
        this.logUse = logpass;




    }

    public boolean checklog (String inuser, String inpass){

        if (inuser.equals( this.logUse) && inpass.equals(this.logpass)) {


            return true;
        }else{

            return false;
        }

    }
}



