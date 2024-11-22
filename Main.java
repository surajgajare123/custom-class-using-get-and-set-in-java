class Main {
    int id;
    String name;
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setId(int a){
       id = a;
    }
    public void setName(String n){
        name = n;
    }
    public static void main(String[] args) {
        System.out.println("setting and getting value by using custom class.!");
        Main su = new Main();
        su.setName("suraj");
        su.setId(12);
        System.out.println(su.getId());
        System.out.println(su.getName());
    
    }
}
