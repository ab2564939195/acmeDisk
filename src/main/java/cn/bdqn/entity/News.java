package cn.bdqn.entity;

import java.util.Date;

/**
 * Created by samsung on 2018/3/17.
 */
/*新闻*/
public class News {
    /*
    *
    * Name	Code	Data Type	Length	Precision	Primary	Foreign Key	Mandatory
新闻id	newsId	int			TRUE	FALSE	TRUE
照片Id	pictureID	int			FALSE	TRUE	FALSE
新闻标题	newsTatle	varchar(50)	50		FALSE	FALSE	FALSE
新闻内容	newsContent	blobtext			FALSE	FALSE	FALSE
新闻作者	newsAuthor	varchar(50)	50		FALSE	FALSE	FALSE
创建时间	newsTime	date			FALSE	FALSE	FALSE
    * */
    private int newsId ,pictureID ;
    private String newsTatle ,newsContent ,newsAuthor;
    private Date newsTime;
    private Commoditypicture commoditypicture;

    @Override
    public String toString() {
        return "News{" +
                "newsId=" + newsId +
                ", pictureID=" + pictureID +
                ", newsTatle='" + newsTatle + '\'' +
                ", newsContent='" + newsContent + '\'' +
                ", newsAuthor='" + newsAuthor + '\'' +
                ", newsTime=" + newsTime +
                ", commoditypicture=" + commoditypicture +
                '}';
    }

    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public int getPictureID() {
        return pictureID;
    }

    public void setPictureID(int pictureID) {
        this.pictureID = pictureID;
    }

    public String getNewsTatle() {
        return newsTatle;
    }

    public void setNewsTatle(String newsTatle) {
        this.newsTatle = newsTatle;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    public String getNewsAuthor() {
        return newsAuthor;
    }

    public void setNewsAuthor(String newsAuthor) {
        this.newsAuthor = newsAuthor;
    }

    public Date getNewsTime() {
        return newsTime;
    }

    public void setNewsTime(Date newsTime) {
        this.newsTime = newsTime;
    }

    public Commoditypicture getCommoditypicture() {
        return commoditypicture;
    }

    public void setCommoditypicture(Commoditypicture commoditypicture) {
        this.commoditypicture = commoditypicture;
    }

    public News(int newsId, int pictureID, String newsTatle, String newsContent, String newsAuthor, Date newsTime, Commoditypicture commoditypicture) {

        this.newsId = newsId;
        this.pictureID = pictureID;
        this.newsTatle = newsTatle;
        this.newsContent = newsContent;
        this.newsAuthor = newsAuthor;
        this.newsTime = newsTime;
        this.commoditypicture = commoditypicture;
    }

    public News() {

    }
}
