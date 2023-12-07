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
    public void display(){
        Node newNode = front;
        while(newNode!=null){
            System.out.print(newNode.data+ "-->");
            newNode=newNode.next;
        }
    }
}


