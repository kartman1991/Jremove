import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);   //Input data
        String input = scanner.nextLine();  //Put data in String
        String[] splitList = input.split(" ");  //Split words in every space
        List<String> jList = new ArrayList<>(Arrays.asList(splitList)); //Put words in list
        Collections.reverse(jList);
        jList.stream().filter(l -> l.matches("J\\w+")).map(l -> l.substring(1)).forEach(System.out::println);
    }
}
