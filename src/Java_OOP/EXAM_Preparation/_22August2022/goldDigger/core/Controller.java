package Java_OOP.EXAM_Preparation._22August2022.goldDigger.core;

public interface Controller {
    String addDiscoverer(String kind, String discovererName);

    String addSpot(String spotName, String... exhibits);

    String excludeDiscoverer(String discovererName);

    String inspectSpot(String spotName);

    String getStatistics();
}
