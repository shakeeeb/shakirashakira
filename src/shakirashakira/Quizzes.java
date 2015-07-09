package shakirashakira;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saleh
 */
public class Quizzes {
    public static void main(String[] args){
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread1.start();
        thread2.start();
    }
 }

class Thread1 extends Thread{
    public void run(){
        int i = 1;
        while(i<10){
            System.out.println("FUCK THEM OTHER NIGGAS");
        try {
            Thread.sleep(10);
        } catch (InterruptedException ie){}
        i++;
    }
    }
    
}

class Thread2 extends Thread{
    public void run(){
        int i=1;
        while(i<10){
            System.out.println("\t\t\t\t\tCASUE IM DOWN WITH MY NIGGAS");
        try {
            Thread.sleep(10);
        } catch (InterruptedException ie){}
        i++;
    }
}

}
