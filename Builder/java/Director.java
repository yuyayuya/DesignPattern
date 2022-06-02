public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }
    public void construct() {
        builder.makeTitle("SampleOfBuilder");
        builder.makeString("This is the sample of Builder design method.");
        builder.makeItems(new String[] {
            "Hoge",
            "Huga",
            "Piyo"
        });
        builder.close();
    }
}