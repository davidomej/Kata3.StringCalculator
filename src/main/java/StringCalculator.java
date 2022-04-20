public class StringCalculator {

    public int add(String s) {
        int n = 0;
        if(s==""){
            n=0;
        }
        if(s.length()==1) {
            n=Integer.parseInt(s);
        }
        return n;
    }

}
