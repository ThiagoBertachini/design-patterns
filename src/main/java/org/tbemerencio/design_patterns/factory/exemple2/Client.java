package org.tbemerencio.design_patterns.factory.exemple2;

public class Client {
    public static void main(String[] args) {
        printMessage(new JsonMessageCreator());
        printMessage(new TextMessageCreator());
    }

    public static void printMessage(MessageCreator messageCreator) {
        System.out.println(messageCreator.getMessage().getContent());
    }
}
