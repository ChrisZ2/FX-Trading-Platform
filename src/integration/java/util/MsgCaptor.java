package util;

import java.util.concurrent.ConcurrentLinkedQueue;

public class MsgCaptor<T> {

    ConcurrentLinkedQueue<T> msgQueue = new ConcurrentLinkedQueue<>();

}
