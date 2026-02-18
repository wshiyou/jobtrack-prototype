class JobApplication {
    String title;
    String company;
    String status;

    public JobApplication(String title, String company, String status) {
        this.title = title;
        this.company = company;
        this.status = status;
    }

    public void display() {
        System.out.println("Job Title: " + title);
        System.out.println("Company: " + company);
        System.out.println("Status: " + status);
    }
}

public class Main {
    public static void main(String[] args) {
        JobApplication app = new JobApplication(
                "Software Engineer Intern",
                "Google",
                "Applied"
        );

        app.display();
    }
}
