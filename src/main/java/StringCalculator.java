public class StringCalculator {

    public int add(String s) throws Exception {
        String[] numbers = s.split("//|,|\n|;");
        int n = 0;

        if(s==""){
            n=0;
        }else if(s.length()==1){
                n=Integer.parseInt(s);
        }else if(numbers.length==2){
            n= Integer.parseInt(numbers[0])+Integer.parseInt(numbers[1]);
        }else if(numbers.length>2){
            n = Integer.parseInt(numbers[0])+ Integer.parseInt(numbers[1])+ Integer.parseInt(numbers[2]);
        }

        if(Integer.parseInt(s)<0){
            throw new Exception("Negatives not allowed"+s);
        }
        return n;
    }

}
