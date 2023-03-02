public class Main {
    public static void main(String[] args) {
        final TextEditor editor = new TextEditor();

        final UndoProvider undoProvider = new UndoProvider(editor);

        editor.append("Hi. ");
        undoProvider.addState(editor.getState());
        System.out.println("Editor displaying..... :");
        editor.display();
        editor.append("How are you? ");
        undoProvider.addState(editor.getState());
        System.out.println("Editor displaying..... :");
        editor.display();


        editor.append("All good? ");
        System.out.println("Editor displaying..... :");
        editor.display();
        System.out.println("undo......");
        undoProvider.undo();
        System.out.println("Editor displaying..... :");
        editor.display();
        System.out.println("undo......");
        undoProvider.undo();
        System.out.println("Editor displaying..... :");
        editor.display();
        System.out.println("undo......");
        undoProvider.undo();
        System.out.println("Editor displaying..... :");
        editor.display();
    }
}