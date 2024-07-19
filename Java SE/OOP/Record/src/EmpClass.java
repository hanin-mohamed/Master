import java.util.Objects;

public class EmpClass {
    private final String name;
    private final int number;
    public  EmpClass (String name, int number){
        this.name=name;
        this.number=number;
    }
    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return"Employee name : "+this.getName()+",Employee number : "+this.getNumber();
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmpClass empClass)) return false;
        return number == empClass.number && Objects.equals(name, empClass.name);
    }
}

