//just to add something on github

public class GreaterOf{

     public static void main(String []args){
        int x = 18;
        int y = 10;
        
        compare(x,y);
     }
     
     public static int compare(int x,int y){
         int result = x - y;
         System.out.println(result);
         
         if(result>0){
             System.out.println(x + " is the greater number");
         }else{
             System.out.println(y + " is the greater number");
         }
         return 0;
     }
}
