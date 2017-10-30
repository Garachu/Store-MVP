package com.store.products;

import com.store.BasePresenter;
import com.store.data.Product;
import com.store.util.BaseView;

import java.util.List;

/**
 * Created by meg on 10/28/17.
 */

/**
 * This specifies the contract between the view and the presenter.
 */
public interface ProductsContract {

    interface  View extends BaseView<Presenter> {
        void showProducts(List<Product> products);
    }

    interface  Presenter extends BasePresenter{
        void loadProducts(boolean forceUpdate);
    }
}
