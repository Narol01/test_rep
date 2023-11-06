package practice;

public class User {

    private String email;
    private String password;

    public User(String email,String password){
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

    private  boolean validateEmail(String email){
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

    private boolean validatePassword(String password) {//Метод matches это некий поисковик символов или букв или цифр в строке когда находи ввозвращает "да"
        boolean arr=false;
        boolean quantitySymbol = (password.length() >= 8);
        boolean uppercase = password.matches(".*[A-Z].*");
        boolean lowercase = password.matches(".*[a-z].*");
        boolean digit = password.matches(".*[0-9]*");
        boolean symbol = password.matches(".*[!%@*&].*");
        return quantitySymbol && uppercase && lowercase && digit && symbol;
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
        User user = (User) object;
        return email.equals(user.email);
    }

    @Override
    public int hashCode() {
        return email.hashCode();
    }
}
