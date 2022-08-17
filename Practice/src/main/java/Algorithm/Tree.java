package Algorithm;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: hedy
 * @Date: 2022/05/06/23:01
 * @Description:
 */

public class Tree {

    public static class TreeNode {
       int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
          this.val = val;
        }
      }
    //二叉树的前序遍历
    public void preorder(List<Integer> list,TreeNode root){
        if(root == null) return;
        list.add(root.val);
        preorder(list,root.left);
        preorder(list,root.right);
    }
    public int[] preorderTraversal (TreeNode root) {
        // write code here
        ArrayList<Integer> list = new ArrayList<>();
        preorder(list,root);
        int[] res = new int[list.size()];
        for (int i = 0;i<list.size();i++)
            res[i] = list.get(i);
        return res;
    }
    //145.二叉树的后序遍历
    public void endorder(List<Integer> list,TreeNode root){
        if(root == null) return;
        endorder(list,root.left);
        endorder(list,root.right);
        list.add(root.val);
    }
    public int[] postorderTraversal (TreeNode root) {
        // write code here
        ArrayList<Integer> list = new ArrayList<>();
        endorder(list,root);
        int [] res = new int[list.size()];
        for (int i = 0;i<list.size();i++){
            res [i]= list.get(i);
        }
        return res;
    }
      //94.中序遍历二叉树
      public void inorder(List<Integer> list, TreeNode root){
          if(root == null) return ;
          //先左子树
          inorder(list,root.left);
          //再访问根节点
          list.add(root.val);
          //访问右子树
          inorder(list,root.right);
      }
    public int[] inorderTraversal (TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        //递归中序遍历
        inorder(list, root);
        int[] res = new int[list.size()];
        for(int i = 0; i<list.size();i++)
            res[i] = list.get(i);
        return res;
    }
    /*
    * 101.对称二叉树
    * */
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return check(root,root);
    }
    public boolean check(TreeNode root1,TreeNode root2){
        if(root1 == null && root2 == null) return true;
        if(root1 == null || root2 == null) return false;
        //递归比较每层左右节点值
        return (root1.val == root2.val)
                &&check(root1.left,root2.right)
                &&check(root1.right,root2.left);
    }
    //104.二叉树的最大深度
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return Math.max(maxDepth(root.left)+1,maxDepth(root.right)+1);
    }

    //543.二叉树的直径
    int ans = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return ans;
    }

    private int dfs(TreeNode root) {
        if (root==null)
            return 0;
        int l=0, r=0;
        if (root.left!=null)
            l += dfs(root.left)+1;
        if (root.right!=null)
            r += dfs(root.right)+1;
        ans = Math.max(ans, l+r);
        return Math.max(l, r);
    }
    //98. 判断是否为二叉搜索树
    int pre = Integer.MIN_VALUE;
    //中序遍历
    public boolean isValidBST (TreeNode root) {
        if(root == null) return true;
        if(!isValidBST(root.left))
            return false;
        if(root.val < pre)
            return false;
        pre = root.val;
        return isValidBST(root.right);
    }

    //226.二叉树镜像\翻转二叉树
    //解题思路：
    public TreeNode Mirror (TreeNode pRoot) {
        // write code here
        if(pRoot == null || (pRoot.left == null && pRoot.right == null)) return pRoot;
//         TreeNode tmp = pRoot.left;
//         pRoot.left = Mirror(pRoot.right);
//         pRoot.right = Mirror(tmp);
        TreeNode left = Mirror(pRoot.left);
        TreeNode right =Mirror(pRoot.right);
        pRoot.left = right;
        pRoot.right = left;
        return pRoot;
    }

    //二叉搜索树最近公共祖先
    /*
    * 解题思路：
    *
    * */
    public ArrayList<Integer> getPath(TreeNode root, int target){
        ArrayList<Integer> path = new ArrayList<>();
        TreeNode node = root;
        while(node.val != target){
            path.add(node.val);
            if(target < node.val) node = node.left;
            else node = node.right;
        }
        path.add(node.val);
        return path;
    }
    public int lowestCommonAncestor (TreeNode root, int p, int q) {
        ArrayList<Integer> path_p = getPath(root,p);
        ArrayList<Integer> path_q = getPath(root,q);
        int res = 0;
        for(int i = 0;i<path_p.size() && i<path_q.size();i++){
            int x = path_p.get(i);
            int y = path_q.get(i);
            if(x == y) res = path_p.get(i);
            else break;
        }
        return res;
    }

    public static void main(String[] args) {
//        TreeNode arr = new int[]{7, 1, 12, 0, 4, 11, 14, 3, 5};
//      lowestCommonAncestor(arr,1,12);
    }



}
