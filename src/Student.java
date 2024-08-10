import java.util.Scanner;

public class Student {
    private String code;
    private String name;
    private int age;
    private boolean sex;
    private double markHTML;
    private double markJavascript;
    private double markJava;

    public Student() {
    }

    public Student(String code, String name, int age, boolean sex, double markHTML, double markJavascript, double markJava) {
        this.code = code;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.markHTML = markHTML;
        this.markJavascript = markJavascript;
        this.markJava = markJava;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public double getMarkHTML() {
        return markHTML;
    }

    public void setMarkHTML(double markHTML) {
        this.markHTML = markHTML;
    }

    public double getMarkJavascript() {
        return markJavascript;
    }

    public void setMarkJavascript(double markJavascript) {
        this.markJavascript = markJavascript;
    }

    public double getMarkJava() {
        return markJava;
    }

    public void setMarkJava(double markJava) {
        this.markJava = markJava;
    }

    // phương thức nhập thông tin
    public void inputData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào mã nhân viên ");
        this.code = scanner.nextLine();
        System.out.println("Nhập vào tên nhân viên ");
        this.name = scanner.nextLine();
        System.out.println("Nhập vào tuổi nhân viên ");
        this.age = scanner.nextInt();
        System.out.println("Nhap vao gioi tinh");
        this.sex=scanner.nextBoolean();
        System.out.println("Nhập vào markHtml ");
        this.markHTML = scanner.nextDouble();
        System.out.println("Nhập vào markJavascript ");
        this.markJavascript = scanner.nextDouble();
        System.out.println("Nhập vào markJava ");
        this.markJava = scanner.nextDouble();
    }

    // phương thức hiển thị thông tin
    public void showData() {
        System.out.println("Thôn tin nhân viên ");
        System.out.println("Mã nhân viên : " + this.code);
        System.out.println("Họ và tên : " + this.name);
        System.out.println("Năm sinh : " + (2024 - this.age));
        System.out.println("Gioi tinh :" + (this.sex ? "nam": "nu"));
        System.out.println("markHtml : " + this.markHTML);
        System.out.println("markJava : " + this.markJava);
        System.out.println("markJavascript : " + this.markJavascript);
    }
    //phương thức xét tốt của sinh viên
    public void consider(){
        Scanner scanner = new Scanner(System.in);
        Double TB = (markHTML+markJava+markJavascript)/3;
        if(TB>=8){
            System.out.println("Gioi");
        }else if(TB>=7){
            System.out.println("Kha");
        }else if(TB>=5){
            System.out.println("Trung binh");
        }else {
            System.out.println("Chưa qua");
        }
    }

}
