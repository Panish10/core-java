package fss;

public class NonRepetative {

    public static void main(String[] args) {
        //panish
        //envelop
        String name = "panish";
        boolean found = false;
        int index = -1;
        for (int i=0; i<name.length()-1; i++) {
            found = false;
            for(int j=i+1; j<name.length(); j++) {
                if(name.charAt(i) == name.charAt(j)) {
                    found = true;
                    break;
                }
            }

            if(!found) {
                index = i;
                break;
            }
        }

        if(index > -1) System.out.println(name.charAt(index));
        else System.out.println("Not found");
    }
}
