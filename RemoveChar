// A method which will remove any given character from a String.
public class RemoveChar {
    public static void main(String args[]) {
        RemoveChar r = new RemoveChar();
        String str ="kukjgfdhjghgjkhlkjklkjhfhjjjnalk";
        char f = 'k';
        String opt = r.filterString(str, f);
        System.out.println(opt);
    }
    String filterString(String str,char f){
        int l = str.length();
        StringBuffer newStr = new StringBuffer ();
        char[] ch = str.toCharArray();  
        for(int i=0;i<l; i++){
            if(ch[i] != f){
                newStr.append(ch[i]);
            }
        }
        return newStr.toString();
    }
}
