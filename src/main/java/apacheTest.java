import org.apache.commons.lang3.StringUtils;

public class apacheTest {


public static String isANumber(String word){

     if (StringUtils.isNumeric(word)){
         return "you entered: " + word + " this is a number";
     } else {
         return "you entered: " + word + "this is not a number";
     }
}


    public static String swapCase(String word){
    return StringUtils.swapCase(word);
    }


     public static String reverse(String word){
     return StringUtils.reverse(word);
    }

    public static void main(String[] args) {

        System.out.println(isANumber("2"));


    }
}
