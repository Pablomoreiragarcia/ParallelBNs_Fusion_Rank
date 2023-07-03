package consensusBN;

import edu.cmu.tetrad.graph.Dag;
import edu.cmu.tetrad.graph.Dag_n;
import edu.cmu.tetrad.graph.GraphNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Prueba_Random {
    public static void main(String[] args) {
        List<GraphNode> nodes = generateNodes(10);

        Dag dag1 = createRandomDag(nodes);
        Dag dag2 = createRandomDag(nodes);
        Dag dag3 = createRandomDag(nodes);
        Dag dag4 = createRandomDag(nodes);
        Dag dag5 = createRandomDag(nodes);
        Dag dag6 = createRandomDag(nodes);
        Dag dag7 = createRandomDag(nodes);
        Dag dag8 = createRandomDag(nodes);
        Dag dag9 = createRandomDag(nodes);
        Dag dag10 = createRandomDag(nodes);
        Dag dag11 = createRandomDag(nodes);
        Dag dag12 = createRandomDag(nodes);
        Dag dag13 = createRandomDag(nodes);
        Dag dag14 = createRandomDag(nodes);
        Dag dag15 = createRandomDag(nodes);
        Dag dag16 = createRandomDag(nodes);
        Dag dag17 = createRandomDag(nodes);
        Dag dag18 = createRandomDag(nodes);
        Dag dag19 = createRandomDag(nodes);
        Dag dag20 = createRandomDag(nodes);
        Dag dag21 = createRandomDag(nodes);
        Dag dag22 = createRandomDag(nodes);
        Dag dag23 = createRandomDag(nodes);
        Dag dag24 = createRandomDag(nodes);
        Dag dag25 = createRandomDag(nodes);
        Dag dag26 = createRandomDag(nodes);
        Dag dag27 = createRandomDag(nodes);
        Dag dag28 = createRandomDag(nodes);
        Dag dag29 = createRandomDag(nodes);
        Dag dag30 = createRandomDag(nodes);
        Dag dag31 = createRandomDag(nodes);
        Dag dag32 = createRandomDag(nodes);
        Dag dag33 = createRandomDag(nodes);
        Dag dag34 = createRandomDag(nodes);
        Dag dag35 = createRandomDag(nodes);
        Dag dag36 = createRandomDag(nodes);
        Dag dag37 = createRandomDag(nodes);
        Dag dag38 = createRandomDag(nodes);
        Dag dag39 = createRandomDag(nodes);
        Dag dag40 = createRandomDag(nodes);
        // Imprimir los Dags
        System.out.println("Dag1:");
        System.out.println(dag1);

        System.out.println("Dag2:");
        System.out.println(dag2);

        System.out.println("Dag3:");
        System.out.println(dag3);

        System.out.println("Dag4:");
        System.out.println(dag4);

        System.out.println("Dag5:");
        System.out.println(dag5);

        System.out.println("Dag6:");
        System.out.println(dag6);

        System.out.println("Dag7:");
        System.out.println(dag7);

        System.out.println("Dag8:");
        System.out.println(dag8);

        System.out.println("Dag9:");
        System.out.println(dag9);

        System.out.println("Dag10:");
        System.out.println(dag10);

        System.out.println("Dag11:");
        System.out.println(dag11);

        System.out.println("Dag12:");
        System.out.println(dag12);

        System.out.println("Dag13:");
        System.out.println(dag13);

        System.out.println("Dag14:");
        System.out.println(dag14);

        System.out.println("Dag15:");
        System.out.println(dag15);

        System.out.println("Dag16:");
        System.out.println(dag16);

        System.out.println("Dag17:");
        System.out.println(dag17);

        System.out.println("Dag18:");
        System.out.println(dag18);

        System.out.println("Dag19:");
        System.out.println(dag19);

        System.out.println("Dag20:");
        System.out.println(dag20);

        System.out.println("Dag21:");
        System.out.println(dag1);

        System.out.println("Dag22:");
        System.out.println(dag2);

        System.out.println("Dag23:");
        System.out.println(dag3);

        System.out.println("Dag24:");
        System.out.println(dag4);

        System.out.println("Dag25:");
        System.out.println(dag5);

        System.out.println("Dag26:");
        System.out.println(dag6);

        System.out.println("Dag27:");
        System.out.println(dag7);

        System.out.println("Dag28:");
        System.out.println(dag8);

        System.out.println("Dag29:");
        System.out.println(dag9);

        System.out.println("Dag30:");
        System.out.println(dag10);

        System.out.println("Dag31:");
        System.out.println(dag11);

        System.out.println("Dag32:");
        System.out.println(dag12);

        System.out.println("Dag33:");
        System.out.println(dag13);

        System.out.println("Dag34:");
        System.out.println(dag14);

        System.out.println("Dag35:");
        System.out.println(dag15);

        System.out.println("Dag36:");
        System.out.println(dag16);

        System.out.println("Dag37:");
        System.out.println(dag17);

        System.out.println("Dag38:");
        System.out.println(dag18);

        System.out.println("Dag39:");
        System.out.println(dag19);

        System.out.println("Dag40:");
        System.out.println(dag20);
        ArrayList<Dag_n> dags = new ArrayList<>();
        dags.add(new Dag_n(dag1));
        dags.add(new Dag_n(dag2));
        dags.add(new Dag_n(dag3));
        dags.add(new Dag_n(dag4));
        dags.add(new Dag_n(dag5));
        dags.add(new Dag_n(dag6));
        dags.add(new Dag_n(dag7));
        dags.add(new Dag_n(dag8));
        dags.add(new Dag_n(dag9));
        dags.add(new Dag_n(dag10));
        dags.add(new Dag_n(dag11));
        dags.add(new Dag_n(dag12));
        dags.add(new Dag_n(dag13));
        dags.add(new Dag_n(dag14));
        dags.add(new Dag_n(dag15));
        dags.add(new Dag_n(dag16));
        dags.add(new Dag_n(dag17));
        dags.add(new Dag_n(dag18));
        dags.add(new Dag_n(dag19));
        dags.add(new Dag_n(dag20));
        dags.add(new Dag_n(dag21));
        dags.add(new Dag_n(dag22));
        dags.add(new Dag_n(dag23));
        dags.add(new Dag_n(dag24));
        dags.add(new Dag_n(dag25));
        dags.add(new Dag_n(dag26));
        dags.add(new Dag_n(dag27));
        dags.add(new Dag_n(dag28));
        dags.add(new Dag_n(dag29));
        dags.add(new Dag_n(dag30));
        dags.add(new Dag_n(dag31));
        dags.add(new Dag_n(dag32));
        dags.add(new Dag_n(dag33));
        dags.add(new Dag_n(dag34));
        dags.add(new Dag_n(dag35));
        dags.add(new Dag_n(dag36));
        dags.add(new Dag_n(dag37));
        dags.add(new Dag_n(dag38));
        dags.add(new Dag_n(dag39));
        dags.add(new Dag_n(dag40));

        ConsensusUnion consensusUnion = new ConsensusUnion(dags);

        Dag_n dagConsensus = consensusUnion.union();
        System.out.println("FUSION");
        System.out.println(dagConsensus);
}

    // Método para generar una lista de nodos con nombres A, B, C, ...
    private static List<GraphNode> generateNodes(int numNodes) {
        List<GraphNode> nodes = new ArrayList<>();
        for (int i = 0; i < numNodes; i++) {
            char nodeName = (char) ('A' + i);
            nodes.add(new GraphNode(String.valueOf(nodeName)));
        }
        return nodes;
    }

    // Método para crear un Dag con conexiones aleatorias entre los nodos
    private static Dag createRandomDag(List<GraphNode> nodes) {
        Dag dag = new Dag();
        for (GraphNode node : nodes) {
            dag.addNode(node);
        }

        Random random = new Random();
        int numEdges = random.nextInt(nodes.size() * (nodes.size() - 1) / 2); // Número aleatorio de conexiones

        List<GraphNode> possibleConnections = new ArrayList<>(nodes);
        List<GraphNode> connectedNodes = new ArrayList<>();

        for (int i = 0; i < numEdges; i++) {
            if (possibleConnections.isEmpty()) {
                break;
            }

            int randomIndex1 = random.nextInt(possibleConnections.size());
            GraphNode node1 = possibleConnections.get(randomIndex1);

            // Evitar crear un ciclo
            if (connectedNodes.contains(node1)) {
                continue;
            }

            possibleConnections.remove(randomIndex1);

            int randomIndex2 = random.nextInt(possibleConnections.size());
            GraphNode node2 = possibleConnections.get(randomIndex2);

            dag.addDirectedEdge(node1, node2);
            connectedNodes.add(node2);
        }

        return dag;
    }
}
