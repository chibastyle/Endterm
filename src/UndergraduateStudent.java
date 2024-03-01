class UndergraduateStudent extends BaseStudent {
    private String major;

    public UndergraduateStudent(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    // Overriding to display additional information specific to undergraduate students
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Major: " + major);
    }
}