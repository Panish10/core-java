package panish.finalex;

public class FinalEx {

    public static void main(String[] args) {

        FinalEx obj = new FinalEx();
        String name = obj.getName();
        name = "neha";
        System.out.println(name);
    }

    public final String getName() {
        return "Panish";
    }
}
