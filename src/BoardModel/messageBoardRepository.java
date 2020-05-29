package BoardModel;

import Board.Message;

import java.io.IOException;
import java.util.Set;

public interface messageBoardRepository{

    public void AddMessage(Message message) throws Exception;

    public void DeleteMessag(Message message) throws IOException;

    public void EditMessage (Message message, String NewMessage) throws Exception;

    public Set<Message> ShowMessageBoard ();
}
