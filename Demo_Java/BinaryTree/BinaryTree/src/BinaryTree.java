/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class BinaryTree {
    private TreeNode root;
    private class TreeNode{
    private TreeNode left;
    private TreeNode right;
    private int data;
    private TreeNode(int data){
    this.data=data;
    }
    }
    public void createBinaryTree(){
    TreeNode first=new TreeNode(9);
        TreeNode second=new TreeNode(2);
    TreeNode third=new TreeNode(3);
    TreeNode fourth=new TreeNode(4);
root=first;
first.left=second;
first.right=third;
second.left=fourth;
    }
    public void preOder(TreeNode root){
    if(root==null){
    return;
    }
        System.out.print(root.data+" ");
        preOder(root.left);
        preOder(root.right);//duyet truoc cua binary tree
    }
    public static void main(String[] args) {
        BinaryTree bt=new BinaryTree();
        bt.createBinaryTree();
        bt.preOder(bt.root);
    }
    
}
