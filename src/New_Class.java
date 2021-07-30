class std_info{
    int roll;
    String name;
    std_info(int s,String x){
        roll=s;
        name=x;
    }
}
class std_marks extends std_info{
    int marks;
    std_marks(int r,int m,String nam) {
        super(r, nam);
        marks = m;
    }
}
class std_data extends std_marks {
    String Address ;
    std_data(int r, int m, String nam,String add) {
        super(r, m, nam);
        Address=add;
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("id:"+roll);
        System.out.println("marks:"+marks);
        System.out.println("Address:"+Address);
    }
}
class New_Class {
    public static void main(String[] args) {
        std_data st=new std_data(23,500,"vineet","Lucknow");
        st.display();
    }
}
