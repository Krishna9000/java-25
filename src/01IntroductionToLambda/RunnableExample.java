class RunnableExample {
  public static void main(String[] args) {
    //prior to java 8 
    Runnable runnable = new Runnable() {
      @Override
      public void run() {
        System.out.println("Inside Runnable 1");
      }
    };
    new Thread(runnable).start();
     
    // Java 8 and above
    Runnable runnableLambda = () -> {
      System.out.println("Inside Lambda Runnable");
    };
    new Thread(runnableLambda).start();

    Runnable runnableLambda2 = () -> System.out.println("Inside Lambda Runnable 2");
    new Thread(runnableLambda2).start();

    new Thread(() -> System.out.println("Inside Lambda Runnable 3")).start();
  }
}
