public class ReplaceAllExample2{
    public static void main(String args[]){
        String s1="My name is abhi. My name is ram. My name is sunny.";
        String replaceString=s1.replaceAll("is","was");//replaces all occurrences of "is" to "was"
        System.out.println(replaceString);
    }}