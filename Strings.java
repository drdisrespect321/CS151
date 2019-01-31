public class Strings {
   
    public static String uniqueLetters(String str){
        String unique = "";
        for(int i = 0; i < str.length(); ++i){
            int same = 0;
            for(int j = 0; j < str.length(); ++j){
                if(str.substring(i,i+1).equals(str.substring(j,j+1))){
                    same++;
                }
            }
            if(same==1){
                unique += str.substring(i,i+1);
            }
        }
        return unique;
    }

}
