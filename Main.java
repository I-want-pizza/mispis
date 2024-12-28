import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создание административного сотрудника
        AdministrativeEmployee admin = new AdministrativeEmployee("admin@example.com", "Alice", 12345);
        System.out.println("Administrative Employee:");
        System.out.println("Name: " + admin.getName());
        System.out.println("Email: " + admin.getEmail());
        System.out.println("SSN: " + admin.getSsNo());
        System.out.println();

        // Создание курса
        Course course = new Course();
        course.setName("Introduction to AI");
        course.setId(101);
        course.setHours(30.5f);
        System.out.println("Course:");
        System.out.println("Name: " + course.getName());
        System.out.println("ID: " + course.getId());
        System.out.println("Hours: " + course.getHours());
        System.out.println();

        // Создание исследователя
        ResearchAssociate researcher = new ResearchAssociate(54321, "Bob", "Machine Learning", "bob@example.com");
        System.out.println("Research Associate:");
        System.out.println("Name: " + researcher.getName());
        System.out.println("Email: " + researcher.getEmail());
        System.out.println("Field of Study: " + researcher.getFieldOfStudy());
        System.out.println();

        // Создание проекта
        Project project = new Project();
        project.setName("AI Research Project");
        project.setStart(Date.valueOf("2024-01-01"));
        project.setEnd(Date.valueOf("2024-12-31"));
        researcher.startProject(project);
        System.out.println("Project:");
        System.out.println("Name: " + project.getName());
        System.out.println("Start Date: " + project.getStart());
        System.out.println("End Date: " + project.getEnd());
        System.out.println();

        // Создание института
        List<ResearchAssociate> employees = new ArrayList<>();
        employees.add(researcher);
        Institute institute = new Institute("AI Institute", "123 AI Street");
        institute.setEmployees(employees);
        System.out.println("Institute:");
        System.out.println("Name: " + institute.getName());
        System.out.println("Address: " + institute.getAddress());
        System.out.println("Employees: " + institute.getEmployees().get(0).getName());
        System.out.println();

        // Участие исследователя в проекте
        Participation participation = new Participation();
        participation.setResearchAssociate(researcher);
        participation.setProject(project);
        participation.setHours(100);
        System.out.println("Participation:");
        System.out.println("Researcher: " + participation.getResearchAssociate().getName());
        System.out.println("Project: " + participation.getProject().getName());
        System.out.println("Hours: " + participation.getHours());
    }
}
