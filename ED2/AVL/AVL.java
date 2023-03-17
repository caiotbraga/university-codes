package ED2.AVL;

public class AVL {
    
    private Subtree root;

    public AVL(Subtree root) {
        this.root = root;
    }

    public void setRoot(Subtree root){
        this.root = root;
    }

    public Integer get(Integer key){
        Subtree node = get(this.root, key); 
        return node.getValue();          
    }

    private Subtree get(Subtree node, Integer key){
        if(node == null){
            return null;
        }
        int cmp = node.getKey().compareTo(key);
        if(cmp == 0){ 
            return node;
        }
        else if(node.getKey().compareTo(key) > 0){ 
            return get(node.getRight(), key);
        }
        else{
            return get(node.getLeft(), key);
        }
    }

    public void put(Integer key){
        this.root = put(this.root, key, 1);
    }

    private Subtree put(Subtree subtree, Integer key, int size){
        if(this.root == null){
            return new Subtree(key, 1);
        }
        int cmp = this.root.getKey().compareTo(key);
        if(cmp > 0){
            Subtree right = subtree.getRight();
            right = put(subtree.getRight(), key, size);
            subtree.setRight(right);
            subtree.setSize(1 + subtree.getSize());
        }
        else{
            Subtree left = subtree.getLeft();
            left = put(subtree.getLeft(), key, size);
            subtree.setLeft(left);
            subtree.setSize(1 + subtree.getSize());
        }
        return subtree;
    }

    public int size(){
        int height = 0;
        if(this.root == null){
            return height;
        }
        return size(this.root);
    }

    private int size(Subtree subtree){
        int size = 0;
        if(subtree == null){
            return size;
        }
        size = size(subtree.getLeft()) + size(subtree.getRight()) + 1;
        return size;
    }

    public int height(Subtree node){
        int left;
        int right;
        if(node == null){
            return -1;
        }else{
            left = height(node.getLeft());
            right = height(node.getRight());
            return Math.max(left, right) + 1;
        }
    }

    public int BF(Subtree node){
        return height(node.getRight()) - height(node.getLeft());
    }

}
