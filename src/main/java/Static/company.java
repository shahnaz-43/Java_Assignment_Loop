package Static;

 class Demo01 {
    int eId;
    int salaray;
    String EmpName;
    public void show() {
        System.out.println(eId + " : " + EmpName +": " + salaray  );

    }
}

public class company{
    public static void main(String[] args) {
        Demo01 emp01=new Demo01();

        emp01.eId=101;
        emp01.salaray=4500;
        emp01.EmpName="kanan";

        emp01.show();
    }
        }