package Submit;
class Parent{//outer class
    String surName;
    String firstName;
    public void WhoIsThisParent(){
        System.out.println(firstName + " "  + surName);
    }
    class Child{//inner class
        String firstName;
        public void WhoIsThisChild(){
            System.out.println(firstName + " " + Parent.this.surName);
            //we can access the parent's surname using Parent.this.surName or just use surName since it's in the same class of the outer class
        }
    }
}

public class TaskE {
    public static void main(String[] args){
        Parent P1=new Parent();
        P1.firstName="Agbor Peter";
        P1.surName="Tataw";
        P1.WhoIsThisParent();
        Parent.Child C1= P1.new Child();
        C1.firstName="Clarkson";
        C1.WhoIsThisChild();
    }
}
