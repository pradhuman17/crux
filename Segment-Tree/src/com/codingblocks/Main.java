package com.codingblocks;

public class Main {

    public static void main(String[] args) {

        int[] arr = {3, 8, 6, 7, -2, -8, 4, 9};

        SegmentTree tree = new SegmentTree(arr);

        tree.display();
    }

}