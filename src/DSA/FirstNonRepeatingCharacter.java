package DSA;

class FindCharacter {
    public static char findNonRepeatingCharacter(String str){

        for(int i=0;i<str.length();i++){
            boolean isUnique = true;

            for(int j=0;j<str.length();j++){
                if(i!=j && str.charAt(i)==str.charAt(j)){
                    isUnique =false;
                    break;
                }
            }
            if(isUnique){
                return str.charAt(i);
            }
        }
        return '_';

    }
}

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "debasishsahu";

        System.out.println("Non Repeated character is "+ FindCharacter.findNonRepeatingCharacter(str));
    }


}
