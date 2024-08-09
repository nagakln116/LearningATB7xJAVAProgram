package jul.ex_13072024;

public class Lab035 {
    public static void main(String[] args) {

        //Escape characters
        char c = '\n';
        System.out.println(c);
        System.out.println("Two new lines are entered above this statement");

        String s = "\n";
        System.out.println(s);
        System.out.println("Two new lines are entered above this statement");

        char t = '\t';
        System.out.println("A tab is put "+t +"between put and between by t");

        char b = '\b'; //deletes a character in the last
        System.out.println("The last letter going to get deleted" + b);

        //char wd = '\r'; It moves the output point back to the beginning of the line without moving down a line (usually).
        System.out.printf("This is first sentence \r This is sentence for next line");

    }
}
