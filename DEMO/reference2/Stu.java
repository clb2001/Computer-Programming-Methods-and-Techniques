package reference2;

public class Stu {
    private String stuNum ;//学生学号
    private String name;//学生姓名
    private String gender;//学生性别
    private int age;//学生年龄
    private int mark;//学生成绩
    
    public Stu(String stuNum,String name,String gender,int age,int mark) {
        this.stuNum = stuNum;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.mark = mark;
    }//构造方法
    
    public String getStuNum() {
        return stuNum;
    }
    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        if(gender != "男"&&gender != "女") {
            System.out.println("输入有误，重新操作");
            return ;
        }
            
        this.gender = gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getMark() {
        return mark;
    }
    public void setMark(int mark) {
        this.mark = mark;
    }
    
}    
