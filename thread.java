import java.util.Scanner;

class Message{
    void print(int msg){
      for(int i=1;i<11;i++){
        int x=msg*i;
        System.out.println(msg+" X "+i+" = "+x);
      }
      try{
        Thread.sleep(1000);}
        catch(Exception e){}
        System.out.println();
    }
}
class child implements Runnable{
  Thread t;
  int data;
  Message ms;
  child(int msg, Message m){
    data = msg;
    ms = m;
    t = new Thread(this);
    t.start();
  }
  public void run()
  {
    synchronized(ms){
      ms.print(data);
    }
  }
}
class Main{
    public static void main(String ab[]){
      Message m = new Message();
      System.out.println("Enter first number: ");
      Scanner d=new Scanner(System.in);
      int t = d.nextInt();
      System.out.println("Enter first number: ");
      int t1 = d.nextInt();
      System.out.println("Enter first number: ");
      int t2 = d.nextInt();
      child c1=new child(t,m);
      child c2=new child(t1,m);
      child c3=new child(t2,m);
    }
}