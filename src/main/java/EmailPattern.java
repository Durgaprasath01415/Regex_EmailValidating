public class EmailPattern {

    public static void main(String[] args) {
        RegexFile regexFile = new RegexFile();
        System.out.println("1."+regexFile.checkEmail("abc.xyz@bridgelabz.co.in"));
        System.out.println("2."+regexFile.checkEmail("abc@yahoo.com"));
        System.out.println("3."+regexFile.checkEmail("abc.100@yahoo.com"));
        System.out.println("4."+regexFile.checkEmail("abc111@abc.com"));
        System.out.println("5."+regexFile.checkEmail("abc-100@abc.net"));
        System.out.println("6."+regexFile.checkEmail("abc.100@abc.com.au"));
        System.out.println("7."+regexFile.checkEmail("abc@1.com"));
        System.out.println("8."+regexFile.checkEmail("abc@gmail.com.com"));
        System.out.println("9."+regexFile.checkEmail("abc+100@gmail.com"));
        System.out.println("10."+regexFile.checkEmail("abc"));
        System.out.println("11."+regexFile.checkEmail("abc@.com.my"));
        System.out.println("12."+regexFile.checkEmail("abc123@gmail.a"));
        System.out.println("13."+regexFile.checkEmail("abc123@.com"));
        System.out.println("14."+regexFile.checkEmail("abc123@.com.com"));
        System.out.println("15."+regexFile.checkEmail(".abc@abc.com"));
        System.out.println("16."+regexFile.checkEmail("abc()*@gmail.com"));
        System.out.println("17."+regexFile.checkEmail("abc@%*.com"));
        System.out.println("18."+regexFile.checkEmail("abc..2002@gmail.com"));
        System.out.println("19."+regexFile.checkEmail("abc.@gmail.com"));
        System.out.println("20."+regexFile.checkEmail("abc@abc@gmail.com"));
        System.out.println("21."+regexFile.checkEmail("abc@gmail.com.1a"));
        System.out.println("22."+regexFile.checkEmail("abc@gmail.com.aa.au"));
    }
}
