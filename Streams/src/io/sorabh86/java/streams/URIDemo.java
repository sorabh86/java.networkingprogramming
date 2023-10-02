package io.sorabh86.java.streams;

import java.net.URI;
import java.net.URISyntaxException;

public class URIDemo {
    public static void main(String[] args) {
        String uriBaseStr = "http://sorabh86.github.com";
        String str = "https://www.google.co.in/?gws_rd=ssl#"+
                "q=networking+in+java+geeksforgeeks"+
                "&spf=1496918039682";

        try {
            URI uriBase = new URI(uriBaseStr);
            System.out.println(uriBase.toString());

            URI uri = URI.create(str);
            System.out.println(uri.toString());

            System.out.println(uri.normalize().toString());
            System.out.println("Scheme="+uri.getScheme());
            System.out.println("Raw Scheme="+uri.getRawSchemeSpecificPart());
            System.out.println("Scheme part="+uri.getSchemeSpecificPart());
            System.out.println("Raw User Info="+uri.getRawUserInfo());
            System.out.println("Authority="+uri.getAuthority());
            System.out.println("Raw Authority="+uri.getRawAuthority());

        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }

    }
}
