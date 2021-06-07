import java.util.Scanner;
class Main {

    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        String str="";
        int x=0;
        System.out.println("What is the input string?");
        str=kb.nextLine();
        x=str.length();
        System.out.println(str+" has "+x+" characters.");

    }
}
