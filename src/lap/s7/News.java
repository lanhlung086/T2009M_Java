package lap.s7;

import java.util.Scanner;

public class News implements INew{
    public int id;
    public String title;
    public String publishDate;
    public String author;
    public String content;
    public float averageRate;

    public News() {
    }

    public News(int id, String title, String publishDate, String author, String content, float averageRate) {
        this.id = id;
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
        this.averageRate = averageRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    @Override
    public void Display() {
        System.out.println("Title: "+getTitle());
        System.out.println("PublishDate: "+getPublishDate());
        System.out.println("Author: "+getAuthor());
        System.out.println("Content: "+getContent());
        System.out.println("AverageRate: "+getAverageRate());
    }

    int[] rateList = new int[3];

    public void Calculate(){
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<rateList.length;i++){
            rateList[i] = sc.nextInt();
        }
        for (int i=0;i<rateList.length;i++){
            this.averageRate += rateList[i];
        }
        this.averageRate = averageRate/3;
    }
}
