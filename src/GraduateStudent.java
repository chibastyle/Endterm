class GraduateStudent extends BaseStudent {
    private String researchTopic;

    public GraduateStudent(String name, int age, String researchTopic) {
        super(name, age);
        this.researchTopic = researchTopic;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Research Topic: " + researchTopic);
    }
}