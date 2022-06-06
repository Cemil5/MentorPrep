package labTasks;

public class FrequencyFromAString {
    public static void main(String[] args) {



        String str = "aabcccd";

        String result = "";


        for (int j = 0; j < str.length() ; j++) {

            char ch =  str.charAt(j);

            int count = 0;
            for (int i = 0; i < str.length() ; i++) {

                if(str.substring(i,(i+1)).equals(""+ch)){
                    count++;
                }

            }

            if (!result.contains(""+ch)){
                result += ch + "" + count;
            }


        }



        System.out.println("result = " + result);




    }
}
