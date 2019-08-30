package Sim;
import java.util.Scanner;
class Students{
    private String Name=" ";
    private String Gender=" ";
    private String Age=" ";
    private String Phone=" ";
    private String Mail=" ";
    private int Num;
    public void setName(String name){
        this.Name=name;
    }

    public String getName() {
        return Name;
    }
    public void setGender(String gender){
        this.Gender=gender;
    }

    public String getGender() {
        return Gender;
    }
    public void setAge(String age){
        this.Age=age;
    }

    public String getAge() {
        return Age;
    }
    public void setPhone(String phone){
        this.Phone=phone;
    }

    public String getPhone() {
        return Phone;
    }
    public void setMail(String mail){
        this.Mail=mail;
    }

    public String getMail() {
        return Mail;
    }
    public void setNum(int num){
        this.Num=num;
    }

    public int getNum() {
        return Num;
    }

}

class card_tool {
    static Scanner reader = new Scanner(System.in);
    static int[] num_list = {1, 2, 3, 4, 5, 6, 7};
    static int num=0;
    static Students[] student=new Students[40];
    static boolean existing;
    static boolean exist;
    static String number;
    static String[] numbers;
    static boolean exists;
    static void set_menu(){
        while (true) {
            System.out.println();
            System.out.println();
            System.out.println("-----------------学生信息管理系统-----------------");
            System.out.println("1 添 加 学 生");
            System.out.println("2 修 改 学 生");
            System.out.println("3 删 除 学 生");
            System.out.println("4 学 生 列 表");
            System.out.println("5 学 生 搜 索");
            System.out.println("6 批 量 删 除");
            System.out.println(" 7 退       出");
            System.out.println("");
            System.out.println("请选择(1-7)(｡･∀･)ﾉﾞ嗨");
            int action_num = reader.nextInt();
            if (useLoop(num_list,action_num)) {
                if (action_num == 1) {
                    add_student();
                }
                if (action_num == 2) {
                    modify();
                }
                if (action_num == 3) {
                    delete();
                }
                if (action_num == 4) {
                    show();
                }
                if (action_num == 5) {
                    search();
                }
                if (action_num == 6) {
                    deletes();
                }
                if (action_num == 7) {
                    System.out.println("欢迎下次使用，ヾ(•ω•`)o");
                    break;
                }
            } else {
                System.out.println("请输入正确的数字o(≧口≦)o");
            }
        }
    }
    static boolean useLoop(int[] arr,int targetValue) {
        for (int s : arr) {
            if (s == (targetValue))
                return true;
        }
        return false;
    }
    static void init(){
        student[num] = new Students();
        student[num].setName("王大蛋");
        student[num].setGender("男");
        student[num].setAge("99");
        student[num].setPhone("983724987");
        student[num].setMail("234617414@163.com");
        student[num].setNum(num+1);
        num=num+1;
        student[num] = new Students();
        student[num].setName("王二蛋");
        student[num].setGender("男");
        student[num].setAge("24");
        student[num].setPhone("098983754");
        student[num].setMail("1233254354@gmail.com");
        student[num].setNum(num+1);
        num=num+1;
        student[num] = new Students();
        student[num].setName("王三蛋");
        student[num].setGender("女");
        student[num].setAge("23");
        student[num].setPhone("3246234234");
        student[num].setMail("979876945@baidu.com");
        student[num].setNum(num+1);
        num=num+1;
        student[num] = new Students();
        student[num].setName("王四蛋");
        student[num].setGender("男");
        student[num].setAge("22");
        student[num].setPhone("123489437");
        student[num].setMail("3274672354@gmail.com");
        student[num].setNum(num+1);
        num=num+1;
        student[num] = new Students();
        student[num].setName("王五蛋");
        student[num].setGender("男");
        student[num].setAge("21");
        student[num].setPhone("123819274");
        student[num].setMail("21317283@qq.com");
        student[num].setNum(num+1);
        num=num+1;
        student[num] = new Students();
        student[num].setName("王六蛋");
        student[num].setGender("男");
        student[num].setAge("20");
        student[num].setPhone("123873928");
        student[num].setMail("34235343@163.com");
        student[num].setNum(num+1);
        num=num+1;
        student[num] = new Students();
        student[num].setName("王七蛋");
        student[num].setGender("女");
        student[num].setAge("19");
        student[num].setPhone("124465324");
        student[num].setMail("235436457@gmail.com");
        student[num].setNum(num+1);
        num=num+1;
        student[num] = new Students();
        student[num].setName("王八蛋");
        student[num].setGender("男");
        student[num].setAge("18");
        student[num].setPhone("12334858");
        student[num].setMail("41478194@qq.com");
        student[num].setNum(num+1);
        num=num+1;
    }
    static void add_student() {
        System.out.println("你选择了1号操作");
        System.out.println("---------------------添加学生---------------------");
        System.out.println("确定添加学生吗?(ﾉ*･ω･)ﾉy/n");
        while(true){
            String sure=reader.next();
            if(sure.equals("y")){
                boolean lock=true;
                break;
            }
            else if(sure.equals("n")){
                System.out.println("不加了吗Σ(っ °Д °;)っ");
                boolean lock=false;
                return;
            }
            else{
                System.out.println("请输入y或n(≧口≦)");
            }
        }
        boolean lock1=true;
        while(lock1){
                System.out.println("这是第"+(num+1)+"个学生");
                student[num] = new Students();
                System.out.print("姓名：");
                String sss=reader.nextLine();
                student[num].setName(reader.nextLine());
                System.out.print("性别：");
                student[num].setGender(reader.nextLine());
                System.out.print("年龄：");
                student[num].setAge(reader.nextLine());
                System.out.print("电话：");
                student[num].setPhone(reader.nextLine());
                System.out.print("邮箱：");
                student[num].setMail(reader.nextLine());
                student[num].setNum(num+1);
                num = num + 1;
                System.out.print("够不够？还要加吗(⊙_⊙)？y/n");
                boolean lock2=true;
                while(lock2) {
                    String iscontinue = reader.nextLine();
                    if (iscontinue.equals("y")) {
                        lock2=false;
                    } else if (iscontinue.equals("n")) {
                        lock2=false;
                        lock1=false;
                    } else {
                        System.out.println("请输入y或n￣へ￣");
                    }
                }
        }
        System.out.println("---------------------添加完成----------------------");
    }
    static void modify(){
        System.out.println("你选择了2号操作");
        System.out.println("编号  姓名\t\t性别  年龄    电话\t\t\t邮箱");
        for(int i=0;i<num;i++){
            System.out.println(student[i].getNum()+"     "+student[i].getName()+"\t\t"+student[i].getGender()+"    "+
                    student[i].getAge()+"     "+student[i].getPhone()+"\t\t"+student[i].getMail());
        }
        System.out.println("---------------------修改学生---------------------");
        boolean lock1=true;
        int i;
        while(lock1) {
            System.out.print("请选择待修改学生编号(-1退出)：");
            int student_num=reader.nextInt();
            if(student_num==-1){
                break;
            }
            for (i = 0; i < num; i++) {
                if (student[i].getNum() == student_num) {
                    exist = true;
                    break;
                }
            }
            if(exist){
                        System.out.println("开始修改" + (i + 1) + "号同学的信息（提示：每个属性直接按回车则表示不修改！O(∩_∩)O）");
                        System.out.print("姓名：" + "(" + student[i].getName() + ")");
                        String s1=reader.nextLine();
                        student[i].setName(verify(student[i].getName(), reader.nextLine()));
                        System.out.print("性别：" + "(" + student[i].getGender() + ")");
                        student[i].setGender(verify(student[i].getGender(), reader.nextLine()));
                        System.out.print("年龄：" + "(" + student[i].getAge() + ")");
                        student[i].setAge(verify(student[i].getAge(), reader.nextLine()));
                        System.out.print("电话：" + "(" + student[i].getPhone() + ")");
                        student[i].setPhone(verify(student[i].getPhone(), reader.nextLine()));
                        System.out.print("邮箱：" + "(" + student[i].getMail() + ")");
                        student[i].setMail(verify(student[i].getMail(), reader.nextLine()));
                        System.out.print("完成！还要修改其他同学的吗o((>ω< ))o？y/n");
                        String ismodfiy = reader.next();
                        boolean lock2 = true;
                        while (lock2) {
                            if (ismodfiy.equals("y")) {
                                lock2 = false;
                            } else if (ismodfiy.equals("n")) {
                                lock2 = false;
                                lock1 = false;
                            } else {
                                System.out.println("请输入y或者n（︶^︶）");
                            }
                        }
                    }
            else {
                System.out.println("这个编号根本就找不着人！(╯‵□′)╯︵┻━┻");
            }
                }
        System.out.println("---------------------修改完成---------------------");
        }
    static String verify(String start,String end){
        if(end.length()==0){
            return start;
        }
        else{
            return end;
        }
    }
    static void delete(){
        System.out.println("你选择了3号操作");
        System.out.println("编号  姓名\t\t性别  年龄    电话\t\t\t邮箱");
        for(int i=0;i<num;i++){
            System.out.println(student[i].getNum()+"     "+student[i].getName()+"\t\t"+student[i].getGender()+"    "+
                    student[i].getAge()+"     "+student[i].getPhone()+"\t\t"+student[i].getMail());
        }
        System.out.println("---------------------删除学生---------------------");
        boolean lock1=true;
        while(lock1) {
            System.out.print("请选择待删除学生编号(-1退出)：");
            int i;
            int student_num=reader.nextInt();
            if(student_num==-1){
                break;
            }
            for (i = 0; i < num; i++) {
                if (student[i].getNum() == student_num) {
                    existing = true;
                    break;
                }
            }
            if(existing){
                    System.out.println("开始删除" + (student_num ) + "号同学的信息");
                    try{
                        for(;i<num+1;i++){
                            student[i].setName(student[i+1].getName());
                            student[i].setGender(student[i+1].getGender());
                            student[i].setAge(student[i+1].getAge());
                            student[i].setPhone(student[i+1].getPhone());
                            student[i].setMail(student[i+1].getMail());
                            student[i].setNum(student[i+1].getNum());
                        }
                    }
                    catch (Exception e){
                        System.out.println();
                }
                    num--;
                    System.out.print("完成！还要删除其他同学吗( •̀ ω •́ )✧？y/n");
                    String ismodfiy = reader.next();
                    boolean lock2 = true;
                    while (lock2) {
                        if (ismodfiy.equals("y")) {
                            lock2 = false;
                        } else if (ismodfiy.equals("n")) {
                            lock2 = false;
                            lock1 = false;
                        } else {
                            System.out.println("请输入y或者n⊙﹏⊙");
                        }
                    }
                }
            else {
                System.out.println("这个编号根本就找不着人！o(≧口≦)o");
            }
            }
        System.out.println("---------------------删除完成---------------------");
        }


    static void show(){
        System.out.println("你选择了4号操作");
        System.out.println("---------------------学生列表---------------------------");
        System.out.println("编号  姓名\t\t性别  年龄    电话\t\t\t邮箱");
        for(int i=0;i<num;i++){
            System.out.println(student[i].getNum()+"     "+student[i].getName()+"\t\t"+student[i].getGender()+"    "+
                    student[i].getAge()+"     "+student[i].getPhone()+"\t\t"+student[i].getMail());
        }
        System.out.println("------------------学生列表完成------------------------");
    }
    static void search(){
        System.out.println("你选择了5号操作");
        System.out.println("---------------------学生搜索---------------------------");
        System.out.println("提示：不需要的查询条件可直接回车！ε=ε=ε=(~￣▽￣)~");
        System.out.println("请输入学生姓名(-1退出)：");
        String ssss=reader.nextLine();
        String search_name=reader.nextLine();
        if(search_name.equals("-1")){
            System.out.println("不用了吗？(◎﹏◎)");
            return;
        }
        System.out.println("请输入学生性别(-1退出)：");
        String search_gender=reader.nextLine();
        if(search_gender.equals("-1")){
            System.out.println("不用了吗？(◎﹏◎)");
            return;
        }
        System.out.println("请输入学生邮箱(-1退出)：");
        String search_mail=reader.nextLine();
        if(search_mail.equals("-1")){
            System.out.println("不用了吗？(⊙﹏⊙)");
            return;
        }
        System.out.println();
        System.out.println("---------------------学生列表---------------------------");
        System.out.println("编号  姓名\t\t性别  年龄    电话\t\t\t邮箱");
        for(int i=0;i<num;i++){
            if(contain(student[i].getName(),search_name)&contain(student[i].getGender(),search_gender)&contain(student[i].getMail(),search_mail)){
                System.out.println(student[i].getNum()+"     "+student[i].getName()+"\t\t"+student[i].getGender()+"    "+
                        student[i].getAge()+"     "+student[i].getPhone()+"\t\t"+student[i].getMail());
            }
        }
        System.out.println("------------------学生列表完成------------------------");
    }
    static boolean contain(String start,String end){
        if (end.length()==0){
            return true;
        }
        else if(start.contains(end)){
            return true;
        }
        else{
            return false;
        }
    }
    static void deletes(){
        System.out.println("你选择了6号操作");
        System.out.println("---------------------批量删除学生---------------------");
        System.out.println("请选择批量删除学生编号(英文逗号隔开)注意！！英文逗号(´ｰ∀ｰ`) (-1退出)：");
        number=reader.next();
        numbers=number.split(",");
        int[] nb=new int[numbers.length];
        for (int i = 0; i <numbers.length ; i++) {
            if(numbers[i].equals("-1")){
                System.out.println("不用了吗◑﹏◐");
                return;
            }
                nb[i] = Integer.parseInt(numbers[i]);
        }
        System.out.println("确定删除吗?(ﾉ*･ω･)ﾉy/n");
        while(true){
            String sure=reader.next();
            if(sure.equals("y")){
                boolean lock=true;
                break;
            }
            else if(sure.equals("n")){
                System.out.println("不删了吗(o゜▽゜)o☆");
                boolean lock=false;
                return;
            }
            else{
                System.out.println("请输入y或n(≧口≦)");
            }
        }
        int i=0;
        int j=0;
        for ( i = 0; i <nb.length ; i++) {
            for (j = 0; j < num; j++) {
                if (student[j].getNum() == nb[i]) {
                    int x=j;
                        for (; j < num + 1; j++) {
                            try {
                                student[j].setName(student[j + 1].getName());
                                student[j].setGender(student[j + 1].getGender());
                                student[j].setAge(student[j + 1].getAge());
                                student[j].setPhone(student[j + 1].getPhone());
                                student[j].setMail(student[j + 1].getMail());
                                student[j].setNum(student[j + 1].getNum());
                            }catch(Exception e){
                                ;
                            }
                        }
                    System.out.print("完成,已删除"+student[x].getName()+"\n");
                    num--;
                    j = 0;
                }
            }
        }
        System.out.println("---------------------批量删除完成---------------------");
    }
    }
