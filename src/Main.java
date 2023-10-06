//Хмыренков
//Рязанский
// 22вп1 вариант 7
import java.util.Scanner;
import java.util.regex.*;
public class Main {
    public static boolean Check_email(String email){
// c помощью регулярного выражения проверят являится ли данная строка email
        String regex = "(\\w+)([\\.-]?\\w+)*@(\\w+)([\\.]?\\w+)";
        Pattern p2 = Pattern.compile(regex);
        Matcher matcher = p2.matcher(email);
        if (matcher.matches()){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println("Лабораторная работа 2\n" +
                "Работу выполнили:\n " +
                "Хмыренков Никита,\n " +
                "Рязанский Максим,\n " +
                "вариант 7");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите Email");
        String s = in.nextLine();
        String[] words = s.split(",");
        for (int i = 0; i< words.length; i++){
            if (Check_email(words[i])){
                System.out.println("это Email");
            }else{
                System.out.println("Это не Email");
            }
        }
    }
}