public class CompareOperations {
    public static void main(String[] args){
        String a = "String";
        String b = "String";
        if (a.equals(b)){
            System.out.println("Strings equals");
        }
    }
    static void example1(){
        int a = 5;
        int b = 10;
        if (a == b){
            System.out.println("Numbers are equals");
        }
        else if (a > b){
            System.out.println("Number 'a' bigger then Number 'b' ");
        }
        else if (a < b){
            System.out.println("Number 'b' bigger then Number 'a' ");
        }

    }
}