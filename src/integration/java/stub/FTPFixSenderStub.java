package stub;

import com.chris.projects.fx.ftp.fix.FixSender;
import quickfix.Message;

public class FTPFixSenderStub implements FixSender {

    @Override
    public boolean send(Message message, String senderCompId, String targetCompId) {
        return false;
    }
}
