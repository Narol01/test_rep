package homework;

public class PasswordA {

    private String email;
    private String password;

    public PasswordA(String email, String password){
        setEmail(email);
        setPassword(password);
    }


    public String getEmail(){
        return email;
    }

    public void setEmail(String Email){
        if(validateEmail(Email)) {
            this.email = Email;
        }else{
            System.out.println(email+ " isn't valid.");
        }
    }

     boolean validateEmail(String email){
        int indexAt=email.indexOf('@');
        if (indexAt == -1 || indexAt != email.lastIndexOf('@')){
            return  false;
        }
        if(email.indexOf('.' , indexAt) == -1){
            return false;
        }
        if (email.indexOf('.')>= email.length()-2){
            return false;
        }
        for (int i = 0; i < email.length(); i++) {//проверка на допустимые символы
            char c=email.charAt(i);
            if(!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')
                    || c == '_' || c == '-' || c == '.' || c == '@')){
                return false;
            }
        }
        return true;
    }
    public String getPassword() {
        return password;
    }



    public void setPassword(String password) {
        if (validatePassword(password)) {
            this.password = password;
        } else {
            System.out.println("Password not valid");
        }
    }
    /*
    1) min 8 symbols
    2) min one symbol of uppercase
    3) min one symbol of lowercase
    4) min one digit
    5) min one special symbol (!%@*&)
     */

     boolean validatePassword(String password) {//Метод matches это некий поисковик символов или букв или цифр в строке когда находи ввозвращает "да"
         boolean[] check = new boolean[5]; // заводим массив типа boolean
         if (password.length() >= 8) {
             check[0] = true;}
         for (int i = 0; i < password.length(); i++) {
             char a = password.charAt(i);
             if (password.matches(".*[A-Z].*")) {
                 check[1] = true;}
             if (password.matches(".*[a-z].*")) {
                 check[2] = true;}
             if(Character.isDigit(a)){
                 check[3] = true;}
             if(password.matches(".*[!%@*&=].*")){
                 check[4] = true;}
         }
         return check[0]&&check[1]&&check[2]&&check[3]&&check[4];
    }



    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        PasswordA user = (PasswordA) object;
        return email.equals(user.email);
    }

    @Override
    public int hashCode() {
        return email.hashCode();
    }
}
