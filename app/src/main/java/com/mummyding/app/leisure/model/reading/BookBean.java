package com.mummyding.app.leisure.model.reading;

import android.content.Context;

import com.mummyding.app.leisure.LeisureApplication;
import com.mummyding.app.leisure.R;

import java.io.Serializable;

/**
 * Created by mummyding on 15-11-15.
 */
public class BookBean implements Serializable{
    String [] author;
    String pubdate;
    String image;
    String catalog;
    String ebook_url;
    String pages;
    String id;
    String title;
    String aurhor_intro;
    String summary;
    String price;

    public String[] getAuthor() {
        return author;
    }

    public void setAuthor(String[] author) {
        this.author = author;
    }

    public String getPubdate() {
        return pubdate;
    }

    public void setPubdate(String pubdate) {
        this.pubdate = pubdate;
    }


    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }


    public String getEbook_url() {
        return ebook_url;
    }

    public void setEbook_url(String ebook_url) {
        this.ebook_url = ebook_url;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getAurhor_intro() {
        return aurhor_intro;
    }

    public void setAurhor_intro(String aurhor_intro) {
        this.aurhor_intro = aurhor_intro;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        Context mContext = LeisureApplication.AppContext;
        StringBuffer sb = new StringBuffer();
        for(String s: getAuthor()){
            sb.append(" "+s);
        }
        return mContext.getString(R.string.text_author)+sb+"\n"+
                mContext.getString(R.string.text_pubdate)+getPubdate()+"\n" +
                mContext.getString(R.string.id_pages)+getPages()+"\n" +
                mContext.getString(R.string.text_price)+getPrice();
    }
}
