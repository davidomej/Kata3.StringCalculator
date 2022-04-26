public class StringCalculator {

    public int add(String s) throws Exception {
            String[] numbers = s.split(",|\n");

        int n = 0;
        if(s.startsWith("//;")){
            String[] nDelimiters = s.split("\n|;");
            n = Integer.parseInt(nDelimiters[2])+Integer.parseInt(nDelimiters[3]);

        }
        if(s==""){
            n=0;
        }else if(s.length()==1){
            n=Integer.parseInt(s);
        }else if(numbers.length==2){
            n= Integer.parseInt(numbers[0])+Integer.parseInt(numbers[1]);
        }else if(numbers.length>2){

            n = Integer.parseInt(numbers[0])+ Integer.parseInt(numbers[1])+ Integer.parseInt(numbers[2]);
            }

            return n;
        }


}
