import java.util.List;
import java.util.ArrayList;


public class SystemLog{
    /** Contains all the entries in this system log.*Guaranteed not to be null and to contain only non-null entries.*/
    private List<LogMessage> messageList;

    public SystemLog() {
        messageList = new ArrayList<LogMessage>();
        String messages[] = {
            "CLIENT3:security alert – repeated login failures",
            "Webserver:disk offline",
            "SERVER1:file not found",
            "SERVER2:read error on disk DSK1",
            "SERVER1:write error on disk DSK2",
            "Webserver:error on /dev/disk"
        };

        for (int i = 0; i < messages.length; i++) {
            LogMessage log = new LogMessage(messages[i]);
            messageList.add(log);
        }
    }
    /** Removes from the system log all entries whose descriptions properly contain keyword,
     *and returns a list (possibly empty) containing the removed entries.*Postcondition:
     *   - Entries in the returned list properly contain keyword and*are in the order in which they appeared in the system log.
     *   - The remaining entries in the system log do not properly contain keyword and*are in their original order.
     *   - The returned list is empty if no messages properly contain keyword.*/
    public List<LogMessage> removeMessages(String keyword) {
        List<LogMessage> ret = new ArrayList<LogMessage>();
        for (int i = messageList.size() - 1; i >= 0; i--) {
            if (messageList.get(i).containsWord(keyword)) {
                ret.add(messageList.get(i));
                messageList.remove(i);
            }
        }
        return ret;
    }
    
    public static void main(String[] args) {
        SystemLog syslog = new SystemLog();
        List<LogMessage> rem = syslog.removeMessages("disk");

        for (int i = 0; i < rem.size(); i++) {
            System.out.println(rem.get(i).getMachineId() + ":" + rem.get(i).getDescription());
        }

    }

}