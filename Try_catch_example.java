
public class Try_catch_example{
    public static void main(String args[]){
   
        for (int i = 1; i <= 50; i++) {
            try {
                if (i == 25) {
                    throw new Exception();
                }
                System.out.println(i);
            } catch (Exception e) {
               
            }
        }
    }
}
