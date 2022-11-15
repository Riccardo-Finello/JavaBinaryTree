public class Node {
    public int value;
    public Node left;
    public Node right;

    public Node(int val){
        value = val;
        left = null;
        right = null;
    }

    public void AddNode(int newVal){
        if(newVal < this.value){
            if(this.left == null){
                this.left = new Node(newVal);
            }
            else{
                this.left.AddNode(newVal);
            }
        }
        else{
            if(this.right == null){
                this.right = new Node(newVal);
            }
            else{
                this.right.AddNode(newVal);
            }
        }
    }

    public void Search(int searchVal){
        if(searchVal < this.value && this.left != null){
            
        }
    }
}
