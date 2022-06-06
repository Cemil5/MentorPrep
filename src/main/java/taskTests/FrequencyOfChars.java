package taskTests;

public class FrequencyOfChars {
    public static void main(String[] args) {
        String str = "AAABBCCCCDDDDD";


    }

    static void solution1( String str){
        String result = "";

        for(int i = 0; i < str.length(); i++){
            int count = 0;
            for (int j = 0; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if(!result.contains("" + str.charAt(i))){
                result += str.charAt(i) + "" + count;
            }
        }
        System.out.println(result);
    }

    public static void solution2(String input){
        char bB= 'b', aA ='a',cC='c',dD='d';
        int result1= 0,result2 =0,result3=0,result4= 0;
        for (int i = 0; i <input.length(); i++) {
            if(input.charAt(i)==bB) {        result1++;
            }else if(input.charAt(i)==aA){        result2++;
            }else if(input.charAt(i)==cC){        result3++;
            }else if(input.charAt(i)==dD){        result4++;    }}

        System.out.println("Result A: =" +result1);
        System.out.println("Result B: =" +result2);
        System.out.println("Result C: =" +result3);
        System.out.println("Result D: =" +result4);
    }
}
