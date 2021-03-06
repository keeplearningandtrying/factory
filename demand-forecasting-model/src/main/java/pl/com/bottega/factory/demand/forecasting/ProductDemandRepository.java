package pl.com.bottega.factory.demand.forecasting;

interface ProductDemandRepository {
    ProductDemand get(String refNo);

    void save(ProductDemand model);

    void initNewProduct(String refNo);
}
