import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;



public class Main {
    
	public static int factorial(int n) {
        if (n == 1) return 1;
        return  n*factorial(n - 1);
    }


    public static void main(String[] args) {

        System.out.println( factorial(4) );

    }

}
	


