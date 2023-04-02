package ProjetoYoutube;

public class Preview {
    private User viewer;

    private Video video;

    public void rate(){
        this.video.setRate(5);
    }
    public void rate(int grade){
        this.video.setRate(grade);
    }
    public void rate(float percent){
        if(percent <= 30)
            this.video.setRate(3);
        else if(percent <= 50)
            this.video.setRate(5);
        else if(percent <= 80)
            this.video.setRate(8);
        else
            this.video.setRate(10);
    }

    public Preview(User viewer, Video video) {
        this.viewer = viewer;
        this.video = video;
        this.viewer.setTotViewers(this.viewer.getTotViewers() + 1);
        this.video.setViews(this.video.getViews() + 1   );
    }

    @Override
    public String toString() {
        return "Video: " + video +
                "\nViewer: " + viewer;
    }

    public User getViewer() {
        return viewer;
    }
    public void setViewer(User viewer) {
        this.viewer = viewer;
    }
    public Video getVideo() {
        return video;
    }
    public void setVideo(Video video) {
        this.video = video;
    }
}
