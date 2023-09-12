package pl.globallogic.exercises.intermediate.AbstractClass;

public class Main {
    public static void main(String[] args) {
        ListItem root = new Node("5");
        MyLinkedList linkedList = new MyLinkedList(root);
        linkedList.addItem(new Node("3"));
        linkedList.addItem(new Node("7"));
        linkedList.addItem(new Node("9"));
        linkedList.traverse(linkedList.getRoot());

        SearchTree searchTree = new SearchTree(root);
        searchTree.addItem(new Node("2"));
        searchTree.addItem(new Node("4"));
        searchTree.addItem(new Node("6"));
        searchTree.addItem(new Node("8"));
        searchTree.traverse(searchTree.getRoot());
    }
}