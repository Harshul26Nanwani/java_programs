import java.util.*;
public class SetExample1{
    public static void main(String args[]){
           Set<String> s=new TreeSet<>();
           s.add("Om"); s.add("Namah"); s.add("Shivay");
           for(String i:s){
               System.out.println(i);
           }
    }
}
