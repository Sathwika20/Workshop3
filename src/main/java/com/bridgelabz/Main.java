package com.bridgelabz;

public class Main {
    public static void main(String[] args){
       Observer observer1 = new Observer1();
       Observer observer2 = new Observer2();

       Subject subject = new Subject();

       subject.register(observer1);
       subject.register(observer2);



      Data data = new Data(10);
      subject.update(data);

    }
}
