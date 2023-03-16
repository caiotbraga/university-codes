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

    public void put(Integer key, Integer value){
        this.root = put(key, value, 1);
    }

    private Subtree put(Integer key, Integer value, int size){
        if(this.root == null){
            return new Subtree(key, value, size);
        }
        int cmp = this.root.getKey().compareTo(key);
        if(cmp > 0)
    }

    public int height(){
        int size = 0;
        if(this.root == null){
            return size;
        }
        return height(this.root);
    }

    private int height(Subtree subtree){
        int size = 0;
        if(subtree == null){
            return size;
        }
        size = height(subtree.getLeft()) + height(subtree.getRight()) + 1;
        return size;
    }

    public int BF(Subtree subtree){
        return height(subtree.getRight()) - height(subtree.getLeft());
    }


}
