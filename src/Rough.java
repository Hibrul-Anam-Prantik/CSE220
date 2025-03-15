public class Rough
{
    public static void main(String[] args) {
        String key = "Morti";
        if(key.length() % 2 == 1) key += "N";
        int sum = 0;
        for(int  i = 0; i < key.length(); i += 2) {

            String ascii = (int)key.charAt(i) + "" + (int)key.charAt(i + 1);  // taking the ascii values of consecutive 2 chars, as instructed
            System.out.println(ascii + " ==> ");
            sum += Integer.parseInt(ascii);   // sum of the instructed ascii numbers
        }
        int size = 6;
        System.out.println(sum);
        System.out.println((int)'N');
        System.out.println(sum % size);
    }
}
