package com.aliceliu.news;

import java.util.ArrayList;

/**
 * Created by liu on 16-4-12.
 */
public class News {

    public int no;
    public String title;
    public String content;

    public News(int num,String strTitle, String strConent){
        title = strTitle;
        content = strConent;
        no = num;
    }

    public static ArrayList<News> newsList = null;

    static {
        newsList = new ArrayList<News>();
        newsList.add(new News(111,"1111","content111"));
        newsList.add(new News(112,"1111","content112"));
        newsList.add(new News(113,"1111","content113"));
        newsList.add(new News(114,"1111","content114"));
        newsList.add(new News(115,"1111","content115"));
        newsList.add(new News(116,"1111","content116"));
        newsList.add(new News(117,"1111","content117"));
        newsList.add(new News(118,"1111","content118"));
        newsList.add(new News(119,"1111","content119"));
        newsList.add(new News(120,"1111","content120"));
        newsList.add(new News(121,"1111","content121"));
        newsList.add(new News(122,"1111","content122"));
        newsList.add(new News(123,"1111","content123"));
        newsList.add(new News(124,"1111","content124"));
    }
}
