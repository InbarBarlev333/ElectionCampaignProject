package Board;

import BoardModel.messageBoardRepository;
import BoardModel.messageBoardRepositoryImp;

public class Main {
    public static void main(String[] args) throws Exception {


        messageBoardRepository messages = new messageBoardRepositoryImp();

        Message message1 = new Message("this is the 1st topic", "this is the 1st message");
        Message message2 = new Message("this is the 2nd topic", "this is the 2nd message");
        Message message3 = new Message("this is the 3rd topic", "this is the 3rd message");
        Message message4 = new Message("this is the 4th topic", "this is the 4th message");
        Message message5 = new Message("this is the 5th topic", "this is the 5th message");
        Message message6 = new Message("this is the 6th topic", "this is the 6th message");


        messages.AddMessage(message1);
        /*messages.AddMessage(message2);
        messages.AddMessage(message3);
        messages.AddMessage(message4);
        messages.AddMessage(message5);
        messages.AddMessage(message6);

        messages.ShowMessageBoard ();
        System.out.println("\n");

        messages.DeleteMessag(message6);

        messages.ShowMessageBoard ();
        System.out.println("\n");

        messages.EditMessage (message1, "message 1st Has changed");

        messages.ShowMessageBoard ();
        System.out.println("\n");*/

    }
}
