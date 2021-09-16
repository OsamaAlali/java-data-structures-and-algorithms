package trees;

import java.util.*;

public class Graphs {

    Map <Node, List<Node> >  adjVertices =new HashMap<>();
//List<Node> nodes=new ArrayList<>();
    public Graphs() {
//        Map<Node, List<Node>>  adjVertices=new HashMap<>();
    }

    public  void  addVertex(int value){
    this.adjVertices.putIfAbsent(new Node(value),new ArrayList<>());
   }

   // add Edge
    public  void addEdge(int firstVale,int secondValue ){
       Node first= new Node(firstVale);
       Node second= new Node(secondValue);

       adjVertices.get(first).add(second);
       adjVertices.get(second).add(first);

    }
   /// Return all nodes
    public Set<Integer> getNodes(){
        Set<Integer> set =new HashSet<>();

        for (Node n : adjVertices.keySet()){
          set.add(n.value);
            System.out.println(n.value);
        }
        return set;
    }
//public void tess(){
//        Node node=adjVertices.keySet().stream().findFirst().get();
//    System.out.println(node.value);
//}

    public  Set<Node>  breadthFirst(Node node){
      Set <Node> visited=new HashSet<>();
      Queue <Node> breadth= new Queue<Node>();
         breadth.enqueue(node);
       visited.add(node);

        while (!breadth.isEmpty()) {
            Node node1 = breadth.dequeue();
            for (Node v :  getNeighbors(node1.value)) {
                if (!visited.contains(v)) {
                    visited.add(v);
                    breadth.enqueue(v);
                }
            }
        }
        return visited;

    }

    Set<Node> depthFirstTraversal( Node node) {
        Set<Node> visited = new LinkedHashSet<Node>();
        Stack<Node> stack = new Stack<Node>();
        stack.push(node);
        while (!stack.isEmpty()) {
            Node vertex = stack.pop();
            if (!visited.contains(vertex)) {
                visited.add(vertex);
                for (Node v : getNeighbors(vertex.value)) {
                    stack.push(v);
                }
            }
        }
        return visited;
    }


    public List<Node> getNeighbors(int value){
       return adjVertices.get(new Node(value));
    }

    public int size(){
       return adjVertices.size();
    }


    @Override
    public String toString() {
        return "Graphs{" +
                "adjVertices=" + adjVertices +
                '}';
    }
}
