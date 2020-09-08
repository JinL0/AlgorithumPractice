
package DFS;

import utils.TreeNode;


public class DFSIterative {

    private TreeNode root;

    public DFSIterative(TreeNode root)
    {
        this.root = root;
    }


    public static void iterative(TreeNode root){
        if (root == null) {
            return;
        }
        System.out.println(root.val);
        iterative(root.left);
        iterative(root.right);
    }

}