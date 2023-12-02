package Graphs.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// 133. Clone Graph
// https://leetcode.com/problems/clone-graph/
// Runtime 25 ms Beats 96.93%
// Memory 42.32 MB Beats 6.34%
// Dec 02, 2023

// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

public class CloneGraph_133 {
    public Node cloneGraph(Node node) {
        if (node == null)
            return null;

        Node start = new Node(node.val);
        HashMap<Integer, Node> map = new HashMap<>();
        f(node, start, map);

        return start;
    }

    void f(Node orign, Node node, HashMap<Integer, Node> map) {
        if (!map.containsKey(node.val)) {
            map.put(node.val, node);
            List<Node> neighb = new ArrayList<>();
            for (Node n : orign.neighbors) {
                if (!map.containsKey(n.val)) {
                    Node temp = new Node(n.val);
                    neighb.add(temp);
                    f(n, temp, map);
                } else {
                    neighb.add(map.get(n.val));
                }
            }
            node.neighbors = neighb;
        }
    }
}