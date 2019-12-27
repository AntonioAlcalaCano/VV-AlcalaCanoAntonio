import org.junit.Assert;
import org.junit.Test;

public class DijkstraTest {
    @Test
    public void Test1 ()
    {
        Double Mat [][] = {{0.0,5.1,4.0,3.0,2.1},
                {3.1,0.0,2.1,1.5,2.1},
                {3.2,4.3,0.0,2.2,4.4},
                {1.4,2.2,4.3,0.0,1.1},
                {3.1,1.8,5.1,3.5,0.0}};
        int vertices = 4;
        int ini = 1;
        int end = 3;
        Dijkstra dj = new Dijkstra(Mat,vertices);
        dj.computeShortestPath(ini,end,"CP1");
        Assert.assertEquals("0", dj.contadorPrueba);
    }

    @Test
    public void Test2 ()
    {
        Double Mat [][] = {{0.0,5.1,4.0,3.0,2.1},
                {3.1,0.0,2.1,1.5,2.1},
                {3.2,4.3,0.0,2.2,4.4},
                {1.4,2.2,4.3,0.0,1.1},
                {3.1,1.8,5.1,3.5,0.0}};
        int vertices = 1;
        int ini = 0;
        int end = 0;
        Dijkstra dj = new Dijkstra(Mat,vertices);
        dj.computeShortestPath(ini,end,"CP2");
        Assert.assertEquals("0Bifurcacion1", dj.contadorPrueba);
    }

    @Test
    public void Test3A ()
    {
        Double Mat [][] = {{0D,0D,0D,0D},
                {0D,0D,0D,0D},
                {0D,0D,0D,0D},
                {0D,0D,0D,0D},
                {0D,0D,0D,0D}};
        int vertices = 3;
        int ini = 1;
        int end = 2;
        Dijkstra dj = new Dijkstra(Mat,vertices);
        dj.computeShortestPath(ini,end,"CP3.1");
        Assert.assertEquals("0Bifurcacion1Bifurcacion2", dj.contadorPrueba);
    }

    @Test
    public void Test3B ()
    {
        Double Mat [][] = {{0D,0D,0D,0D},
                {0D,0D,0D,0D},
                {0D,0D,0D,0D},
                {0D,0D,0D,0D},
                {0D,0D,0D,0D}};
        int vertices = 3;
        int ini = 1;
        int end = 2;
        Dijkstra dj = new Dijkstra(Mat,vertices);
        dj.computeShortestPath(ini,end,"CP3.2");
        Assert.assertEquals("0Bifurcacion1Bifurcacion2", dj.contadorPrueba);
    }

    @Test
    public void Test3C ()
    {
        Double Mat [][] = {{0D,0D,0D,0D},
                {0D,0D,0D,0D},
                {0D,0D,0D,0D},
                {0D,0D,0D,0D},
                {0D,0D,0D,0D}};
        int vertices = 3;
        int ini = 1;
        int end = 2;
        Dijkstra dj = new Dijkstra(Mat,vertices);
        dj.computeShortestPath(ini,end,"CP3.3");
        Assert.assertEquals("0Bifurcacion1Bifurcacion2", dj.contadorPrueba);
    }

    @Test
    public void Test4 ()
    {
        Double Mat [][] = {{0.0,5.1,4.0,3.0,2.1},
                {3.1,0.0,2.1,1.5,2.1},
                {3.2,4.3,0.0,2.2,4.4},
                {1.4,2.2,4.3,0.0,1.1},
                {3.1,1.8,5.1,3.5,0.0}};
        int vertices = 4;
        int ini = 1;
        int end = 3;
        Dijkstra dj = new Dijkstra(Mat,vertices);
        dj.computeShortestPath(ini,end,"CP4");
        Assert.assertEquals("0Bifurcacion1Bifurcacion2Bifurcacion3", dj.contadorPrueba);
    }

    @Test
    public void Test5 ()
    {
        Double Mat [][] = {{0.0,5.1,4.0,3.0,2.1},
                {3.1,0.0,2.1,1.5,2.1},
                {3.2,4.3,0.0,2.2,4.4},
                {1.4,2.2,4.3,0.0,1.1},
                {3.1,1.8,5.1,3.5,0.0}};

        int number = 4;
        Dijkstra dj = new Dijkstra(Mat,number);
        dj.computeShortestPath(1,3);
        Assert.assertTrue(dj.contadorPrueba.contains("0Bifurcacion1Bifurcacion2Bifurcacion3Bifurcacion4"));

    }
}
