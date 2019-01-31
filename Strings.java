public class Strings {
   
    public static String uniqueLetters(String str){
        String unique = "";
        for(int i = 0; i < str.length(); ++i){
            int count = 0;
            for(int j = 0; j < str.length(); ++j){
                if(str.charAt(i) == str.charAt(j)){
                    ++count;
                }
            }
            if(count == 1){
                unique += String.valueOf(str.charAt(i));
            }
        }
        return unique;
    }

}

