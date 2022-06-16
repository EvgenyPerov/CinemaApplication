import java.util.*;

public class CinemaApplicationRun {

    public static void main(String[] args) {
        Cinema cinema1 = new Cinema("film1","horror", 1.4f);
        Cinema cinema2 = new Cinema("film2","drama", 1.2f);
        Cinema cinema3 = new Cinema("film3","triller", 1.5f);
        Cinema cinema4 = new Cinema("film4","fantasy", 1.9f);
        Cinema cinema5 = new Cinema("film5","documental", 1f);
        Cinema cinema6 = new Cinema("film6","carton", 1.7f);
        Cinema cinema7 = new Cinema("film7","comedy", 2f);
        Cinema cinema8 = new Cinema("film8","sitcom", 1.1f);

        ArrayList<Cinema> cinemaArrayList1 =  new ArrayList();
        cinemaArrayList1.add(cinema1);
        cinemaArrayList1.add(cinema2);
        cinemaArrayList1.add(cinema8);
        Viewer viewer1 = new Viewer("Jack",20, cinemaArrayList1);

        ArrayList<Cinema> cinemaArrayList2 =  new ArrayList();
        cinemaArrayList2.add(cinema3);
        cinemaArrayList2.add(cinema4);
        cinemaArrayList2.add(cinema5);
        Viewer viewer2 = new Viewer("Bob",40,cinemaArrayList2);

        ArrayList<Cinema> cinemaArrayList3 =  new ArrayList();
        cinemaArrayList3.add(cinema3);
        cinemaArrayList3.add(cinema5);
        cinemaArrayList3.add(cinema6);
        cinemaArrayList3.add(cinema7);
        cinemaArrayList3.add(cinema8);
        Viewer viewer3 = new Viewer("Lara",30,cinemaArrayList3);

        ArrayList<Cinema> cinemaArrayList4 =  new ArrayList();
        cinemaArrayList4.add(cinema1);
        cinemaArrayList4.add(cinema4);
        cinemaArrayList4.add(cinema8);
        Viewer viewer4 = new Viewer("Kris",18,cinemaArrayList4);

        ArrayList<Cinema> cinemaArrayList5 =  new ArrayList();
        cinemaArrayList5.add(cinema8);
        Viewer viewer5 = new Viewer("Mike",32,cinemaArrayList5);
  //      System.out.println(viewer5.getCount());

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
