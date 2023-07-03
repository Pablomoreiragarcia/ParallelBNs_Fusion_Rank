package consensusBN;

import edu.cmu.tetrad.graph.Dag;
import edu.cmu.tetrad.graph.Dag_n;
import edu.cmu.tetrad.graph.GraphNode;

import java.util.ArrayList;

public class Main_Pruebas {
    public static void main(String[] args) {
        GraphNode nodeA = new GraphNode("A");
        GraphNode nodeB = new GraphNode("B");
        GraphNode nodeC = new GraphNode("C");
        GraphNode nodeD = new GraphNode("D");
        GraphNode nodeE = new GraphNode("E");
        GraphNode nodeF = new GraphNode("F");

        Dag dag1 = new Dag();
        dag1.addNode(nodeA);
        dag1.addNode(nodeB);
        dag1.addNode(nodeC);
        dag1.addNode(nodeD);
        dag1.addNode(nodeE);
        dag1.addNode(nodeF);
        dag1.addDirectedEdge(dag1.getNode("A"), dag1.getNode("B"));
        dag1.addDirectedEdge(dag1.getNode("A"), dag1.getNode("C"));
        dag1.addDirectedEdge(dag1.getNode("C"), dag1.getNode("D"));
        dag1.addDirectedEdge(dag1.getNode("C"), dag1.getNode("F"));
        dag1.addDirectedEdge(dag1.getNode("B"), dag1.getNode("E"));
        dag1.addDirectedEdge(dag1.getNode("B"), dag1.getNode("D"));
        System.out.println(dag1);

        Dag dag2 = new Dag();
        dag2.addNode(nodeA);
        dag2.addNode(nodeB);
        dag2.addNode(nodeC);
        dag2.addNode(nodeD);
        dag2.addNode(nodeE);
        dag2.addNode(nodeF);
        dag2.addDirectedEdge(dag2.getNode("A"), dag2.getNode("C"));
        dag2.addDirectedEdge(dag2.getNode("A"), dag2.getNode("D"));
        dag2.addDirectedEdge(dag2.getNode("C"), dag2.getNode("F"));
        dag2.addDirectedEdge(dag2.getNode("C"), dag2.getNode("E"));
        dag2.addDirectedEdge(dag2.getNode("D"), dag2.getNode("B"));
        System.out.println(dag2);

        ArrayList<Dag_n> dags = new ArrayList<>();
        dags.add(new Dag_n(dag1));
        dags.add(new Dag_n(dag2));
        ConsensusUnion consensusUnion = new ConsensusUnion(dags);

        Dag_n dagConsensus = consensusUnion.union();
        System.out.println(dagConsensus);
    }
}