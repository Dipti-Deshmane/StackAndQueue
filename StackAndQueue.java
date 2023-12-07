package StackAndQueue;

public class StackAndQueue {
    public static Node head;
    public static boolean isEmpty(){
        return head == null;

    }
    public static void push(int data){

        Node newNode = new Node(data);

        if(head==null){
            head = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }

    public static void display(){
        Node newNode = head;
        while(newNode!=null){
            System.out.print(newNode.data+ "-->");
            newNode=newNode.next;
        }


    }


}
