public class StringMethods1 {
    public static void main(String[] args) {
        String name1 = "Nitish Kumar";
        String name2 = "Nitish Kumar";

        for(int i=0;i<name1.length();i++){
            System.out.print(name1.charAt(i));
        }
        System.out.println();
        if(name1.equals(name2)){
            System.out.println("name1 is same as name 2");
        }
        else{
            System.out.println("name1  is different than name 2");
        }

        if(name1.compareTo(name2)>0){
            System.out.println("name1 > name2");
        }
        else if(name1.compareTo(name2)==0){
            System.out.println("name1 = name2");
        }
        else {
            System.out.println("name1 < name2");
        }
    }
}
