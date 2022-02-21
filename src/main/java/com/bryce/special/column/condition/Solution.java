package com.bryce.special.column.condition;

import java.util.LinkedList;

/**
 * @author bryce
 * @version 1.0
 * @date 2021/11/10 23:08
 * @description todo
 */



public class Solution {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    final String SEPERATOR = ",";

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serialize(root,sb);
        return sb.toString();
    }

    private void serialize(TreeNode root,StringBuilder sb){
        if(root==null){
            sb.append("-1").append(SEPERATOR);
            return;
        }
        sb.append(root.val).append(SEPERATOR);
        serialize(root.left,sb);
        serialize(root.right,sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        LinkedList<String> nodes = new LinkedList<>();
        for(String val:data.split(SEPERATOR)){
            nodes.addLast(val);
        }
        System.out.println(nodes.size());
        return deserialize(nodes);
    }

    private TreeNode deserialize(LinkedList<String> nodes){
        if(nodes.isEmpty()){
            return null;
        }
        String temp = nodes.removeFirst();
        if(temp.equals("-1")){
            return null;
        }
        TreeNode root = new TreeNode(Integer.valueOf(temp));
        root.left = deserialize(nodes);
        root.right = deserialize(nodes);
        return root;
    }

/*    public static void main(String[] args) {
        String a = new String("4,-7,-1,-1,-3,-9,9,6,0,-1,-1,-1,-1,6,-4,-1,-1,-1,-1,-7,-6,5,-1,-1,-1,-6,9,-2,-1,-1,-1,-1,-3,-4,-1,-1,-1,");
        new Solution().deserialize(a);
        LinkedList a = new LinkedList();
        a.remove();
    }*/

}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
