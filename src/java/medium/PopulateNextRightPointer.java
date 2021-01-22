package medium;

import util.Node;

import java.util.LinkedList;
import java.util.Queue;

public class PopulateNextRightPointer {
    public Node connect(Node root) {
        if(root == null){
            return null;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        setPointers(q);
        return root;
    }

    public void setPointers(Queue<Node> q){
        int elements = q.size();
        if(elements == 0){
            return;
        }
        Node leftNode = q.remove();
        if(leftNode.left != null){
            q.add(leftNode.left);
            q.add(leftNode.right);
        }
        elements--;
        while(elements>0){
            Node node = q.remove();
            elements--;
            leftNode.next = node;
            if(node.left != null){
                q.add(node.left);
                q.add(node.right);
            }
            leftNode = node;
        }
        setPointers(q);
    }
}