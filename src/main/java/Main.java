import java.util.function.UnaryOperator;

/*
    Fix the modifiers of the PREFIX and SUFFIX variables
    so they can be used in the operator lambda expression.
    Fix the lambda expression so that:
    str doesn’t have any whitespace.
    The PREFIX and SUFFIX values are added to the string.
 */
public class Main {
    static String PREFIX = "__prefix__";
    static String SUFFIX = "__suffix__";
	
	// fix the operator code
    public static UnaryOperator<String> operator = str -> str.replaceAll(" ", "");

    public static void main(String[] args) {

        String res = operator.apply("  hello"); 
        System.out.println(PREFIX + res + SUFFIX); // __prefix__hello__suffix__
    }
}
