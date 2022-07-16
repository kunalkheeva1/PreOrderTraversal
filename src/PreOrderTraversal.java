import java.util.ArrayList;
import java.util.List;


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


     public static void preOrder(TreeNode root, ArrayList<Integer> list){
         if(root == null) return;

         list.add(root.val);
         preOrder(root.left, list);
         preOrder(root.right, list);


     }

    public static List<Integer> preOrderTraverlal(TreeNode root){

    }


    public static void main(String[] args) {

    }
}
