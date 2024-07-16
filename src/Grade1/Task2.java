package Grade1;

public class Task2 {

    private int S_id;
    private String S_name;
    private int S_age;
    private long S_mobNo;

    public Task2(int s_id, String s_name, int s_age, long s_mobNo) {
        S_id = s_id;
        S_name = s_name;
        S_age = s_age;
        S_mobNo = s_mobNo;
    }

    @Override
    public String toString() {
        return "Task2{" +
                "S_id=" + S_id +
                ", S_name='" + S_name + '\'' +
                ", S_age=" + S_age +
                ", S_mobNo=" + S_mobNo +
                '}';
    }

    public int getS_id() {
        return S_id;
    }

    public String getS_name() {
        return S_name;
    }

    public int getS_age() {
        return S_age;
    }

    public long getS_mobNo() {
        return S_mobNo;
    }
}
