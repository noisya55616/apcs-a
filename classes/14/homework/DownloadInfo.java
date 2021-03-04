public class DownloadInfo {
    private String downloadTitle;
    private int downloadAmount;

    /** Creates a new instance with the given unique title and sets the
     *  number of times downloaded to 1
     *  @param title the unique title of the downloaded song
     */
    public DownloadInfo(String title) { 
        downloadTitle = title;
        downloadAmount = 1;
    }

    /** @return the title
     */
    public String getTitle() {
        return downloadTitle;
    }
    /** Increment the number times downloaded by 1
     */
    public void incrementTimesDownloaded() {
        downloadAmount++;
    }
}