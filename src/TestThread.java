public class TestThread extends Thread{
    @Override
    public void run() {
        System.out.println("Thread");
    }

    public static void main(String[] args) {
        TestThread testThread=new TestThread();
        testThread.start();
        testThread.run();
        testThread.run();
        System.out.println(testThread.isAlive());
    }
}
