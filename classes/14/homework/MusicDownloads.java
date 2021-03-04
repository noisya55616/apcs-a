import java.util.List;
import java.util.ArrayList;


public class MusicDownloads {
    private List<DownloadInfo> downloadList;

    public MusicDownloads() {
        downloadList = new ArrayList<DownloadInfo>();
    }

    public DownloadInfo getDownloadInfo(String title) {
        for (int i = 0; i < downloadList.size(); i++) {
            if (downloadList.get(i).getTitle().equals(title)) return downloadList.get(i);
        }
        return null;
    }

    public void updateDownloads(List<String> titles) {
        for (int i = 0; i < titles.size(); i++) {
            int idx = -1;
            for (int j = 0; j < downloadList.size(); j++) {
                if (downloadList.get(j).getTitle().equals(titles.get(i))) idx = j;
            }
            if (idx == -1) {
                DownloadInfo dlInfo = new DownloadInfo(titles.get(i));
                downloadList.add(dlInfo);
            }
            else {
                downloadList.get(idx).incrementTimesDownloaded();
            }
        }
    }
}
