public class TextBuilder extends Builder {
    private StringBuilder sb = new StringBuilder();

    @Override
    public void makeTitle(String title) {
        sb.append("==============================\n");
        sb.append(title + "\n");
        sb.append("==============================\n\n");
    }
    @Override
    public void makeString(String str) {
        sb.append("_____ " + str + " _____\n");
    }
    @Override
    public void makeItems(String[] items) {
        for (String s : items) {
            sb.append("    * " + s + "\n");
        }
    }
    @Override
    public void close() {
        sb.append("\nEOL\n");
    }

    public String getTextResult() {
        return sb.toString();
    }
}