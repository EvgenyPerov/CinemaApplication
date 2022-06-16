import java.util.List;

public class Viewer {
    private String nickName;
    private int age;
    private int count;
    private List<Cinema> cinemaList;

    public Viewer(String nickName, int age, List<Cinema> cinemaList) {
        this.nickName = nickName;
        this.age = age;
        this.cinemaList = cinemaList;
        this.count = cinemaList.size();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCount() {
        return count;
    }

    public void setCinemaList(List<Cinema> cinemaList) {
        this.cinemaList = cinemaList;
    }

    public List<Cinema> getCinemaList() {
        return cinemaList;
    }
}
