package qnfzks3.springboot.semiprojectv5.model;

public class Board {
    private String bno;
    private String title;
    private String userid;
    private String thumbs;
    private String views;
    private String content;
    private String regdate;

    public Board() {
    }

    public Board(String bno, String title, String userid, String thumbs, String views, String content, String regdate) {
        this.bno = bno;
        this.title = title;
        this.userid = userid;
        this.thumbs = thumbs;
        this.views = views;
        this.content = content;
        this.regdate = regdate;
    }

    public String getBno() {
        return bno;
    }

    public void setBno(String bno) {
        this.bno = bno;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getThumbs() {
        return thumbs;
    }

    public void setThumbs(String thumbs) {
        this.thumbs = thumbs;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }
}




