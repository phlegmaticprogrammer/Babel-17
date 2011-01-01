package com.babel17.jruntime;

public final class Message {

    public final static Message m_string = make("string");

    private final String message;

    private Message(String m) {
        message = m;
    }

    public boolean equals(Message m) {
        return message.equals(m.message);
    }

    public String get() {
        return message;
    }

    public static Message make(String m) {
        return new Message(m.toLowerCase());
    }
}
