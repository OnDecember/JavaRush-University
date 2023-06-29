package ua.javarush.task.pro.task09.task0912;

/* 
Перевірка URL-адреси
*/

public class Solution {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.com.ua", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("URL-адреса " + url + " містить мережевий протокол " + protocol + " і домен " + domain);
        }
    }

    public static String checkProtocol(String url) {
        int index = url.indexOf(':');
        if (index == -1) {
            return "невідомий";
        }
        String protocol = url.substring(0, index);
        if (!"https".equals(protocol) && !"http".equals(protocol)) {
            return "невідомий";
        }
        return protocol;
    }

    public static String checkDomain(String url) {
        int index = url.lastIndexOf('.');
        String domain = url.substring(index + 1);
        if (!"com".equals(domain) && !"net".equals(domain) && !"org".equals(domain) && !"ua".equals(domain)) {
            return "невідомий";
        }
        return domain;
    }
}
