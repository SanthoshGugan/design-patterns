public class TextEditor {
    private String text;

    public TextEditor() {
        this.text = "";
    }

    public void append(final String text) {
        this.text = this.text + text;
    }

    public TextEditorState getState() {
        final var textEditorState = new TextEditorState();
        textEditorState.setState(text);
        return textEditorState;
    }

    public void setState(final TextEditorState state) {
        this.text = state.getState();
    }

    public static class TextEditorState {
        private String text;

        private String getState() { return text; }

        private void setState(String text) { this.text = text; }
    }

    public void display(){
        System.out.println(text);
    }
}
