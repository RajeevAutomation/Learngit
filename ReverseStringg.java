public class ReverseStringg {


        public static void main(String[] args) {
    String str = "rajeev pal";
    
    char[] array = str.toCharArray();
    
    for(int i = str.length()-1; i>=0; i--)
    {
        System.out.println(array[i]);
    }
        }
    
    }
    
