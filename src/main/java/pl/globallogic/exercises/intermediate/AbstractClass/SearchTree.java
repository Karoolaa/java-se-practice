package pl.globallogic.exercises.intermediate.AbstractClass;

public class SearchTree implements NodeList {
    private ListItem root = null;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (item == null) {
            return false;
        }
        if (root == null) {
            root = item;
            return true;
        }
        ListItem currentItem = root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison < 0) {
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(item);
                    return true;
                }
            } else if (comparison > 0) {
                if (currentItem.previous() != null) {
                    currentItem = currentItem.previous();
                } else {
                    currentItem.setPrevious(item);
                    return true;
                }
            } else {
                System.out.println(item.getValue() + " is already present, not added.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item == null) {
            return false;
        }
        ListItem currentItem = root;
        ListItem parentItem = null;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison == 0) {
                performRemoval(currentItem, parentItem);
                return true;
            } else if (comparison < 0) {
                parentItem = currentItem;
                currentItem = currentItem.next();
            } else {
                parentItem = currentItem;
                currentItem = currentItem.previous();
            }
        }
        return false;
    }

    private void performRemoval(ListItem item, ListItem parentItem) {
        if (item.next() == null) {
            if (parentItem == null) {
                root = item.previous();
            } else if (item == parentItem.next()) {
                parentItem.setNext(item.previous());
            } else {
                parentItem.setPrevious(item.previous());
            }
        } else if (item.previous() == null) {
            if (parentItem == null) {
                root = item.next();
            } else if (item == parentItem.next()) {
                parentItem.setNext(item.next());
            } else {
                parentItem.setPrevious(item.next());
            }
        } else {
            ListItem current = item.next();
            ListItem leftMostParent = item;
            while (current.previous() != null) {
                leftMostParent = current;
                current = current.previous();
            }
            item.setValue(current.getValue());
            if (leftMostParent == item) {
                item.setNext(current.next());
            } else {
                leftMostParent.setPrevious(current.next());
            }
        }
    }

    @Override
    public void traverse(ListItem root) {
        if (root != null) {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }
}