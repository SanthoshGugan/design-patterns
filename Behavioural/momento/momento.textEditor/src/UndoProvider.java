import java.util.Stack;

public class UndoProvider {

    private final TextEditor textEditor;
    private final Stack<TextEditor.TextEditorState> stack;

    public UndoProvider(final TextEditor textEditor) {
        this.textEditor = textEditor;
        this.stack = new Stack<>();
    }

    public void addState(final TextEditor.TextEditorState state) {
        this.stack.push(state);
    }

    public void undo() {
        if (stack.empty()) {
            System.out.println(" Nothing to Undo!");
            return;
        }
        final var prevState = stack.pop();
        textEditor.setState(prevState);
    }


}
