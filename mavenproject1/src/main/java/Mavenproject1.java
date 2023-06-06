
import java.awt.*;
import java.time.Instant;
import java.util.*;
 
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author rufat
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        
        int age =30;
        int her=age;
        int Viwers=3_234_123;
        long number=3_533_567_456_354L;
        
        float price=10.99F;  
        char letter='F';
        System.out.println(letter);
        
        boolean is=false;
        System.out.println("qqqqqqqqqq"+is);
        
        Date now=new Date();
        
        
        System.out.println(now);
       
        
        byte x=1;
        byte y=x;
        x=2;
        
        System.out.println(y);
        
        Point p1 =new Point(1,1);
        Point p2=p1;
        p1.x=2;
        System.out.println(p1);
           
        String mess=" Hello \" world"+"!! ";
        System.out.println(mess.endsWith("!!"));
        System.out.println(mess.startsWith("!!"));
        System.out.println(mess.length());
        System.out.println(mess.indexOf("wor"));
        System.out.println(mess.replace("!", "*"));
        System.out.println(mess.toLowerCase());
        System.out.println(mess.trim());
        
        int[] arr=new int[5];
        arr[1]=4;
        arr[2]=5;
        System.out.println(arr[2]);
        System.out.println(Arrays.toString(arr));
         
        int[] num={2,1,4,5,6};
        Arrays.sort(num);
        System.out.println(num.length);
        System.out.println(Arrays.toString(num));
         
        int[][] matrix=new int[2][3];
        int[][] m={{2,2,3},{6,3,2}};
        m[0][0]=1; 
        System.out.println(Arrays.deepToString(matrix)); 
        System.out.println(Arrays.deepToString(m));
        
        final float pi=3.14F;
        double r=(double)10/(double)3;
        System.out.println(r);
        
        int xx=1;
        int yy=xx++;
        System.out.println(xx);
        System.out.println(yy);
        
        String q="1.1";
        double qq=Double.parseDouble(q);
        System.out.println(qq);
        
        double random=Math.round( Math.random() *100 );
        System.out.println("Random: "+random);
        
        Scanner scanner=new Scanner(System.in);
        
        
//        byte gg=scanner.nextByte();
//        System.out.println("inputted byte: "+gg);
//        
//        System.out.println("Age: ");
//        int myage=scanner.nextInt();
//        System.out.println("My age: "+myage);
//        
//        String nam=scanner.next();
//        System.out.println("String: "+nam);
//    


    
    
    }
}
