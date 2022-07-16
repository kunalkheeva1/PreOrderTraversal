import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

// get a node class which contains the left and right side of the tree as well as the value
 class TreeNode{
 int val;
 TreeNode left;
 TreeNode right;
 TreeNode(int val, TreeNode right, TreeNode left){
     this.val = val;
     this.left = left;
     this.right =right;
 }

}



public class PreOrderTraversal {

//recursive method
     public static void preOrder(TreeNode root, ArrayList<Integer> list){
         // if root is null then simply return
         if(root == null) return;
        // otherwise add the value in the list first then move to the left and then right
         // as per preOrderTraversal
         list.add(root.val);
         preOrder(root.left, list);
         preOrder(root.right, list);


     }

    public static List<Integer> preOrderTraverlal(TreeNode root){

         //call the method and return the list
        ArrayList<Integer> list = new ArrayList<>();
        preOrder(root, list);
        return list;
    }


    public static void main(String[] args) {

    }
}
