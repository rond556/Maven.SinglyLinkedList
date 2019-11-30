package com.zipcodewilmington.singlylinkedlist;


import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() {
    }

    public void append(Integer input) {
        if (head == null) {
            head = new Node(input);
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(input);
    }

    public void remove(Integer index){
        if(index == 0){
            head = head.next;
        }

        Node current = head;
        for(int i = -1; i < index - 1; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        }

    public Integer get(Integer input) {
        Integer counter = -1;

        Node current = head;
        while(current != null){
            if(current.data.equals(input))
                return counter;
            counter++;
            current = current.next;
        }
        return -1;
    }

    public Boolean contains(Integer input){
        Node current = head;
        if(current.data.equals(input)){
            return true;
        }
            while(current.next != null){
                if(current.data.equals(input)){
                    return true;
                }
                current = current.next;
            }
            return false;
    }


    public Integer size() {
        Integer counter = 0;
        Node current = head;
        while(current.next != null){
            counter++;
            current = current.next;
        }
        return counter;
    }

    public SinglyLinkedList copy(){
        SinglyLinkedList copyList = new SinglyLinkedList();
        Node current = head;
        while(current.next != null){
            copyList.append(current.data);
            current = current.next;
        }
        return copyList;
    }

    public void sort(SinglyLinkedList list) {
        SinglyLinkedList sortedList = new SinglyLinkedList();
        Integer size = list.size();
        Node current = head;
        for(int i = 0; i < size; i++){
            Integer temp = head.data;
            while(current.next != null){
                if(current.data > current.next.data){
                temp = current.data;
                }
                current = current.next;
            }
            sortedList.append(temp);
            this.remove(this.get(temp));
        }this.head = sortedList.head;

        }


    private class Node {
        Node next;
        Integer data;

        public Node(Integer dataValue) {
            data = dataValue;
        }
    }
}

