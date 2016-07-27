

 public class NewClass {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        int num=6789;
        int swap=0;
          int num=100;
         int i=String.valueOf(num).length();
         int k=0;
         int[]numbers=new int[i];
@@ -18,12 +24,13 @@ public static void main(String[] args) {
     num = num / 10;
     k++;
 }
    
   Arrays.sort(numbers); 
   swap=numbers[numbers.length-1];
   
   numbers[numbers.length-1]=numbers[0];
   numbers[0]=swap;
      for (int digit :numbers ) {
    System.out.print(digit );
    } 
        
     }
    
 }
