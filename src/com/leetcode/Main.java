package com.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class Main {

    int a = 1;

    public static void main(String[] args) throws IOException {
        //sendVerificationCode();
        {
            int a = 1;
            int b = 1;
        }
        //Runtime.getRuntime().exec("shutdown -s -t 3600");
        outer:
        for (var i = 0; i < 10; i++) {
            for (var j = 0; j < 10; j++) {
                if (i == 5 && j == 5) {
                    break outer;
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }
    }

    private static void sendVerificationCode() {
        try {
            //        var url=new URL("https://itdage.com/kkb/kkbsms?key=xzk&number=13311679920&code=786324");
            var url = new URL("https://www.baidu.com");
            var connection = url.openConnection();
            var is = connection.getInputStream();
            var br = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));

            do {
                System.out.println(br.readLine());
            } while (br.readLine() != null);
            br.close();
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
