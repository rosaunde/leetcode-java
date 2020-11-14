package medium;

import util.Node;

import java.util.ArrayList;
import java.util.List;

class PopulateNextRightPointersInBinaryTree {
    public Node connect(Node root) {
        if(root == null){
            return null;
        }
        root.next = null;
        List<Node> nodes = new ArrayList<>();
        if(root.left != null){
            nodes.add(root.left);
        }
        if(root.right != null){
            nodes.add(root.right);
        }
        connect(nodes);
        return root;
    }

    public void connect(List<Node> nodes){
        if (nodes.size() == 0){
            return;
        }
        List<Node> nextNodes = new ArrayList<>();
        for(int i = 0; i < nodes.size(); i++){
            Node node = nodes.get(i);
            if(i == (nodes.size() - 1)){
                node.next = null;
            } else{
                node.next = nodes.get(i+1);
            }
            if(node.left != null){
                nextNodes.add(node.left);
            }
            if(node.right != null){
                nextNodes.add(node.right);
            }
        }
        connect(nextNodes);
    }
}