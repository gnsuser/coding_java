package java_oops;

public class StringFunctions {
    public static void main(String args[]){
        String name = "Gaurav";
        System.out.println(name.length());
        name = name.concat(" Surnis");
        System.out.println(name);
        System.out.println(name.concat(" Surnis"));
        System.out.println(name.equals("gaurav surnis"));
        System.out.println(name.equalsIgnoreCase("gaurav surnis"));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.substring(0,6));
        System.out.println(name.substring(1));
        System.out.println(name.charAt(5));
        System.out.println(name.contains("Gau"));
        System.out.println(name.replace("Gau", "stu"));
        String surname = "gaurav";
        System.out.println(surname.substring(3,6));

    }
}
