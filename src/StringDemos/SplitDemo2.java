package StringDemos;

public class SplitDemo2 {

    public static void main(String[] args) {
        String str = "Hey baby you are so lovely";

        String[] sArr = str.split(" ") ;

        for(int i=0; i<sArr.length ;i++ )
        {
           String currentString = sArr[i];
           int l = currentString.length();

           if(currentString.charAt(l-1) == 'y')
               System.out.println(sArr[i]);
        }

    }
}
