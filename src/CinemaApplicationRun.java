import java.util.ArrayList;
import java.util.List;

public class CinemaApplicationRun {

    public static void main(String[] args) {
        Viewer viewer1 = new Viewer("Jack",20,4);
        Viewer viewer2 = new Viewer("Bob",40,10);
        Viewer viewer3 = new Viewer("Lara",30,7);
        Viewer viewer4 = new Viewer("Kris",18,8);
        Viewer viewer5 = new Viewer("Mike",32,25);

        List<Viewer> viewerList = new ArrayList<>();
        viewerList.add(viewer1);
        viewerList.add(viewer2);
        viewerList.add(viewer3);
        viewerList.add(viewer4);
        viewerList.add(viewer5);

        ViewerStatistics viewerStatistics = new ViewerStatistics();
        viewerStatistics.averageAge(viewerList);
    }

}
