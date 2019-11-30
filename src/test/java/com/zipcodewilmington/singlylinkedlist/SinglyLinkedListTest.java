package com.zipcodewilmington.singlylinkedlist;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {


    @Test
    public void sizeTest(){
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.append(5);
        singlyLinkedList.append(7);
        singlyLinkedList.append(2);
        singlyLinkedList.append(1);
        singlyLinkedList.append(3);
        Integer expected = 5;
        Integer actual = singlyLinkedList.size();
        Assert.assertEquals(expected,actual);
        Assert.assertTrue(singlyLinkedList.contains(7));
    }

    @Test
    public void appendTest(){
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.append(2);
        Integer expected = 1;
        Integer actual = singlyLinkedList.size();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeTest(){
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.append(5);
        singlyLinkedList.append(7);
        singlyLinkedList.append(2);
        singlyLinkedList.append(1);
        singlyLinkedList.append(3);
        singlyLinkedList.remove(2);
        Integer expected = 4;
        Integer actual = singlyLinkedList.size();
        Assert.assertEquals(expected,actual);
        Assert.assertFalse(singlyLinkedList.contains(2));
    }
    @Test
    public void getTest() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.append(5);
        singlyLinkedList.append(7);
        singlyLinkedList.append(2);
        singlyLinkedList.append(1);
        singlyLinkedList.append(3);
        Integer expected = 1;
        Integer actual = singlyLinkedList.get(7);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsTest(){
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.append(5);
        singlyLinkedList.append(7);
        singlyLinkedList.append(2);
        singlyLinkedList.append(1);
        singlyLinkedList.append(3);
        Assert.assertTrue(singlyLinkedList.contains(7));
    }

    @Test
    public void copyTest(){
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.append(5);
        singlyLinkedList.append(7);
        singlyLinkedList.append(2);
        singlyLinkedList.append(1);
        singlyLinkedList.append(3);
        Integer expected = 2;
        Integer actual = singlyLinkedList.copy().get(7);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void sortTest(){
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.append(5);
        singlyLinkedList.append(7);
        singlyLinkedList.append(2);
        singlyLinkedList.append(1);
        singlyLinkedList.append(3);
        singlyLinkedList.sort(singlyLinkedList);
        Integer expected = -1;
        Integer actual = singlyLinkedList.get(1);

        Assert.assertEquals(expected,actual);
    }
}
