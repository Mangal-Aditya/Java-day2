//First of all memory is very expensive so
// we have to use them carefully now if I am calculating an age than
// I should use byte instead of int because the age is in between + - 127

// At the other hand if I am calculating leap year I can't use Byte, but I can use short int
class Literals {
    public static void main(String[] args) {
        System.out.println("Hello");
        int a = 30 ;
        char b = 'A' ;
        float v = 5.6f ;
// as the float takes double  by default we have to use 5.6f to show that this is a float value
        double ag = 5.6 ;
        String name = "Mangaladitya Chatterjee";
        System.out.println(name);
    }
}
