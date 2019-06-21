import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str1[]=new String[20];
     str1[0]="H";
        str1[1]="e";
        str1[2]="l";
        str1[3]="l";
        str1[4]="o";
        str1[5]="w";
        str1[6]="o";
        str1[7]="r";
        str1[8]="l";
        str1[9]="d";
        int start=sc.nextInt();
        int end=sc.nextInt();
        String t1[]=Arrays.copyOfRange(str1,start,end);
        for(int i=0;i<t1.length;i++)
        System.out.print(t1[i]);
  }
}