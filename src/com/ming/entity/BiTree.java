package com.ming.entity;

import java.util.Scanner;

public class BiTree {
    private Integer data;
    private BiTree leftChild;
    private BiTree rightChild;

    public BiTree() {
    }

    public static BiTree createTree(){
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        BiTree T;
        if (data == -1){
            T = null;
        }else {
            T = new BiTree();
            T.data = data;
            T.leftChild = createTree();
            T.rightChild = createTree();
        }
        return T;
    }

    public static void InOrder(BiTree T){
        if (T!=null){
            InOrder(T.leftChild);
            System.out.print(T.data + " ");
            InOrder(T.rightChild);
        }
    }

    public static void main(String[] args) {
        BiTree T = createTree();
        InOrder(T);
    }
}
