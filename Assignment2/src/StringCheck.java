import java.util.regex.Pattern;

public class StringCheck {


    //Space Complexity depends on input
    //Time Complexity is O(1)

    public boolean allAlphabets(String input){
        if (Pattern.matches("[a-zA-Z]*",input))
            return true;
        else
            return false;
    }

}
