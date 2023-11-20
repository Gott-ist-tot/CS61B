public class DogLauncher {
    public static void main(String[] args){
        Dog d1=new Dog(1);
        Dog d2= new Dog(100);
        /*Static Calling*/
        Dog bigger=Dog.maxDog(d1,d2);
        d1.makeNoise();
        bigger.makeNoise();
        System.out.println(Dog.binomen);
    }
}
