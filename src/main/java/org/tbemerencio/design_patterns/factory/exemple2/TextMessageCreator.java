package org.tbemerencio.design_patterns.factory.exemple2;

public class TextMessageCreator extends MessageCreator{
    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
