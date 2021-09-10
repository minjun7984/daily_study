package DataStructure.Stack;

import DataStructure.Array;

public class ArrayStack {

    Array arrayStack;
    int top;

    public ArrayStack() { // 아무것도 없을시
        top = 0;
        arrayStack = new Array();
    }

    public ArrayStack(int size){
        top = 0;
        arrayStack = new Array(size);
    }

    public void push(int data){ //배열일 경우 꽉차 있는지 체크하고 요소 추가

        if( isFull() ){
            System.out.println("stack is full");
            return;
        }
        arrayStack.addElement(data);
        top++;
    }

    public int pop(){

        if( isEmpty() ) {
            System.out.println("stack is empty");
            return Array.ERROR_NUM;
        }
        return arrayStack.removeElement(--top);
    }

    public int peek(){

        if( isEmpty() ) {
            System.out.println("stack is empty");
            return Array.ERROR_NUM;
        }
        return arrayStack.getElement(--top);
    }

    public boolean isFull(){

        if(top == arrayStack.ARRAY_SIZE){
            return true;
        }
        else return false;
    }

    public boolean isEmpty(){

        if( top == 0 ){
            System.out.println("stack is empty");
            return true;
        }
        else return false;
    }

    public void printAll(){
        arrayStack.printAll();
    }

}
