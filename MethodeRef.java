public class MethodeRef {

    Character startWith(String s){
        return s.charAt(5);
    }

    public static void main(String[] args) {
        MethodeRef str = new MethodeRef();
        Converter<String, Character> conv = str::startWith;
        Character converted = conv.convert("aasdfasfkljasfkjhasfkjh lkjhflkashflkjashflkjashf lajhsdflkhasflkjashflkasj ");
        System.out.println(converted);
    }
}
@FunctionalInterface
interface Converter<F, T>{
    T convert (F from);
}
