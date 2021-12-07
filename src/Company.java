class Company {

    private final double tax = 0.13;

    private String name;
    private String city;

    private static int count = 0;

    Company () {
    }

    public Employee spawnEmployee() {
        count++;
        Employee emp = new Employee();
        emp.setId(count);
        return emp;
    }

    protected String changeEmployeeName(Employee employee, String newName) {
        employee.setFirstName(newName);
        return employee.getFirstName();
    }
}