package org.tbemerencio.design_patterns.factory.exemple2;

public class JsonMessageCreator extends MessageCreator{
    @Override
    public Message createMessage() {
        return new JsonMessage();
    }
}
