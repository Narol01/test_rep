package homework.code.model;

public class Code {

    private long code;

    public Code(long code) {
        this.code = code;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public long lengthCode1(){
        return String.valueOf(code).length();
    }
    public long controlSum(long code){
        long sum = 0;
        while (code != 0) {
            sum = sum + (code % 10);
            code /= 10;
        }
        return sum;
    }
    public long lengthCode(long code){
        int numbersCount=0;
        while (code!=0){
        numbersCount++;
        code/=10;
        }
        return numbersCount;
    }
    public boolean isValid(long cods) {
        if (cods == 8 || cods == 13 ) {
            return true;
        }
        return false;
    }
}
