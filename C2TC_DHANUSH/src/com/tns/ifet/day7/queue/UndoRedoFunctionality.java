package com.tns.ifet.day7.queue;
import java.util.ArrayDeque;
import java.util.Deque;

public class UndoRedoFunctionality {
    public static void main(String[] args) {
        Deque<String> actionHistory = new ArrayDeque<>();
        performAction("Action 1", actionHistory);
        performAction("Action 2", actionHistory);
        performAction("Action 3", actionHistory);
        if (!actionHistory.isEmpty()) {
            String lastAction = actionHistory.removeLast();
            System.out.println("Undo: " + lastAction);
        }
        if (!actionHistory.isEmpty()) {
            String undoneAction = actionHistory.removeLast();
            System.out.println("Redo: " + undoneAction);
        }
    }
    private static void performAction(String action, Deque<String> actionHistory) {
        System.out.println("Performing action: " + action);
        actionHistory.addLast(action);
    }
}