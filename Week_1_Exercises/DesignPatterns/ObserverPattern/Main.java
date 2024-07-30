public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket("AAPL");

        Observer mobileApp = new MobileApp("MobileApp1");
        Observer webApp = new WebApp("WebApp1");

        stockMarket.register(mobileApp);
        stockMarket.register(webApp);

        stockMarket.setStockPrice(150.0);
        stockMarket.setStockPrice(155.5);
    }
}
