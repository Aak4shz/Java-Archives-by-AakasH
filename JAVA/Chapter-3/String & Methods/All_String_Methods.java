public class All_String_Methods {
    public static void main(String[] args) {
        String name = "Aakash Munda";
        System.out.println(name);

        int value = name.length();
        System.out.println(value);

        String lString = name.toLowerCase();
        System.out.println(lString);

        String uString = name.toUpperCase();
        System.out.println(uString);

        String nonTrimmedString = "       Aakash       ";
        System.out.println(nonTrimmedString);

        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString.trim());

        System.out.println(name.substring(7));
        System.out.println(name.substring(4, 12));

        System.out.println(name.replace('A', 'X'));
        System.out.println(name.replace('M', 'G'));

        System.out.println(name.replace("M", "Baksh"));
        System.out.println(name.replace("aakash", "Aakash Munda"));

        System.out.println(name.startsWith("Aa"));
        System.out.println(name.endsWith("zx"));

        System.out.println(name.charAt(0));
        System.out.println(name.charAt(7));

        System.out.println(name.indexOf("M"));
        System.out.println(name.indexOf("u"));

        String  modifiedName = "AanaXHana";
        System.out.println(modifiedName);

        System.out.println(modifiedName.indexOf("ana"));
        System.out.println(modifiedName.indexOf("ana", 4));

        System.out.println(modifiedName.lastIndexOf("ana" , 5));

        System.out.println(name.equals("Aakash Munda"));
        System.out.println(name.equals("AaKaSH MuNDa"));
        System.out.println(name.equalsIgnoreCase("aakash munda"));

    }
}
