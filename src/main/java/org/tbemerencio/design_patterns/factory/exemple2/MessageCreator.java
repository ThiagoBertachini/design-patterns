package org.tbemerencio.design_patterns.factory.exemple2;

public abstract class MessageCreator {

    public Message getMessage() {
        Message msg = createMessage();
        msg.addDefaultHeaders();
        msg.encrypt();
        return msg;
    }

    // Factory method
    public abstract Message createMessage();
}
