package de.telran;

import static java.lang.System.out;
import java.util.Scanner;
public class BinaryTree {
        class Node {
            String info;
            int key;
            Node parent;
            Node leftNode;
            Node rightNode;

            Node() {
                info = "";
                key = Integer.MIN_VALUE;
                leftNode = null;
                rightNode = null;
                parent = null;
            }

            Node(String info, int key) {
                this.info = info;
                this.key = key;
                leftNode = null;
                rightNode = null;
            }

            Node(String info, int key, Node parent) {
                this.info = info;
                this.key = key;
                leftNode = null;
                rightNode = null;
                this.parent = parent;
            }

            int compareKeyTo(Node n) {
                return (this.key - n.key); // >0 - текущий больше
            }
        }
        de.telran.BinaryTree.Node root;

        BinaryTree(){
            root = null;
        }

        de.telran.BinaryTree.Node getRoot(){
            return root;
        }

        void printKey(de.telran.BinaryTree.Node node){
            out.printf("%5d", node.key);
        }

        void insertLeafInTree(String inf, int k){
            de.telran.BinaryTree.Node currentNode = root;
            de.telran.BinaryTree.Node parentNode = null;
            while (currentNode != null) {
                parentNode = currentNode;
                if (k < currentNode.key) {
                    currentNode = currentNode.leftNode;
                }
                else if (k > currentNode.key) {
                    currentNode = currentNode.rightNode;
                }
                else {
                    // if k == currentNode.key
                    currentNode.info = inf;
                    return;
                }
            } // while

            de.telran.BinaryTree.Node newNode = new de.telran.BinaryTree.Node(inf, k, parentNode);
            if (parentNode == null ){ // создаем корень
                root = newNode;
            }
            else {
                if (k < parentNode.key) {
                    parentNode.leftNode = newNode;
                }
                else {
                    parentNode.rightNode = newNode;
                }
            }
        } // insert

        /**
         * определяет частоту вхождения для заданного слова
         */

        static int count=0;

        int preOrderinf(de.telran.BinaryTree.Node node, String info ) {
            if (node != null) {
                preOrderinf(node.leftNode, info) ;
                preOrderinf(node.rightNode, info);
                if (node.info == info) {
                    count+=1;
                }
            }
            return count;
        }

    }

    class Treetext {
        public static void main(String[] args){
            de.telran.BinaryTree st = new de.telran.BinaryTree();
            String inf;
            int k;

            inf = "Ale";
            k = 5;
            st.insertLeafInTree(inf, k);


            inf = "Mas";
            k = 1;
            st.insertLeafInTree(inf, k);

            inf = "Ale";
            k = 7;
            st.insertLeafInTree(inf, k);

            inf = "KLe";
            k = 6;
            st.insertLeafInTree(inf, k);

            System.out.println( st.preOrderinf(  st.getRoot(), "Ale"));
        }


    }
