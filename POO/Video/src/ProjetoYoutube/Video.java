package ProjetoYoutube;

public class Video implements AcoesVideo {
    private int views, like;
    private String title;
    private boolean play;
    private float rate;

    public Video(String title) {
        this.title = title;
        this.rate = 10;
    }

    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }
    public int getLike() {
        return like;
    }
    public void setLike(int like) {
        this.like = like;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public boolean getPlay() {
        return play;
    }
    public void setPlay(boolean play) {
        this.play = play;
    }
    public float getRate() {
        return rate;
    }
    public void setRate(float rate) {
        if (this.views == 0) {
            this.rate = rate;
        } else {
            this.rate = (this.rate + rate) / 2;
        }
    }

    @Override
    public String toString() {
        return "Title: " + title +
                "\nViewers: " + views +
                "\nLikes: " + like +
                "\nPlay: " + play +
                "\nRate: " + rate + "\n";
    }

    @Override
    public void play(){
        this.play = true;
    }

    @Override
    public void pause(){
        this.play = false;
    }

    @Override
    public void like(){
        this.like++;
    }

}
