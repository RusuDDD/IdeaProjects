public class Main {
    public static void main(String[] args) {


//        Predicate<T>
//        Function<T, R>
//        UnaryOperator<T>
//        Supplier<R>
//        Consumer<T>

// IntSupplier, LongSupplier, DoubleSupplier : all work only with primitives
//  Supplier<Integer> - works only with Objects
//  int -> long -> double
//
//  (s1, s2) -> new Person(s1, s2);
//      it is: BiFunction
//
//  () -> new Random().nextInt(); int 43
//      it is: Supplier, one of types: IntSupplier, LongSupplier, DoubleSupplier
//
//  r -> System.out.println(r * r * Math.PI);
//      it is: Consumer
//
//  (e1,e2) -> (e1.equals(e2)) ? e2.getLastName() + e2.getLastName() : "";
//      it is: BiFunction<T1, T2, String> taking two arguments T1 and T2, returns String argument
//
//  (a,b) -> (a + b).length() > 10;
//      it is:  BiPredicate<String, String>
//
//  (Person p, Person p2) ->(p1.compareTo(p2) >=0) ? p1:p2;
//      it is: BinaryOperator<Person>  or BiFunction<Person, Person, Person>
//
//  (a) -> a * a;
//      it is: IntFunction or UnaryOperator<Numeric>  or ToIntFUnction
//
//  (Person p, int a) -> p.setAge(a);
//      it is: ObjIntConsumer   (special type of Consumer)
   }
}
