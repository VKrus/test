class Employee extends Person{

    private final int HOURS_PER_MONTH = 120;
    private final int RATE = 100;

    private int status;
    private int workedHoursThisMonth;
    private int id;

    Employee() {
        workedHoursThisMonth = 0;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int doWork(int howMuchTime) {
        workedHoursThisMonth += howMuchTime;
        return workedHoursThisMonth;
    }

    protected double salary() {
        return workedHoursThisMonth * RATE;
    }
}