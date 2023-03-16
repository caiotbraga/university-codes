package ED2.AVL;

public class Node {
    private Integer key;
    private Node rightNode;
    private Node leftNode;
    private Integer value;
    
    public Node(Integer key, Integer value) {
        this.key = key;
        this.value = value;
        this.rightNode = null;
        this.leftNode = null;
    }

    public Integer getKey() {
        return key;
    }
    public void setKey(Integer key) {
        this.key = key;
    }
    public Node getRightNode() {
        return rightNode;
    }
    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }
    public Node getLeftNode() {
        return leftNode;
    }
    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }
    public Integer getValue() {
        return value;
    }
    public void setValue(Integer value) {
        this.value = value;
    }
}
