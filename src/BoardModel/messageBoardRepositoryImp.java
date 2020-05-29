package BoardModel;

import Board.Message;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class messageBoardRepositoryImp implements messageBoardRepository {
    private final String FILENAME = "Allmessages";
    private Set<Message> messages;
    private FileManager<Message> fileManager;

    public messageBoardRepositoryImp() throws IOException, ClassNotFoundException {
        this.fileManager = new FileManager<>(FILENAME);
        messages = new HashSet<Message>();
        this.messages = fileManager.read();
    }


    @Override
    public void AddMessage(Message message) throws Exception {
        if (message == null) {
            throw new Exception("Something went wrong");
        }
        for (Message message1 : messages) {
            if (message1.equals(message)) {
                throw new Exception("Already exists!");
            }
        }
        this.messages.add(message);
        this.fileManager.write(messages);
    }

    @Override
    public void DeleteMessag(Message message) throws IOException {
        messages.remove(message);
        fileManager.write(messages);

    }

    @Override
    public void EditMessage(Message message, String NewMessage) throws Exception {
        for (Message check : messages) {
            if (check == message) {
                check.setMessageItSelf(NewMessage);
            } else {
                throw new Exception("there is no such messages.message");
            }

        }

    }

    @Override
    public Set<Message> ShowMessageBoard() {
        Set<Message> result = new HashSet<Message>();
        for (Message AllMessages : messages) {
            System.out.println(AllMessages.getTopic() + " " + AllMessages.getMessageItSelf());
        }
        return result;


    }

}
