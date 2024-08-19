public class Strings {

    private String str;
    private String str2 = "I like Java";

    public Strings(String str){
        this.str = str;
    }

    public void setStr(String str){
        this.str = str;
    }

    public void exploreStr(){
        int ind;
        System.out.println("Последний символ: " +this.str.charAt(this.str.length()-1));
        if (this.str.endsWith("java!")) {
            System.out.println("заканчивается на 'java!'");
        }
        else System.out.println("не заканчивается на 'java!'");

        if (this.str.startsWith("Добро пож")) {
            System.out.println("начинается на 'Добро пож'");
        }
        else System.out.println("не начинается на 'Добро пож'");

        if (this.str.contains("Java")) {
            System.out.println("содержит 'Java'");
        }
        else System.out.println("не содержит 'Java'");

        System.out.println("В строке " + this.str2 + " позиция слова 'Java':" + this.str2.indexOf("Java"));

        System.out.println("заменили все 'a' на 'o', получили:" + this.str.replace("a", "o"));

        System.out.println("строка в верхнем регистре:" + this.str.toUpperCase());
        System.out.println("строка в нижнем регистре:" + this.str.toLowerCase());

        ind = this.str.indexOf("Java");
        String txt = "Методом String.substring() вырезали 'Java' из исходной строки:";
        if (ind==0){
            System.out.println(txt + this.str.substring(ind));
        } else {
            System.out.println(txt + this.str.substring(0,ind) + this.str.substring(ind+4));
        }

    }

}
