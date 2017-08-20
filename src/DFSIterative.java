import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by USER on 8/18/2017.
 */
public class DFSIterative
{
    private int vertices;
    private LinkedList<Integer> graph[];

    DFSIterative (int vertices)
    {
        this.vertices = vertices;
        graph = new LinkedList[vertices];
        for (int i=0;i<vertices;i++)
        {
            graph[i] = new LinkedList<>();
        }
    }

    void addEdge (int vertice , int edge)
    {
        graph[vertice].add(edge);
    }

    void DFS (int startPoint)
    {
        boolean [] visited = new boolean[vertices];
        Stack<Integer> stack = new Stack<>();

        stack.push(startPoint);

        while (!stack.isEmpty())
        {
            int s = stack.peek();
            stack.pop();
            if (!visited[s])
            {
                System.out.println(s);
                visited[s] = true;
            }
            Iterator<Integer> i = graph[s].listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                {
                    stack.push(n);
                }
            }

        }

    }

    public static void main(String[] args)
    {
        DFSIterative g = new DFSIterative(5);
        g.addEdge(1, 0);
        g.addEdge(0, 2);
        g.addEdge(2, 1);
        g.addEdge(0, 3);
        g.addEdge(1, 4);

        System.out.println("Following is the Depth First Traversal");
        g.DFS(0);

    }
}
