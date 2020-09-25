public class test {
  void abc(Animal a){
      System.out.println("A");
  }
  void abc(Mouse m){
      System.out.println("M");
  }

    public static void main(String[] args) {
        test t = new test();
        Animal an = new Mouse();
        t.abc(an);
        an.getName();
    }
}


class Animal{
    void getName(){
        System.out.println("Animal");
    }
}
class Mouse extends Animal{
    @Override
    void getName(){
        System.out.println("Mouse");
    }
}