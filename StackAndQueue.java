package StackAndQueue;

public class StackAndQueue {

    static Node front, rear;
    StackAndQueue(){
    front=null;
    rear=null;
    }

    public void add(int data){
        Node newNode = new Node(data);
        if(rear==null){
            front=newNode;
            rear = newNode;
            }else {
            rear.next = newNode;
            rear = newNode;
        }
        }
    public void remove(){
        Node newNode = front;
        if(front==null){
            System.out.println("Queue is empty");
        }else
        {
            while(front!=null){
                front = front.next;
                }

    }}

    public void display(){
        Node newNode = front;
        while(newNode!=null){
            System.out.print(newNode.data+ "-->");
            newNode=newNode.next;
        }
        System.out.println("Queue is empty now");
    }
}


