import java.util.List;

public class ViewerStatistics {

    public void averageAge(List<Viewer> list){
        System.out.println(list.stream().mapToInt(Viewer::getAge).sum()/ list.size());
    }
}
