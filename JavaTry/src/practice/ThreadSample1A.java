package practice;
public class ThreadSample1A {
  public static void main(String[] args) {
    Thread th1 = new ThreadA("スレッド1");
    Thread th2 = new ThreadA("スレッド2");
    
    th1.start();
    th2.start();
  }
}
class ThreadA extends Thread {
  String name;
  int count = 0;
  ThreadA(String name) {
    this.name = name;
  }
  public void run(){
    for ( int i = 0; i < 5; i++ ) {
      count++;
      System.out.println(name+"-"+count);
      try {
        Thread.sleep(500);
      } catch ( InterruptedException e ) {
        e.printStackTrace();
      }
    }
  }
}