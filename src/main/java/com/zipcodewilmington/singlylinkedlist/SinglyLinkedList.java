package com.zipcodewilmington.singlylinkedlist;


import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {

    public static Integer counter;
        private Node head;

        public SinglyLinkedList(){
        }

        public void add(Object input) {
            if (head == null) {
                head = new Node(input);
            }
            Node temporary = new Node(input);
            Node current = head;

            if (current != null) {
                while (current.getNext() != null) {
                    current = current.getNext();
                }
                current.setNext(current);
            }
            incrementCounter();
        }


        private static Integer getCounter() {
            return counter;
        }

        public static void incrementCounter() {
            counter++;
        }

        public void decrementCounter() {
            counter--;
        }

        public void add(Object input, Integer index) {
            Node temporary = new Node(input);
            Node current = head;

            if(current != null) {
                for (int i = 0; i < index && current.getNext() != null; i++){
                    current = current.getNext();
                }
            }
            temporary.setNext(current.getNext());
            current.setNext(temporary);
            incrementCounter();
        }

        public Object get(Integer index) {
            if (index < 0)
                return null;
            Node current = null;
            if(head != null) {
                current = head.getNext();
                for (int i = 0; i < index; i++) {
                    if (current.getNext() == null) {
                        return null;
                    }
                    current = current.getNext();
                }
                return current.getData();
            }
            return current;
        }

        public Boolean remove(Integer index) {
            if(index < 1 || index > size())
                return false;

            Node current = head;
            if(head != null) {
                for (int i = 0; i < index; i++) {
                    if (current.getNext() == null) {
                        return false;
                    }
                    current = current.getNext();
                }
                current.setNext(current.getNext().getNext());

                decrementCounter();
                return true;
            }
            return false;
        }

        public Integer size() {
            return getCounter();
        }

        public String toString() {
            String output = "";

            if (head != null) {
                Node current = head.getNext();
                while (current != null){
                    output += "[" + current.getData().toString() + "]";
                    current=current.getNext();
                }
            }
            return output;
        }


    private class Node{

        Node next;
        Object data;

        public Node(Object dataValue) {
            next = null;
            data = dataValue;
        }

        public Object getData(){
            return data;
        }

        public void setNext(Node nextValue){
            next = nextValue;
        }

        public Node getNext(){
            return next;
        }
        }
    }

