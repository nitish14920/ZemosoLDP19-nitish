package assignment_2;

public class Assignment2 {
    int index = 0;
    Boolean[] alpha = new Boolean[26];

    public boolean checkString(String str){
        for (int i=0;i<str.length();i++){
            if((str.charAt(i) >= 'a') && str.charAt(i)<='z' || ((str.charAt(i) >= 'A') && str.charAt(i)<='Z')){
                index = str.charAt(i) - 'a';
                alpha[index] = true;
            }
        }
        for(int j=0;j<26;j++){
            if(alpha[j] == null){
                return false;
            }
        }
        return true;
    }

}
