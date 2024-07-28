public class Multithreading {
    public static void main (String [] args){
        MultithreadingThing myThing = new MultithreadingThing();
          MultithreadingThing myThing2 = new MultithreadingThing();
        myThing.start();
         myThing2.start();
    }
}