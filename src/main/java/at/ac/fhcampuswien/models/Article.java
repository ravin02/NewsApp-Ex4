package at.ac.fhcampuswien.models;

public class Article {
    private final String author;
    private final String title;
    private Source source;
    private String description;
    private String url;
    private String urlToImage;
    private String publishedAt;
    private String content;

    private Article(Builder builder){
        this.author = builder.author;
        this.title = builder.title;
        this.source = builder.source;
        this.description = builder.description;
        this.url = builder.url;
        this.urlToImage = builder.urlToImage;
        this.publishedAt = builder.publishedAt;
        this.content = builder.content;

    }
    public Source getSource() {
        return source;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return
                "Title: " + getTitle() + "\n" +
                        "Author: " + getAuthor() + "\n"
                        //+ "; Source: " + getSource().getName() + "\n"
                        + "Description (length): " + getDescription().length() + "\nDescription: " + getDescription() + "\n";
    }


    public static class Builder{
        private final String author;
        private final String title;
        private Source source;
        private String description;
        private String url;
        private String urlToImage;
        private String publishedAt;
        private String content;

        public Builder (String author, String title){
            this.author = author;
            this.title = title;
        }

        public Builder source (Source source){
            this.source = source;
            return this;
        }

        public Builder description (String description){
            this.description = description;
            return this;
        }

        public Builder url (String url) {
            this.url = url;
            return this;
        }

        public Builder urlToImage (String urlToImage){
            this.urlToImage = urlToImage;
            return this;
        }

        public Builder publishedAt (String publishedAt){
            this.publishedAt = publishedAt;
            return this;
        }

        public Builder content (String content){
            this.content = content;
            return this;
        }

        public Article build(){
            return new Article(this);
        }

    }
   }