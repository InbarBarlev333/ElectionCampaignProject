package Board;

import java.io.Serializable;

public class Message implements Serializable {

    private String Topic = " ";
    private String MessageItSelf = " ";


    public Message(String topic, String messageItSelf){
        Topic = topic;
        MessageItSelf = messageItSelf;

    }

    public Message(){
        Topic= "no topic";
        MessageItSelf = "no messageItself";
    }



    public String getTopic() {
        return Topic;
    }

    public String getMessageItSelf() {
        return MessageItSelf;
    }

    public void setTopic(String topic) {
        Topic = topic;
    }

    public void setMessageItSelf(String messageItSelf) {
        this.MessageItSelf = messageItSelf;
    }


    //



    @Override
    public boolean equals(Object o) {

        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }

        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof Message)) {
            return false;
        }

        // typecast o to Complex so that we can compare data members
        Message c = (Message) o;

        // Compare the data members and return accordingly
        return Topic.equals(c.Topic);

    }


    public boolean contains(Object obj){
        Message other = (Message) obj;
        if(this.Topic == other.Topic){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Message: [Topic=" + Topic + ", message " + MessageItSelf +  "]";
    }
}



