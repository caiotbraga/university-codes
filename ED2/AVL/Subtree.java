package ED2.AVL;

public class Subtree {
    private Integer key;
    private Subtree rightNode;
    private Subtree leftNode;
    private Integer value;
    private int height;
    
    public Subtree(Integer key, Integer value, int height) {
        this.key = key;
        this.value = value;
        this.rightNode = null;
        this.leftNode = null;
        this.height = height;
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

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    
}
