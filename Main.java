package StackAndQueue;

public class Main {
    public static void main(String[] args) {
        StackAndQueue s = new StackAndQueue();

        s.push(70);
        s.push(30);
        s.push(56);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        s.display();



    }

}
