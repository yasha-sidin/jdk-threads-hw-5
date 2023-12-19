import lombok.*;

@Getter
@Setter
public class Philosopher {
    private String name;
    @Setter(AccessLevel.NONE)
    private int times = 0;

    public Philosopher(String name) {
        this.name = name;
    }
    public void haveLunch() {
        System.out.println(getName() + "(" + (times + 1) + ")" + ": had lunch");
        addTime();
    }

    public void ponder() {
        System.out.println(getName() + "(" + times + ")" + " pondered");
    }

    private void addTime() {
        times++;
    }
}
