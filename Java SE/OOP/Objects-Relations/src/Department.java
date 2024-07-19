public class Department {
    private String depName;
    private int depNo;

    public Department(String depName, int depNo) {
        this.depName = depName;
        this.depNo = depNo;
    }

    public Department() {
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public int getDepNo() {
        return depNo;
    }

    public void setDepNo(int depNo) {
        this.depNo = depNo;
    }

    @Override
    public String toString() {
        return "Department{" +
                "depName='" + depName + '\'' +
                ", depNo=" + depNo +
                '}';
    }
}
