package ED2.AVL;

public class Subtree {
    private Integer key;
    private Subtree rightNode;
    private Subtree leftNode;
    private int size;

    public Subtree(Integer key, int size) {
        this.key = key;
        this.rightNode = null;
        this.leftNode = null;
        this.size = size;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public Subtree getRight() {
        return rightNode;
    }

    public void setRight(Subtree rightNode) {
        this.rightNode = rightNode;
    }

    public Subtree getLeft() {
        return leftNode;
    }

    public void setLeft(Subtree leftNode) {
        this.leftNode = leftNode;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
