package jdbc.entity;

public class Web {
    private String name;
    private int id;

    public Web(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Web() {
    }

    @Override
    public String toString() {
        return "Web{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
