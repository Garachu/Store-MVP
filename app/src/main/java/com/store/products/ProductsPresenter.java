package com.store.products;

/**
 * Created by meg on 10/29/17.
 */

public class ProductsPresenter implements ProductsContract.Presenter{

    private boolean mFirstLoad = true;

    @Override
    public void loadProducts(boolean forceUpdate) {

    }

    @Override
    public void start() {
        loadProducts(false);
    }
}
