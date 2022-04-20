public class StringCalculator {

    public int add(String s) {
        String[] numbers = s.split(",");
        int n = 0;
        if(s==""){
            n=0;
        }
        if(s.length()==1) {
            n=Integer.parseInt(s);
        }
        if(numbers.length>=2){
            n= Integer.parseInt(numbers[0])+Integer.parseInt(numbers[1]);
        }

        return n;
    }

}
