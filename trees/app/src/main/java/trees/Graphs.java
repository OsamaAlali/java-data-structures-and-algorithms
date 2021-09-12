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


//    public Set<Node> getNodes(){
//
//      Set <Node> visited=new HashSet<>();
//      Queue <Node> breadth= new Queue<Node>();
//         breadth.enqueue(adjVertices.keySet().stream().findFirst().get());
//       visited.add(adjVertices.keySet().stream().findFirst().get());
//
//        while (!breadth.isEmpty()) {
//            Node node = breadth.dequeue();
//            for (Node v :  getNeighbors(node.value)) {
//                if (!visited.contains(v)) {
//                    visited.add(v);
//                    breadth.enqueue(v);
//                }
//            }
//        }
//        return visited;
//
//    }


    public List<Node> getNeighbors(int value){
       return adjVertices.get(new Node(value));
    }

    public int size(){
       return adjVertices.size();
    }
}
