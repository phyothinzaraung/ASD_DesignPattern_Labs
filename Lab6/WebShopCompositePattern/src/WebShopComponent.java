public abstract class WebShopComponent {
    protected String name;

    public WebShopComponent(String name){
        this.name = name;
    }

    public abstract void print();
}
