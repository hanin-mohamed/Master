public  record EmpRecord(String name,int number ) {
    String uppercaseName(){
        return name.toUpperCase();
    }
    public  static void printWhateve() {  //static must be called by Class name
        System.out.println("Whatever");
    }
}
