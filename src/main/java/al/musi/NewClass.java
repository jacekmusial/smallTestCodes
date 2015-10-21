package al.musi;

/**
 *
 * @author re
 */
public class NewClass {

    public int countWords (String str) {
        int ret = 0;

        for(int i = 0 ; i < str.length(); i++) {
            if (str.charAt(i) == ' ')  {
                ret++;
            }					
        }
        return ret+1;
    }
	
    int wordcount(String s)
    {
        char ch[]= new char[s.length()];
        int c = 0;      
		
        for (int i = 0 ; i < s.length(); i++)
        {
            ch[i]= s.charAt(i);
            if( ((i>0) && (ch[i]!=' ') && (ch[i-1]==' ')) 
                    || ((ch[0]!=' ')&&(i==0)) ) {
                c++;
            }
                
        }
        return c;
    }
	
    public static void main (String[] args) throws java.lang.Exception
    {
        String str = "Alive is awesome";
        NewClass ideone = new NewClass();

        System.out.println(str + ": " + ideone.countWords(str));
        System.out.println("str" + ": " + ideone.countWords("str"));
        System.out.println("str " + ": " + ideone.countWords("str "));

        System.out.println("");

        System.out.println(str + ": " + ideone.wordcount(str));
        System.out.println("str" + ": " + ideone.wordcount("str"));
        System.out.println("str " + ": " + ideone.wordcount("str "));

        System.out.println("");

        System.out.println(str.trim().split(" ").length);
        System.out.println("str".trim().split(" ").length);
        System.out.println("str ".trim().split(" ").length);

    }
    
}
