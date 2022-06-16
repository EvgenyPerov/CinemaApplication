public class Viewer {
    private String nickName;
    private int age;
    private int count;

    public Viewer(String nickName, int age, int count) {
        this.nickName = nickName;
        this.age = age;
        this.count = count;
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

    public void setCount(int count) {
        this.count = count;
    }
}
