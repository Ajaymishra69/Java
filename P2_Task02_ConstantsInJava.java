class P2_Task02_ConstantsInJava {
    public static final double pi=3.14;//    Here pi is the constant becoz we r using final keyword
    public static void main(String[] args) {
        System.out.println(pi); 
        int x=AddA(69,34);
        System.out.println(x);
       // int double =23;
    }
    
    static int AddA(int a, int b)
    {
        System.out.println(pi);
        return (a+b);
    }
}