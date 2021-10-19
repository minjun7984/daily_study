package Thread;

import java.util.ArrayList;

class Library{

    public ArrayList<String> shelf = new ArrayList();

    public Library(){
        shelf.add("해리포터와 마법사의 돌");
        shelf.add("해리포터와 비밀의 방");
        shelf.add("해리포터와 아즈카반의 죄수");
        shelf.add("해리포터와 불의잔");
    }

    public synchronized String lendBook() throws InterruptedException {

        Thread t = Thread.currentThread();
        while (shelf.size() == 0) {
            System.out.println( t.getName() + "waiting start");
            wait();
            System.out.println( t.getName() + "waiting end");
        }

        if (shelf.size() > 0) {
            String book = shelf.remove(0);
            System.out.println(t.getName() + " : " + book + "lend");
            return book;
        }
        else return null;
    }

    public synchronized void returnBook(String book){

        Thread t = Thread.currentThread();
        shelf.add(book);
        notifyAll();
        System.out.println(t.getName() + " : " + book + "return");
    }
}

class Student extends Thread{
    public Student(String name){
        super(name);
    }

    public void run() {

        try {
            String title = LibraryMain.library.lendBook();
            if (title == null)
                return;
            sleep(5000);
            LibraryMain.library.returnBook(title);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class LibraryMain {

    public static Library library = new Library();
    public static void main(String[] args){

        Student std1 = new Student("std1");
        Student std2 = new Student("std2");
        Student std3 = new Student("std3");
        Student std4 = new Student("std4");
        Student std5 = new Student("std5");

        std1.start();
        std2.start();
        std3.start();
        std4.start();
        std5.start();
    }
}
