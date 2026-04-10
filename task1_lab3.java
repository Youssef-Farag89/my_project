import java.util.Scanner;

class temp{
    private float tempvalue;
    private char tempchar;

    public temp(){
        tempvalue=0;
        tempchar='C';
    }

    public temp(float v, char c){
        tempvalue=v;
        tempchar=c;
    }

    public float cel(){
        return 5*(tempvalue-32)-9;
    }

    public float fer(){
        return (9*tempvalue/5)+32;
    }

    public void setvalue(float v){
        tempvalue=v;
    }

    public void setchar(char c){
        tempchar=c;
    }

    public void setboth(float v, char c){
        tempvalue=v;
        tempchar=c;
    }

    public String to_string(){
        return "valu_temperature = " + tempvalue + "char_temperature = " + tempchar;
    }

    public boolean equal(temp test){
        if(this.tempvalue == test.tempvalue) return true;
        else return false;
    }

    public boolean large(temp test){
        if(this.tempvalue > test.tempvalue) return true;
        else return false;
    }
    public boolean less(temp test){
        if(this.tempvalue < test.tempvalue) return true;
        else return false;
    }
}
public class task1_lab3{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        // System.out.println("please enter your number : ");
        // int x=in.nextInt();

        temp t = new temp(19,'C');

        temp t1 = new temp(20,'F');

        System.out.println(t.equal(t1));
        in.close();
    }
}